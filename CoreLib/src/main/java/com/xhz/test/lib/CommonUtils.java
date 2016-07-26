package com.xhz.test.lib;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtils {

    public static String toExactString(long milliseconds) {
        return format("yyyy/M/d HH:mm", milliseconds);
    }

    private static String format(String template, long milliseconds) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(template, Locale.getDefault());
        return simpleDateFormat.format(new Date(milliseconds));
    }

    public static String formatTime(long second) {
        // Log.i("tag", "second:" + second);
        if (second < 0) return "";

        StringBuilder stringBuilder = new StringBuilder();
        long hour = second / 3600;
        if (hour > 0) {
            if (hour < 10) {
                stringBuilder.append("0");
            }
            stringBuilder.append(hour).append(":");
            second -= hour * 3600;
        } else {
            stringBuilder.append("00").append(":");
        }

        long minute = second / 60;
        if (minute > 0) {
            if (minute < 10) {
                stringBuilder.append("0");
            }
            stringBuilder.append(minute).append(":");
            second -= minute * 60;
        } else {
            stringBuilder.append("00").append(":");
        }

        if (second > 0) {
            if (second < 10) {
                stringBuilder.append("0");
            }
            stringBuilder.append(second);
        } else {
            stringBuilder.append("00");
        }

        return stringBuilder.toString();
    }
}
