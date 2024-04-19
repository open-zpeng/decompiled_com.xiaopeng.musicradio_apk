package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.UserAccountBean;
import com.xiaopeng.musicradio.bean.UserAccountInfo;
import com.xiaopeng.musicradio.bean.UserVipInfo;
import com.xiaopeng.musicradio.bean.VipDetail;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agg;
import defpackage.agq;
import defpackage.amp;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: UserVipModel.java */
/* renamed from: bdd  reason: default package */
/* loaded from: classes2.dex */
public class bdd implements amp.a, amp.b {
    private UserAccountInfo a;
    private Call<UserAccountBean> b;
    private long c;
    private Disposable d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserVipModel.java */
    /* renamed from: bdd$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final bdd a = new bdd();
    }

    /* compiled from: UserVipModel.java */
    /* renamed from: bdd$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i, String str);

        void a(UserAccountInfo userAccountInfo);
    }

    public static bdd c() {
        return a.a;
    }

    public bdd() {
        u.a(this);
        amp.a().a(this);
    }

    private String l() {
        return ((aqs) apx.a().b()).a();
    }

    public void d() {
        LogUtils.d("UserVipModel", "clear..");
        Call<UserAccountBean> call = this.b;
        if (call != null) {
            call.cancel();
            this.b = null;
        }
        this.a = null;
        u.c(new agg.ai(-1));
    }

    private void a(final long j, final boolean z) {
        final String l = l();
        if (TextUtils.isEmpty(l)) {
            this.a = null;
            if (z) {
                u.c(new agg.ai(-1));
                return;
            }
            return;
        }
        UserAccountInfo userAccountInfo = this.a;
        if (userAccountInfo == null || !l.equals(userAccountInfo.getOpenId())) {
            ban.e(new Runnable() { // from class: bdd.1
                @Override // java.lang.Runnable
                public void run() {
                    final UserAccountInfo userAccountInfo2 = (UserAccountInfo) z.a(afk.a().a("key_account_info_" + l), (Class<Object>) UserAccountInfo.class);
                    ban.g(new Runnable() { // from class: bdd.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (j > bdd.this.c) {
                                UserAccountInfo userAccountInfo3 = userAccountInfo2;
                                if (userAccountInfo3 != null) {
                                    userAccountInfo3.setOpenId(l);
                                }
                                bdd.this.a = userAccountInfo2;
                                if (z) {
                                    u.c(new agg.ai(-1));
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
        final UserAccountInfo userAccountInfo = this.a;
        if (userAccountInfo == null) {
            return;
        }
        ban.a(new Runnable() { // from class: bdd.2
            @Override // java.lang.Runnable
            public void run() {
                afk.a().b("key_account_info_" + str, z.a(userAccountInfo));
            }
        });
    }

    public boolean e() {
        boolean d = apx.a().d();
        UserAccountInfo userAccountInfo = this.a;
        if (userAccountInfo == null || !d) {
            return false;
        }
        return userAccountInfo.isVip();
    }

    public String f() {
        UserAccountInfo userAccountInfo = this.a;
        return userAccountInfo != null ? userAccountInfo.getNickName() : "";
    }

    public String g() {
        UserAccountInfo userAccountInfo = this.a;
        if (userAccountInfo != null) {
            return userAccountInfo.getHeadImgUrl();
        }
        return null;
    }

    public String h() {
        UserVipInfo vipInfo;
        UserAccountInfo userAccountInfo = this.a;
        return (userAccountInfo == null || (vipInfo = userAccountInfo.getVipInfo()) == null) ? "" : vipInfo.getVipEndTime();
    }

    public List<VipDetail> i() {
        UserAccountInfo userAccountInfo = this.a;
        if (userAccountInfo != null) {
            return userAccountInfo.getVipInfo().getVipDetailDto();
        }
        return new ArrayList();
    }

    public boolean j() {
        UserVipInfo vipInfo;
        boolean d = apx.a().d();
        UserAccountInfo userAccountInfo = this.a;
        if (userAccountInfo == null || !d || (vipInfo = userAccountInfo.getVipInfo()) == null) {
            return false;
        }
        return vipInfo.isGreenVip();
    }

    public void a(int i) {
        a(l(), i);
    }

    public void a(String str, int i) {
        a(str, i, (b) null);
    }

    public void a(final String str, final int i, final b bVar) {
        Call<UserAccountBean> call = this.b;
        if (call != null) {
            call.cancel();
            this.b = null;
        }
        Log.i("UserVipModel", "sycAccountInfoWithServer: " + str);
        a(System.currentTimeMillis(), false);
        if (TextUtils.isEmpty(str)) {
            m();
            if (bVar != null) {
                ban.g(new Runnable() { // from class: bdd.3
                    @Override // java.lang.Runnable
                    public void run() {
                        bVar.a(-1, "openId isEmpty");
                    }
                });
                return;
            }
            return;
        }
        final UserAccountInfo userAccountInfo = this.a;
        amp.a().a(this, false);
        Log.i("UserVipModel", "sycAccountInfoWithServer: ===========");
        this.b = bdg.a().a(new avc<UserAccountBean>() { // from class: bdd.4
            @Override // defpackage.avc
            public void a(UserAccountBean userAccountBean) {
                UserAccountInfo userAccountInfo2 = userAccountBean.data;
                UserVipInfo vipInfo = userAccountInfo2.getVipInfo();
                if (vipInfo.getVipDetailDto() == null && vipInfo.getVipInfo() != null && vipInfo.getVipInfo().getVipDetailDto() != null) {
                    vipInfo.setVipDetailDto(vipInfo.getVipInfo().getVipDetailDto());
                }
                if (userAccountInfo2 != null) {
                    userAccountInfo2.setOpenId(str);
                }
                bdd.this.a = userAccountInfo2;
                bdd.this.a(str);
                u.c(new agg.ai(i));
                bdd.this.a(userAccountInfo, userAccountInfo2);
                bdd.this.c = System.currentTimeMillis();
                LogUtils.i("UserVipModel", "sycAccountInfoWithServer response:" + bdd.this.a);
                bdd.this.n();
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(userAccountInfo2);
                }
            }

            @Override // defpackage.avc
            public void a(int i2, String str2) {
                LogUtils.i("UserVipModel", "sycAccountInfoWithServer err code=" + i2 + "msg=" + str2);
                amp.a().a(bdd.this, true);
                bdd.this.n();
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(i2, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2) {
        if (userAccountInfo == null || userAccountInfo2 == null || !Objects.equals(userAccountInfo.openId, userAccountInfo2.openId) || userAccountInfo.isVip() != userAccountInfo2.isVip()) {
            u.c(new agg.ah(userAccountInfo2.isVip()));
        }
    }

    public void k() {
        a(System.currentTimeMillis(), true);
    }

    private void m() {
        Disposable disposable = this.d;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.d.dispose();
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        m();
        if (com.xiaopeng.musicradio.model.car.a.a().f()) {
            this.d = Flowable.timer(5L, TimeUnit.MINUTES).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: bdd.5
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    if (com.xiaopeng.musicradio.model.car.a.a().f()) {
                        bdd.this.a(3);
                    }
                }
            });
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.g gVar) {
        k();
    }

    @Override // defpackage.amp.a
    public void p_() {
        if (apx.a().d()) {
            a(1);
        }
    }

    @Override // defpackage.amp.b
    public void q_() {
        if (apx.a().d()) {
            a(l(), 2);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.s sVar) {
        if (sVar.a() && apx.a().d()) {
            return;
        }
        m();
    }
}
