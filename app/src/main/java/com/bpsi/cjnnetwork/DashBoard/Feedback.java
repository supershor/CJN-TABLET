package com.bpsi.cjnnetwork.DashBoard;

import com.google.gson.annotations.SerializedName;

public class Feedback {
    @SerializedName("feedback_id")
    private int feedbackId;

    @SerializedName("feedback_datetime")
    private String feedbackDatetime;

    @SerializedName("feedback_text")
    private String feedbackText;

    @SerializedName("feedback_audio")
    private String feedbackAudio;

    @SerializedName("feedback_video")
    private String feedbackVideo;

    @SerializedName("feedback_status")
    private int feedbackStatus;

    @SerializedName("feedback_display_status")
    private int feedbackDisplayStatus;

    @SerializedName("feedback_display_count")
    private int feedbackDisplayCount;

    @SerializedName("feedback_display_value")
    private int feedbackDisplayValue;

    @SerializedName("feedback_user")
    private String feedbackUser;

    @SerializedName("feedback_user_role")
    private String feedbackUserRole;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("feedback_user_image_path")
    private String feedbackUserImagePath;

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackDatetime() {
        return feedbackDatetime;
    }

    public void setFeedbackDatetime(String feedbackDatetime) {
        this.feedbackDatetime = feedbackDatetime;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getFeedbackAudio() {
        return feedbackAudio;
    }

    public void setFeedbackAudio(String feedbackAudio) {
        this.feedbackAudio = feedbackAudio;
    }

    public String getFeedbackVideo() {
        return feedbackVideo;
    }

    public void setFeedbackVideo(String feedbackVideo) {
        this.feedbackVideo = feedbackVideo;
    }

    public int getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(int feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public int getFeedbackDisplayStatus() {
        return feedbackDisplayStatus;
    }

    public void setFeedbackDisplayStatus(int feedbackDisplayStatus) {
        this.feedbackDisplayStatus = feedbackDisplayStatus;
    }

    public int getFeedbackDisplayCount() {
        return feedbackDisplayCount;
    }

    public void setFeedbackDisplayCount(int feedbackDisplayCount) {
        this.feedbackDisplayCount = feedbackDisplayCount;
    }

    public int getFeedbackDisplayValue() {
        return feedbackDisplayValue;
    }

    public void setFeedbackDisplayValue(int feedbackDisplayValue) {
        this.feedbackDisplayValue = feedbackDisplayValue;
    }

    public String getFeedbackUser() {
        return feedbackUser;
    }

    public void setFeedbackUser(String feedbackUser) {
        this.feedbackUser = feedbackUser;
    }

    public String getFeedbackUserRole() {
        return feedbackUserRole;
    }

    public void setFeedbackUserRole(String feedbackUserRole) {
        this.feedbackUserRole = feedbackUserRole;
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

    public String getFeedbackUserImagePath() {
        return feedbackUserImagePath;
    }

    public void setFeedbackUserImagePath(String feedbackUserImagePath) {
        this.feedbackUserImagePath = feedbackUserImagePath;
    }
}