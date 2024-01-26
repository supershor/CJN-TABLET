package com.example.cjnnetwork.network;


import com.example.cjnnetwork.utils.GlobalInterface;

/**
 * Class containing webservice constants
 *
 * @author pramod
 */
public class WebserviceConstants {


    public static final String HTTP_BASE_URL = "https://";
    public static final String CJN_BASE_URL = "https://dev.cjnnow.com/api";
    //public static final String SMART_COOKIE_STUDNET_DEFAULT_IMG =
    //"http://tsmartcookies.bpsi.us/core/image/avatar_2x.png";
    public static String SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE = "";
    public static String SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE1 = "";
    public static final String SMART_COOKIE_STUDNET_DEFAULT_IMG = "https://smartcookie.in/core/Images/avatar_2x.png";
    public static String BASE_HELP_URL = "smartcookie.in/";
    public static String BASE_HELP_URL_dev = "dev.smartcookie.in/";
    public static final String SMARTCOOKIE_COOKIE_SPONSOR_DEFAULT_IMG = "http://smartcookie.bpsi.us/Assets/images/sp/profile/newlogo.png";
    public static final String LOGIN_API = CJN_BASE_URL+"/login";
    public static final String REGISTER_API = CJN_BASE_URL+"/signup";
    public static final String GET_JOBDESCRIPTION = "http://localhost.devcjnnow.com//api2/api2.php?x=jobdesc";
    public static String SMART_COOKIE_STUDNET_BASE_URL = "smartcookie.in/";
    public static void setAppType(String Apptype) {
        if (Apptype.equals(GlobalInterface.TEST)) {

            SMART_COOKIE_STUDNET_BASE_URL =
                    // "devsmart.bpsi.us/core/Version2/";
                    //"tsmartcookies.bpsi.us/core/Version2/";
                    "test.smartcookie.in/";
            // "dev.smartcookie.in/core/Version2/";
            SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE =
                    // "devsmart.bpsi.us/core/";
                    // "tsmartcookies.bpsi.us/core/";
                    "test.smartcookie.in/core/Version3/";
            // "dev.smartcookie.in/core/Version2/";

            SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE1 =
                    // "devsmart.bpsi.us/core/";
                    // "tsmartcookies.bpsi.us/core/";
                    "test.smartcookie.in/core/";
        } else if (Apptype.equals(GlobalInterface.DEV)) {

            SMART_COOKIE_STUDNET_BASE_URL =
                    // "devsmart.bpsi.us/core/Version2/";
                    //"tsmartcookies.bpsi.us/core/Version2/";
                    // "test.smartcookie.in/core/Version2/";
                    "dev.smartcookie.in/";


            SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE =
                    // "devsmart.bpsi.us/core/";
                    // "tsmartcookies.bpsi.us/core/";
                    //"test.smartcookie.in/core/Version2/";
                    //"dev.smartcookie.in/core/Version2/";
                    "localhost.smartcookie.in/core/Version3/";
            SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE1 = "dev.smartcookie.in/core/";
        }

        else {

            SMART_COOKIE_STUDNET_BASE_URL =
                    "smartcookie.in/";

            SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE =
                    "smartcookie.in/core/";

            SMART_COOKIE_STUDNET_BASE_URL_FOR_IMAGE1 =
                    "smartcookie.in/core/";
        }
    }





}




