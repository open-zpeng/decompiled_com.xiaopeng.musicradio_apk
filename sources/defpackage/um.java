package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogSqliteStore.java */
/* renamed from: um  reason: default package */
/* loaded from: classes3.dex */
public class um implements ul {
    String a = "SELECT * FROM %s ORDER BY %s ASC LIMIT %s";
    String b = "SELECT count(*) FROM %s";
    String c = "DELETE FROM log where _id in ( select _id from log  ORDER BY _id ASC LIMIT %d )";
    a d;

    /* JADX INFO: Access modifiers changed from: protected */
    public um(Context context) {
        this.d = new a(context);
    }

    @Override // defpackage.ul
    public synchronized boolean a(List<vo> list) {
        a aVar;
        if (list != null) {
            if (list.size() != 0) {
                SQLiteDatabase sQLiteDatabase = null;
                boolean z = false;
                try {
                    sQLiteDatabase = this.d.getWritableDatabase();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.beginTransaction();
                        int i = 0;
                        while (true) {
                            try {
                                if (i >= list.size()) {
                                    z = true;
                                    break;
                                }
                                vo voVar = list.get(i);
                                if (voVar != null) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("eventId", voVar.b);
                                    contentValues.put("priority", voVar.c);
                                    contentValues.put("content", voVar.b());
                                    contentValues.put("time", voVar.d);
                                    contentValues.put("_index", voVar.e);
                                    long insert = sQLiteDatabase.insert("log", "", contentValues);
                                    if (insert == -1) {
                                        break;
                                    }
                                    uw.a("UTSqliteLogStore", "[insert] ", voVar.e, " isSuccess:", true, "ret", Long.valueOf(insert));
                                }
                                i++;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                uw.a("UTSqliteLogStore", "insert error", th);
                                ti.a(th);
                                if (sQLiteDatabase != null) {
                                    try {
                                        sQLiteDatabase.setTransactionSuccessful();
                                    } catch (Throwable unused) {
                                    }
                                    try {
                                        sQLiteDatabase.endTransaction();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                aVar = this.d;
                                aVar.a(sQLiteDatabase);
                                return z;
                            }
                        }
                    } else {
                        uw.a("UTSqliteLogStore", "db is null");
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.setTransactionSuccessful();
                        } catch (Throwable unused3) {
                        }
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    aVar = this.d;
                } catch (Throwable th2) {
                    th = th2;
                }
                aVar.a(sQLiteDatabase);
                return z;
            }
        }
        return true;
    }

    @Override // defpackage.ul
    public synchronized int b(List<vo> list) {
        boolean z;
        int i;
        if (list != null) {
            if (list.size() != 0) {
                SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.beginTransaction();
                    i = 0;
                    z = true;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        long delete = writableDatabase.delete("log", "_id=?", new String[]{list.get(i2).a + ""});
                        if (delete <= 0) {
                            uw.a("UTSqliteLogStore", "[delete]  ", Integer.valueOf(list.get(i2).a), " ret:", Long.valueOf(delete));
                            z = false;
                        } else if (!"6005".equalsIgnoreCase(list.get(i2).b)) {
                            i++;
                        }
                    }
                    try {
                        writableDatabase.setTransactionSuccessful();
                    } catch (Throwable unused) {
                    }
                    try {
                        writableDatabase.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    this.d.a(writableDatabase);
                } else {
                    uw.a("UTSqliteLogStore", "db is null");
                    z = false;
                    i = 0;
                }
                uw.a("UTSqliteLogStore", "delete ", Integer.valueOf(list.size()), " isSuccess:", Boolean.valueOf(z));
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.ul
    /* renamed from: b */
    public synchronized ArrayList<vo> a(String str, int i) {
        ArrayList<vo> arrayList;
        try {
        } catch (Throwable unused) {
            arrayList = null;
        }
        if (i <= 0) {
            return (ArrayList) Collections.EMPTY_LIST;
        }
        arrayList = new ArrayList<>(i);
        try {
            SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
            if (writableDatabase != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM ");
                sb.append("log");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(" WHERE ");
                    sb.append(str);
                }
                sb.append(" ORDER BY ");
                sb.append("time");
                sb.append(" ASC ");
                sb.append(" LIMIT ");
                sb.append(i + "");
                String sb2 = sb.toString();
                uw.a("UTSqliteLogStore", "sql:" + sb2);
                Cursor rawQuery = writableDatabase.rawQuery(sb2, null);
                while (rawQuery != null && rawQuery.moveToNext()) {
                    vo voVar = new vo();
                    uw.a("UTSqliteLogStore", "pos", Integer.valueOf(rawQuery.getPosition()), "count", Integer.valueOf(rawQuery.getCount()));
                    voVar.a = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                    voVar.b = rawQuery.getString(rawQuery.getColumnIndex("eventId"));
                    voVar.c = rawQuery.getString(rawQuery.getColumnIndex("priority"));
                    voVar.b(rawQuery.getString(rawQuery.getColumnIndex("content")));
                    voVar.d = rawQuery.getString(rawQuery.getColumnIndex("time"));
                    try {
                        voVar.e = rawQuery.getString(rawQuery.getColumnIndex("_index"));
                    } catch (Throwable unused2) {
                    }
                    arrayList.add(voVar);
                }
                a(rawQuery);
                this.d.a(writableDatabase);
            } else {
                uw.a("UTSqliteLogStore", "db is null");
            }
        } catch (Throwable unused3) {
        }
        return arrayList;
    }

    @Override // defpackage.ul
    public synchronized int a() {
        int i;
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        i = 0;
        if (writableDatabase != null) {
            Cursor rawQuery = writableDatabase.rawQuery(String.format(this.b, "log"), null);
            if (rawQuery != null) {
                rawQuery.moveToFirst();
                i = rawQuery.getInt(0);
            }
            a(rawQuery);
            this.d.a(writableDatabase);
        } else {
            uw.a("UTSqliteLogStore", "db is null");
        }
        return i;
    }

    @Override // defpackage.ul
    public synchronized void b() {
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        if (writableDatabase != null) {
            writableDatabase.delete("log", null, null);
            this.d.a(writableDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LogSqliteStore.java */
    /* renamed from: um$a */
    /* loaded from: classes3.dex */
    public class a extends SQLiteOpenHelper {
        private AtomicInteger b;
        private SQLiteDatabase c;

        a(Context context) {
            super(context, "ut.db", (SQLiteDatabase.CursorFactory) null, 2);
            this.b = new AtomicInteger();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=DELETE", null);
            } catch (Throwable unused) {
            }
            um.this.a(cursor);
            super.onOpen(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS log (_id INTEGER PRIMARY KEY AUTOINCREMENT, eventId TEXT,priority TEXT, streamId TEXT, time TEXT, content TEXT, _index TEXT )");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i == 1 && i2 == 2) {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE log ADD COLUMN _index TEXT ");
                } catch (Throwable th) {
                    uw.a("UTSqliteLogStore", "DB Upgrade Error", th);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public synchronized SQLiteDatabase getWritableDatabase() {
            try {
                if (this.b.incrementAndGet() == 1) {
                    this.c = super.getWritableDatabase();
                }
            }
            return this.c;
        }

        public synchronized void a(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase == null) {
                return;
            }
            try {
                if (this.b.decrementAndGet() == 0 && this.c != null) {
                    this.c.close();
                    this.c = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // defpackage.ul
    public synchronized void a(String str, String str2) {
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        if (writableDatabase != null) {
            writableDatabase.delete("log", str + " < ?", new String[]{String.valueOf(str2)});
            this.d.a(writableDatabase);
        } else {
            uw.a("UTSqliteLogStore", "db is null");
        }
    }

    @Override // defpackage.ul
    public void a(int i) {
        if (i <= 0) {
            return;
        }
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        if (writableDatabase == null) {
            uw.a("UTSqliteLogStore", "db is null");
            return;
        }
        try {
            writableDatabase.execSQL(String.format(this.c, Integer.valueOf(i)));
        } catch (Throwable unused) {
        }
        this.d.a(writableDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }
}
