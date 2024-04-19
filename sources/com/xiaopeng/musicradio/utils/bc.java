package com.xiaopeng.musicradio.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaopeng.lib.utils.LogUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: SpConfig.java */
/* loaded from: classes2.dex */
public class bc {
    private static Map<String, bc> a = new HashMap();
    private SharedPreferences b;

    private static bc b(Context context, String str) {
        bc bcVar = a.containsKey(str) ? a.get(str) : null;
        if (bcVar == null) {
            bc bcVar2 = new bc(context, str);
            a.put(str, bcVar2);
            return bcVar2;
        }
        return bcVar;
    }

    public static synchronized bc a(Context context, String str) {
        bc b;
        synchronized (bc.class) {
            if (str == null) {
                str = "";
            }
            b = b(context, str);
        }
        return b;
    }

    private bc(Context context, String str) {
        az.a();
        this.b = context.getSharedPreferences(str + ".configuration", 0);
    }

    public synchronized boolean a(String str, String str2) {
        return a(this.b.edit().putString(str, str2));
    }

    public synchronized boolean a(String str, int i) {
        return a(this.b.edit().putInt(str, i));
    }

    public synchronized String b(String str, String str2) {
        return this.b.getString(str, str2);
    }

    public synchronized int b(String str, int i) {
        return this.b.getInt(str, i);
    }

    private boolean a(SharedPreferences.Editor editor) {
        try {
            editor.apply();
            return true;
        } catch (Throwable th) {
            LogUtils.e("Config", th);
            return false;
        }
    }
}
