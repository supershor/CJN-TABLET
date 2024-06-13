
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _7 implements Parcelable
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
    @SerializedName("Job_title")
    @Expose
    private String jobTitle;
    @SerializedName("Job_desc")
    @Expose
    private String jobDesc;
    @SerializedName("Job_cmp_id")
    @Expose
    private String jobCmpId;
    @SerializedName("Job_employe_id")
    @Expose
    private String jobEmployeId;
    @SerializedName("Job_desc_pdf_link")
    @Expose
    private String jobDescPdfLink;
    @SerializedName("Job_desc_pdf_name")
    @Expose
    private String jobDescPdfName;
    @SerializedName("Job_desc_img_name")
    @Expose
    private String jobDescImgName;
    @SerializedName("Job_desc_img_link")
    @Expose
    private String jobDescImgLink;
    @SerializedName("qrcode_filename")
    @Expose
    private String qrcodeFilename;
    @SerializedName("Job_date_stamp")
    @Expose
    private String jobDateStamp;
    @SerializedName("job_desc_qr_code")
    @Expose
    private String jobDescQrCode;
    public final static Creator<_7> CREATOR = new Creator<_7>() {


        public _7 createFromParcel(android.os.Parcel in) {
            return new _7(in);
        }

        public _7 [] newArray(int size) {
            return (new _7[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _7(android.os.Parcel in) {
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
        this.jobTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.jobDesc = ((String) in.readValue((String.class.getClassLoader())));
        this.jobCmpId = ((String) in.readValue((String.class.getClassLoader())));
        this.jobEmployeId = ((String) in.readValue((String.class.getClassLoader())));
        this.jobDescPdfLink = ((String) in.readValue((String.class.getClassLoader())));
        this.jobDescPdfName = ((String) in.readValue((String.class.getClassLoader())));
        this.jobDescImgName = ((String) in.readValue((String.class.getClassLoader())));
        this.jobDescImgLink = ((String) in.readValue((String.class.getClassLoader())));
        this.qrcodeFilename = ((String) in.readValue((String.class.getClassLoader())));
        this.jobDateStamp = ((String) in.readValue((String.class.getClassLoader())));
        this.jobDescQrCode = ((String) in.readValue((String.class.getClassLoader())));
    }

    public _7() {
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getJobCmpId() {
        return jobCmpId;
    }

    public void setJobCmpId(String jobCmpId) {
        this.jobCmpId = jobCmpId;
    }

    public String getJobEmployeId() {
        return jobEmployeId;
    }

    public void setJobEmployeId(String jobEmployeId) {
        this.jobEmployeId = jobEmployeId;
    }

    public String getJobDescPdfLink() {
        return jobDescPdfLink;
    }

    public void setJobDescPdfLink(String jobDescPdfLink) {
        this.jobDescPdfLink = jobDescPdfLink;
    }

    public String getJobDescPdfName() {
        return jobDescPdfName;
    }

    public void setJobDescPdfName(String jobDescPdfName) {
        this.jobDescPdfName = jobDescPdfName;
    }

    public String getJobDescImgName() {
        return jobDescImgName;
    }

    public void setJobDescImgName(String jobDescImgName) {
        this.jobDescImgName = jobDescImgName;
    }

    public String getJobDescImgLink() {
        return jobDescImgLink;
    }

    public void setJobDescImgLink(String jobDescImgLink) {
        this.jobDescImgLink = jobDescImgLink;
    }

    public String getQrcodeFilename() {
        return qrcodeFilename;
    }

    public void setQrcodeFilename(String qrcodeFilename) {
        this.qrcodeFilename = qrcodeFilename;
    }

    public String getJobDateStamp() {
        return jobDateStamp;
    }

    public void setJobDateStamp(String jobDateStamp) {
        this.jobDateStamp = jobDateStamp;
    }

    public String getJobDescQrCode() {
        return jobDescQrCode;
    }

    public void setJobDescQrCode(String jobDescQrCode) {
        this.jobDescQrCode = jobDescQrCode;
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
        dest.writeValue(jobTitle);
        dest.writeValue(jobDesc);
        dest.writeValue(jobCmpId);
        dest.writeValue(jobEmployeId);
        dest.writeValue(jobDescPdfLink);
        dest.writeValue(jobDescPdfName);
        dest.writeValue(jobDescImgName);
        dest.writeValue(jobDescImgLink);
        dest.writeValue(qrcodeFilename);
        dest.writeValue(jobDateStamp);
        dest.writeValue(jobDescQrCode);
    }

    public int describeContents() {
        return  0;
    }

}
