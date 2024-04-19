package defpackage;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* compiled from: AuthCodeBean.java */
/* renamed from: adr  reason: default package */
/* loaded from: classes2.dex */
public class adr extends BaseBean {
    @SerializedName("data")
    public a data;

    public String toString() {
        return "AuthCodeBean{data=" + this.data + '}';
    }

    /* compiled from: AuthCodeBean.java */
    /* renamed from: adr$a */
    /* loaded from: classes2.dex */
    public static class a {
        @SerializedName("openId")
        public String a;
        @SerializedName("expireTime")
        public long b;
        @SerializedName("login")
        public boolean c;

        public String toString() {
            return "DataBean{openId='" + this.a + "', expireTime=" + this.b + ", login=" + this.c + '}';
        }
    }
}
