
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _0__3 implements Parcelable
{

    @SerializedName("feedback_id")
    @Expose
    private Integer feedbackId;
    @SerializedName("feedback_datetime")
    @Expose
    private String feedbackDatetime;
    @SerializedName("feedback_text")
    @Expose
    private String feedbackText;
    @SerializedName("feedback_audio")
    @Expose
    private String feedbackAudio;
    @SerializedName("feedback_video")
    @Expose
    private String feedbackVideo;
    @SerializedName("feedback_status")
    @Expose
    private Integer feedbackStatus;
    @SerializedName("feedback_display_status")
    @Expose
    private Integer feedbackDisplayStatus;
    @SerializedName("feedback_display_count")
    @Expose
    private Integer feedbackDisplayCount;
    @SerializedName("feedback_display_value")
    @Expose
    private Integer feedbackDisplayValue;
    @SerializedName("feedback_user_id")
    @Expose
    private String feedbackUserId;
    @SerializedName("feedback_user")
    @Expose
    private String feedbackUser;
    @SerializedName("feedback_user_role")
    @Expose
    private String feedbackUserRole;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("candidate_image")
    @Expose
    private String candidateImage;
    @SerializedName("viewer_image")
    @Expose
    private Object viewerImage;
    @SerializedName("employer_image")
    @Expose
    private Object employerImage;
    public final static Creator<_0__3> CREATOR = new Creator<_0__3>() {


        public _0__3 createFromParcel(android.os.Parcel in) {
            return new _0__3(in);
        }

        public _0__3 [] newArray(int size) {
            return (new _0__3[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _0__3(android.os.Parcel in) {
        this.feedbackId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.feedbackDatetime = ((String) in.readValue((String.class.getClassLoader())));
        this.feedbackText = ((String) in.readValue((String.class.getClassLoader())));
        this.feedbackAudio = ((String) in.readValue((String.class.getClassLoader())));
        this.feedbackVideo = ((String) in.readValue((String.class.getClassLoader())));
        this.feedbackStatus = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.feedbackDisplayStatus = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.feedbackDisplayCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.feedbackDisplayValue = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.feedbackUserId = ((String) in.readValue((String.class.getClassLoader())));
        this.feedbackUser = ((String) in.readValue((String.class.getClassLoader())));
        this.feedbackUserRole = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.candidateImage = ((String) in.readValue((String.class.getClassLoader())));
        this.viewerImage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.employerImage = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public _0__3() {
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
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

    public Integer getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(Integer feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public Integer getFeedbackDisplayStatus() {
        return feedbackDisplayStatus;
    }

    public void setFeedbackDisplayStatus(Integer feedbackDisplayStatus) {
        this.feedbackDisplayStatus = feedbackDisplayStatus;
    }

    public Integer getFeedbackDisplayCount() {
        return feedbackDisplayCount;
    }

    public void setFeedbackDisplayCount(Integer feedbackDisplayCount) {
        this.feedbackDisplayCount = feedbackDisplayCount;
    }

    public Integer getFeedbackDisplayValue() {
        return feedbackDisplayValue;
    }

    public void setFeedbackDisplayValue(Integer feedbackDisplayValue) {
        this.feedbackDisplayValue = feedbackDisplayValue;
    }

    public String getFeedbackUserId() {
        return feedbackUserId;
    }

    public void setFeedbackUserId(String feedbackUserId) {
        this.feedbackUserId = feedbackUserId;
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

    public String getCandidateImage() {
        return candidateImage;
    }

    public void setCandidateImage(String candidateImage) {
        this.candidateImage = candidateImage;
    }

    public Object getViewerImage() {
        return viewerImage;
    }

    public void setViewerImage(Object viewerImage) {
        this.viewerImage = viewerImage;
    }

    public Object getEmployerImage() {
        return employerImage;
    }

    public void setEmployerImage(Object employerImage) {
        this.employerImage = employerImage;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(feedbackId);
        dest.writeValue(feedbackDatetime);
        dest.writeValue(feedbackText);
        dest.writeValue(feedbackAudio);
        dest.writeValue(feedbackVideo);
        dest.writeValue(feedbackStatus);
        dest.writeValue(feedbackDisplayStatus);
        dest.writeValue(feedbackDisplayCount);
        dest.writeValue(feedbackDisplayValue);
        dest.writeValue(feedbackUserId);
        dest.writeValue(feedbackUser);
        dest.writeValue(feedbackUserRole);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(candidateImage);
        dest.writeValue(viewerImage);
        dest.writeValue(employerImage);
    }

    public int describeContents() {
        return  0;
    }

}
