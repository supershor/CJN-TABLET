
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _0__4 implements Parcelable
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
    @SerializedName("job_id")
    @Expose
    private Integer jobId;
    @SerializedName("number_of_opening")
    @Expose
    private Integer numberOfOpening;
    @SerializedName("number_of_job_offers_made")
    @Expose
    private String numberOfJobOffersMade;
    @SerializedName("number_of_job_offer_rejction")
    @Expose
    private String numberOfJobOfferRejction;
    @SerializedName("number_of_candidate_waiting")
    @Expose
    private String numberOfCandidateWaiting;
    public final static Creator<_0__4> CREATOR = new Creator<_0__4>() {


        public _0__4 createFromParcel(android.os.Parcel in) {
            return new _0__4(in);
        }

        public _0__4 [] newArray(int size) {
            return (new _0__4[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _0__4(android.os.Parcel in) {
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
        this.jobId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.numberOfOpening = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.numberOfJobOffersMade = ((String) in.readValue((String.class.getClassLoader())));
        this.numberOfJobOfferRejction = ((String) in.readValue((String.class.getClassLoader())));
        this.numberOfCandidateWaiting = ((String) in.readValue((String.class.getClassLoader())));
    }

    public _0__4() {
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

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getNumberOfOpening() {
        return numberOfOpening;
    }

    public void setNumberOfOpening(Integer numberOfOpening) {
        this.numberOfOpening = numberOfOpening;
    }

    public String getNumberOfJobOffersMade() {
        return numberOfJobOffersMade;
    }

    public void setNumberOfJobOffersMade(String numberOfJobOffersMade) {
        this.numberOfJobOffersMade = numberOfJobOffersMade;
    }

    public String getNumberOfJobOfferRejction() {
        return numberOfJobOfferRejction;
    }

    public void setNumberOfJobOfferRejction(String numberOfJobOfferRejction) {
        this.numberOfJobOfferRejction = numberOfJobOfferRejction;
    }

    public String getNumberOfCandidateWaiting() {
        return numberOfCandidateWaiting;
    }

    public void setNumberOfCandidateWaiting(String numberOfCandidateWaiting) {
        this.numberOfCandidateWaiting = numberOfCandidateWaiting;
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
        dest.writeValue(jobId);
        dest.writeValue(numberOfOpening);
        dest.writeValue(numberOfJobOffersMade);
        dest.writeValue(numberOfJobOfferRejction);
        dest.writeValue(numberOfCandidateWaiting);
    }

    public int describeContents() {
        return  0;
    }

}
