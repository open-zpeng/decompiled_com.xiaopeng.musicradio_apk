package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ncm.NcmBTConnBean;
import com.xiaopeng.musicradio.utils.h;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agd;
import defpackage.agf;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: IcmTransferModel.java */
/* renamed from: aov  reason: default package */
/* loaded from: classes2.dex */
public class aov {
    private boolean a;

    /* compiled from: IcmTransferModel.java */
    /* renamed from: aov$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aov a = new aov();
    }

    private aov() {
        this.a = false;
        c();
    }

    public static aov a() {
        return a.a;
    }

    public void b() {
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCarApiConnect(agf.a aVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealBtConnectState(agd.b bVar) {
        if (this.a) {
            a(bVar.a());
        }
    }

    public void c() {
        this.a = true;
        Log.i("IcmTransferModel", "onIcmConnected: " + aei.a().c());
        a(com.xiaopeng.musicradio.model.bluetooth.a.i().n());
    }

    private void a(final boolean z) {
        ban.a(new Runnable() { // from class: aov.1
            @Override // java.lang.Runnable
            public void run() {
                if (aov.this.a) {
                    NcmBTConnBean ncmBTConnBean = new NcmBTConnBean();
                    ncmBTConnBean.setEnable("1");
                    ncmBTConnBean.setMsgtype("1");
                    NcmBTConnBean.NotifyBean notifyBean = new NcmBTConnBean.NotifyBean();
                    if (z) {
                        notifyBean.setBluetoothMusic("1");
                    } else {
                        notifyBean.setBluetoothMusic("0");
                    }
                    notifyBean.setMsgIndex("3");
                    ncmBTConnBean.setNotify(notifyBean);
                    String a2 = z.a(ncmBTConnBean);
                    if (h.e() != null) {
                        try {
                            h.e().sendSpeechStateInfo(a2.getBytes());
                        } catch (Exception unused) {
                        }
                        LogUtils.i("IcmTransferModel", "transferBTConnect: " + a2);
                        return;
                    }
                    LogUtils.i("IcmTransferModel", "scu服务初始化失败");
                }
            }
        });
    }
}
