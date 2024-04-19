package com.xiaopeng.lib.framework.account.info;

import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfoEvent;
/* loaded from: classes.dex */
public class UserInfoEventImpl implements IUserInfoEvent {
    private IUserInfo mUserInfo;

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfoEvent
    public IUserInfo getUserInfo() {
        return this.mUserInfo;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfoEvent
    public IUserInfoEvent setUserInfo(IUserInfo iUserInfo) {
        this.mUserInfo = iUserInfo;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfoEventImpl;{");
        IUserInfo iUserInfo = this.mUserInfo;
        if (iUserInfo == null) {
            sb.append(" mUserInfo is null }");
        } else {
            sb.append(iUserInfo.toString());
            sb.append(" }");
        }
        return sb.toString();
    }
}
