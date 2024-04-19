package com.xiaopeng.lib.framework.moduleinterface.accountmodule;

import android.app.Application;
/* loaded from: classes.dex */
public interface IAccount {
    IUserInfo getUserInfo();

    void init(Application application, String str);

    void init(Application application, String str, String str2);

    void login();

    void logout();

    void requestOAuth(ICallback<IAuthInfo, IError> iCallback);

    void requestOAuth(String str, ICallback<IAuthInfo, IError> iCallback);

    void requestOTP(String str, ICallback<IOTPInfo, IError> iCallback);
}
