package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: DateTypeAdapter.java */
/* renamed from: lp  reason: default package */
/* loaded from: classes3.dex */
public final class lp extends nd<Date> {
    public static final nc a = new nc() { // from class: lp.1
        @Override // defpackage.nc
        public <T> nd<T> a(mq mqVar, mo<T> moVar) {
            if (moVar.a() == Date.class) {
                return new lp();
            }
            return null;
        }
    };
    private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat d = a();

    private static DateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private synchronized Date a(String str) {
        try {
            try {
                try {
                } catch (ParseException unused) {
                    return this.d.parse(str);
                }
            } catch (ParseException e) {
                throw new na(str, e);
            }
        } catch (ParseException unused2) {
            return this.b.parse(str);
        }
        return this.c.parse(str);
    }

    @Override // defpackage.nd
    public synchronized void a(mk mkVar, Date date) {
        if (date == null) {
            mkVar.f();
        } else {
            mkVar.b(this.b.format(date));
        }
    }

    @Override // defpackage.nd
    /* renamed from: b */
    public Date a(mj mjVar) {
        if (mjVar.f() == ml.NULL) {
            mjVar.j();
            return null;
        }
        return a(mjVar.h());
    }
}
