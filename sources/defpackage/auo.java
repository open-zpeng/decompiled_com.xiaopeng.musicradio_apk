package defpackage;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
/* compiled from: NrPlayOpt.java */
/* renamed from: auo  reason: default package */
/* loaded from: classes2.dex */
public class auo {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NrPlayOpt.java */
    /* renamed from: auo$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final auo a = new auo();
    }

    public static auo a() {
        return a.a;
    }

    public void a(NetRadioInfo netRadioInfo) {
        if (aps.i().j() || netRadioInfo == null) {
            return;
        }
        aup.e();
        NetRadioProgramInfo d = aps.i().d();
        NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
        if (parentInfo != null && parentInfo.getId() == netRadioInfo.getId()) {
            if (aps.i().getPlayState() == 1) {
                aps.i().pause();
                return;
            } else if (aps.i().getPlayState() == 2) {
                aps.i().pause();
                return;
            } else if (aps.i().getPlayState() == 3) {
                aps.i().play();
                return;
            } else {
                aps.i().a(netRadioInfo);
                return;
            }
        }
        aps.i().a(netRadioInfo);
    }
}
