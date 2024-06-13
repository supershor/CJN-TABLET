
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _0__1 implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("show_id")
    @Expose
    private String showId;
    @SerializedName("asset_id")
    @Expose
    private String assetId;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("from_table")
    @Expose
    private String fromTable;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("duration")
    @Expose
    private String duration;
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
    public final static Creator<_0__1> CREATOR = new Creator<_0__1>() {


        public _0__1 createFromParcel(android.os.Parcel in) {
            return new _0__1(in);
        }

        public _0__1 [] newArray(int size) {
            return (new _0__1[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _0__1(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.showId = ((String) in.readValue((String.class.getClassLoader())));
        this.assetId = ((String) in.readValue((String.class.getClassLoader())));
        this.startTime = ((String) in.readValue((String.class.getClassLoader())));
        this.endTime = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.layout = ((String) in.readValue((String.class.getClassLoader())));
        this.fromTable = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.duration = ((String) in.readValue((String.class.getClassLoader())));
        this.videoId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.videoFileName = ((String) in.readValue((String.class.getClassLoader())));
        this.videoUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.videoTimestamp = ((String) in.readValue((String.class.getClassLoader())));
        this.videoCreatedBy = ((String) in.readValue((String.class.getClassLoader())));
        this.videoOwner = ((String) in.readValue((String.class.getClassLoader())));
    }

    public _0__1() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

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

    public String getFromTable() {
        return fromTable;
    }

    public void setFromTable(String fromTable) {
        this.fromTable = fromTable;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(showId);
        dest.writeValue(assetId);
        dest.writeValue(startTime);
        dest.writeValue(endTime);
        dest.writeValue(location);
        dest.writeValue(layout);
        dest.writeValue(fromTable);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(duration);
        dest.writeValue(videoId);
        dest.writeValue(videoFileName);
        dest.writeValue(videoUrl);
        dest.writeValue(videoTimestamp);
        dest.writeValue(videoCreatedBy);
        dest.writeValue(videoOwner);
    }

    public int describeContents() {
        return  0;
    }

}
