package defpackage;

import com.xiaopeng.musicradio.utils.u;
/* compiled from: ModuleInit.java */
/* renamed from: arb  reason: default package */
/* loaded from: classes2.dex */
public abstract class arb {
    public abstract void igOff();

    public abstract void igOn();

    public abstract void initDelay();

    public abstract void initNow();

    public void initPlayer() {
    }

    public abstract void onMusicBinded();

    public abstract void registerService();

    public arb() {
        u.a(this);
    }
}
