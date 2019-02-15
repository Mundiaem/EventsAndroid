package com.treadstone.grpproject.daropointsevents.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Notification {
    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("message")
    @Expose
    String message;
    @SerializedName("targets")
    @Expose
    String targets;
}
