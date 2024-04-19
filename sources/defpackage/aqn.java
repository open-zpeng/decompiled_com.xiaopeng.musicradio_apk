package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import defpackage.apx;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: AuthModelImpl.java */
/* renamed from: aqn  reason: default package */
/* loaded from: classes2.dex */
public class aqn implements aqs {
    private volatile String a;
    private volatile long b;
    private boolean c;
    private boolean d;
    private Calendar e;
    private Disposable f;
    private String g;

    public aqn() {
        Calendar calendar = this.e;
        this.e = Calendar.getInstance();
        u.a(this);
        i();
    }

    @Override // defpackage.aqs
    public void a(String str, String str2, long j, String str3) {
        LogUtils.i("AuthModel", "onBindSuccess");
        a(str2, j);
        u.c(new agq.g(str3));
        a(str);
    }

    @Override // defpackage.aqs
    public void a(aqt aqtVar) {
        b("logout");
        a(true);
        g();
        if (aqtVar != null) {
            aqtVar.a();
        }
    }

    @Override // defpackage.aqo
    public void f() {
        if (NetUtils.isNetworkAvailable(a.a())) {
            if (adp.a()) {
                LogUtils.i("AuthModel", "checkLogoutServer:dialog shown");
                return;
            }
            h();
            if (this.c) {
                LogUtils.i("AuthModel", "logoutServer:mExpireTime=" + this.b);
                if (this.b == 0) {
                    g();
                } else {
                    a(false);
                }
            }
        }
    }

    private void g() {
        if (!NetUtils.isNetworkAvailable(a.a())) {
            LogUtils.i("AuthModel", "logoutServer:no net");
        } else if (this.d) {
            LogUtils.i("AuthModel", "logoutServer:running");
        } else {
            this.d = true;
            adl.a(new avc<ads>() { // from class: aqn.1
                @Override // defpackage.avc
                public void a(ads adsVar) {
                    LogUtils.i("AuthModel", "logoutServer:response");
                    aqn.this.a(false);
                    aqn.this.d = false;
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    LogUtils.e("AuthModel", "logoutServer:error:" + i + ListSignBean.COLLECTID_SUFFIX + str);
                    aqn.this.d = false;
                }
            });
        }
    }

    @Override // defpackage.aqo
    public void c() {
        if (NetUtils.isNetworkAvailable(a.a)) {
            bci.e();
        }
        b("onBindInvalid");
    }

    private void b(String str) {
        LogUtils.i("AuthModel", "resetBindInfo:" + str);
        a("", 0L);
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (bcuVar != null) {
            bcuVar.clearUserData();
        }
        ban.e(new Runnable() { // from class: aqn.2
            @Override // java.lang.Runnable
            public void run() {
                aqe.b().g();
                u.c(new agq.m());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.c = z;
        ay.a("sp_logout_server_flag", z ? 1 : 0);
    }

    private void a(String str, long j) {
        this.a = str;
        this.b = j;
        ay.a("sp_qq_open_id", str);
        ay.a("sp_qq_expire_time", j);
    }

    private void h() {
        i();
        this.c = ay.b("sp_logout_server_flag", 1) == 1;
    }

    private void i() {
        if (this.b == 0) {
            this.a = ay.c("sp_qq_open_id", "");
            this.b = ay.b("sp_qq_expire_time", 0L);
        }
    }

    @Override // defpackage.aqo
    public boolean d() {
        boolean z = this.b > 0 && !TextUtils.isEmpty(this.a) && this.e.getTimeInMillis() < this.b;
        LogUtils.d("AuthModel", "isMusicBinded:" + this.a + ListSignBean.COLLECTID_SUFFIX + this.b + ListSignBean.COLLECTID_SUFFIX + z);
        return z;
    }

    @Override // defpackage.aqo
    public void a(apx.b bVar) {
        if (d()) {
            if (bVar != null) {
                bVar.a(false);
            }
        } else if (bVar != null) {
            bVar.a();
        }
    }

    @Override // defpackage.aqo
    public void b(final apx.b bVar) {
        axv.a(this.f);
        this.f = Observable.timer(500L, TimeUnit.MILLISECONDS).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: aqn.3
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                aqn.this.a(bVar);
            }
        });
    }

    @Override // defpackage.aqo
    public boolean e() {
        if (d()) {
            return false;
        }
        ak.b(a.a, f.h.kugou_unbind_tips);
        return true;
    }

    @Override // defpackage.aqs
    public String a() {
        return this.a == null ? "" : this.a;
    }

    @Override // defpackage.aqs
    public String b() {
        if (this.g == null) {
            this.g = ay.c("key_last_music_login_type", "");
        }
        return this.g;
    }

    public void a(String str) {
        this.g = str;
        ay.a("key_last_music_login_type", str);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.p pVar) {
        f();
    }
}
