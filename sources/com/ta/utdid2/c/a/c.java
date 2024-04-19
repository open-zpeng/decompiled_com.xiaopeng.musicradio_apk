package com.ta.utdid2.c.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.ta.utdid2.b.a.i;
import com.ta.utdid2.c.a.b;
import java.io.File;
import java.util.Map;
/* compiled from: PersistentConfiguration.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f117a;

    /* renamed from: a  reason: collision with other field name */
    private b f119a;

    /* renamed from: a  reason: collision with other field name */
    private d f120a;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Context mContext;
    private SharedPreferences.Editor a = null;

    /* renamed from: a  reason: collision with other field name */
    private b.a f118a = null;

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185 A[Catch: Exception -> 0x0193, TRY_LEAVE, TryCatch #4 {Exception -> 0x0193, blocks: (B:80:0x0181, B:82:0x0185), top: B:94:0x0181 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.c.a.c.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private d a(String str) {
        File m65a = m65a(str);
        if (m65a != null) {
            this.f120a = new d(m65a.getAbsolutePath());
            return this.f120a;
        }
        return null;
    }

    /* renamed from: a  reason: collision with other method in class */
    private File m65a(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            File file = new File(String.format("%s%s%s", externalStorageDirectory.getAbsolutePath(), File.separator, str));
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    private void a(SharedPreferences sharedPreferences, b bVar) {
        b.a a;
        if (sharedPreferences == null || bVar == null || (a = bVar.a()) == null) {
            return;
        }
        a.b();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                a.a(key, (String) value);
            } else if (value instanceof Integer) {
                a.a(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                a.a(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                a.a(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                a.a(key, ((Boolean) value).booleanValue());
            }
        }
        a.commit();
    }

    private void a(b bVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit;
        if (bVar == null || sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.clear();
        for (Map.Entry<String, ?> entry : bVar.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                edit.putString(key, (String) value);
            } else if (value instanceof Integer) {
                edit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                edit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        edit.commit();
    }

    private boolean b() {
        b bVar = this.f119a;
        if (bVar != null) {
            boolean mo64a = bVar.mo64a();
            if (!mo64a) {
                commit();
            }
            return mo64a;
        }
        return false;
    }

    private void c() {
        b bVar;
        SharedPreferences sharedPreferences;
        if (this.a == null && (sharedPreferences = this.f117a) != null) {
            this.a = sharedPreferences.edit();
        }
        if (this.i && this.f118a == null && (bVar = this.f119a) != null) {
            this.f118a = bVar.a();
        }
        b();
    }

    public void putString(String str, String str2) {
        if (i.m63a(str) || str.equals("t")) {
            return;
        }
        c();
        SharedPreferences.Editor editor = this.a;
        if (editor != null) {
            editor.putString(str, str2);
        }
        b.a aVar = this.f118a;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    public void remove(String str) {
        if (i.m63a(str) || str.equals("t")) {
            return;
        }
        c();
        SharedPreferences.Editor editor = this.a;
        if (editor != null) {
            editor.remove(str);
        }
        b.a aVar = this.f118a;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(4:3|(1:7)|8|(9:10|11|(1:15)|16|17|18|19|(4:21|(2:23|(2:25|(3:27|(1:29)(1:31)|30))(2:32|(1:36)))|37|(3:43|44|(1:46)))|49))|54|11|(2:13|15)|16|17|18|19|(0)|49) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        r2.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean commit() {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r5.a
            r3 = 0
            if (r2 == 0) goto L20
            boolean r4 = r5.j
            if (r4 != 0) goto L16
            android.content.SharedPreferences r4 = r5.f117a
            if (r4 == 0) goto L16
            java.lang.String r4 = "t"
            r2.putLong(r4, r0)
        L16:
            android.content.SharedPreferences$Editor r0 = r5.a
            boolean r0 = r0.commit()
            if (r0 != 0) goto L20
            r0 = r3
            goto L21
        L20:
            r0 = 1
        L21:
            android.content.SharedPreferences r1 = r5.f117a
            if (r1 == 0) goto L31
            android.content.Context r1 = r5.mContext
            if (r1 == 0) goto L31
            java.lang.String r2 = r5.e
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r5.f117a = r1
        L31:
            r1 = 0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L37
            goto L3b
        L37:
            r2 = move-exception
            r2.printStackTrace()
        L3b:
            boolean r2 = com.ta.utdid2.b.a.i.m63a(r1)
            if (r2 != 0) goto La6
            java.lang.String r2 = "mounted"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L84
            com.ta.utdid2.c.a.b r2 = r5.f119a
            if (r2 != 0) goto L79
            java.lang.String r2 = r5.f
            com.ta.utdid2.c.a.d r2 = r5.a(r2)
            if (r2 == 0) goto L84
            java.lang.String r4 = r5.e
            com.ta.utdid2.c.a.b r2 = r2.a(r4, r3)
            r5.f119a = r2
            boolean r2 = r5.j
            if (r2 != 0) goto L69
            android.content.SharedPreferences r2 = r5.f117a
            com.ta.utdid2.c.a.b r4 = r5.f119a
            r5.a(r2, r4)
            goto L70
        L69:
            com.ta.utdid2.c.a.b r2 = r5.f119a
            android.content.SharedPreferences r4 = r5.f117a
            r5.a(r2, r4)
        L70:
            com.ta.utdid2.c.a.b r2 = r5.f119a
            com.ta.utdid2.c.a.b$a r2 = r2.a()
            r5.f118a = r2
            goto L84
        L79:
            com.ta.utdid2.c.a.b$a r2 = r5.f118a
            if (r2 == 0) goto L84
            boolean r2 = r2.commit()
            if (r2 != 0) goto L84
            r0 = r3
        L84:
            java.lang.String r2 = "mounted"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L98
            java.lang.String r2 = "mounted_ro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La6
            com.ta.utdid2.c.a.b r1 = r5.f119a
            if (r1 == 0) goto La6
        L98:
            com.ta.utdid2.c.a.d r1 = r5.f120a     // Catch: java.lang.Exception -> La6
            if (r1 == 0) goto La6
            com.ta.utdid2.c.a.d r1 = r5.f120a     // Catch: java.lang.Exception -> La6
            java.lang.String r2 = r5.e     // Catch: java.lang.Exception -> La6
            com.ta.utdid2.c.a.b r1 = r1.a(r2, r3)     // Catch: java.lang.Exception -> La6
            r5.f119a = r1     // Catch: java.lang.Exception -> La6
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.c.a.c.commit():boolean");
    }

    public String getString(String str) {
        b();
        SharedPreferences sharedPreferences = this.f117a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!i.m63a(string)) {
                return string;
            }
        }
        b bVar = this.f119a;
        return bVar != null ? bVar.getString(str, "") : "";
    }
}
