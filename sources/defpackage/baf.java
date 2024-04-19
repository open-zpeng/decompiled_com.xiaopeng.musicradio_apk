package defpackage;

import com.xiaopeng.musicradio.a;
import org.json.JSONObject;
/* compiled from: BasePushCommand.java */
/* renamed from: baf  reason: default package */
/* loaded from: classes2.dex */
public abstract class baf {
    private JSONObject mBundle;
    private int mId;

    protected abstract void a(int i, JSONObject jSONObject);

    public abstract String getCommand();

    public baf(int i, JSONObject jSONObject) {
        this.mId = i;
        this.mBundle = jSONObject;
    }

    public void onEvent() {
        if (a.b) {
            a(this.mId, this.mBundle);
        } else {
            a();
        }
    }

    protected void a() {
        bah.a().a(this);
    }

    public void doCommand() {
        a(this.mId, this.mBundle);
    }
}
