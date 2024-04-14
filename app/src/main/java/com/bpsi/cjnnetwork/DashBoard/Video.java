package com.bpsi.cjnnetwork.DashBoard;

import com.google.gson.annotations.SerializedName;

public class Video {
    @SerializedName("id")
    private int id;

    @SerializedName("video_id")
    private int videoId;

    @SerializedName("video_file_name")
    private String videoFileName;

    @SerializedName("video_url")
    private String videoUrl;

    @SerializedName("video_timestamp")
    private String videoTimestamp;

    @SerializedName("video_created_by")
    private String videoCreatedBy;

    @SerializedName("video_owner")
    private String videoOwner;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoTimestamp() {
        return videoTimestamp;
    }

    public void setVideoTimestamp(String videoTimestamp) {
        this.videoTimestamp = videoTimestamp;
    }

    public String getVideoCreatedBy() {
        return videoCreatedBy;
    }

    public void setVideoCreatedBy(String videoCreatedBy) {
        this.videoCreatedBy = videoCreatedBy;
    }

    public String getVideoOwner() {
        return videoOwner;
    }

    public void setVideoOwner(String videoOwner) {
        this.videoOwner = videoOwner;
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