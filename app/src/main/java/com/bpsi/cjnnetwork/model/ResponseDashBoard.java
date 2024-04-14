package com.bpsi.cjnnetwork.model;

import android.view.Display;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseDashBoard {

        @SerializedName("Display")
        @Expose
        private Display display;

        /**
         * No args constructor for use in serialization
         *
         */
        public ResponseDashBoard() {
        }

        /**
         *
         * @param display
         */
        public ResponseDashBoard(Display display) {
            super();
            this.display = display;
        }

        public Display getDisplay() {
            return display;
        }

        public void setDisplay(Display display) {
            this.display = display;
        }

    }
