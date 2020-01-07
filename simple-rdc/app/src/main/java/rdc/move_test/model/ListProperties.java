package rdc.move_test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Deepak Kaku on 07-01-2020.
 */

public class ListProperties {


    @SerializedName("properties")
    @Expose
    private ArrayList<Property> propertyList;

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }
}
