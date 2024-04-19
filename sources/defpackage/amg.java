package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.o;
import com.google.android.exoplayer2.DefaultRenderersFactory;
/* compiled from: LiveDataUtils.java */
/* renamed from: amg  reason: default package */
/* loaded from: classes2.dex */
public class amg {
    public static void a(LiveData liveData, o oVar) {
        a(liveData, oVar, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public static void a(final LiveData liveData, final o oVar, long j) {
        ban.b(new Runnable() { // from class: amg.1
            @Override // java.lang.Runnable
            public void run() {
                LiveData.this.b(oVar);
            }
        }, j);
    }
}
