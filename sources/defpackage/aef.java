package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.aisuggest.ContentBean;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumDetailBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.am;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.afv;
import defpackage.agg;
import defpackage.ago;
import defpackage.axm;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ProgramAisuggest.java */
/* renamed from: aef  reason: default package */
/* loaded from: classes2.dex */
public class aef {

    /* compiled from: ProgramAisuggest.java */
    /* renamed from: aef$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aef a = new aef();
    }

    public static aef a() {
        return a.a;
    }

    public aef() {
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveAisuggest(afv.a aVar) {
        ContentBean a2 = aVar.a();
        if (a2.getType() == 2) {
            RdAlbumBean rdAlbumBean = (RdAlbumBean) z.a(a2.getObject(), (Class<Object>) RdAlbumBean.class);
            if (rdAlbumBean == null) {
                LogUtils.i("MusicAisuggest", "onReceiveSuggest rdBean == null");
            } else if (TextUtils.equals(a2.getCmd(), "open")) {
                a(rdAlbumBean.getId());
            } else if (TextUtils.equals(a2.getCmd(), "play")) {
                b(rdAlbumBean.getId());
            } else if (TextUtils.equals(a2.getCmd(), "replay")) {
                c(rdAlbumBean.getId());
            } else {
                LogUtils.i("MusicAisuggest", "CMD error, cmd=" + a2.getCmd() + "");
            }
        } else if (a2.getType() == 5) {
            LogUtils.i("MusicAisuggest", "received ai SGST_TYPE_HEADSPEECH");
            b();
        }
    }

    public void a(long j) {
        LogUtils.i("MusicAisuggest", "try openRdAlbum!");
        if (c()) {
            return;
        }
        am.a();
        axp.a().a(j, new avc<FMAlbumDetailBean>() { // from class: aef.1
            @Override // defpackage.avc
            public void a(FMAlbumDetailBean fMAlbumDetailBean) {
                LogUtils.i("MusicAisuggest", "openRdAlbum success!");
                ago.f fVar = new ago.f(fMAlbumDetailBean.getData());
                fVar.a(true);
                fVar.b(false);
                u.e(fVar);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.i("MusicAisuggest", "openRdAlbum err: " + str);
                ak.b(com.xiaopeng.musicradio.a.a, bj.b(i, str));
            }
        });
        bch.b(j);
    }

    public void b(final long j) {
        if (c()) {
            return;
        }
        axp.a().a(j, new avc<FMAlbumDetailBean>() { // from class: aef.2
            @Override // defpackage.avc
            public void a(FMAlbumDetailBean fMAlbumDetailBean) {
                String str = "reading_album_" + j;
                String str2 = fMAlbumDetailBean.getData().getSort() == 0 ? "timeAsc" : "timeDesc";
                ReadingInfo a2 = axk.a().a(fMAlbumDetailBean.getData().getId());
                if (a2 != null) {
                    str2 = a2.getSort();
                }
                LogUtils.i("MusicAisuggest", "" + str2);
                axm axmVar = new axm(new axm.a().a(str).b(str2).a(fMAlbumDetailBean.getData()).a(true)) { // from class: aef.2.1
                    private boolean b = false;

                    @Override // defpackage.ahp
                    public void a(boolean z, int i, int i2, List<ProgramBean> list) {
                        super.a(z, i, i2, list);
                        if (this.b) {
                            return;
                        }
                        this.b = true;
                        u.c(new agg.r(3));
                    }
                };
                amw.a().c();
                axmVar.e(true);
                axn.i().a((ahp<ProgramBean>) axmVar);
                if (!TextUtils.equals(str, axn.i().s()) || axn.i().l().isEmpty()) {
                    return;
                }
                u.c(new agg.r(3));
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.i("MusicAisuggest", "playRdAlbum err: " + str);
                ak.b(com.xiaopeng.musicradio.a.a, bj.b(i, str));
            }
        });
        bch.d(j);
    }

    public void c(final long j) {
        if (c()) {
            return;
        }
        axp.a().a(j, new avc<FMAlbumDetailBean>() { // from class: aef.3
            @Override // defpackage.avc
            public void a(FMAlbumDetailBean fMAlbumDetailBean) {
                String str = "reading_album_" + j;
                ReadingInfo a2 = axk.a().a(fMAlbumDetailBean.getData().getId());
                String sort = a2 != null ? a2.getSort() : null;
                LogUtils.i("MusicAisuggest", "" + sort);
                axn.i().a((ahp<ProgramBean>) new axm(new axm.a().a(str).b(sort).a(fMAlbumDetailBean.getData()).a(true)) { // from class: aef.3.1
                    private boolean b = false;

                    @Override // defpackage.ahp
                    public void a(boolean z, int i, int i2, List<ProgramBean> list) {
                        super.a(z, i, i2, list);
                        if (this.b) {
                            return;
                        }
                        this.b = true;
                        u.c(new agg.r(3));
                    }
                });
                if (!TextUtils.equals(str, axn.i().s()) || axn.i().l().isEmpty()) {
                    return;
                }
                u.c(new agg.r(3));
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.i("MusicAisuggest", "replayRdAlbum err: " + str);
                ak.b(com.xiaopeng.musicradio.a.a, bj.b(i, str));
            }
        });
        bch.e(j);
    }

    public void b() {
        axn.i().a((ahp<ProgramBean>) new axm.a().a("headspeech").a(true).b(10).a());
        ban.b(new Runnable() { // from class: aef.4
            @Override // java.lang.Runnable
            public void run() {
                if (axn.i().m() > 0) {
                    ak.b(com.xiaopeng.musicradio.a.a, f.h.ever_play_this_program);
                }
            }
        }, 200L);
    }

    private boolean c() {
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
            return false;
        }
        ak.b(com.xiaopeng.musicradio.a.a, bj.b(-1, null));
        return true;
    }
}
