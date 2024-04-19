package com.xiaopeng.lib.framework.account.adapt;

import com.xiaopeng.lib.framework.moduleinterface.accountmodule.AbsException;
/* loaded from: classes.dex */
public class AccountException extends AbsException {
    private int mCode;

    public AccountException(String str) {
        super(str);
    }

    public AccountException(int i, String str) {
        super(str);
        this.mCode = i;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.AbsException
    public int getCode() {
        return this.mCode;
    }
}
