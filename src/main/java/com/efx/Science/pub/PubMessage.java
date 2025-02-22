package com.efx.Science.pub;

import java.util.HashMap;
import java.util.Map;

public class PubMessage {
    public static Map dlmap = new HashMap();

    public static String serverUrl = "https://kx.nbefx.com";

    //    小程序
    public static String appid = "wx2cc0b9586ebdd013";
    public static String secret = "e527a9c33cbefef1a68dc29c18c6bf9e";
    //    公众号
    public static String appidw = "";
    public static String secretw = "";
    public static String access_token = "";
    public static String refresh_token = "";
    public static String getAccess_token() {
        return access_token;
    }
    public static void setAccess_token(String access_token) {
        PubMessage.access_token = access_token;
    }
    public static String getRefresh_token() {
        return refresh_token;
    }
    public static void setRefresh_token(String refresh_token) {
        PubMessage.refresh_token = refresh_token;
    }

}
