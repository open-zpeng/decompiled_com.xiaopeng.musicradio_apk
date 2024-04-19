package defpackage;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
/* compiled from: BaseUpdate.java */
/* renamed from: apo  reason: default package */
/* loaded from: classes2.dex */
public abstract class apo {
    protected boolean a;
    protected String b;

    /* compiled from: BaseUpdate.java */
    /* renamed from: apo$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(NetRadioInfo netRadioInfo);
    }

    public abstract void a(a aVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a = true;
    }

    public apo(String str) {
        this.b = str;
    }
}
