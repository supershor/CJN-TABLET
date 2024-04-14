package com.bpsi.cjnnetwork.DashBoard;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Display {
    @SerializedName("location")
    private String location;

    @SerializedName("layout")
    private String layout;

    @SerializedName("0")
    private List<Video> videos;

    @SerializedName("1")
    private List<Advertisement> advertisements;

    @SerializedName("2")
    private List<Feedback> feedbacks;

    // Add other arrays as needed

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(List<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
}