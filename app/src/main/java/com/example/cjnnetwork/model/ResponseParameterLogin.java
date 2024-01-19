package com.example.cjnnetwork.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseParameterLogin {

    @SerializedName("responseStatus")
    @Expose
    private int responseStatus;
    @SerializedName("responseMessage")
    @Expose
    private String responseMessage;

    public int getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
