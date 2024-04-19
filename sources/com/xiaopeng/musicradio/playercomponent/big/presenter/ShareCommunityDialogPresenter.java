package com.xiaopeng.musicradio.playercomponent.big.presenter;

import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareContentBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareSongBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.f;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import defpackage.afx;
import defpackage.agd;
import defpackage.agg;
import defpackage.amx;
import defpackage.avp;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ShareCommunityDialogPresenter extends BasePresenter<f> {
    public String b;
    public ShareContentBean c;
    private int d;
    private BaseInfo e;
    private aek f;
    private amx.a g;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("ShareCommunityDialogPresenter", "onCreate: ======");
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        Log.i("ShareCommunityDialogPresenter", "onDestroy: ======");
        u.b(this);
    }

    public void a(String str) {
        if (aei.a().e() == null) {
            return;
        }
        int i = this.d;
        if (i == 0) {
            a(str, (MusicInfo) this.e);
        } else if (i != 3) {
        } else {
            a(str, (ProgramBean) this.e);
        }
    }

    private void a(String str, MusicInfo musicInfo) {
        a(avv.a(str, musicInfo));
    }

    public void a(ShareSongBean shareSongBean) {
        if (shareSongBean == null) {
            if (a() != null) {
                a().b(null);
            }
            Log.i("ShareCommunityDialogPresenter", "shareSongBean: is null");
            return;
        }
        avs.a().a(shareSongBean, new avc<BaseBean>() { // from class: com.xiaopeng.musicradio.playercomponent.big.presenter.ShareCommunityDialogPresenter.1
            @Override // defpackage.avc
            public void a(BaseBean baseBean) {
                LogUtils.i("ShareCommunityDialogPresenter", "Success = " + baseBean.getCode());
                if (ShareCommunityDialogPresenter.this.a() != null) {
                    ShareCommunityDialogPresenter.this.a().b();
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.w("ShareCommunityDialogPresenter", "fail code: " + i + " msg= " + str);
                if (ShareCommunityDialogPresenter.this.a() != null) {
                    ShareCommunityDialogPresenter.this.a().b(null);
                }
            }
        });
    }

    private void a(String str, ProgramBean programBean) {
        a(avv.a(str, programBean));
    }

    public void a(ShareProgramBean shareProgramBean) {
        if (shareProgramBean == null) {
            if (a() != null) {
                a().b(null);
            }
            Log.i("ShareCommunityDialogPresenter", "shareProgramBean: is null");
            return;
        }
        avs.a().a(shareProgramBean, new avc<BaseBean>() { // from class: com.xiaopeng.musicradio.playercomponent.big.presenter.ShareCommunityDialogPresenter.2
            @Override // defpackage.avc
            public void a(BaseBean baseBean) {
                LogUtils.i("ShareCommunityDialogPresenter", "Success = " + baseBean.getCode());
                if (ShareCommunityDialogPresenter.this.a() != null) {
                    ShareCommunityDialogPresenter.this.a().b();
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.i("ShareCommunityDialogPresenter", "failed id = " + i + " fail message: " + str);
                if (ShareCommunityDialogPresenter.this.a() != null) {
                    if (i != -1) {
                        ShareCommunityDialogPresenter.this.a().b(str);
                    } else {
                        ShareCommunityDialogPresenter.this.a().b(null);
                    }
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRefresh(agg.h hVar) {
        Log.i("ShareCommunityDialogPresenter", "onRefresh: " + hVar.a() + " getType = " + aei.a().c());
        if (hVar.a() == aei.a().c()) {
            this.d = hVar.a();
            this.f = aei.a().c(this.d);
            a(this.f, this.d);
            d();
            a(hVar.a());
            f();
            c();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onThemeChange(afx.b bVar) {
        e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBackground(afx.a aVar) {
        if (aVar == null || !aVar.a() || a() == null) {
            return;
        }
        a().a();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPhoneChange(agd.f fVar) {
        if (fVar == null || !fVar.a() || a() == null) {
            return;
        }
        a().a();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        if (sVar == null || sVar.a() || a() == null) {
            return;
        }
        a().a();
    }

    private void a(aek aekVar, int i) {
        if (aekVar == null || !a(aekVar)) {
            return;
        }
        if (i == 0) {
            this.e = (MusicInfo) aekVar.d();
        } else if (i != 3) {
        } else {
            this.e = (ProgramBean) aekVar.d();
        }
    }

    private void d() {
        amx.a d = amx.a().d();
        this.g = d;
        Log.i("ShareCommunityDialogPresenter", "onRefreshLogo: =======" + d);
        if (d == null || d.b() == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(a.a.getResources(), d.b());
        if (a() != null) {
            a().a(bitmapDrawable);
        }
    }

    private void e() {
        amx.a d = amx.a().d();
        Log.i("ShareCommunityDialogPresenter", "onRefreshLogo: =======" + d);
        if (d == null || d.b() == null || !d.e() || d != this.g) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(a.a.getResources(), d.b());
        if (a() != null) {
            a().a(bitmapDrawable);
        }
    }

    private void f() {
        String j = w.j();
        String str = adb.a(a.a).a;
        if (a() != null) {
            a().b(str, j);
        }
    }

    public void a(int i) {
        aek aekVar = this.f;
        if (aekVar == null) {
            return;
        }
        if (i == 0) {
            MusicInfo musicInfo = (MusicInfo) aekVar.d();
            if (a() == null || musicInfo == null) {
                return;
            }
            a().b_(musicInfo.getSong(), musicInfo.getSinger());
        } else if (i != 3) {
        } else {
            ProgramBean programBean = (ProgramBean) aekVar.d();
            if (a() == null || programBean == null) {
                return;
            }
            a().b_(programBean.getAlbumName(), programBean.getArtistName());
        }
    }

    public void c() {
        avs.a().a(new avc<ShareContentBean>() { // from class: com.xiaopeng.musicradio.playercomponent.big.presenter.ShareCommunityDialogPresenter.3
            @Override // defpackage.avc
            public void a(ShareContentBean shareContentBean) {
                List<String> a = avv.a(shareContentBean, ShareCommunityDialogPresenter.this.d);
                if (a == null || a.isEmpty()) {
                    if (ShareCommunityDialogPresenter.this.d != 0) {
                        if (ShareCommunityDialogPresenter.this.d == 3) {
                            ShareCommunityDialogPresenter.this.b = a.a.getResources().getString(avp.d.default_program_content, "E38");
                        }
                    } else {
                        ShareCommunityDialogPresenter.this.b = a.a.getResources().getString(avp.d.default_music_content, "E38");
                    }
                } else {
                    ShareCommunityDialogPresenter.this.b = avv.a(a);
                    if (ShareCommunityDialogPresenter.this.a() != null) {
                        ShareCommunityDialogPresenter.this.a().a(ShareCommunityDialogPresenter.this.b);
                    }
                }
                ShareCommunityDialogPresenter.this.c = shareContentBean;
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.i("ShareCommunityDialogPresenter", "failed id = " + i + "fail message: " + str);
                if (ShareCommunityDialogPresenter.this.a() != null) {
                    if (ShareCommunityDialogPresenter.this.d == 0) {
                        ShareCommunityDialogPresenter.this.a().c(a.a.getResources().getString(avp.d.default_music_content, w.j()));
                    } else {
                        ShareCommunityDialogPresenter.this.a().c(a.a.getResources().getString(avp.d.default_program_content, w.j()));
                    }
                }
            }
        });
    }

    private boolean a(aek aekVar) {
        return aekVar.d() != null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSubDialogCreate(agg.aa aaVar) {
        if (a() != null) {
            a().a();
        }
    }
}
