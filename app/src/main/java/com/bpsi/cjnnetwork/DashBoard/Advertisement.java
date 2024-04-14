package com.bpsi.cjnnetwork.DashBoard;

import com.google.gson.annotations.SerializedName;

public class Advertisement {
    @SerializedName("advertisement_id")
    private int advertisementId;

    @SerializedName("emaployer_id")
    private String employerId;

    @SerializedName("advertizment_name")
    private String advertisementName;

    @SerializedName("advertisement_asset")
    private String advertisementAsset;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    public int getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(int advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getEmployerId() {
        return employerId;
    }

    public void setEmployerId(String employerId) {
        this.employerId = employerId;
    }

    public String getAdvertisementName() {
        return advertisementName;
    }

    public void setAdvertisementName(String advertisementName) {
        this.advertisementName = advertisementName;
    }

    public String getAdvertisementAsset() {
        return advertisementAsset;
    }

    public void setAdvertisementAsset(String advertisementAsset) {
        this.advertisementAsset = advertisementAsset;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}