package defpackage;

import android.content.Context;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.VipDetail;
import com.xiaopeng.musicradio.login.manager.main.presenter.LoginManagerPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import java.util.List;
/* compiled from: LoginManagerViewProxy.java */
/* renamed from: ahk  reason: default package */
/* loaded from: classes2.dex */
public class ahk extends aeu<ahi, LoginManagerPresenter> implements ahi {
    @Override // defpackage.ahi
    public void a(String str, String str2, boolean z, boolean z2, String str3, List<VipDetail> list) {
    }

    public ahk(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public LoginManagerPresenter g() {
        return new LoginManagerPresenter();
    }

    @Override // defpackage.ahi
    public void a_(boolean z) {
        if (z) {
            ((LoginManagerPresenter) this.c).f();
        }
        a("OnQqAuthChanged", Boolean.valueOf(z));
        c(z);
    }

    @Override // defpackage.ahi
    public void b(boolean z) {
        if (z) {
            ((LoginManagerPresenter) this.c).h();
        }
        a("OnXmlyAuthChanged", Boolean.valueOf(z));
        d(z);
    }

    @Override // defpackage.ahi
    public void a(String str, String str2, boolean z, String str3) {
        a(ahl.a(str, str2, z, str3, false));
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("logout".equals(str)) {
            if (SkillStatisticsBean.PAGE_MUSIC.equals(bArr)) {
                ((LoginManagerPresenter) this.c).g();
            } else {
                ((LoginManagerPresenter) this.c).i();
            }
        } else if ("getAuth".equals(str)) {
            ((LoginManagerPresenter) this.c).c();
        }
        if ("isMusicAuth".equals(str)) {
            ((LoginManagerPresenter) this.c).d();
        } else if ("isXmlyAuth".equals(str)) {
            ((LoginManagerPresenter) this.c).e();
        } else if ("getMusicAccountInfo".equals(str)) {
            ((LoginManagerPresenter) this.c).f();
        } else if ("getXmlyAccountInfo".equals(str)) {
            ((LoginManagerPresenter) this.c).h();
        } else if ("logoutMusic".equals(str)) {
            ((LoginManagerPresenter) this.c).g();
        } else if ("logoutXmly".equals(str)) {
            ((LoginManagerPresenter) this.c).i();
        } else if ("getLastMusicLoginType".equals(str)) {
            b();
        }
    }

    public void b() {
        a("LoginManagerViewProxy_getLastMusicLoginType", (AbstractMessageLite) Common.StringParam.newBuilder().a(((aqs) apx.a().b()).b()).build());
    }

    public void c(boolean z) {
        a("LoginManagerViewProxy_login_music_isauth", ahl.a(z));
    }

    public void d(boolean z) {
        a("LoginManagerViewProxy_login_xmly_isauth", ahl.a(z));
    }

    public void a(AbstractMessageLite abstractMessageLite) {
        a("LoginManagerViewProxy_login_xmly_accountinfo", abstractMessageLite);
    }
}
