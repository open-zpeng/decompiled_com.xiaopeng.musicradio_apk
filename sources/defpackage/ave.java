package defpackage;

import android.os.Bundle;
/* compiled from: BundleBasePolicy.java */
/* renamed from: ave  reason: default package */
/* loaded from: classes2.dex */
public class ave {

    /* compiled from: BundleBasePolicy.java */
    /* renamed from: ave$a */
    /* loaded from: classes2.dex */
    public interface a {
        Bundle a();

        void b();
    }

    public a a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new avf(bundle);
    }

    public static Bundle a(String str, String str2, String str3, int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putString("voice_id", str);
        bundle.putInt("voice_type", i);
        bundle.putInt("cache_type", i2);
        bundle.putString("voice_name", str2);
        bundle.putString("album_name", str3);
        bundle.putInt("content_length", i3);
        return bundle;
    }
}
