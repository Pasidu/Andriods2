package com.example.pasidu.helloworld.VolleyBall;


import java.util.Map;

/**
 * Created by Pasidu on 10/19/2015.
 */
public class SilkCookie {
    private static final String SET_COOKIE_KEY = "Set-Cookie";
    private static final String COOKIE_KEY = "Cookie";
    private static final String SESSION_COOKIE = "sessionid";

    private static SilkCookie _instance;

    public static SilkCookie get() {
        return _instance;
    }

    public final void checkSessionCookie(Map<String, String> headers) {
        if (headers.containsKey(SET_COOKIE_KEY) && headers.get(SET_COOKIE_KEY).startsWith(SESSION_COOKIE)) {
            String cookie = headers.get(SET_COOKIE_KEY);
            if (cookie.length() > 0) {
                String[] splitCookie = cookie.split(";");
                String[] splitSessionId = splitCookie[0].split("=");
                cookie = splitSessionId[1];



            }
        }
    }

//    public final void addSessionCookie(Map<String, String> headers) {
//        String sessionId = _preferences.getString(SESSION_COOKIE, "");
//        if (sessionId.length() > 0) {
//            StringBuilder builder = new StringBuilder();
//            builder.append(SESSION_COOKIE);
//            builder.append("=");
//            builder.append(sessionId);
//            if (headers.containsKey(COOKIE_KEY)) {
//                builder.append("; ");
//                builder.append(headers.get(COOKIE_KEY));
//            }
//            headers.put(COOKIE_KEY, builder.toString());
//        }
//    }
}
