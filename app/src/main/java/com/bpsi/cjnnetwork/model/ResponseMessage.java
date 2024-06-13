
package com.bpsi.cjnnetwork.model;

  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class ResponseMessage implements Parcelable
{

    @SerializedName("Display")
    @Expose
    private Display display;
    public final static Creator<ResponseMessage> CREATOR = new Creator<ResponseMessage>() {


        public ResponseMessage createFromParcel(android.os.Parcel in) {
            return new ResponseMessage(in);
        }

        public ResponseMessage[] newArray(int size) {
            return (new ResponseMessage[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected ResponseMessage(android.os.Parcel in) {
        this.display = ((Display) in.readValue((Display.class.getClassLoader())));
    }

    public ResponseMessage() {
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(display);
    }

    public int describeContents() {
        return  0;
    }

}
