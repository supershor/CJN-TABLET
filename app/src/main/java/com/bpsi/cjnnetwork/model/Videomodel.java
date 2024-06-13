
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class Videomodel implements Parcelable
{

    @SerializedName("responseStatus")
    @Expose
    private Boolean responseStatus;
    @SerializedName("responseMessage")
    @Expose
    private ResponseMessage responseMessage;
    public final static Creator<Videomodel> CREATOR = new Creator<Videomodel>() {


        public Videomodel createFromParcel(android.os.Parcel in) {
            return new Videomodel(in);
        }

        public Videomodel[] newArray(int size) {
            return (new Videomodel[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected Videomodel(android.os.Parcel in) {
        this.responseStatus = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.responseMessage = ((ResponseMessage) in.readValue((ResponseMessage.class.getClassLoader())));
    }

    public Videomodel() {
    }

    public Boolean getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Boolean responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(responseStatus);
        dest.writeValue(responseMessage);
    }

    public int describeContents() {
        return  0;
    }

}
