package com.bpsi.cjnnetwork.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Display{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("video_id")
    @Expose
    private Integer videoId;
    @SerializedName("video_file_name")
    @Expose
    private String videoFileName;
    @SerializedName("video_url")
    @Expose
    private String videoUrl;
    @SerializedName("video_timestamp")
    @Expose
    private String videoTimestamp;
    @SerializedName("video_created_by")
    @Expose
    private String videoCreatedBy;
    @SerializedName("video_owner")
    @Expose
    private String videoOwner;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
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


