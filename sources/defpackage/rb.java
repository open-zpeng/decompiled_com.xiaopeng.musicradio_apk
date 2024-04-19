package defpackage;

import android.util.JsonReader;
/* compiled from: IntegerParser.java */
/* renamed from: rb  reason: default package */
/* loaded from: classes3.dex */
public class rb implements rw<Integer> {
    public static final rb a = new rb();

    private rb() {
    }

    @Override // defpackage.rw
    /* renamed from: a */
    public Integer b(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(rc.b(jsonReader) * f));
    }
}
