package defpackage;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.adc;
import defpackage.ade;
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
/* renamed from: adh  reason: default package */
/* loaded from: classes2.dex */
public class adh extends e<add> {
    private a b;
    private boolean c;
    private ade.a d;
    private boolean e;
    private boolean f;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void a(add addVar) {
        super.a((adh) addVar);
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
            c("detachView");
        }
    }

    public void b() {
        LogUtils.d("QrCodePresenter", "applyQrCode:" + this.c);
        if (this.c) {
            return;
        }
        a(false, "applyQrCode");
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
            a((Integer) (-6));
            return;
        }
        this.c = true;
        adc.a(new adc.a<adj<adk>>(new TypeToken<adj<adk>>() { // from class: adh.2
        }.getType()) { // from class: adh.1
            @Override // defpackage.adc.a
            public void a(adj<adk> adjVar) {
                LogUtils.i("QrCodePresenter", "getQrCode:" + adjVar);
                adh.this.c = false;
                if (adjVar.b != null) {
                    adh.this.a(adjVar.b.a);
                } else {
                    adh.this.a(Integer.valueOf(adjVar.a));
                }
            }

            @Override // defpackage.adc.a
            public void a(int i, String str, boolean z) {
                LogUtils.i("QrCodePresenter", "getQrCode:onError:" + i + ListSignBean.COLLECTID_SUFFIX + str + ListSignBean.COLLECTID_SUFFIX + z);
                adh.this.c = false;
                adh.this.a(Integer.valueOf(i));
            }
        });
    }

    public void a(String str) {
        if (j() == null) {
            return;
        }
        j().a(1, str);
        a(false, "onGetQRCodeSuccess");
        b(str);
    }

    public void a(Integer num) {
        if (num != null && num.intValue() == -6) {
            ban.b(new Runnable() { // from class: adh.3
                @Override // java.lang.Runnable
                public void run() {
                    adh.this.h();
                }
            }, 500L);
        } else {
            i();
        }
    }

    public boolean a(adi adiVar) {
        LogUtils.d("QrCodePresenter", "onLoginTokenReceived, task:" + this.b + "; bean:" + adiVar);
        a aVar = this.b;
        if (aVar == null || adiVar == null || !aVar.a(adiVar.a()) || this.b.a()) {
            return false;
        }
        b(adiVar);
        a(true, "onLoginTokenReceived");
        return true;
    }

    private void b(String str) {
        String d = d(str);
        LogUtils.d("QrCodePresenter", "startCheck, xpCode:" + d);
        if (TextUtils.isEmpty(d)) {
            return;
        }
        this.b = new a(d);
        this.b.b();
    }

    private void c(String str) {
        if (this.f) {
            u.b(this);
            this.f = false;
        }
    }

    public void a(boolean z, String str) {
        if (z) {
            c(str);
        }
        if (this.b != null) {
            LogUtils.d("QrCodePresenter", "stopCheck, currentTask:" + this.b + ",from=" + str);
            this.b.c();
            this.b = null;
        }
    }

    private String d(String str) {
        try {
            int indexOf = str.indexOf("xpCode=");
            if (indexOf > 0) {
                return str.substring(indexOf + 7);
            }
            return null;
        } catch (Exception e) {
            LogUtils.e("QrCodePresenter", "getXpCode", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtils.d("QrCodePresenter", "notifyNetworkUnavailable");
        if (j() == null) {
            a(true);
        } else {
            j().a(-6);
        }
    }

    private void i() {
        LogUtils.d("QrCodePresenter", "notifyNetworkUnstable: ");
        if (j() == null) {
            a(true);
        } else {
            j().b(35);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        LogUtils.d("QrCodePresenter", "notifyQrCodeTimeout");
        if (j() == null) {
            a(true);
        } else {
            j().c(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QrCodePresenter.java */
    /* renamed from: adh$a */
    /* loaded from: classes2.dex */
    public class a {
        private final String b;
        private boolean c;
        private long d;
        private Disposable e;

        private a(String str) {
            this.b = str;
        }

        public String toString() {
            return "CheckLoginTask{mXpCode='" + this.b + "', mStopped=" + this.c + '}';
        }

        public boolean a() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(String str) {
            return Objects.equals(this.b, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.d = System.currentTimeMillis();
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            Disposable disposable = this.e;
            if (disposable != null && !disposable.isDisposed()) {
                this.e.dispose();
                this.e = null;
            }
            this.c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.c) {
                adh.this.a(true);
            } else if (System.currentTimeMillis() - this.d >= 300000) {
                adh.this.e(this.b);
            } else if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
                adh.this.h();
            } else {
                adh.this.e = true;
                f();
                adc.a(this.b, new adc.a<adj<adi>>(new TypeToken<adj<adi>>() { // from class: adh.a.2
                }.getType()) { // from class: adh.a.1
                    @Override // defpackage.adc.a
                    public void a(adj<adi> adjVar) {
                        LogUtils.i("QrCodePresenter", "getAuthCode:" + adjVar + ListSignBean.COLLECTID_SUFFIX + a.this.b);
                        boolean z = false;
                        adh.this.e = false;
                        adi adiVar = adjVar.b;
                        if (adiVar != null && !TextUtils.isEmpty(adiVar.a)) {
                            a.this.e();
                            adiVar.a(a.this.b);
                            z = adh.this.a(adiVar);
                        }
                        if (z) {
                            return;
                        }
                        adh.this.j();
                    }

                    @Override // defpackage.adc.a
                    public void a(int i, String str, boolean z) {
                        LogUtils.i("QrCodePresenter", "getAuthCode:onError:" + i + ListSignBean.COLLECTID_SUFFIX + str + ListSignBean.COLLECTID_SUFFIX + z + ListSignBean.COLLECTID_SUFFIX + a.this.b);
                        adh.this.e = false;
                        if (i == 120640016 || i == 120640017) {
                            a.this.e();
                            adh.this.e(a.this.b);
                        } else if (adh.this.j() == null) {
                            adh.this.a(true);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            Disposable disposable = this.e;
            if (disposable == null || disposable.isDisposed()) {
                return;
            }
            this.e.dispose();
        }

        private void f() {
            e();
            this.e = Flowable.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: adh.a.3
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    a.this.e = null;
                    a.this.d();
                }
            });
        }
    }

    @SuppressLint({"CheckResult"})
    private void b(adi adiVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("loginConfirm: code = ");
        sb.append(adiVar.a);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(this.d != null);
        LogUtils.d("QrCodePresenter", sb.toString());
        if (j() != null) {
            j().a(adiVar.a);
        }
        ade.a aVar = this.d;
        if (aVar != null) {
            aVar.a(adiVar.a);
            this.d = null;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        if (sVar == null || sVar.a()) {
            return;
        }
        if (j() != null) {
            j().a();
        }
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ade.a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("onCallbackCancel:");
        sb.append(this.e);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(this.d != null);
        LogUtils.i("QrCodePresenter", sb.toString());
        aqi.a().a(false);
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
