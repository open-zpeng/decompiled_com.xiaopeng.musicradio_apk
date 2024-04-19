package defpackage;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* compiled from: SqlDateTypeAdapter.java */
/* renamed from: lw  reason: default package */
/* loaded from: classes3.dex */
public final class lw extends nd<Date> {
    public static final nc a = new nc() { // from class: lw.1
        @Override // defpackage.nc
        public <T> nd<T> a(mq mqVar, mo<T> moVar) {
            if (moVar.a() == Date.class) {
                return new lw();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    @Override // defpackage.nd
    public synchronized void a(mk mkVar, Date date) {
        mkVar.b(date == null ? null : this.b.format((java.util.Date) date));
    }

    @Override // defpackage.nd
    /* renamed from: b */
    public synchronized Date a(mj mjVar) {
        if (mjVar.f() == ml.NULL) {
            mjVar.j();
            return null;
        }
        try {
            return new Date(this.b.parse(mjVar.h()).getTime());
        } catch (ParseException e) {
            throw new na(e);
        }
    }
}
