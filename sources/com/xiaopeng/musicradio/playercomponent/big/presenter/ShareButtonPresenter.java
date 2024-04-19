package com.xiaopeng.musicradio.playercomponent.big.presenter;

import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.SystemPropertyUtil;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.i;
import com.xiaopeng.musicradio.utils.ak;
import defpackage.avp;
/* loaded from: classes2.dex */
public class ShareButtonPresenter extends BasePresenter<Object> {
    private i b;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(androidx.lifecycle.i iVar) {
        super.onCreate(iVar);
        Log.i("ShareButtonPresenter", "onCreate: ======");
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(androidx.lifecycle.i iVar) {
        super.onDestroy(iVar);
    }

    public void c() {
        boolean z = SystemPropertyUtil.getAccountUid() > 0;
        if (z && NetUtils.isNetworkAvailable(a.a)) {
            if (this.b == null) {
                this.b = new i(a.a);
                this.b.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.presenter.ShareButtonPresenter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ShareButtonPresenter.this.b = null;
                    }
                });
            }
            this.b.c();
        } else if (!z) {
            d();
        } else {
            ak.a(a.a, avp.d.net_error_tip);
        }
    }

    private void d() {
        AccountManager accountManager = AccountManager.get(a.a);
        final AccountManagerFuture<Bundle> addAccount = accountManager != null ? accountManager.addAccount("com.xiaopeng.accountservice.ACCOUNT_TYPE_XP_VEHICLE", null, null, null, null, null, null) : null;
        if (addAccount == null) {
            Log.e("ShareButtonPresenter", "login: feature is null");
        } else {
            ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.playercomponent.big.presenter.ShareButtonPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Bundle bundle = (Bundle) addAccount.getResult();
                        Log.i("ShareButtonPresenter", "login: bundle = " + bundle);
                        if (bundle != null) {
                            final Intent intent = (Intent) bundle.getParcelable("intent");
                            Log.i("ShareButtonPresenter", "login intent : " + intent);
                            if (intent != null) {
                                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.playercomponent.big.presenter.ShareButtonPresenter.2.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Activity c = com.xiaopeng.musicradio.utils.a.a().c();
                                        Log.i("ShareButtonPresenter", "login activity : ===========" + c);
                                        if (c != null) {
                                            c.startActivity(intent);
                                        }
                                    }
                                });
                            }
                        }
                    } catch (Exception e) {
                        Log.e("ShareButtonPresenter", "login: ", e);
                    }
                }
            });
        }
    }
}
