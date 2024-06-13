
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _5 implements Parcelable
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
    private Object createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("assessment_id")
    @Expose
    private Integer assessmentId;
    @SerializedName("assessment_system")
    @Expose
    private String assessmentSystem;
    @SerializedName("qr_code")
    @Expose
    private String qrCode;
    @SerializedName("assessment_test_link")
    @Expose
    private String assessmentTestLink;
    @SerializedName("assessment_qrcode_filename")
    @Expose
    private String assessmentQrcodeFilename;
    public final static Creator<_5> CREATOR = new Creator<_5>() {


        public _5 createFromParcel(android.os.Parcel in) {
            return new _5(in);
        }

        public _5 [] newArray(int size) {
            return (new _5[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _5(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.showId = ((String) in.readValue((String.class.getClassLoader())));
        this.assetId = ((String) in.readValue((String.class.getClassLoader())));
        this.startTime = ((String) in.readValue((String.class.getClassLoader())));
        this.endTime = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.layout = ((String) in.readValue((String.class.getClassLoader())));
        this.fromTable = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.updatedAt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.duration = ((String) in.readValue((String.class.getClassLoader())));
        this.assessmentId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.assessmentSystem = ((String) in.readValue((String.class.getClassLoader())));
        this.qrCode = ((String) in.readValue((String.class.getClassLoader())));
        this.assessmentTestLink = ((String) in.readValue((String.class.getClassLoader())));
        this.assessmentQrcodeFilename = ((String) in.readValue((String.class.getClassLoader())));
    }

    public _5() {
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

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getAssessmentSystem() {
        return assessmentSystem;
    }

    public void setAssessmentSystem(String assessmentSystem) {
        this.assessmentSystem = assessmentSystem;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getAssessmentTestLink() {
        return assessmentTestLink;
    }

    public void setAssessmentTestLink(String assessmentTestLink) {
        this.assessmentTestLink = assessmentTestLink;
    }

    public String getAssessmentQrcodeFilename() {
        return assessmentQrcodeFilename;
    }

    public void setAssessmentQrcodeFilename(String assessmentQrcodeFilename) {
        this.assessmentQrcodeFilename = assessmentQrcodeFilename;
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
        dest.writeValue(assessmentId);
        dest.writeValue(assessmentSystem);
        dest.writeValue(qrCode);
        dest.writeValue(assessmentTestLink);
        dest.writeValue(assessmentQrcodeFilename);
    }

    public int describeContents() {
        return  0;
    }

}
