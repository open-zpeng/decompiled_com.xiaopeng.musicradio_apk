package defpackage;

import com.xiaopeng.musicradio.a;
/* compiled from: BaseCommand.java */
/* renamed from: bae  reason: default package */
/* loaded from: classes2.dex */
public abstract class bae {
    private String mData;
    private String mEvent;

    protected abstract void a(String str, String str2);

    public abstract String getCommand();

    public bae(String str, String str2) {
        this.mEvent = str;
        this.mData = str2;
    }

    public void onEvent() {
        if (a.b) {
            a(this.mEvent, this.mData);
        } else {
            a();
        }
    }

    protected void a() {
        bah.a().a(this);
    }

    public void doCommand() {
        a(this.mEvent, this.mData);
    }
}
