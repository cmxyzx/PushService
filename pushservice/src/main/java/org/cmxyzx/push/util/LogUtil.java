package org.cmxyzx.push.util;

public class LogUtil {

    public static void logV(String msg) {
        System.out.println(msg);
    }

    public static void logE(String msg, Exception e) {
        System.out.println(msg);
        e.printStackTrace();
    }

    public static void logW(String msg) {
        System.out.println(msg);
    }

    public static void logD(String msg) {
        System.out.println(msg);
    }

    public static void logI(String msg) {
        System.out.println(msg);
    }

}
