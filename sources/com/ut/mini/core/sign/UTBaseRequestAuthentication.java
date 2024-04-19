package com.ut.mini.core.sign;
/* loaded from: classes.dex */
public class UTBaseRequestAuthentication implements IUTRequestAuthentication {
    private boolean E;
    private String ac;
    private String g;

    @Override // com.ut.mini.core.sign.IUTRequestAuthentication
    public String getAppkey() {
        return this.g;
    }

    public String getAppSecret() {
        return this.ac;
    }

    public UTBaseRequestAuthentication(String str, String str2) {
        this.g = null;
        this.ac = null;
        this.E = false;
        this.g = str;
        this.ac = str2;
    }

    public UTBaseRequestAuthentication(String str, String str2, boolean z) {
        this.g = null;
        this.ac = null;
        this.E = false;
        this.g = str;
        this.ac = str2;
        this.E = z;
    }

    public boolean isEncode() {
        return this.E;
    }

    @Override // com.ut.mini.core.sign.IUTRequestAuthentication
    public String getSign(String str) {
        if (this.g == null || this.ac == null) {
            uw.a("UTBaseRequestAuthentication", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            return ux.a(ux.c((str + this.ac).getBytes()));
        }
    }
}
