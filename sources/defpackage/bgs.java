package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ParkingPositionBean.java */
/* renamed from: bgs  reason: default package */
/* loaded from: classes2.dex */
public class bgs {
    private int a;

    public static final bgs a(String str) {
        bgs bgsVar = new bgs();
        try {
            bgsVar.a = new JSONObject(str).optInt("position");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bgsVar;
    }

    public String toString() {
        return "ParkingPositionBean{position=" + this.a + '}';
    }
}
