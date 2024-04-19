package defpackage;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* compiled from: QrCodeBean.java */
/* renamed from: aec  reason: default package */
/* loaded from: classes2.dex */
public class aec extends BaseBean {
    @SerializedName("data")
    public a data;

    public String toString() {
        return "QrCodeBean{data=" + this.data + '}';
    }

    /* compiled from: QrCodeBean.java */
    /* renamed from: aec$a */
    /* loaded from: classes2.dex */
    public static class a {
        @SerializedName("qrCode")
        public String a;
        @SerializedName("authCode")
        public String b;
        @SerializedName("effectiveTime")
        public int c;

        public String toString() {
            return "DataBean{qrCode='" + this.a + "', authCode='" + this.b + "', effectiveTime=" + this.c + '}';
        }
    }
}
