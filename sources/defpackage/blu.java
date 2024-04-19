package defpackage;

import java.util.prefs.AbstractPreferences;
/* compiled from: Base64.java */
/* renamed from: blu  reason: default package */
/* loaded from: classes3.dex */
public class blu {
    private static final blu a = new blu();
    private static final a b;

    static {
        blu bluVar = a;
        bluVar.getClass();
        b = new a();
    }

    public static String a(String str) {
        b.putByteArray("akey", str.getBytes());
        return b.a();
    }

    public static String a(byte[] bArr) {
        b.putByteArray("aKey", bArr);
        return b.a();
    }

    /* compiled from: Base64.java */
    /* renamed from: blu$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractPreferences {
        private String b;

        @Override // java.util.prefs.AbstractPreferences
        protected AbstractPreferences childSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String[] childrenNamesSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void flushSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String getSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String[] keysSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void removeNodeSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void removeSpi(String str) {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void syncSpi() {
        }

        public a() {
            super(null, "");
            this.b = null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void putSpi(String str, String str2) {
            this.b = str2;
        }

        public String a() {
            return this.b;
        }
    }
}
