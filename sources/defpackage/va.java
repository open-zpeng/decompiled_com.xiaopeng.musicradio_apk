package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Random;
/* compiled from: PhoneInfoUtils.java */
/* renamed from: va  reason: default package */
/* loaded from: classes3.dex */
public class va {
    private static final Random a = new Random();

    public static final String a() {
        int nextInt = a.nextInt();
        int nextInt2 = a.nextInt();
        byte[] a2 = ut.a((int) (System.currentTimeMillis() / 1000));
        byte[] a3 = ut.a((int) System.nanoTime());
        byte[] a4 = ut.a(nextInt);
        byte[] a5 = ut.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a2, 0, bArr, 0, 4);
        System.arraycopy(a3, 0, bArr, 4, 4);
        System.arraycopy(a4, 0, bArr, 8, 4);
        System.arraycopy(a5, 0, bArr, 12, 4);
        return uq.b(bArr, 2);
    }

    public static String a(Context context) {
        if (context != null) {
            try {
                String string = context.getSharedPreferences("UTCommon", 0).getString("_ie", "");
                if (!TextUtils.isEmpty(string)) {
                    String str = new String(uq.a(string.getBytes(), 2), "UTF-8");
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                }
            } catch (Exception unused) {
            }
        }
        String a2 = TextUtils.isEmpty(null) ? a() : null;
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_ie", new String(uq.c(a2.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return a2;
    }

    public static String b(Context context) {
        if (context != null) {
            try {
                String string = context.getSharedPreferences("UTCommon", 0).getString("_is", "");
                if (!TextUtils.isEmpty(string)) {
                    String str = new String(uq.a(string.getBytes(), 2), "UTF-8");
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                }
            } catch (Exception unused) {
            }
        }
        String a2 = TextUtils.isEmpty(null) ? a() : null;
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_is", new String(uq.c(a2.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return a2;
    }
}
