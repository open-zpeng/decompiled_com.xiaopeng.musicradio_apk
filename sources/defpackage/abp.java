package defpackage;

import com.google.gson.Gson;
/* compiled from: GlobalGsonInstance.java */
/* renamed from: abp  reason: default package */
/* loaded from: classes2.dex */
public class abp {
    private Gson a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlobalGsonInstance.java */
    /* renamed from: abp$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final abp a = new abp();
    }

    public static abp a() {
        return a.a;
    }

    private abp() {
        this.a = new Gson();
    }

    public Gson b() {
        return this.a;
    }
}
