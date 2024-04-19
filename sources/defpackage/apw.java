package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: AbsReissueModel.java */
/* renamed from: apw  reason: default package */
/* loaded from: classes2.dex */
public abstract class apw {
    protected boolean b;
    protected ConcurrentHashMap<String, a> c = new ConcurrentHashMap<>();
    protected Thread a = new Thread(new b(), "ReissueModel");

    /* compiled from: AbsReissueModel.java */
    /* renamed from: apw$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ReissueInfo reissueInfo, int i, String str);

        void a(ReissueInfo reissueInfo, BaseBean baseBean);
    }

    public void a() {
    }

    public abstract void a(ReissueInfo reissueInfo, a aVar, int i, String str);

    public abstract void b();

    public apw() {
        this.a.setPriority(1);
        this.a.start();
        u.a(this);
    }

    public void a(String str, a aVar) {
        if (str == null || aVar == null) {
            return;
        }
        this.c.put(str, aVar);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onPowerStateChange(agg.s sVar) {
        if (sVar.a()) {
            afi.d().b();
        }
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onEvent(agg.p pVar) {
        b();
    }

    /* compiled from: AbsReissueModel.java */
    /* renamed from: apw$b */
    /* loaded from: classes2.dex */
    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!apw.this.b) {
                apw.this.b = true;
                afi.d().b();
            }
            while (true) {
                final ReissueInfo a = afi.d().a();
                if (a != null) {
                    final a aVar = apw.this.c.get(a.getUrl());
                    StringBuilder sb = new StringBuilder();
                    sb.append("run:  ======== ");
                    sb.append(a);
                    sb.append(" ,callback=");
                    sb.append(aVar == null);
                    Log.i("ReissueModel", sb.toString());
                    if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                        LogUtils.i("ReissueModel", "no network: " + a);
                        apw.this.a(a, aVar, 404, "当前无网络");
                    } else {
                        aqj.a().a(a, new avc<BaseBean>() { // from class: apw.b.1
                            @Override // defpackage.avc
                            public void a(BaseBean baseBean) {
                                LogUtils.i("ReissueModel", "response: " + a);
                                ban.e(new Runnable() { // from class: apw.b.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        anonymousClass1.a(a);
                                        List<ReissueInfo> mergeList = a.getMergeList();
                                        if (mergeList != null) {
                                            for (ReissueInfo reissueInfo : mergeList) {
                                                a(reissueInfo);
                                            }
                                        }
                                    }
                                });
                                a aVar2 = aVar;
                                if (aVar2 != null) {
                                    aVar2.a(a, baseBean);
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public void a(ReissueInfo reissueInfo) {
                                ReissueInfo a2 = afi.d().a(reissueInfo.getObjectId());
                                if (a2 != null && TextUtils.equals(reissueInfo.getObjectId(), a2.getObjectId()) && TextUtils.equals(reissueInfo.getUrl(), a2.getUrl())) {
                                    afi.d().c(a2);
                                }
                            }

                            @Override // defpackage.avc
                            public void a(int i, String str) {
                                LogUtils.e("ReissueModel", "error: code=" + i + " msg=" + str);
                                a aVar2 = aVar;
                                if (aVar2 != null) {
                                    aVar2.a(a, i, str);
                                }
                                apw.this.a(a, aVar, i, str);
                            }
                        });
                    }
                }
            }
        }
    }
}
