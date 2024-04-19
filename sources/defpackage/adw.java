package defpackage;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.utils.b;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.adx;
import defpackage.aea;
import defpackage.aec;
import defpackage.afx;
import defpackage.agd;
import defpackage.agg;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: QrCodePresenter.java */
/* renamed from: adw  reason: default package */
/* loaded from: classes2.dex */
public class adw extends e<adv> {
    private a b;
    private boolean c;
    private adx.a d;
    private boolean e;
    private boolean f;
    private int g;

    static /* synthetic */ int c(adw adwVar) {
        int i = adwVar.g + 1;
        adwVar.g = i;
        return i;
    }

    public adw(adx.a aVar) {
        this.d = aVar;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void a(adv advVar) {
        super.a((adw) advVar);
        if (this.f) {
            return;
        }
        u.a(this);
        this.f = true;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void a() {
        super.a();
        a aVar = this.b;
        if (aVar == null || aVar.a()) {
            a("detachView");
        }
    }

    public void b() {
        LogUtils.i("XQrCodePresenter", "applyQrCode:" + this.c);
        if (this.c) {
            return;
        }
        a(false, "applyQrCode");
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
            a((Integer) (-6));
            return;
        }
        this.c = true;
        adu.a("qq", new avc<aec>() { // from class: adw.1
            @Override // defpackage.avc
            public void a(aec aecVar) {
                LogUtils.i("XQrCodePresenter", "getQrCode");
                adw.this.c = false;
                if (aecVar.getCode() == 200) {
                    if (aecVar.data != null && !TextUtils.isEmpty(aecVar.data.a)) {
                        adw.this.a(aecVar.data);
                        return;
                    } else {
                        adw.this.a(Integer.valueOf(aecVar.getCode()));
                        return;
                    }
                }
                adw.this.a(Integer.valueOf(aecVar.getCode()));
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.i("XQrCodePresenter", "getQrCode:onError:" + i + ListSignBean.COLLECTID_SUFFIX + str);
                adw.this.c = false;
                adw.this.a(Integer.valueOf(i));
            }
        });
    }

    public void a(aec.a aVar) {
        if (j() == null) {
            return;
        }
        j().a(1, aVar.a);
        a(false, "onGetQRCodeSuccess");
        a(aVar.b, aVar.c);
    }

    public void a(Integer num) {
        if (num != null && num.intValue() == -6) {
            ban.b(new Runnable() { // from class: adw.2
                @Override // java.lang.Runnable
                public void run() {
                    adw.this.h();
                }
            }, 500L);
        } else {
            i();
        }
    }

    public boolean a(aea.a aVar, String str) {
        LogUtils.i("XQrCodePresenter", "onLoginTokenReceived, task:" + this.b + "; authCode:" + str);
        a aVar2 = this.b;
        if (aVar2 == null || aVar == null || !aVar2.a(str) || this.b.a()) {
            return false;
        }
        a(aVar);
        a(true, "onLoginTokenReceived");
        return true;
    }

    private void a(String str, int i) {
        LogUtils.i("XQrCodePresenter", "startCheck, authCode:" + str + ",effectiveTime:" + i);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = new a(str, i);
        this.b.b();
    }

    private void a(String str) {
        if (this.f) {
            u.b(this);
            this.f = false;
        }
    }

    public void a(boolean z, String str) {
        if (z) {
            a(str);
        }
        if (this.b != null) {
            LogUtils.i("XQrCodePresenter", "stopCheck, currentTask:" + this.b + ",from=" + str);
            this.b.c();
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtils.i("XQrCodePresenter", "notifyNetworkUnavailable");
        if (j() == null) {
            a(true);
            return;
        }
        a(false, "notifyNetworkUnavailable");
        j().a(-6);
    }

    private void i() {
        LogUtils.i("XQrCodePresenter", "notifyNetworkUnstable: ");
        if (j() == null) {
            a(true);
            return;
        }
        a(false, "notifyNetworkUnstable");
        j().b(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        LogUtils.i("XQrCodePresenter", "notifyQrCodeTimeout:" + str);
        if (j() == null) {
            a(true);
            return;
        }
        a(false, "notifyQrCodeTimeout");
        j().c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QrCodePresenter.java */
    /* renamed from: adw$a */
    /* loaded from: classes2.dex */
    public class a {
        private final String b;
        private final long c;
        private boolean d;
        private long e;
        private Disposable f;

        private a(String str, int i) {
            this.b = str;
            this.c = i * 60000;
        }

        public String toString() {
            return "CheckLoginTask{mAuthCode='" + this.b + "', mStopped=" + this.d + '}';
        }

        public boolean a() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(String str) {
            return Objects.equals(this.b, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.e = System.currentTimeMillis();
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            Disposable disposable = this.f;
            if (disposable != null && !disposable.isDisposed()) {
                this.f.dispose();
                this.f = null;
            }
            this.d = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.d) {
                return;
            }
            if (System.currentTimeMillis() - this.e >= this.c) {
                adw.this.b(this.b);
            } else if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
                adw.this.h();
            } else {
                adw.this.e = true;
                f();
                adu.b(this.b, new avc<aea>() { // from class: adw.a.1
                    @Override // defpackage.avc
                    public void a(aea aeaVar) {
                        LogUtils.i("XQrCodePresenter", "getAuthCode:" + aeaVar + ListSignBean.COLLECTID_SUFFIX + a.this.b + ListSignBean.COLLECTID_SUFFIX + adw.this.g);
                        boolean z = false;
                        adw.this.e = false;
                        if (aeaVar.getCode() == 200 && aeaVar.data != null && !TextUtils.isEmpty(aeaVar.data.a) && !TextUtils.isEmpty(aeaVar.data.b)) {
                            a.this.e();
                            z = adw.this.a(aeaVar.data, a.this.b);
                        }
                        if (z || adw.this.j() != null || adw.c(adw.this) <= 10) {
                            return;
                        }
                        adw.this.a(true);
                    }

                    @Override // defpackage.avc
                    public void a(int i, String str) {
                        LogUtils.i("XQrCodePresenter", "getAuthCode:onError:" + i + ListSignBean.COLLECTID_SUFFIX + str + ListSignBean.COLLECTID_SUFFIX + a.this.b);
                        adw.this.e = false;
                        if (adw.this.j() == null) {
                            adw.this.a(true);
                            return;
                        }
                        a.this.e();
                        adw.this.b(a.this.b);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            Disposable disposable = this.f;
            if (disposable == null || disposable.isDisposed()) {
                return;
            }
            this.f.dispose();
        }

        private void f() {
            e();
            this.f = Flowable.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: adw.a.2
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    a.this.f = null;
                    a.this.d();
                }
            });
        }
    }

    @SuppressLint({"CheckResult"})
    private void a(aea.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("loginConfirm: data = ");
        sb.append(aVar);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(this.d != null);
        LogUtils.i("XQrCodePresenter", sb.toString());
        if (j() != null) {
            j().a();
        }
        adx.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.a(aVar.a, aVar.b);
            this.d = null;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        if (sVar == null || sVar.a()) {
            return;
        }
        if (j() != null) {
            j().b();
        }
        a(true);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPhoneChange(agd.f fVar) {
        if (fVar == null || !fVar.a()) {
            return;
        }
        if (j() != null) {
            j().b();
        }
        a(true);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBackground(afx.a aVar) {
        if (aVar == null || !aVar.a() || b.a(com.xiaopeng.musicradio.a.a())) {
            return;
        }
        if (j() != null) {
            j().b();
        }
        a(true);
    }

    public void c() {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        adx.a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("onCallbackCancel:");
        sb.append(this.e);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(this.d != null);
        LogUtils.i("XQrCodePresenter", sb.toString());
        if (this.e || (aVar = this.d) == null) {
            return;
        }
        aVar.a();
        if (z) {
            a(true, "onCallbackCancel");
            this.d = null;
        }
    }
}
