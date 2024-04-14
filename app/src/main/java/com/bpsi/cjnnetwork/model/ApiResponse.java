package com.bpsi.cjnnetwork.model;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {
    @SerializedName("responseStatus")
    private boolean responseStatus;

    @SerializedName("responseMessage")
    private ResponseMessage responseMessage;

    public boolean isResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(boolean responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }
}

