
package com.bpsi.cjnnetwork.model;

import java.util.List;
  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _0 implements Parcelable
{

    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("0")
    @Expose
    private List<_0__1> _0;
    public final static Creator<_0> CREATOR = new Creator<_0>() {


        public _0 createFromParcel(android.os.Parcel in) {
            return new _0(in);
        }

        public _0 [] newArray(int size) {
            return (new _0[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _0(android.os.Parcel in) {
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this._0, (_0__1.class.getClassLoader()));
    }

    public _0() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<_0__1> get0() {
        return _0;
    }

    public void set0(List<_0__1> _0) {
        this._0 = _0;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(location);
        dest.writeList(_0);
    }

    public int describeContents() {
        return  0;
    }

}
