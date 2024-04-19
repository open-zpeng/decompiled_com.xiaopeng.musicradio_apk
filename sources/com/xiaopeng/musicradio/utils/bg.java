package com.xiaopeng.musicradio.utils;

import com.xiaopeng.lib.utils.info.BuildInfoUtils;
import defpackage.agu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: TimeUtil.java */
/* loaded from: classes2.dex */
public class bg {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    public static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat c = new SimpleDateFormat("MM-dd HH:mm");
    public static final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat e = new SimpleDateFormat("mm:ss");
    public static final SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
    public static final SimpleDateFormat g = new SimpleDateFormat("HH:mm");
    public static final SimpleDateFormat h = new SimpleDateFormat("a h:mm");
    public static final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
    public static final SimpleDateFormat j = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    public static final SimpleDateFormat k = new SimpleDateFormat("yyyy/MM/dd");
    private static final SimpleDateFormat l = new SimpleDateFormat("HH:mm", Locale.CHINA);
    private static Date m = new Date();
    private static String[] n = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    private static final Calendar o = Calendar.getInstance();
    private static final SimpleDateFormat p = new SimpleDateFormat();

    public static String a(long j2, SimpleDateFormat simpleDateFormat) {
        m.setTime(j2);
        return simpleDateFormat.format(m);
    }

    public static String a(long j2) {
        return a(j2, k);
    }

    public static Date a(String str) {
        try {
            return g.parse(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static long b(long j2) {
        return (j2 - (c(j2) * 60000)) / 1000;
    }

    public static long c(long j2) {
        return j2 / 60000;
    }

    public static long d(long j2) {
        return j2 / 3600000;
    }

    public static long e(long j2) {
        return d(j2) / 24;
    }

    public static long f(long j2) {
        return (j2 - (((d(j2) * 1000) * 60) * 60)) / 60000;
    }

    public static long g(long j2) {
        return ((j2 / 3600000) + 8) % 24;
    }

    private static SimpleDateFormat d() {
        return new SimpleDateFormat(String.format("M%sd%s", com.xiaopeng.musicradio.a.a.getString(agu.b.time_month), com.xiaopeng.musicradio.a.a.getString(agu.b.time_day)), Locale.CHINA);
    }

    public static String h(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return d().format(calendar.getTime());
    }

    public static String i(long j2) {
        long time = new Date().getTime() - j2;
        if (time < 60000) {
            return "1分钟前";
        }
        if (time < 3600000) {
            long c2 = c(time);
            StringBuilder sb = new StringBuilder();
            if (c2 <= 0) {
                c2 = 1;
            }
            sb.append(c2);
            sb.append("分钟前");
            return sb.toString();
        } else if (time < 86400000) {
            return ((int) Math.rint(((float) c(time)) / 60.0f)) + "小时前";
        } else if (time < 604800000) {
            long e2 = e(time);
            StringBuilder sb2 = new StringBuilder();
            if (e2 <= 0) {
                e2 = 1;
            }
            sb2.append(e2);
            sb2.append("天前");
            return sb2.toString();
        } else {
            return d.format(new Date(j2));
        }
    }

    public static long a(int i2) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(5, calendar.get(5) + i2);
        return calendar.getTimeInMillis();
    }

    public static String a() {
        switch (Calendar.getInstance().get(7)) {
            case 1:
                return "7";
            case 2:
                return "1";
            case 3:
                return "2";
            case 4:
                return "3";
            case 5:
                return BuildInfoUtils.BID_LAN;
            case 6:
                return BuildInfoUtils.BID_PT_SPECIAL_1;
            case 7:
                return BuildInfoUtils.BID_PT_SPECIAL_2;
            default:
                return "";
        }
    }

    public static String b() {
        switch (Calendar.getInstance().get(7)) {
            case 1:
                return BuildInfoUtils.BID_PT_SPECIAL_2;
            case 2:
                return "7";
            case 3:
                return "1";
            case 4:
                return "2";
            case 5:
                return "3";
            case 6:
                return BuildInfoUtils.BID_LAN;
            case 7:
                return BuildInfoUtils.BID_PT_SPECIAL_1;
            default:
                return "";
        }
    }

    public static long c() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(10, 12);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i2 = calendar.get(5);
        if (i2 <= 9) {
            return "0" + i2;
        }
        return i2 + "";
    }

    public static String b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i2 = calendar.get(2);
        String[] strArr = n;
        if (i2 >= strArr.length) {
            return strArr[0];
        }
        return strArr[i2];
    }

    public static long c(Date date) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
