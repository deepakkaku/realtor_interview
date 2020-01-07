package rdc.move_test.api;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Deepak Kaku on 07-01-2020.
 */

public class ApiClient {
    private Retrofit retrofit = null;
    RealtorService realtorService;


    private Context context;

    public ApiClient(Context context) {
        this.context = context;
    }


    public RealtorService getRealtorService() {

        if (retrofit == null) {
            OkHttpClient.Builder client = new OkHttpClient.Builder();
           /* if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
                logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
                client.addInterceptor(logging);
            }*/

            retrofit = new Retrofit.Builder().client(client.build())
                    .baseUrl("https://mapi-ng.rdc.moveaws.com/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        realtorService = retrofit.create(RealtorService.class);

        return realtorService;
    }
}
