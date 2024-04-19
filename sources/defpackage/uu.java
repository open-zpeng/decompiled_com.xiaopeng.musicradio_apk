package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: KeyArraySorter.java */
/* renamed from: uu  reason: default package */
/* loaded from: classes3.dex */
public class uu {
    private static uu a = new uu();
    private b b = new b();
    private a c = new a();

    private uu() {
    }

    public static uu a() {
        return a;
    }

    public String[] a(String[] strArr, boolean z) {
        Comparator comparator;
        if (z) {
            comparator = this.c;
        } else {
            comparator = this.b;
        }
        if (comparator == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        Arrays.sort(strArr, comparator);
        return strArr;
    }

    /* compiled from: KeyArraySorter.java */
    /* renamed from: uu$b */
    /* loaded from: classes3.dex */
    private class b implements Comparator<String> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2) * (-1);
        }
    }

    /* compiled from: KeyArraySorter.java */
    /* renamed from: uu$a */
    /* loaded from: classes3.dex */
    private class a implements Comparator<String> {
        private a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2);
        }
    }
}
