package com.xiaopeng.speech.protocol.bean;

import org.json.JSONObject;
/* compiled from: CardValue.java */
/* loaded from: classes2.dex */
public class b {
    private double a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public static b a(String str) {
        b bVar = new b();
        try {
            bVar.a = new JSONObject(str).optDouble("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public static b b(String str) {
        b bVar = new b();
        try {
            bVar.b = new JSONObject(str).optInt("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public static b c(String str) {
        b bVar = new b();
        try {
            bVar.c = new JSONObject(str).optInt("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public static b d(String str) {
        b bVar = new b();
        try {
            bVar.d = new JSONObject(str).optInt("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public static b e(String str) {
        b bVar = new b();
        try {
            bVar.e = new JSONObject(str).optInt("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public static b f(String str) {
        b bVar = new b();
        try {
            bVar.f = new JSONObject(str).optInt("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public static b g(String str) {
        b bVar = new b();
        try {
            bVar.g = new JSONObject(str).optInt("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public static b h(String str) {
        b bVar = new b();
        try {
            bVar.h = new JSONObject(str).optInt("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    public String toString() {
        return "CardValue{acWindLv='" + this.a + "', acWindLv=" + this.b + ", atmosphereBrightness=" + this.c + ", atmosphereColor=" + this.d + ", acSeatHeatingLv=" + this.e + ", acSeatVentilateLv=" + this.f + ", screenBrightness=" + this.g + ", icmBrightness=" + this.h + '}';
    }
}
