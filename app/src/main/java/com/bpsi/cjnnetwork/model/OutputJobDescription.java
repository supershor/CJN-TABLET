package com.bpsi.cjnnetwork.model;

public class OutputJobDescription {

    private int responseStatus;
    private String jobdesc;
    private String jobpdf;

    public int getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public String getJobpdf() {
        return jobpdf;
    }

    public void setJobpdf(String jobpdf) {
        this.jobpdf = jobpdf;
    }
}
