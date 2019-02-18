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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets;
    }
}
