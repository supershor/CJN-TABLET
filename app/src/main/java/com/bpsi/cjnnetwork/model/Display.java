
package com.bpsi.cjnnetwork.model;

import java.util.List;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Display implements Parcelable {

    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("0")
    @Expose
    private com.bpsi.cjnnetwork.model._0 _0;
    @SerializedName("1")
    @Expose
    private com.bpsi.cjnnetwork.model._1 _1;
    @SerializedName("2")
    @Expose
    private com.bpsi.cjnnetwork.model._2 _2;
    @SerializedName("3")
    @Expose
    private com.bpsi.cjnnetwork.model._3 _3;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("4")
    @Expose
    private List<Object> _4;
    @SerializedName("5")
    @Expose
    private List<com.bpsi.cjnnetwork.model._5> _5;
    @SerializedName("6")
    @Expose
    private List<com.bpsi.cjnnetwork.model._6> _6;
    @SerializedName("7")
    @Expose
    private List<com.bpsi.cjnnetwork.model._7> _7;
    public final static Creator<Display> CREATOR = new Creator<Display>() {


        public Display createFromParcel(android.os.Parcel in) {
            return new Display(in);
        }

        public Display[] newArray(int size) {
            return (new Display[size]);
        }

    };

    @SuppressWarnings({
            "unchecked"
    })
    protected Display(android.os.Parcel in) {
        this.layout = ((String) in.readValue((String.class.getClassLoader())));
        this._0 = ((com.bpsi.cjnnetwork.model._0) in.readValue((_0.class.getClassLoader())));
        this._1 = ((com.bpsi.cjnnetwork.model._1) in.readValue((_1.class.getClassLoader())));
        this._2 = ((com.bpsi.cjnnetwork.model._2) in.readValue((_2.class.getClassLoader())));
        this._3 = ((com.bpsi.cjnnetwork.model._3) in.readValue((_3.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this._4, (Object.class.getClassLoader()));
        in.readList(this._5, (com.bpsi.cjnnetwork.model._5.class.getClassLoader()));
        in.readList(this._6, (com.bpsi.cjnnetwork.model._6.class.getClassLoader()));
        in.readList(this._7, (com.bpsi.cjnnetwork.model._7.class.getClassLoader()));
    }

    public Display() {
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public com.bpsi.cjnnetwork.model._0 get0() {
        return _0;
    }

    public void set0(com.bpsi.cjnnetwork.model._0 _0) {
        this._0 = _0;
    }

    public com.bpsi.cjnnetwork.model._1 get1() {
        return _1;
    }

    public void set1(com.bpsi.cjnnetwork.model._1 _1) {
        this._1 = _1;
    }

    public com.bpsi.cjnnetwork.model._2 get2() {
        return _2;
    }

    public void set2(com.bpsi.cjnnetwork.model._2 _2) {
        this._2 = _2;
    }

    public com.bpsi.cjnnetwork.model._3 get3() {
        return _3;
    }

    public void set3(com.bpsi.cjnnetwork.model._3 _3) {
        this._3 = _3;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Object> get4() {
        return _4;
    }

    public void set4(List<Object> _4) {
        this._4 = _4;
    }

    public List<com.bpsi.cjnnetwork.model._5> get5() {
        return _5;
    }

    public void set5(List<com.bpsi.cjnnetwork.model._5> _5) {
        this._5 = _5;
    }

    public List<com.bpsi.cjnnetwork.model._6> get6() {
        return _6;
    }

    public void set6(List<com.bpsi.cjnnetwork.model._6> _6) {
        this._6 = _6;
    }

    public List<com.bpsi.cjnnetwork.model._7> get7() {
        return _7;
    }

    public void set7(List<com.bpsi.cjnnetwork.model._7> _7) {
        this._7 = _7;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(layout);
        dest.writeValue(_0);
        dest.writeValue(_1);
        dest.writeValue(_2);
        dest.writeValue(_3);
        dest.writeValue(location);
        dest.writeList(_4);
        dest.writeList(_5);
        dest.writeList(_6);
        dest.writeList(_7);
    }

    public int describeContents() {
        return 0;
    }

}
