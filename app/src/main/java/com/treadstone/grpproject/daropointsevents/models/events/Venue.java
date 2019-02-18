package com.treadstone.grpproject.daropointsevents.models.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue {
    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("name")
    @Expose
    String name;
    @SerializedName("building_name")
    @Expose
    String buildingName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
}
