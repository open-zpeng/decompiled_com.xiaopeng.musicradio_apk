package com.xiaopeng.musicradio.player;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.FileDataSourceFactory;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
/* compiled from: MetadataRetriever.java */
/* loaded from: classes2.dex */
public final class i {
    private final AdsMediaSource.MediaSourceFactory a;
    private final HandlerThread b = new HandlerThread("ExoPlayer:MetadataRetriever");
    private final HandlerWrapper c;
    private b d;

    /* compiled from: MetadataRetriever.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(TrackGroupArray trackGroupArray);

        void a(Throwable th);
    }

    public static i a() {
        return a(Clock.DEFAULT);
    }

    static i a(Clock clock) {
        return a(new ExtractorMediaSource.Factory(new FileDataSourceFactory()).setExtractorsFactory(new DefaultExtractorsFactory().setParseMeta(true)), clock);
    }

    private static i a(AdsMediaSource.MediaSourceFactory mediaSourceFactory, Clock clock) {
        return new i(mediaSourceFactory, clock);
    }

    public i(AdsMediaSource.MediaSourceFactory mediaSourceFactory, Clock clock) {
        this.a = mediaSourceFactory;
        this.b.start();
        this.c = clock.createHandler(this.b.getLooper(), new a());
    }

    public void a(MediaItem mediaItem) {
        Log.i("MetadataRetriever", "retrieveMetadata: " + mediaItem.localConfiguration.uri);
        this.c.removeCallbacksAndMessages(null);
        this.c.obtainMessage(0, mediaItem).sendToTarget();
    }

    public void b() {
        this.c.sendEmptyMessage(5);
    }

    public void a(Runnable runnable) {
        this.c.removeCallbacksAndMessages(null);
        this.c.post(runnable);
    }

    public void a(b bVar) {
        this.d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MetadataRetriever.java */
    /* loaded from: classes2.dex */
    public final class a implements Handler.Callback {
        private final C0156a b = new C0156a();
        private MediaSource c;
        private MediaPeriod d;

        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    a();
                    MediaItem mediaItem = (MediaItem) message.obj;
                    Log.i("MetadataRetriever", "retrieveMetadata prepare: " + mediaItem.localConfiguration.uri);
                    this.c = i.this.a.createMediaSource(mediaItem.localConfiguration.uri, null, null);
                    this.c.prepareSource(null, true, this.b);
                    i.this.c.sendEmptyMessage(1);
                    return true;
                case 1:
                    try {
                        if (this.d == null) {
                            ((MediaSource) Assertions.checkNotNull(this.c)).maybeThrowSourceInfoRefreshError();
                        } else {
                            this.d.maybeThrowPrepareError();
                        }
                        i.this.c.sendEmptyMessageDelayed(1, 100);
                    } catch (Exception e) {
                        i.this.c.obtainMessage(4, e).sendToTarget();
                    }
                    return true;
                case 2:
                    ((MediaPeriod) Assertions.checkNotNull(this.d)).continueLoading(0L);
                    return true;
                case 3:
                    if (i.this.d != null) {
                        i.this.d.a(this.d.getTrackGroups());
                    }
                    a();
                    return true;
                case 4:
                    Exception exc = (Exception) message.obj;
                    if (i.this.d != null) {
                        Log.i("MetadataRetriever", "handleMessage: " + exc);
                        i.this.d.a(exc);
                    }
                    a();
                    return true;
                case 5:
                    Log.i("MetadataRetriever", "handleMessage: MESSAGE_DESTROY ");
                    i.this.b.quit();
                    return true;
                default:
                    return false;
            }
        }

        private void a() {
            MediaSource mediaSource = this.c;
            if (mediaSource != null) {
                MediaPeriod mediaPeriod = this.d;
                if (mediaPeriod != null) {
                    mediaSource.releasePeriod(mediaPeriod);
                    this.d = null;
                }
                this.c.releaseSource();
                this.c = null;
            }
            i.this.c.removeMessages(2);
            Log.i("MetadataRetriever", "release2: =====");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MetadataRetriever.java */
        /* renamed from: com.xiaopeng.musicradio.player.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0156a implements MediaSource.Listener {
            private final C0157a b = new C0157a();
            private final Allocator c = new DefaultAllocator(true, 65536);

            public C0156a() {
            }

            @Override // com.google.android.exoplayer2.source.MediaSource.Listener
            public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline, Object obj) {
                Log.i("MetadataRetriever", "onSourceInfoRefreshed : " + a.this.d + " callback = " + i.this.d);
                if (a.this.d != null) {
                    return;
                }
                int indexOfPeriod = timeline.getIndexOfPeriod(timeline.getUidOfPeriod(0));
                a.this.d = mediaSource.createPeriod(new MediaSource.MediaPeriodId(indexOfPeriod), this.c);
                a.this.d.prepare(this.b, 0L);
            }

            /* compiled from: MetadataRetriever.java */
            /* renamed from: com.xiaopeng.musicradio.player.i$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            private final class C0157a implements MediaPeriod.Callback {
                private C0157a() {
                }

                @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                public void onPrepared(MediaPeriod mediaPeriod) {
                    Log.i("MetadataRetriever", "onPrepared retrieveMetadata prepare: " + mediaPeriod + " callback = " + i.this.d);
                    i.this.c.removeMessages(1);
                    i.this.c.obtainMessage(3).sendToTarget();
                }

                @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                /* renamed from: a */
                public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                    i.this.c.obtainMessage(2).sendToTarget();
                }
            }
        }
    }
}
