package defpackage;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* compiled from: AuthCodeBean.java */
/* renamed from: aea  reason: default package */
/* loaded from: classes2.dex */
public class aea extends BaseBean {
    @SerializedName("data")
    public a data;

    public String toString() {
        return "AuthCodeBean{data=" + this.data + '}';
    }

    /* compiled from: AuthCodeBean.java */
    /* renamed from: aea$a */
    /* loaded from: classes2.dex */
    public static class a {
        @SerializedName("openId")
        public String a;
        @SerializedName("sid")
        public String b;

        public String toString() {
            return "DataBean{openId='" + this.a + "', sid=" + this.b + '}';
        }
    }
}
