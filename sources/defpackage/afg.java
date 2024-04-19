package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.internal.DaoConfig;
/* compiled from: MigrationHelper.java */
/* renamed from: afg  reason: default package */
/* loaded from: classes2.dex */
public final class afg {
    public static boolean a = true;
    public static int b = -1;
    private static String c = "MigrationHelper";
    private static WeakReference<a> d;

    /* compiled from: MigrationHelper.java */
    /* renamed from: afg$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Database database, boolean z);

        void b(Database database, boolean z);
    }

    public static void a(Database database, Class<? extends AbstractDao<?, ?>>... clsArr) {
        a("【Generate temp table】start");
        b(database, clsArr);
        a("【Generate temp table】complete");
        WeakReference<a> weakReference = d;
        a aVar = weakReference != null ? weakReference.get() : null;
        if (aVar != null) {
            aVar.b(database, true);
            a("【Drop all table by listener】");
            aVar.a(database, false);
            a("【Create all table by listener】");
        } else {
            a(database, true, clsArr);
            b(database, false, clsArr);
        }
        a("【Restore data】start");
        c(database, clsArr);
        a("【Restore data】complete");
    }

    private static void b(Database database, Class<? extends AbstractDao<?, ?>>... clsArr) {
        for (Class<? extends AbstractDao<?, ?>> cls : clsArr) {
            String str = null;
            DaoConfig daoConfig = new DaoConfig(database, cls);
            String str2 = daoConfig.tablename;
            if (a(database, false, str2)) {
                try {
                    str = daoConfig.tablename.concat("_TEMP");
                    database.execSQL("DROP TABLE IF EXISTS " + str + ";");
                    database.execSQL("CREATE TEMPORARY TABLE " + str + " AS SELECT * FROM " + str2 + ";");
                    StringBuilder sb = new StringBuilder();
                    sb.append("【Table】");
                    sb.append(str2);
                    sb.append("\n ---Columns-->");
                    sb.append(a(daoConfig));
                    a(sb.toString());
                    a("【Generate temp table】" + str);
                } catch (SQLException e) {
                    Log.e(c, "【Failed to generate temp table】" + str, e);
                }
            } else {
                a("【New Table】" + str2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(org.greenrobot.greendao.database.Database r5, boolean r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r5 == 0) goto L65
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto La
            goto L65
        La:
            if (r6 == 0) goto Lf
            java.lang.String r6 = "sqlite_temp_master"
            goto L11
        Lf:
            java.lang.String r6 = "sqlite_master"
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT COUNT(*) FROM "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " WHERE type = ? AND name = ?"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            r2 = 2
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.String r4 = "table"
            r2[r0] = r4     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r2[r3] = r7     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            android.database.Cursor r1 = r5.rawQuery(r6, r2)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r1 == 0) goto L49
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r5 != 0) goto L3f
            goto L49
        L3f:
            int r5 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r1 == 0) goto L5b
            r1.close()
            goto L5b
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            return r0
        L4f:
            r5 = move-exception
            goto L5f
        L51:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5a
            r1.close()
        L5a:
            r5 = r0
        L5b:
            if (r5 <= 0) goto L5e
            r0 = r3
        L5e:
            return r0
        L5f:
            if (r1 == 0) goto L64
            r1.close()
        L64:
            throw r5
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afg.a(org.greenrobot.greendao.database.Database, boolean, java.lang.String):boolean");
    }

    private static String a(DaoConfig daoConfig) {
        if (daoConfig == null) {
            return "no columns";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < daoConfig.allColumns.length; i++) {
            sb.append(daoConfig.allColumns[i]);
            sb.append(ListSignBean.COLLECTID_SUFFIX);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private static void a(Database database, boolean z, Class<? extends AbstractDao<?, ?>>... clsArr) {
        a(database, "dropTable", z, clsArr);
        a("【Drop all table by reflect】");
    }

    private static void b(Database database, boolean z, Class<? extends AbstractDao<?, ?>>... clsArr) {
        a(database, "createTable", z, clsArr);
        a("【Create all table by reflect】");
    }

    private static void a(Database database, String str, boolean z, Class<? extends AbstractDao<?, ?>>... clsArr) {
        if (clsArr.length < 1) {
            return;
        }
        try {
            for (Class<? extends AbstractDao<?, ?>> cls : clsArr) {
                cls.getDeclaredMethod(str, Database.class, Boolean.TYPE).invoke(null, database, Boolean.valueOf(z));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    private static void c(Database database, Class<? extends AbstractDao<?, ?>>... clsArr) {
        for (Class<? extends AbstractDao<?, ?>> cls : clsArr) {
            DaoConfig daoConfig = new DaoConfig(database, cls);
            String str = daoConfig.tablename;
            String concat = daoConfig.tablename.concat("_TEMP");
            if (a(database, true, concat)) {
                try {
                    ArrayList arrayList = new ArrayList(a(database, concat).size());
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < daoConfig.properties.length; i++) {
                        String str2 = daoConfig.properties[i].columnName;
                        if (a(database, concat).contains(str2)) {
                            arrayList.add(str2);
                            arrayList2.add(str2);
                        } else {
                            try {
                                String a2 = a(daoConfig.properties[i].type);
                                if ("INTEGER".equals(a2) || "BOOLEAN".equals(a2)) {
                                    arrayList2.add("0 as " + str2);
                                    arrayList.add(str2);
                                }
                            } catch (Exception e) {
                                Log.e(c, "【Fail getTypeByClass】" + concat, e);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        String join = TextUtils.join(ListSignBean.COLLECTID_SUFFIX, arrayList);
                        String join2 = TextUtils.join(ListSignBean.COLLECTID_SUFFIX, arrayList2);
                        a("columnSQL " + join);
                        a("columnSQLQuery " + join2);
                        database.execSQL("INSERT INTO " + str + " (" + join + ") SELECT " + join2 + " FROM " + concat + ";");
                        StringBuilder sb = new StringBuilder();
                        sb.append("【Restore data】 to ");
                        sb.append(str);
                        a(sb.toString());
                    }
                    database.execSQL("DROP TABLE " + concat);
                    a("【Drop temp table】" + concat);
                } catch (SQLException e2) {
                    Log.e(c, "【Failed to restore data from temp table 】" + concat, e2);
                }
            }
        }
    }

    private static List<String> a(Database database, String str) {
        Cursor cursor = null;
        r0 = null;
        List<String> asList = null;
        cursor = null;
        try {
            try {
                Cursor rawQuery = database.rawQuery("SELECT * FROM " + str + " limit 0", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getColumnCount() > 0) {
                            asList = Arrays.asList(rawQuery.getColumnNames());
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor = rawQuery;
                        e.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return new ArrayList();
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        new ArrayList();
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return asList == null ? new ArrayList() : asList;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(String str) {
        if (a) {
            Log.i(c, str);
        }
    }

    private static String a(Class<?> cls) {
        if (cls.equals(String.class)) {
            return "TEXT";
        }
        if (cls.equals(Long.class) || cls.equals(Integer.class) || cls.equals(Long.TYPE) || cls.equals(Integer.TYPE)) {
            return "INTEGER";
        }
        if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
            return "BOOLEAN";
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        r7 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r7 >= 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
        r8 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r0 >= r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        r8.append(r1.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        if (r0 == (r7 - 1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        r8.append(com.xiaopeng.musicradio.bean.ListSignBean.COLLECTID_SUFFIX);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        r7 = r8.toString();
        com.xiaopeng.musicradio.utils.ay.b("sp_key_blue_v14_songids", r7);
        r8 = defpackage.afg.c;
        com.xiaopeng.lib.utils.LogUtils.i(r8, "sp_key_blue_v14_songids:" + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(org.greenrobot.greendao.database.Database r7, java.lang.Class<? extends org.greenrobot.greendao.AbstractDao<?, ?>> r8) {
        /*
            org.greenrobot.greendao.internal.DaoConfig r0 = new org.greenrobot.greendao.internal.DaoConfig
            r0.<init>(r7, r8)
            java.lang.String r8 = r0.tablename
            r0 = 0
            boolean r1 = a(r7, r0, r8)
            if (r1 != 0) goto Lf
            return
        Lf:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r5 = "SELECT * FROM "
            r4.append(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.append(r8)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r5 = " WHERE MUSIC_FROM="
            r4.append(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.append(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r5 = " ORDER BY TS DESC limit 200"
            r4.append(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.database.Cursor r2 = r7.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
        L38:
            boolean r7 = r2.moveToNext()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r7 == 0) goto L50
            java.lang.String r7 = "_id"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            long r4 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r1.add(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            goto L38
        L50:
            if (r2 == 0) goto L71
            goto L6e
        L53:
            r7 = move-exception
            goto Lb2
        L55:
            r7 = move-exception
            java.lang.String r4 = defpackage.afg.c     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r5.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = "【Failed to restore blue data from table 】"
            r5.append(r6)     // Catch: java.lang.Throwable -> L53
            r5.append(r8)     // Catch: java.lang.Throwable -> L53
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L53
            android.util.Log.i(r4, r8, r7)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L71
        L6e:
            r2.close()
        L71:
            int r7 = r1.size()
            if (r7 >= r3) goto L78
            return
        L78:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
        L7d:
            if (r0 >= r7) goto L92
            java.lang.Object r2 = r1.get(r0)
            r8.append(r2)
            int r2 = r7 + (-1)
            if (r0 == r2) goto L8f
            java.lang.String r2 = ","
            r8.append(r2)
        L8f:
            int r0 = r0 + 1
            goto L7d
        L92:
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "sp_key_blue_v14_songids"
            com.xiaopeng.musicradio.utils.ay.b(r8, r7)
            java.lang.String r8 = defpackage.afg.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sp_key_blue_v14_songids:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.xiaopeng.lib.utils.LogUtils.i(r8, r7)
            return
        Lb2:
            if (r2 == 0) goto Lb7
            r2.close()
        Lb7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afg.a(org.greenrobot.greendao.database.Database, java.lang.Class):void");
    }
}
