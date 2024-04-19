package com.xiaopeng.musicradio.player;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.google.android.exoplayer2.util.Util;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.player.q;
import com.xiaopeng.musicradio.utils.be;
import defpackage.bam;
import java.io.IOException;
/* compiled from: MediaPlayerModel.java */
/* loaded from: classes2.dex */
public class h implements bam.a, Player.EventListener, CacheDataSource.EventListener, d, q.a {
    DefaultRenderersFactory b;
    private l c;
    private SimpleExoPlayer f;
    private bam g;
    private String h;
    private Cache i;
    private LoadControl m;
    private int n;
    private Handler o;
    private String p;
    private boolean q;
    private p r;
    private Handler s;
    private boolean d = true;
    private boolean j = false;
    private int k = 0;
    private boolean l = false;
    DefaultTrackSelector a = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(null));
    private q e = new q(this.a);

    /* compiled from: MediaPlayerModel.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, String str);

        void b(boolean z);

        void onDownloaded(String str, long j);

        void onPlayPosition(int i, int i2);

        void onSetData(Bundle bundle);

        void onTimeLineChange();

        void playState(int i);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener
    public void onCachedBytesRead(long j, long j2) {
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setData(Bundle bundle) {
    }

    public h(Cache cache, boolean z) {
        this.i = null;
        this.i = cache;
        this.e.a(this);
        this.b = new DefaultRenderersFactory(com.xiaopeng.musicradio.a.a, null, 2);
        this.b.setEnableAudioFloatOutput(z);
        this.m = new DefaultLoadControl(new DefaultAllocator(true, 65536), 30000, 60000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false);
        this.f = ExoPlayerFactory.newSimpleInstance(this.b, this.a, this.m);
        this.f.addListener(this);
        this.f.addListener(this.e);
        this.f.addAudioDebugListener(this.e);
        this.g = new bam(this);
        this.o = new b();
        this.s = new Handler();
        Log.i("MediaPlayerModel", "MediaPlayerModel: " + this);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getDuration() {
        long duration;
        long j = this.f.getDuration() <= 0 ? 0L : (int) (duration / 1000);
        if (j > 0) {
            this.k = (int) j;
        }
        if (this.l) {
            j = this.k;
        }
        return (int) j;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getCurrentPosition() {
        if (this.f.getPlaybackState() == 1) {
            return this.n;
        }
        return Math.min(getDuration(), (int) (this.f.getCurrentPosition() / 1000));
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSecondPosition() {
        if (this.f.getPlaybackState() != 1 || this.f.getPlayWhenReady()) {
            if (this.q && avh.b(this.i, this.h)) {
                return getDuration();
            }
            return (int) (this.f.getBufferedPosition() / 1000);
        }
        return 0;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isPlaying() {
        SimpleExoPlayer simpleExoPlayer = this.f;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getPlayWhenReady();
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setVolume(float f, float f2) {
        this.f.setVolume(f);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public float getVolume() {
        return this.f.getVolume();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void start() {
        LogUtils.i("MediaPlayerModel", "start: ");
        this.f.setPlayWhenReady(true);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void pause() {
        LogUtils.i("MediaPlayerModel", "pause: ");
        this.f.setPlayWhenReady(false);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isIdle() {
        return this.f.getPlaybackState() == 1;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void startSeek() {
        this.g.a();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void seekTo(int i) {
        LogUtils.i("MediaPlayerModel", "seek to :" + i);
        this.f.seekTo((long) (i * 1000));
        this.n = i;
        l lVar = this.c;
        if (lVar != null) {
            lVar.onPlayPosition(this.h, i, getSecondPosition());
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str) {
        prepareData(str, true);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z) {
        prepareData(str, z, true);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z, boolean z2) {
        prepareData(str, z, z2, true);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z, boolean z2, boolean z3) {
        DataSource.Factory a2;
        MediaSource createMediaSource;
        String b2 = avi.b(str);
        if (TextUtils.isEmpty(b2)) {
            LogUtils.e("MediaPlayerModel", "prepareData: uri is null");
            b2 = "";
        }
        String a3 = avi.a(str);
        LogUtils.i("MediaPlayerModel", "prepareData:" + b2 + " newPlay=" + z + " cache=" + z2 + " cacheKey = " + a3);
        for (CacheSpan cacheSpan : this.i.getCachedSpans(a3)) {
            Log.i("MediaPlayerModel", "prepareData: key = " + cacheSpan.key + " pos = " + cacheSpan.position + " len = " + cacheSpan.length + " isCache = " + cacheSpan.isCached);
        }
        Log.i("MediaPlayerModel", "prepareData: ======= cacheLength = " + avh.d(this.i, str) + " allLen = " + avh.c(this.i, str));
        if (TextUtils.equals(str, this.h)) {
            this.l = true;
        } else {
            this.l = false;
        }
        this.h = str;
        this.q = z2;
        if (z2) {
            a2 = avi.a(this.i, this.r);
        } else {
            a2 = avi.a(this.r);
        }
        if (Util.inferContentType(Uri.parse(b2)) == 2) {
            createMediaSource = new HlsMediaSource.Factory(a2).createMediaSource(Uri.parse(b2), this.o, (MediaSourceEventListener) this.e);
        } else if (a(b2)) {
            this.p = a3;
            createMediaSource = new ExtractorMediaSource.Factory(a2).setCustomCacheKey(this.p).createMediaSource(Uri.parse(b2), this.s, (MediaSourceEventListener) this.e);
        } else if (b(b2)) {
            createMediaSource = new ExtractorMediaSource.Factory(new com.xiaopeng.musicradio.player.a()).createMediaSource(Uri.parse(b2), this.s, (MediaSourceEventListener) this.e);
        } else {
            createMediaSource = new ExtractorMediaSource.Factory(avi.a()).setExtractorsFactory(new DefaultExtractorsFactory().setConstantBitrateSeekingAlwaysEnabled(true)).createMediaSource(Uri.parse(b2), this.s, (MediaSourceEventListener) this.e);
        }
        this.f.setPlayWhenReady(z3);
        this.f.prepare(createMediaSource, z, true);
        this.g.a();
        if (z) {
            seekTo(0);
        }
    }

    private boolean a(String str) {
        return str.startsWith("http");
    }

    private boolean b(String str) {
        return str.startsWith("file:///android_asset");
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void stop() {
        LogUtils.i("MediaPlayerModel", "stop: ");
        this.j = false;
        this.n = 0;
        this.f.stop(true);
        this.f.setPlayWhenReady(false);
        l lVar = this.c;
        if (lVar != null) {
            lVar.onPlayPosition(this.h, 0, 0);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void reset() {
        LogUtils.i("MediaPlayerModel", "reset: ");
        this.j = true;
        this.n = 0;
        this.f.stop(true);
        l lVar = this.c;
        if (lVar != null) {
            lVar.onPlayPosition(this.h, 0, 0);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void release() {
        this.f.setPlayWhenReady(false);
        this.f.release();
    }

    public void a(l lVar) {
        this.c = lVar;
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        l lVar;
        LogUtils.d("MediaPlayerModel", "onTimelineChanged: " + timeline + " manifest=" + obj + " reason=" + i);
        l lVar2 = this.c;
        if (lVar2 != null) {
            lVar2.onTimeLineChange(this.h);
        }
        if (i != 0 || this.f.getPlayWhenReady() || (lVar = this.c) == null) {
            return;
        }
        lVar.onPlayPosition(this.h, getCurrentPosition(), getSecondPosition());
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        LogUtils.d("MediaPlayerModel", "onTracksChanged: " + trackGroupArray + " trackSelections=" + trackSelectionArray);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onLoadingChanged(final boolean z) {
        LogUtils.d("MediaPlayerModel", "onLoadingChanged: " + z);
        this.o.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.player.h.1
            @Override // java.lang.Runnable
            public void run() {
                if (h.this.c != null) {
                    h.this.c.loadingChange(h.this.h, z);
                }
            }
        }, 500L);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z, int i) {
        LogUtils.i("MediaPlayerModel", "onPlayerStateChanged: playWhenReady=" + z + " playbackState=" + i);
        if (!z) {
            this.g.a();
            l lVar = this.c;
            if (lVar != null) {
                lVar.onPlayPosition(this.h, getCurrentPosition(), getSecondPosition());
            }
            l lVar2 = this.c;
            if (lVar2 != null) {
                if (i != 1) {
                    lVar2.playState(this.h, 3);
                } else if (!this.j) {
                    lVar2.playState(this.h, -1);
                }
                this.j = false;
            }
        } else if (i == 3) {
            this.n = 0;
            l lVar3 = this.c;
            if (lVar3 != null) {
                lVar3.playState(this.h, 2);
            }
            this.g.a(1000);
        } else if (i == 2) {
            if (this.c == null || getSecondPosition() - getCurrentPosition() >= 1) {
                return;
            }
            this.c.playState(this.h, 1);
        } else if (i == 4) {
            l lVar4 = this.c;
            if (lVar4 != null) {
                lVar4.playState(this.h, 5);
            }
        } else if (i == 1) {
            this.n = (int) (this.f.getCurrentPosition() / 1000);
            this.g.a();
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getPlaybackState() {
        return this.f.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i) {
        LogUtils.i("MediaPlayerModel", "onRepeatModeChanged: repeatMode=" + i);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z) {
        LogUtils.i("MediaPlayerModel", "shuffleModeEnabled [" + z + "]");
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        LogUtils.e("MediaPlayerModel", "onPlayerError: " + exoPlaybackException.type);
        if (exoPlaybackException.getCause() != null) {
            if (exoPlaybackException.getCause() instanceof HttpDataSource.InvalidResponseCodeException) {
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (HttpDataSource.InvalidResponseCodeException) exoPlaybackException.getSourceException();
                if (invalidResponseCodeException.responseCode == 403) {
                    a(invalidResponseCodeException.responseCode);
                    return;
                }
            } else if (exoPlaybackException.getCause() instanceof FfmpegDecoderException) {
                Message obtain = Message.obtain();
                obtain.obj = this.h;
                this.o.sendMessage(obtain);
            }
            a(exoPlaybackException.type);
            return;
        }
        a(exoPlaybackException.type);
    }

    private void a(int i) {
        this.g.a();
        l lVar = this.c;
        if (lVar != null) {
            lVar.onPlayError(this.h, i);
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i) {
        LogUtils.i("MediaPlayerModel", "positionDiscontinuity [" + i + "]");
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        LogUtils.i("MediaPlayerModel", "onPlaybackParametersChanged: " + playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
        LogUtils.i("MediaPlayerModel", "onSeekProcessed: ");
    }

    @Override // defpackage.bam.a
    public void a() {
        l lVar = this.c;
        if (lVar != null) {
            lVar.onPlayPosition(this.h, getCurrentPosition(), getSecondPosition());
        }
    }

    public String b() {
        return this.h;
    }

    public String c() {
        return this.p;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setPlaySpeed(float f) {
        if (this.f != null) {
            this.f.setPlaybackParameters(new PlaybackParameters(f, 1.0f));
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSessionId() {
        return this.f.getAudioSessionId();
    }

    public void a(p pVar) {
        this.r = pVar;
    }

    @Override // com.xiaopeng.musicradio.player.q.a
    public void a(DataSpec dataSpec, IOException iOException) {
        if (dataSpec != null && iOException != null && be.a(dataSpec.key, avi.a(this.h)) && (iOException instanceof ParserException) && ((ParserException) iOException).isShouldLoadError()) {
            Log.i("MediaPlayerModel", "onLoadError: ======== ");
            a(3);
            Message obtain = Message.obtain();
            obtain.obj = this.h;
            this.o.sendMessage(obtain);
        }
    }

    /* compiled from: MediaPlayerModel.java */
    /* loaded from: classes2.dex */
    private class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.obj == null || !(message.obj instanceof String)) {
                return;
            }
            Log.i("MediaPlayerModel", "handleMessage: " + message.obj);
            avh.a(h.this.i, (String) message.obj);
        }
    }
}
