package com.xiaopeng.musicradio.service;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.push.PushUserBean;
import com.xiaopeng.musicradio.utils.z;
/* loaded from: classes2.dex */
public class XmlyVipService extends a implements bcv {
    private static final String TAG = "XmlyVipService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    @Override // defpackage.bcv
    public String getNickName() {
        return bdh.c().f();
    }

    @Override // defpackage.bcv
    public String getUserLogo() {
        return bdh.c().g();
    }

    @Override // defpackage.bcv
    public boolean isVip() {
        return bdh.c().e();
    }

    @Override // defpackage.bcv
    public String getVipEndTime() {
        return bdh.c().h();
    }

    @Override // defpackage.bcv
    public void loadUserInfo() {
        bdh.c().i();
    }

    @Override // defpackage.bcv
    public void fetchUserInfo() {
        bdh.c().a(0);
    }

    @Override // defpackage.bcv
    public void clearUserData() {
        bdh.c().d();
    }

    public Dialog createVipBuyingDlg(Context context) {
        if (context == null) {
            return null;
        }
        return new bcx().b(context);
    }

    @Override // defpackage.bcv
    public void onServerPush(String str) {
        boolean z;
        LogUtils.i(TAG, "onServerPush=" + str);
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            PushUserBean pushUserBean = (PushUserBean) z.a(str, (Class<Object>) PushUserBean.class);
            z = pushUserBean != null ? pushUserBean.test : false;
            if (pushUserBean != null && pushUserBean.getScene() == 26033) {
                bdh.c().a(pushUserBean.getOpenId(), false, (Long) null);
            } else if (pushUserBean != null && pushUserBean.getScene() == 26032) {
                bdh.c().a(pushUserBean.getOpenId(), true, Long.valueOf(pushUserBean.getExpireTime()));
            }
        }
        if (z) {
            return;
        }
        bdh.c().a(-1);
    }
}
