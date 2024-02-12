package com.bpsi.cjnnetwork.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InputParameterJobDec {

    @SerializedName("jobid")
    @Expose
    private String jobid;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }
}
