package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RecordTrackBean.java */
/* renamed from: awm  reason: default package */
/* loaded from: classes2.dex */
public class awm {
    @SerializedName("liveRecords")
    private List<awi> a = new ArrayList();
    @SerializedName("trackRecords")
    private List<awj> b = new ArrayList();
    @SerializedName("radioRecords")
    private List<awl> c = new ArrayList();

    public List<awi> a() {
        return this.a;
    }

    public List<awj> b() {
        return this.b;
    }

    public List<awl> c() {
        return this.c;
    }

    public void d() {
        this.c.clear();
        this.b.clear();
        this.a.clear();
    }
}
