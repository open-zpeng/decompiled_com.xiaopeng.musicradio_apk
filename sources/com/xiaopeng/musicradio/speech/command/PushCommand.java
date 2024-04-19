package com.xiaopeng.musicradio.speech.command;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.libconfig.ipc.IpcConfig;
import com.xiaopeng.musicradio.bean.aisuggest.ChuXContentBean;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.am;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agg;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PushCommand extends baf {
    public static final String TAG = "PushCommand";

    @Override // defpackage.baf
    public String getCommand() {
        return TAG;
    }

    public PushCommand(int i, JSONObject jSONObject) {
        super(i, jSONObject);
    }

    @Override // defpackage.baf
    protected void a(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            if (i != 800001) {
                switch (i) {
                    case IpcConfig.MessageCenterConfig.IPC_ID_MESSAGE_CHANNEL_PUSH_MESSAGE /* 10010 */:
                        if (jSONObject.has(IpcConfig.IPCKey.STRING_MSG)) {
                            ChuXContentBean chuXContentBean = (ChuXContentBean) z.a(jSONObject.optString(IpcConfig.IPCKey.STRING_MSG), (Class<Object>) ChuXContentBean.class);
                            if (chuXContentBean == null) {
                                LogUtils.i(TAG, "ChuXContentBean is unright!");
                                return;
                            }
                            Log.i(TAG, "onEvent: " + chuXContentBean.getScene());
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
                        }
                        return;
                    case IpcConfig.MessageCenterConfig.IPC_ID_MESSAGE_PUSH_TO_APP /* 10011 */:
                        if (jSONObject.has(IpcConfig.IPCKey.STRING_MSG)) {
                            aoy.a().a(jSONObject.optString(IpcConfig.IPCKey.STRING_MSG));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            am.a();
            u.e(new agg.z(2));
        }
    }
}
