package defpackage;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* compiled from: QrCodeBean.java */
/* renamed from: adt  reason: default package */
/* loaded from: classes2.dex */
public class adt extends BaseBean {
    @SerializedName("data")
    public a data;

    public String toString() {
        return "QrCodeBean{data=" + this.data + '}';
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QrCodeBean{qrCodeType=");
        sb.append(str);
        sb.append(", data=");
        sb.append("wx".equals(str) ? a(this.data) : this.data);
        sb.append('}');
        return sb.toString();
    }

    public String a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return "DataBean{authCode='" + aVar.b + "', effectiveTime=" + aVar.c + '}';
    }

    /* compiled from: QrCodeBean.java */
    /* renamed from: adt$a */
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
