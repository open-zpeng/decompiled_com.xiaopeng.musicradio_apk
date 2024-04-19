package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.util.MimeTypes;
import com.xiaopeng.musicradio.bean.db.AudioParseInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.player.i;
import com.xiaopeng.musicradio.utils.bj;
/* compiled from: MusicRetriever.java */
/* renamed from: bbr  reason: default package */
/* loaded from: classes2.dex */
public class bbr {
    private i a = i.a();
    private a b;

    /* compiled from: MusicRetriever.java */
    /* renamed from: bbr$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(MusicInfo musicInfo, AudioParseInfo audioParseInfo);

        void b(MusicInfo musicInfo, AudioParseInfo audioParseInfo);
    }

    public void a(final MusicInfo musicInfo, final MediaItem mediaItem) {
        Log.i("MusicRetriever", "retrieveMetadata1 uri = " + mediaItem.localConfiguration.uri);
        this.a.a(new Runnable() { // from class: bbr.1
            @Override // java.lang.Runnable
            public void run() {
                AudioParseInfo a2 = bbj.a().a(musicInfo.getHash());
                if (a2 == null) {
                    Log.i("MusicRetriever", "retrieveMetadata2 from parse uri = " + mediaItem.localConfiguration.uri + " hash = " + musicInfo.getHash());
                    bbr.this.a.a(mediaItem);
                    return;
                }
                Log.i("MusicRetriever", "retrieveMetadata3 from dbdata uri = " + mediaItem.localConfiguration.uri + " hash = " + musicInfo.getHash());
                if (bbr.this.b != null) {
                    bbr.this.b.a(musicInfo, a2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioParseInfo a(MusicInfo musicInfo, TrackGroupArray trackGroupArray) {
        AudioParseInfo audioParseInfo = new AudioParseInfo();
        audioParseInfo.setId(musicInfo.getHash());
        audioParseInfo.setPath(musicInfo.getData());
        boolean z = false;
        Metadata metadata = null;
        for (int i = 0; i < trackGroupArray.length; i++) {
            TrackGroup trackGroup = trackGroupArray.get(i);
            boolean z2 = z;
            int i2 = 0;
            while (true) {
                if (i2 >= trackGroup.length) {
                    z = z2;
                    break;
                }
                if (trackGroup.getFormat(i2).sampleMimeType.contains(MimeTypes.BASE_TYPE_AUDIO)) {
                    metadata = trackGroup.getFormat(i2).metadata;
                    z2 = true;
                } else if (trackGroup.getFormat(i2).sampleMimeType.contains(MimeTypes.BASE_TYPE_VIDEO)) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        audioParseInfo.setAudio(z);
        if (metadata != null && metadata.length() > 0) {
            for (int i3 = 0; i3 < metadata.length(); i3++) {
                MediaMetadata.Builder builder = new MediaMetadata.Builder();
                metadata.get(i3).populateMediaMetadata(builder);
                MediaMetadata build = builder.build();
                if (!TextUtils.isEmpty(build.title) && !bj.b(String.valueOf(build.title))) {
                    audioParseInfo.setSong(String.valueOf(build.title));
                }
                if (!TextUtils.isEmpty(build.artist) && !bj.b(String.valueOf(build.artist))) {
                    audioParseInfo.setSinger(String.valueOf(build.artist));
                }
                if (!TextUtils.isEmpty(build.albumTitle) && !bj.b(String.valueOf(build.albumTitle))) {
                    audioParseInfo.setAlbumTitle(String.valueOf(build.albumTitle));
                }
            }
        }
        return audioParseInfo;
    }

    public void a(final MusicInfo musicInfo, final a aVar) {
        this.b = aVar;
        this.a.a(new i.b() { // from class: bbr.2
            @Override // com.xiaopeng.musicradio.player.i.b
            public void a(TrackGroupArray trackGroupArray) {
                Log.i("MusicRetriever", "onParseFinish: " + musicInfo.getData() + " hash = " + musicInfo.getHash());
                AudioParseInfo a2 = bbr.this.a(musicInfo, trackGroupArray);
                bbj.a().a(a2);
                aVar.a(musicInfo, a2);
            }

            @Override // com.xiaopeng.musicradio.player.i.b
            public void a(Throwable th) {
                Log.i("MusicRetriever", "onParseException: " + th);
                if (th instanceof UnrecognizedInputFormatException) {
                    AudioParseInfo audioParseInfo = new AudioParseInfo();
                    audioParseInfo.setId(musicInfo.getHash());
                    audioParseInfo.setAudio(false);
                    bbj.a().a(audioParseInfo);
                    aVar.b(musicInfo, audioParseInfo);
                } else if (th instanceof FileDataSource.FileDataSourceException) {
                    AudioParseInfo audioParseInfo2 = new AudioParseInfo();
                    audioParseInfo2.setId(musicInfo.getHash());
                    audioParseInfo2.setAudio(false);
                    bbj.a().a(audioParseInfo2);
                    aVar.b(musicInfo, audioParseInfo2);
                } else {
                    aVar.b(musicInfo, null);
                }
            }
        });
    }

    public void a() {
        this.b = null;
        this.a.a((i.b) null);
    }

    public void b() {
        Log.i("MusicRetriever", "destroy: =======");
        this.a.b();
    }
}
