package defpackage;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: TimeTypeAdapter.java */
/* renamed from: lv  reason: default package */
/* loaded from: classes3.dex */
public final class lv extends nd<Time> {
    public static final nc a = new nc() { // from class: lv.1
        @Override // defpackage.nc
        public <T> nd<T> a(mq mqVar, mo<T> moVar) {
            if (moVar.a() == Time.class) {
                return new lv();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    @Override // defpackage.nd
    public synchronized void a(mk mkVar, Time time) {
        mkVar.b(time == null ? null : this.b.format((Date) time));
    }

    @Override // defpackage.nd
    /* renamed from: b */
    public synchronized Time a(mj mjVar) {
        if (mjVar.f() == ml.NULL) {
            mjVar.j();
            return null;
        }
        try {
            return new Time(this.b.parse(mjVar.h()).getTime());
        } catch (ParseException e) {
            throw new na(e);
        }
    }
}
