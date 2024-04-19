package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.push.PushUserBean;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agg;
import defpackage.agq;
import java.util.Calendar;
import java.util.Objects;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ReadingAuthModelImpl.java */
/* renamed from: aqq  reason: default package */
/* loaded from: classes2.dex */
public class aqq implements aqu {
    private volatile String a;
    private volatile String b;
    private boolean c;
    private boolean d;
    private Calendar e;
    private apz f;

    public aqq() {
        Calendar calendar = this.e;
        this.e = Calendar.getInstance();
        u.a(this);
        j();
    }

    @Override // defpackage.aqu
    public void a(String str, String str2) {
        LogUtils.i("ReadingAuthModel", "onBindSuccess");
        b();
        b(str, str2);
        u.c(new agq.r());
        apz apzVar = this.f;
        if (apzVar != null) {
            apzVar.a(true);
        }
        this.f = null;
    }

    @Override // defpackage.aqu
    public void a(aqa aqaVar) {
        b("logout");
        a(true);
        a();
        if (aqaVar != null) {
            aqaVar.a(false);
        }
    }

    @Override // defpackage.aqp
    public void d() {
        if (NetUtils.isNetworkAvailable(a.a())) {
            if (adz.a()) {
                LogUtils.i("ReadingAuthModel", "checkLogoutServer:dialog shown");
                return;
            }
            i();
            if (this.c) {
                LogUtils.i("ReadingAuthModel", "logoutServer:mSid=" + this.b);
                if (TextUtils.isEmpty(this.b)) {
                    a();
                } else {
                    a(false);
                }
            }
        }
    }

    private void a() {
        if (!NetUtils.isNetworkAvailable(a.a())) {
            LogUtils.i("ReadingAuthModel", "logoutServer:no net");
        } else if (this.d) {
            LogUtils.i("ReadingAuthModel", "logoutServer:running");
        } else {
            this.d = true;
            adu.a(new avc<aeb>() { // from class: aqq.1
                @Override // defpackage.avc
                public void a(aeb aebVar) {
                    LogUtils.i("ReadingAuthModel", "logoutServer:response");
                    aqq.this.a(false);
                    aqq.this.d = false;
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    LogUtils.e("ReadingAuthModel", "logoutServer:error:" + i + ListSignBean.COLLECTID_SUFFIX + str);
                    aqq.this.d = false;
                }
            });
        }
    }

    @Override // defpackage.aqp
    public void c() {
        if (NetUtils.isNetworkAvailable(a.a)) {
            bci.e();
        }
        b("onBindInvalid");
    }

    private void b(String str) {
        LogUtils.i("ReadingAuthModel", "resetBindInfo:" + str);
        k();
        b("", "");
        bcv bcvVar = (bcv) c.a().b(bcv.class);
        if (bcvVar != null) {
            bcvVar.clearUserData();
        }
        u.c(new agq.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.c = z;
        ay.a("sp_xmly_logout_server_flag", z ? 1 : 0);
    }

    private void b(String str, String str2) {
        this.a = str;
        this.b = str2;
        ay.a("sp_xmly_open_id", str);
        ay.a("sp_xmly_sid", str2);
    }

    private void b() {
        ay.a("sp_xmly_login_time", System.currentTimeMillis());
    }

    private long h() {
        return ay.b("sp_xmly_login_time", 0L);
    }

    private void i() {
        j();
        this.c = ay.b("sp_xmly_logout_server_flag", 1) == 1;
    }

    private void j() {
        if (TextUtils.isEmpty(this.b)) {
            this.a = ay.c("sp_xmly_open_id", "");
            this.b = ay.c("sp_xmly_sid", "");
        }
    }

    @Override // defpackage.aqp
    public boolean e() {
        boolean z = (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) ? false : true;
        LogUtils.d("ReadingAuthModel", "isReadingBinded:" + this.a + ListSignBean.COLLECTID_SUFFIX + this.b + ListSignBean.COLLECTID_SUFFIX + z);
        return z;
    }

    @Override // defpackage.aqp
    public void a(apz apzVar) {
        k();
        if (!e()) {
            this.f = apzVar;
            adz.c();
        } else if (apzVar != null) {
            apzVar.a(false);
        }
    }

    private void k() {
        apz apzVar = this.f;
        if (apzVar != null) {
            try {
                apzVar.a();
            } catch (Exception e) {
                LogUtils.e("ReadingAuthModel", "resetLoginCallback:" + e.getLocalizedMessage());
            }
        }
        this.f = null;
    }

    @Override // defpackage.aqp
    public String f() {
        return this.a == null ? "" : this.a;
    }

    @Override // defpackage.aqp
    public String g() {
        return this.b == null ? "" : this.b;
    }

    @Override // defpackage.aqp
    public void a(String str) {
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        this.b = str;
        ay.a("sp_xmly_sid", str);
    }

    @Override // defpackage.aqp
    public void a(String str, long j) {
        PushUserBean pushUserBean;
        LogUtils.i("ReadingAuthModel", "onServerPush=" + str);
        if (TextUtils.isEmpty(str) || (pushUserBean = (PushUserBean) z.a(str, (Class<Object>) PushUserBean.class)) == null) {
            return;
        }
        String f = f();
        long h = h();
        LogUtils.i("ReadingAuthModel", "onServerPush:openId=" + f + ",loginTime=" + h + ",validStartTs=" + j);
        if (!Objects.equals(pushUserBean.getOpenId(), f) || j < h) {
            return;
        }
        b("onServerPush");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.p pVar) {
        d();
    }
}
