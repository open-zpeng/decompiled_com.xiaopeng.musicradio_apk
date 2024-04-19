package defpackage;

import android.text.TextUtils;
import java.util.Set;
/* compiled from: AccurateSampleCondition.java */
/* renamed from: tp  reason: default package */
/* loaded from: classes3.dex */
public class tp {
    private Set<String> a;
    private a b;

    /* compiled from: AccurateSampleCondition.java */
    /* renamed from: tp$a */
    /* loaded from: classes3.dex */
    private enum a {
        IN,
        NOT_IN
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean contains = this.a.contains(str);
        return this.b == a.IN ? contains : !contains;
    }
}
