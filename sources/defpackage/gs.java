package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
/* compiled from: ContentInfoCompat.java */
/* renamed from: gs  reason: default package */
/* loaded from: classes3.dex */
public final class gs {
    final ClipData a;
    final int b;
    final int c;
    final Uri d;
    final Bundle e;

    static String a(int i) {
        switch (i) {
            case 0:
                return "SOURCE_APP";
            case 1:
                return "SOURCE_CLIPBOARD";
            case 2:
                return "SOURCE_INPUT_METHOD";
            case 3:
                return "SOURCE_DRAG_AND_DROP";
            default:
                return String.valueOf(i);
        }
    }

    static String b(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    gs(a aVar) {
        this.a = (ClipData) gp.a(aVar.a);
        this.b = gp.a(aVar.b, 0, 3, "source");
        this.c = gp.a(aVar.c, 1);
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public String toString() {
        return "ContentInfoCompat{clip=" + this.a + ", source=" + a(this.b) + ", flags=" + b(this.c) + ", linkUri=" + this.d + ", extras=" + this.e + "}";
    }

    public ClipData a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: gs$a */
    /* loaded from: classes3.dex */
    public static final class a {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        public a(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a a(Uri uri) {
            this.d = uri;
            return this;
        }

        public a a(Bundle bundle) {
            this.e = bundle;
            return this;
        }

        public gs a() {
            return new gs(this);
        }
    }
}
