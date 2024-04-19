package defpackage;

import org.json.JSONObject;
/* compiled from: ControlReason.java */
/* renamed from: bgu  reason: default package */
/* loaded from: classes2.dex */
public class bgu {
    private int a;

    public static bgu a(String str) {
        bgu bguVar = new bgu();
        bguVar.a(0);
        try {
            bguVar.a(new JSONObject(str).optInt("reason"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bguVar;
    }

    public void a(int i) {
        this.a = i;
    }
}
