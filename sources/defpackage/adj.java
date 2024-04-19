package defpackage;

import com.google.gson.annotations.SerializedName;
/* compiled from: BizResponse.java */
/* renamed from: adj  reason: default package */
/* loaded from: classes2.dex */
public class adj<T> {
    @SerializedName("code")
    public int a;
    @SerializedName("data")
    public T b;
    @SerializedName("msg")
    public String c;

    public String toString() {
        return "BizResponse{code=" + this.a + ", data=" + this.b + ", msg='" + this.c + "'}";
    }
}
