package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.protocol.bean.recommend.RecommendBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.agq;
import java.util.HashMap;
/* compiled from: ProgramCollectManager.java */
/* renamed from: axh  reason: default package */
/* loaded from: classes2.dex */
public class axh implements aqd {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProgramCollectManager.java */
    /* renamed from: axh$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final axh a = new axh();
    }

    public static axh a() {
        return a.a;
    }

    public axh() {
        aql.b().a(this);
    }

    @Override // defpackage.aqd
    public void b() {
        Log.i("ProgramCollectManager", "clearUserData: ==========");
        axj.a().d();
        ay.a("should_down_read_love", true);
        anm.a().b();
        u.c(new agq.b());
    }

    @Override // defpackage.aqd
    public void c() {
        anm.a().c();
    }

    public void a(ReadLoveInfo readLoveInfo, boolean z) {
        if (axj.a().c(readLoveInfo.getAlbumId())) {
            a(readLoveInfo);
        } else {
            b(readLoveInfo, z);
        }
    }

    public void a(String str, final int i) {
        LogUtils.i("ProgramCollectManager", "playReadingTrack");
        r.a("喜马拉雅登录提示", str, new apz() { // from class: axh.1
            @Override // defpackage.apz
            public void a(boolean z) {
                LogUtils.i("ProgramCollectManager", "onLogin: ");
                if (aei.a().c() == 3) {
                    if (aqh.a().g() && i == 1) {
                        aei.a().c(3).play();
                    } else {
                        aei.a().c(3).play();
                    }
                }
            }

            @Override // defpackage.apz
            public void a() {
                LogUtils.i("ProgramCollectManager", "onLoginFail: ");
            }
        });
    }

    public void b(final ReadLoveInfo readLoveInfo, final boolean z) {
        LogUtils.i("ProgramCollectManager", "readLove");
        r.a("喜马拉雅登录提示", com.xiaopeng.musicradio.a.a.getString(b.f.title_dialog_program_login), new apz() { // from class: axh.2
            @Override // defpackage.apz
            public void a(boolean z2) {
                LogUtils.i("ProgramCollectManager", "onLogin: ");
                if (axj.a().e() >= 500) {
                    ak.a(com.xiaopeng.musicradio.a.a, "订阅读物已达上限");
                    u.c(new agq.o(readLoveInfo.getAlbumId(), false));
                } else if (z) {
                } else {
                    LogUtils.i("ProgramCollectManager", "saveAsync not News");
                    axj.a().a(readLoveInfo);
                    u.c(new agq.o(readLoveInfo.getAlbumId(), true));
                    afi.d().a(ano.a(readLoveInfo));
                    aqg.c().a();
                    HashMap hashMap = new HashMap();
                    hashMap.put(RecommendBean.SHOW_TIME_RESULT, "add");
                    hashMap.put(VuiConstants.ELEMENT_TYPE, "reading");
                    hashMap.put("voiceid", Long.valueOf(readLoveInfo.getAlbumId()));
                    hashMap.put("voice", readLoveInfo.getAlbumName());
                    hashMap.put("person", readLoveInfo.getArtist());
                    bci.c(hashMap);
                }
            }

            @Override // defpackage.apz
            public void a() {
                LogUtils.i("ProgramCollectManager", "onLoginFail: ");
                u.c(new agq.o(readLoveInfo.getAlbumId(), false));
            }
        });
    }

    public void a(final ReadLoveInfo readLoveInfo) {
        LogUtils.i("ProgramCollectManager", "readCancelLove");
        aqf.a().a(new apz() { // from class: axh.3
            @Override // defpackage.apz
            public void a(boolean z) {
                LogUtils.i("ProgramCollectManager", "onLogin: ");
                axj.a().b(readLoveInfo.getAlbumId());
                u.c(new agq.o(readLoveInfo.getAlbumId(), false));
                afi.d().a(ano.b(readLoveInfo));
                aqg.c().a();
                HashMap hashMap = new HashMap();
                hashMap.put(RecommendBean.SHOW_TIME_RESULT, "cancel");
                hashMap.put(VuiConstants.ELEMENT_TYPE, "reading");
                hashMap.put("voiceid", Long.valueOf(readLoveInfo.getAlbumId()));
                hashMap.put("voice", readLoveInfo.getAlbumName());
                hashMap.put("person", readLoveInfo.getArtist());
                bci.c(hashMap);
            }

            @Override // defpackage.apz
            public void a() {
                LogUtils.i("ProgramCollectManager", "onLoginFail: ");
                u.c(new agq.o(readLoveInfo.getAlbumId(), true));
            }
        });
    }

    public void a(ProgramBean programBean, int i, @ReadingInfo.SORT String str) {
        LogUtils.i("ProgramCollectManager", "saveReadHistory: " + i);
        final ReadHistoryInfo a2 = aq.a(programBean, i, str);
        if (programBean.getChannelId() == 0 || axk.a().c(a2.getAlbumId())) {
            if (programBean.getChannelId() > 0) {
                axk.a().a(a2);
            }
            axi.a().a(a2);
            return;
        }
        LogUtils.i("ProgramCollectManager", "saveReadHistory news , may delay a little ");
        axk.a().a(a2.getAlbumId(), new Runnable() { // from class: axh.4
            @Override // java.lang.Runnable
            public void run() {
                axk.a().a(a2);
                axi.a().a(a2);
            }
        }, new Runnable() { // from class: axh.5
            @Override // java.lang.Runnable
            public void run() {
                axi.a().a(a2);
            }
        });
    }

    public void a(long j) {
        axi.a().b(j);
    }

    @Override // defpackage.aqd
    public void e() {
        d();
    }

    public void d() {
        anm.a().d();
    }
}
