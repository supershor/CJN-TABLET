package com.bpsi.cjnnetwork.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllModel {

    @SerializedName("responseStatus")
    @Expose
    private Boolean responseStatus;
    @SerializedName("responseMessage")
    @Expose
    private ResponseMessage responseMessage;

    /**
     * No args constructor for use in serialization
     */
    public AllModel() {
    }

    /**
     * @param responseStatus
     * @param responseMessage
     */
    public AllModel(Boolean responseStatus, ResponseMessage responseMessage) {
        super();
        this.responseStatus = responseStatus;
        this.responseMessage = responseMessage;
    }

    public Boolean getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Boolean responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }
}