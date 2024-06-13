
package com.bpsi.cjnnetwork.model;

import java.util.List;
  import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 public class _1 implements Parcelable
{

    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("0")
    @Expose
    private List<_0__2> _0;
    public final static Creator<_1> CREATOR = new Creator<_1>() {


        public _1 createFromParcel(android.os.Parcel in) {
            return new _1(in);
        }

        public _1 [] newArray(int size) {
            return (new _1[size]);
        }

    }
    ;

    @SuppressWarnings({
        "unchecked"
    })
    protected _1(android.os.Parcel in) {
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this._0, (_0__2.class.getClassLoader()));
    }

    public _1() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<_0__2> get0() {
        return _0;
    }

    public void set0(List<_0__2> _0) {
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
