package com.bpsi.cjnnetwork.network;


import com.google.gson.annotations.SerializedName;

public class ApiRequest {
    @SerializedName("show_id")
    private String showId;

    public ApiRequest(String showId) {
        this.showId = showId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

}
