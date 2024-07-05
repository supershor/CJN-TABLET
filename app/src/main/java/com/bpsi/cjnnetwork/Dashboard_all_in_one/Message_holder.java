package com.bpsi.cjnnetwork.Dashboard_all_in_one;

public class Message_holder {
    String name;
    String message;
    String designation;
    String image;

    public Message_holder(String designation, String image, String message, String name) {
        this.designation = designation;
        this.image = image;
        this.message = message;
        this.name = name;
    }
}
