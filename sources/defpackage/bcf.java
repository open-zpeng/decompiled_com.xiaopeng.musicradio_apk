package defpackage;

import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.bm;
import com.xiaopeng.musicradio.utils.bn;
import com.xiaopeng.musicradio.utils.bo;
/* compiled from: AppPreloadUtil.java */
/* renamed from: bcf  reason: default package */
/* loaded from: classes2.dex */
public class bcf {
    public static void a() {
        int b = ay.b("msg_type", 0);
        LogUtils.i("AppPreloadUtil", "preload type:" + b);
        if (b == 3) {
            bo.a().c();
            ban.b(new Runnable() { // from class: bcf.1
                @Override // java.lang.Runnable
                public void run() {
                    bn.a().c();
                    bm.a().c();
                }
            }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        } else if (b == 6) {
            bn.a().c();
            ban.b(new Runnable() { // from class: bcf.2
                @Override // java.lang.Runnable
                public void run() {
                    bo.a().c();
                    bm.a().c();
                }
            }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        } else {
            bm.a().c();
            ban.b(new Runnable() { // from class: bcf.3
                @Override // java.lang.Runnable
                public void run() {
                    bn.a().c();
                    bo.a().c();
                }
            }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
    }
}
