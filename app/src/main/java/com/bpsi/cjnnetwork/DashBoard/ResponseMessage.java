package com.bpsi.cjnnetwork.DashBoard;

import com.bpsi.cjnnetwork.model.Display;
import com.google.gson.annotations.SerializedName;

public class ResponseMessage {
    @SerializedName("Display")
    private Display display;

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}