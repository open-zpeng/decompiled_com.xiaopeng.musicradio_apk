package defpackage;
/* compiled from: ExceptionHelper.java */
/* renamed from: bli  reason: default package */
/* loaded from: classes3.dex */
public class bli {
    public static bks a(int i) {
        if (i == 4 || i == 5) {
            return new bkx(i);
        }
        return new bks(i);
    }

    public static bks a(Throwable th) {
        if (th.getClass().getName().equals("java.security.GeneralSecurityException")) {
            return new bkx(th);
        }
        return new bks(th);
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
