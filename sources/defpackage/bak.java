package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.xiaopeng.musicradio.utils.w;
/* compiled from: ThemeResources.java */
/* renamed from: bak  reason: default package */
/* loaded from: classes2.dex */
public class bak {
    private bak() {
    }

    public static bak a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThemeResources.java */
    /* renamed from: bak$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final bak a = new bak();
    }

    private int a(Context context, int i) {
        return a(context, i, c());
    }

    private int a(Context context, int i, boolean z) {
        if (z) {
            try {
                int identifier = context.getResources().getIdentifier(context.getResources().getResourceEntryName(i) + "_" + b(), context.getResources().getResourceTypeName(i), context.getPackageName());
                return identifier == 0 ? i : identifier;
            } catch (Exception unused) {
                return i;
            }
        }
        return i;
    }

    private String b() {
        return c() ? "night" : "";
    }

    private boolean c() {
        return baj.a().d();
    }

    private int b(Context context, int i) {
        return b(context, i, c());
    }

    private int b(Context context, int i, boolean z) {
        int a2;
        if (z && (a2 = a(context, i)) != 0) {
            return context.getResources().getColor(a2);
        }
        return context.getResources().getColor(i);
    }

    private Drawable c(Context context, int i) {
        return c(context, i, c());
    }

    private Drawable c(Context context, int i, boolean z) {
        int a2;
        if (z && (a2 = a(context, i)) != 0) {
            return context.getResources().getDrawable(a2);
        }
        return context.getResources().getDrawable(i);
    }

    public static int a(int i, int i2) {
        if (w.a()) {
            return a().b(com.xiaopeng.musicradio.a.a, i);
        }
        return a().b(com.xiaopeng.musicradio.a.a, i2);
    }

    public static int a(int i) {
        return a().b(com.xiaopeng.musicradio.a.a, i);
    }

    public static int a(int i, boolean z) {
        return a().b(com.xiaopeng.musicradio.a.a, i, z);
    }

    public static Drawable b(int i) {
        return a().c(com.xiaopeng.musicradio.a.a, i);
    }

    public static int c(int i) {
        return a().a(com.xiaopeng.musicradio.a.a, i);
    }

    public static int b(int i, boolean z) {
        return a().a(com.xiaopeng.musicradio.a.a, i, z);
    }
}
