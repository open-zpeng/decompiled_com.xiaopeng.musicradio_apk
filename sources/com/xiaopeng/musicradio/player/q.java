package com.xiaopeng.musicradio.player;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.EventLogger;
import java.io.IOException;
/* compiled from: XpEventLogger.java */
/* loaded from: classes2.dex */
public class q extends EventLogger {
    private a a;
    private boolean b;

    /* compiled from: XpEventLogger.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(DataSpec dataSpec, IOException iOException);
    }

    public q(MappingTrackSelector mappingTrackSelector) {
        super(mappingTrackSelector);
        this.b = false;
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(DataSpec dataSpec, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        super.onLoadError(dataSpec, i, i2, format, i3, obj, j, j2, j3, j4, j5, iOException, z);
        Log.e("XpEventLogger", "onLoadError  = " + iOException);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(dataSpec, iOException);
            this.b = false;
        }
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z, int i) {
        super.onPlayerStateChanged(z, i);
        if (i == 3) {
            this.b = true;
        } else {
            this.b = false;
        }
    }

    public void a(a aVar) {
        this.a = aVar;
    }
}
