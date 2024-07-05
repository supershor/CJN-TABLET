package com.bpsi.cjnnetwork.Dashboard_all_in_one;

public class qrcodes {
    String qrcode_filename;
    String assessment_name;
    String assessment_test_link;

    public qrcodes(String qrcode_filename,String assessment_name) {
        this.assessment_name = assessment_name;
        this.qrcode_filename = qrcode_filename;
    }public qrcodes(String qrcode_filename,String assessment_name,String assessment_test_link) {
        this.assessment_name = assessment_name;
        this.assessment_test_link=assessment_test_link;
        this.qrcode_filename = qrcode_filename;
    }


}
