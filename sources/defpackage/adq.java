package defpackage;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.utils.b;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.adn;
import defpackage.adr;
import defpackage.adt;
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
/* renamed from: adq  reason: default package */
/* loaded from: classes2.dex */
public class adq extends e<adm> {
    private a b;
    private boolean c;
    private adn.a d;
    private boolean e;
    private boolean f;
    private String g;
    private int h;

    static /* synthetic */ int d(adq adqVar) {
        int i = adqVar.h + 1;
        adqVar.h = i;
        return i;
    }

    public adq(adn.a aVar, String str) {
        this.d = aVar;
        this.g = str;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void a(adm admVar) {
        super.a((adq) admVar);
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
        LogUtils.i("QQrCodePresenter", "applyQrCode:" + this.g + ListSignBean.COLLECTID_SUFFIX + this.c);
        if (this.c) {
            return;
        }
        a(false, "applyQrCode");
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
            a((Integer) (-6));
            return;
        }
        this.c = true;
        String str = this.g;
        adl.a(str, "wx".equals(str), new avc<adt>() { // from class: adq.1
            @Override // defpackage.avc
            public void a(adt adtVar) {
                LogUtils.i("QQrCodePresenter", "getQrCode:" + adtVar.a(adq.this.g));
                adq.this.c = false;
                if (adtVar.getCode() == 200) {
                    if (adtVar.data != null && !TextUtils.isEmpty(adtVar.data.a)) {
                        adq.this.a(adtVar.data);
                        return;
                    } else {
                        adq.this.a(Integer.valueOf(adtVar.getCode()));
                        return;
                    }
                }
                adq.this.a(Integer.valueOf(adtVar.getCode()));
            }

            @Override // defpackage.avc
            public void a(int i, String str2) {
                LogUtils.i("QQrCodePresenter", "getQrCode:onError:" + i + ListSignBean.COLLECTID_SUFFIX + str2);
                adq.this.c = false;
                adq.this.a(Integer.valueOf(i));
            }
        });
    }

    public void a(adt.a aVar) {
        if (j() == null) {
            return;
        }
        j().a(1, aVar.a);
        a(false, "onGetQRCodeSuccess");
        a(aVar.b, aVar.c);
    }

    public void a(Integer num) {
        if (num != null && num.intValue() == -6) {
            ban.b(new Runnable() { // from class: adq.2
                @Override // java.lang.Runnable
                public void run() {
                    adq.this.h();
                }
            }, 500L);
        } else {
            i();
        }
    }

    public boolean a(adr.a aVar, String str) {
        LogUtils.i("QQrCodePresenter", "onLoginTokenReceived, task:" + this.b + "; authCode:" + str);
        a aVar2 = this.b;
        if (aVar2 == null || aVar == null || !aVar2.a(str) || this.b.a()) {
            return false;
        }
        a(aVar);
        a(true, "onLoginTokenReceived");
        return true;
    }

    private void a(String str, int i) {
        LogUtils.i("QQrCodePresenter", "startCheck, authCode:" + str + ",effectiveTime:" + i);
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
            LogUtils.i("QQrCodePresenter", "stopCheck, currentTask:" + this.b + ",from=" + str);
            this.b.c();
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtils.i("QQrCodePresenter", "notifyNetworkUnavailable");
        if (j() == null) {
            a(true);
            return;
        }
        a(false, "notifyNetworkUnavailable");
        j().a(-6);
    }

    private void i() {
        LogUtils.i("QQrCodePresenter", "notifyNetworkUnstable: ");
        if (j() == null) {
            a(true);
            return;
        }
        a(false, "notifyNetworkUnstable");
        j().b(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        LogUtils.i("QQrCodePresenter", "notifyQrCodeTimeout:" + str);
        if (j() == null) {
            a(true);
            return;
        }
        a(false, "notifyQrCodeTimeout");
        j().c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QrCodePresenter.java */
    /* renamed from: adq$a */
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
                adq.this.b(this.b);
            } else if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
                adq.this.h();
            } else {
                adq.this.e = true;
                f();
                adl.a(this.b, new avc<adr>() { // from class: adq.a.1
                    @Override // defpackage.avc
                    public void a(adr adrVar) {
                        LogUtils.i("QQrCodePresenter", "getAuthCode:" + adrVar + ListSignBean.COLLECTID_SUFFIX + a.this.b + ListSignBean.COLLECTID_SUFFIX + adq.this.h);
                        boolean z = false;
                        adq.this.e = false;
                        if (adrVar.getCode() == 200 && adrVar.data != null && !TextUtils.isEmpty(adrVar.data.a) && adrVar.data.b > 0 && adrVar.data.c) {
                            a.this.e();
                            z = adq.this.a(adrVar.data, a.this.b);
                        }
                        if (z || adq.this.j() != null || adq.d(adq.this) <= 10) {
                            return;
                        }
                        adq.this.a(true);
                    }

                    @Override // defpackage.avc
                    public void a(int i, String str) {
                        LogUtils.i("QQrCodePresenter", "getAuthCode:onError:" + i + ListSignBean.COLLECTID_SUFFIX + str + ListSignBean.COLLECTID_SUFFIX + a.this.b);
                        adq.this.e = false;
                        if (adq.this.j() == null) {
                            adq.this.a(true);
                            return;
                        }
                        a.this.e();
                        adq.this.b(a.this.b);
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
            this.f = Flowable.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: adq.a.2
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
    private void a(adr.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("loginConfirm: data = ");
        sb.append(aVar);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(this.d != null);
        LogUtils.i("QQrCodePresenter", sb.toString());
        if (j() != null) {
            j().a();
        }
        adn.a aVar2 = this.d;
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
        adn.a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("onCallbackCancel:");
        sb.append(this.e);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(this.d != null);
        LogUtils.i("QQrCodePresenter", sb.toString());
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
