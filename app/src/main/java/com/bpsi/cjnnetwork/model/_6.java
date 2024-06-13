
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _6 implements Parcelable
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
    @SerializedName("interview_room_id")
    @Expose
    private Integer interviewRoomId;
    @SerializedName("conference_system_type")
    @Expose
    private String conferenceSystemType;
    @SerializedName("interview_room_link")
    @Expose
    private String interviewRoomLink;
    @SerializedName("interview_qr_code")
    @Expose
    private String interviewQrCode;
    public final static Creator<_6> CREATOR = new Creator<_6>() {


        public _6 createFromParcel(android.os.Parcel in) {
            return new _6(in);
        }

        public _6 [] newArray(int size) {
            return (new _6[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _6(android.os.Parcel in) {
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
        this.interviewRoomId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.conferenceSystemType = ((String) in.readValue((String.class.getClassLoader())));
        this.interviewRoomLink = ((String) in.readValue((String.class.getClassLoader())));
        this.interviewQrCode = ((String) in.readValue((String.class.getClassLoader())));
    }

    public _6() {
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

    public Integer getInterviewRoomId() {
        return interviewRoomId;
    }

    public void setInterviewRoomId(Integer interviewRoomId) {
        this.interviewRoomId = interviewRoomId;
    }

    public String getConferenceSystemType() {
        return conferenceSystemType;
    }

    public void setConferenceSystemType(String conferenceSystemType) {
        this.conferenceSystemType = conferenceSystemType;
    }

    public String getInterviewRoomLink() {
        return interviewRoomLink;
    }

    public void setInterviewRoomLink(String interviewRoomLink) {
        this.interviewRoomLink = interviewRoomLink;
    }

    public String getInterviewQrCode() {
        return interviewQrCode;
    }

    public void setInterviewQrCode(String interviewQrCode) {
        this.interviewQrCode = interviewQrCode;
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
        dest.writeValue(interviewRoomId);
        dest.writeValue(conferenceSystemType);
        dest.writeValue(interviewRoomLink);
        dest.writeValue(interviewQrCode);
    }

    public int describeContents() {
        return  0;
    }

}
