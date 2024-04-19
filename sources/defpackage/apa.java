package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import com.xiaopeng.lib.framework.ipcmodule.IpcModuleEntry;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.ipcmodule.IIpcService;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.libconfig.ipc.IpcConfig;
import com.xiaopeng.musicradio.bean.aisuggest.ChuXContentBean;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.am;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agg;
import java.util.Set;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: IpcReceiveModel.java */
/* renamed from: apa  reason: default package */
/* loaded from: classes2.dex */
public class apa {
    private IIpcService a;
    private SparseArray<Set<aoz>> b;

    /* compiled from: IpcReceiveModel.java */
    /* renamed from: apa$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final apa a = new apa();
    }

    private apa() {
        this.b = new SparseArray<>();
        this.a = (IIpcService) Module.get(IpcModuleEntry.class).get(IIpcService.class);
        this.a.init();
        u.a(this);
    }

    public static apa a() {
        return a.a;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(IIpcService.IpcMessageEvent ipcMessageEvent) {
        LogUtils.i("IpcReceiveModel", "onEvent: " + ipcMessageEvent);
        int msgID = ipcMessageEvent.getMsgID();
        String senderPackageName = ipcMessageEvent.getSenderPackageName();
        Bundle payloadData = ipcMessageEvent.getPayloadData();
        switch (msgID) {
            case IpcConfig.MessageCenterConfig.IPC_ID_MESSAGE_CHANNEL_PUSH_MESSAGE /* 10010 */:
                ChuXContentBean chuXContentBean = (ChuXContentBean) z.a(ipcMessageEvent.getPayloadData().getString(IpcConfig.IPCKey.STRING_MSG), (Class<Object>) ChuXContentBean.class);
                if (chuXContentBean == null) {
                    LogUtils.i("IpcReceiveModel", "ChuXContentBean is unright!");
                    return;
                }
                Log.i("IpcReceiveModel", "onEvent: " + chuXContentBean.getScene());
                if (chuXContentBean.getScene() == 20001) {
                    aoy.a().a(chuXContentBean.getContent());
                    return;
                } else if (chuXContentBean.getScene() == 26031) {
                    aqf.a().a(chuXContentBean.getContent(), chuXContentBean.getValidStartTs());
                    return;
                } else if (chuXContentBean.getScene() == 26032 || chuXContentBean.getScene() == 26033) {
                    bcv bcvVar = (bcv) c.a().b(bcv.class);
                    if (bcvVar != null) {
                        bcvVar.onServerPush(chuXContentBean.getContent());
                        return;
                    }
                    return;
                } else if (chuXContentBean.getScene() == 26060 || chuXContentBean.getScene() == 26062) {
                    bcu bcuVar = (bcu) c.a().b(bcu.class);
                    if (bcuVar != null) {
                        bcuVar.sycUserInfoWithServer();
                    }
                    u.f(new agg.ak());
                    return;
                } else {
                    bcu bcuVar2 = (bcu) c.a().b(bcu.class);
                    if (bcuVar2 != null) {
                        bcuVar2.onReceiveMqttMsg(chuXContentBean.getContent());
                        return;
                    }
                    return;
                }
            case IpcConfig.MessageCenterConfig.IPC_ID_MESSAGE_PUSH_TO_APP /* 10011 */:
                aoy.a().a(ipcMessageEvent.getPayloadData().getString(IpcConfig.IPCKey.STRING_MSG));
                return;
            case IpcConfig.DevtoolsConfig.IPC_ID_MSG_NOTIFY /* 60001 */:
                aoy.a().b(payloadData.getString(IpcConfig.IPCKey.STRING_MSG));
                return;
            case 70001:
                u.e(new agg.l());
                return;
            case IpcConfig.MusicConfig.MSG_ID_OPEN_BT_PLAYER /* 800001 */:
                am.a();
                u.e(new agg.z(2));
                return;
            default:
                a(msgID, senderPackageName, payloadData);
                return;
        }
    }

    private void a(int i, String str, Bundle bundle) {
        Set<aoz> set = this.b.get(i);
        if (set == null) {
            return;
        }
        for (aoz aozVar : set) {
            aozVar.a(i, str, bundle);
        }
    }
}
