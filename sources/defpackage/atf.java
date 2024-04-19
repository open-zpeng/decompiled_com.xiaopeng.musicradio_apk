package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.bb;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MsPlayOpt.java */
/* renamed from: atf  reason: default package */
/* loaded from: classes2.dex */
public class atf {

    /* compiled from: MsPlayOpt.java */
    /* renamed from: atf$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final atf a = new atf();
    }

    public static atf a() {
        return a.a;
    }

    public void a(String str) {
        a(str, false);
    }

    public void a(String str, boolean z) {
        if (TextUtils.equals(apk.i().x(), str)) {
            if (apk.i().getPlayState() == 1) {
                if (z) {
                    return;
                }
                apk.i().pause();
                return;
            } else if (apk.i().getPlayState() == 2) {
                if (z) {
                    return;
                }
                apk.i().pause();
                return;
            } else if (apk.i().getPlayState() == 3) {
                apk.i().play();
                bci.c();
                return;
            } else {
                apk.i().a(new amq(str, 50) { // from class: atf.1
                    @Override // defpackage.ahp
                    public boolean n() {
                        return true;
                    }

                    @Override // defpackage.ahp
                    public void a(boolean z2, int i, String str2) {
                        super.a(z2, i, str2);
                        ak.a(com.xiaopeng.musicradio.a.a, str2);
                    }
                });
                return;
            }
        }
        apk.i().a(new amq(str, 50) { // from class: atf.2
            @Override // defpackage.ahp
            public boolean n() {
                return true;
            }

            @Override // defpackage.ahp
            public void a(boolean z2, int i, String str2) {
                super.a(z2, i, str2);
                ak.a(com.xiaopeng.musicradio.a.a, str2);
            }
        });
    }

    public void a(String str, List<MusicInfo> list) {
        if (TextUtils.equals(apk.i().x(), str)) {
            if (apk.i().getPlayState() == 1) {
                apk.i().pause();
                return;
            } else if (apk.i().getPlayState() == 2) {
                apk.i().pause();
                return;
            } else if (apk.i().getPlayState() == 3) {
                apk.i().play();
                bci.c();
                return;
            } else {
                apk.i().a(new amq(str, 0, 50, list, bb.a(list)));
                return;
            }
        }
        apk.i().a(new amq(str, 0, 50, list, bb.a(list)));
    }

    public void a(List<MusicInfo> list, String str, int i, MusicInfo musicInfo) {
        MusicInfo d = apk.i().d();
        String x = apk.i().x();
        boolean z = true;
        if (musicInfo == null) {
            if (d == null || !TextUtils.equals(str, x)) {
                z = false;
            }
        } else if (d == null || !d.equals(musicInfo)) {
            z = false;
        }
        if (z) {
            if (apk.i().getPlayState() == 2) {
                apk.i().pause();
            } else {
                apk.i().play();
            }
        } else if (list == null || list.isEmpty()) {
        } else {
            apk.i().a(new amq(str, 0, 50, new ArrayList(list), i) { // from class: atf.3
                @Override // defpackage.ahp
                public boolean n() {
                    return true;
                }
            });
        }
    }
}
