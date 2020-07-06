package com.example.rxjava2_retrofit2_mvp.utils;

import android.util.Log;


public class LogUtil {
    public static boolean isDebug = true;

    public static String prefix = "控制台打印的日志为>>>:";

    public static String getTag(StackTraceElement traceElement) {
        StringBuffer toStringBuffer = new StringBuffer(prefix).append("[")
                .append(traceElement.getFileName()).append(" | ")
                .append(traceElement.getLineNumber()).append(" | ")
                .append(traceElement.getMethodName()).append("()").append("]");
        String TAG = toStringBuffer.toString();
        return TAG;
    }

    public static void e(String msg) {
        StackTraceElement traceElement = new Exception()
                .getStackTrace()[1];
        e(getTag(traceElement), msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void e(Exception ex) {
        // StackTraceElement traceElement = new java.lang.Exception()
        // .getStackTrace()[1];
        StackTraceElement traceElement = Thread.currentThread().getStackTrace()[1];
        e(getTag(traceElement), ex.toString());
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void d(String msg) {
        StackTraceElement traceElement = new Exception()
                .getStackTrace()[1];
        d(getTag(traceElement), msg);
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void i(String msg) {
        StackTraceElement traceElement = new Exception()
                .getStackTrace()[1];
        i(getTag(traceElement), msg);
    }
}
