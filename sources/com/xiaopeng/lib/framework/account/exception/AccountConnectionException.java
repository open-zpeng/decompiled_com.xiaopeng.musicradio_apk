package com.xiaopeng.lib.framework.account.exception;

import com.xiaopeng.lib.framework.moduleinterface.accountmodule.AbsException;
/* loaded from: classes.dex */
public class AccountConnectionException extends AbsException {
    public static final int ERROR_CODE_SERVER_DISCONNECTION = 1;
    private static final String ERROR_CODE_SERVER_DISCONNECTION_STR = "账号服务已断开连接";
    public static final int ERROR_CODE_SERVER_UNBIND = 2;
    private static final String ERROR_CODE_SERVER_UNBIND_STR = "账号服务已取消绑定";
    public static final int ERROR_CODE_SERVER_UNKNOWN = 0;
    private static final String ERROR_CODE_SERVER_UNKNOWN_STR = "账号服务未知错误";
    private int mCode;

    public AccountConnectionException() {
        this(0);
    }

    public AccountConnectionException(int i) {
        this(i, null);
    }

    public AccountConnectionException(String str) {
        this(0, str);
    }

    public AccountConnectionException(int i, String str) {
        super(i, str);
        this.mCode = i;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.AbsException
    public int getCode() {
        return this.mCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.mCode) {
            case 0:
                return "账号服务未知错误";
            case 1:
                return "账号服务已断开连接";
            case 2:
                return ERROR_CODE_SERVER_UNBIND_STR;
            default:
                return "账号服务未知错误";
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AccountConnectionException;{ code=" + getCode() + " message=" + getMessage() + " }";
    }
}
