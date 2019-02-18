package com.treadstone.grpproject.daropointsevents.models.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Events {
    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("name")
    @Expose
    String name;
    @SerializedName("start_at")
    @Expose
    String startAt;
    @SerializedName("ends_at")
    @Expose
    String endsAt;
    @SerializedName("organizers_description")
    @Expose
    String organizersDescription;
    @SerializedName("location_name")
    @Expose

    Venue  locationName;
    @SerializedName("code_of_conduct")
    @Expose
    String codeOfConduct;
    @SerializedName("description")
    @Expose
    String description;
    @SerializedName("is_description")
    @Expose
    Boolean isDescription;
    @SerializedName("speakers")
    @Expose
    String speakers;
    @SerializedName("event_topic")
    @Expose
    String eventTopic;
    @SerializedName("duration")
    @Expose
    String duration;

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

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    public String getOrganizersDescription() {
        return organizersDescription;
    }

    public void setOrganizersDescription(String organizersDescription) {
        this.organizersDescription = organizersDescription;
    }

    public Venue getLocationName() {
        return locationName;
    }

    public void setLocationName(Venue locationName) {
        this.locationName = locationName;
    }

    public String getCodeOfConduct() {
        return codeOfConduct;
    }

    public void setCodeOfConduct(String codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(Boolean description) {
        isDescription = description;
    }

    public String getSpeakers() {
        return speakers;
    }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    public String getEventTopic() {
        return eventTopic;
    }

    public void setEventTopic(String eventTopic) {
        this.eventTopic = eventTopic;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
