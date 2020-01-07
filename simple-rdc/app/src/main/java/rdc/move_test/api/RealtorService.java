package rdc.move_test.api;

import rdc.move_test.model.ListProperties;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Deepak Kaku on 07-01-2020.
 */

public interface RealtorService {
    @GET("/properties?offset=5&limit=100&city=Napa&state_code=CA&sort=relevance&client_id=rdc_mobile_native")
    public Call<ListProperties> getList();
    ;

}
