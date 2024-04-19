package defpackage;

import android.text.TextUtils;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.XmlyAccountBean;
import com.xiaopeng.musicradio.bean.XmlyAccountInfo;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agg;
import defpackage.agq;
import defpackage.amp;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: XmlyVipModel.java */
/* renamed from: bdh  reason: default package */
/* loaded from: classes2.dex */
public class bdh implements amp.a, amp.b {
    private XmlyAccountInfo a;
    private Call<XmlyAccountBean> b;
    private long c;
    private Disposable d;

    /* compiled from: XmlyVipModel.java */
    /* renamed from: bdh$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bdh a = new bdh();
    }

    /* compiled from: XmlyVipModel.java */
    /* renamed from: bdh$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i, String str);

        void a(XmlyAccountInfo xmlyAccountInfo);
    }

    public static bdh c() {
        return a.a;
    }

    public bdh() {
        u.a(this);
        amp.a().a(this);
    }

    private String j() {
        return aqh.a().c();
    }

    public void d() {
        LogUtils.d("XmlyVipModel", "clear..");
        Call<XmlyAccountBean> call = this.b;
        if (call != null) {
            try {
                call.cancel();
            } catch (Exception unused) {
            }
            this.b = null;
        }
        this.a = null;
        u.c(new agg.u(-1));
    }

    private void a(final long j, final boolean z) {
        final String j2 = j();
        if (TextUtils.isEmpty(j2)) {
            this.a = null;
            if (z) {
                u.c(new agg.u(-1));
                return;
            }
            return;
        }
        XmlyAccountInfo xmlyAccountInfo = this.a;
        if (xmlyAccountInfo == null || !j2.equals(xmlyAccountInfo.getOpenId())) {
            ban.e(new Runnable() { // from class: bdh.1
                @Override // java.lang.Runnable
                public void run() {
                    final XmlyAccountInfo xmlyAccountInfo2 = (XmlyAccountInfo) z.a(afk.a().a("key_xmly_account_info_" + j2), (Class<Object>) XmlyAccountInfo.class);
                    ban.g(new Runnable() { // from class: bdh.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (j > bdh.this.c) {
                                XmlyAccountInfo xmlyAccountInfo3 = xmlyAccountInfo2;
                                if (xmlyAccountInfo3 != null) {
                                    xmlyAccountInfo3.setOpenId(j2);
                                }
                                bdh.this.a = xmlyAccountInfo2;
                                if (z) {
                                    u.c(new agg.u(-1));
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        final XmlyAccountInfo xmlyAccountInfo = this.a;
        if (xmlyAccountInfo == null) {
            return;
        }
        ban.a(new Runnable() { // from class: bdh.2
            @Override // java.lang.Runnable
            public void run() {
                afk.a().b("key_xmly_account_info_" + str, z.a(xmlyAccountInfo));
            }
        });
    }

    public boolean e() {
        boolean e = aqf.a().e();
        XmlyAccountInfo xmlyAccountInfo = this.a;
        if (xmlyAccountInfo == null || !e) {
            return false;
        }
        return xmlyAccountInfo.isVip();
    }

    public String f() {
        XmlyAccountInfo xmlyAccountInfo = this.a;
        return xmlyAccountInfo != null ? xmlyAccountInfo.getNickName() : "";
    }

    public String g() {
        XmlyAccountInfo xmlyAccountInfo = this.a;
        if (xmlyAccountInfo != null) {
            return xmlyAccountInfo.getAvatarUrl();
        }
        return null;
    }

    public String h() {
        XmlyAccountInfo xmlyAccountInfo = this.a;
        return xmlyAccountInfo != null ? xmlyAccountInfo.getVipEndTime() : "";
    }

    public void a(int i) {
        a(j(), i);
    }

    public void a(String str, int i) {
        a(str, i, (b) null);
    }

    public void a(final String str, final int i, final b bVar) {
        LogUtils.d("XmlyVipModel", "sycAccountInfoWithServer:openId:" + str + ",source:" + i);
        Call<XmlyAccountBean> call = this.b;
        if (call != null) {
            call.cancel();
            this.b = null;
        }
        a(System.currentTimeMillis(), false);
        if (TextUtils.isEmpty(str)) {
            k();
            if (bVar != null) {
                ban.g(new Runnable() { // from class: bdh.3
                    @Override // java.lang.Runnable
                    public void run() {
                        bVar.a(-1, "openId isEmpty");
                    }
                });
                return;
            }
            return;
        }
        final XmlyAccountInfo xmlyAccountInfo = this.a;
        amp.a().a(this, false);
        this.b = bdg.a().b(new avc<XmlyAccountBean>() { // from class: bdh.4
            @Override // defpackage.avc
            public void a(XmlyAccountBean xmlyAccountBean) {
                XmlyAccountInfo xmlyAccountInfo2 = xmlyAccountBean.data;
                if (xmlyAccountInfo2 != null) {
                    xmlyAccountInfo2.setOpenId(str);
                }
                bdh.this.a = xmlyAccountInfo2;
                bdh.this.a(str);
                u.c(new agg.u(i));
                bdh.this.a(xmlyAccountInfo, xmlyAccountInfo2);
                bdh.this.c = System.currentTimeMillis();
                LogUtils.d("XmlyVipModel", "sycAccountInfoWithServer response:" + bdh.this.a);
                bdh.this.l();
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(xmlyAccountInfo2);
                }
            }

            @Override // defpackage.avc
            public void a(int i2, String str2) {
                LogUtils.i("XmlyVipModel", "sycAccountInfoWithServer err code=" + i2 + "msg=" + str2);
                amp.a().a(bdh.this, true);
                bdh.this.l();
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(i2, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(XmlyAccountInfo xmlyAccountInfo, XmlyAccountInfo xmlyAccountInfo2) {
        if (xmlyAccountInfo == null || xmlyAccountInfo2 == null || !Objects.equals(xmlyAccountInfo.openId, xmlyAccountInfo2.openId) || xmlyAccountInfo.isVip() != xmlyAccountInfo2.isVip()) {
            u.c(new agg.t(xmlyAccountInfo2.isVip()));
        }
    }

    public void i() {
        a(System.currentTimeMillis(), true);
    }

    public void a(String str, boolean z, Long l) {
        XmlyAccountInfo xmlyAccountInfo = this.a;
        LogUtils.i("XmlyVipModel", "updateVip:lastXmlyAccountInfo=" + xmlyAccountInfo + ",openId=" + str + ",vip=" + z + ",vipExpireTime=" + l);
        if (xmlyAccountInfo == null || !Objects.equals(xmlyAccountInfo.getOpenId(), str) || xmlyAccountInfo.isVip() == z) {
            return;
        }
        xmlyAccountInfo.setVip(z);
        if (l != null) {
            xmlyAccountInfo.setVipExpireTime(l.longValue());
        }
        u.c(new agg.u(-1));
        u.c(new agg.t(xmlyAccountInfo.isVip()));
    }

    private void k() {
        Disposable disposable = this.d;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.d.dispose();
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        k();
        if (com.xiaopeng.musicradio.model.car.a.a().f()) {
            this.d = Flowable.timer(5L, TimeUnit.MINUTES).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: bdh.5
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    if (com.xiaopeng.musicradio.model.car.a.a().f()) {
                        bdh.this.a(3);
                    }
                }
            });
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.r rVar) {
        i();
    }

    @Override // defpackage.amp.a
    public void p_() {
        if (aqf.a().e()) {
            a(1);
        }
    }

    @Override // defpackage.amp.b
    public void q_() {
        if (aqf.a().e()) {
            a(j(), 2);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.s sVar) {
        if (sVar.a() && aqf.a().e()) {
            return;
        }
        k();
    }
}
