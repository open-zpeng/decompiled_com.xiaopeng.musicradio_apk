package com.xiaopeng.musicradio.login.main.view;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.base.c;
import com.xiaopeng.musicradio.login.main.presenter.LoginPresenter;
import defpackage.agy;
@Route(path = "/login/login")
/* loaded from: classes.dex */
public class LoginActivity extends c<aha, Object, LoginPresenter> {
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public LoginPresenter e() {
        return new LoginPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    protected int f() {
        return agy.c.activity_login;
    }
}
