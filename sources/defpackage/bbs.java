package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.MediaItem;
import com.xiaopeng.musicradio.bean.db.AudioParseInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import defpackage.bbr;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: RetrieverEngine.java */
/* renamed from: bbs  reason: default package */
/* loaded from: classes2.dex */
public class bbs implements Handler.Callback {
    private bj<String, AudioParseInfo> a;
    private bbr.a d;
    private AtomicInteger f = new AtomicInteger();
    private bbt b = new bbt(5);
    private bbu<MusicInfo> c = new bbu<>();
    private Handler e = new Handler(Looper.myLooper(), this);

    public bbs(int i) {
        this.a = new bj<>(i);
    }

    public void a(MusicInfo musicInfo) {
        if (new File(musicInfo.getData()).exists()) {
            Log.i("RetrieverEngine", "parse retrieverCount : " + this.f + " info = " + musicInfo);
            AudioParseInfo a2 = this.a.a((bj<String, AudioParseInfo>) musicInfo.getHash());
            if (a2 != null) {
                bbr.a aVar = this.d;
                if (aVar != null) {
                    aVar.a(musicInfo, a2);
                }
                a();
            } else if (this.f.get() >= 5) {
                this.c.a((bbu<MusicInfo>) musicInfo);
            } else {
                this.f.incrementAndGet();
                final bbr a3 = this.b.a();
                Log.i("RetrieverEngine", "parse: " + musicInfo.getData());
                a3.a(musicInfo, new bbr.a() { // from class: bbs.1
                    @Override // defpackage.bbr.a
                    public void a(MusicInfo musicInfo2, AudioParseInfo audioParseInfo) {
                        Log.i("RetrieverEngine", "parse success: " + musicInfo2.getData());
                        bbs.this.e.obtainMessage(1, new a(a3, audioParseInfo, musicInfo2)).sendToTarget();
                    }

                    @Override // defpackage.bbr.a
                    public void b(MusicInfo musicInfo2, AudioParseInfo audioParseInfo) {
                        Log.i("RetrieverEngine", "parse fail: " + musicInfo2.getData());
                        bbs.this.e.obtainMessage(2, new a(a3, audioParseInfo, musicInfo2)).sendToTarget();
                    }
                });
                a3.a(musicInfo, MediaItem.fromUri(musicInfo.getData()));
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        switch (message.what) {
            case 1:
                this.a.a(aVar.b.getId(), aVar.b);
                this.b.a(aVar.a);
                this.f.decrementAndGet();
                bbr.a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.a(aVar.c, aVar.b);
                }
                a();
                return false;
            case 2:
                this.b.a(aVar.a);
                this.f.decrementAndGet();
                bbr.a aVar3 = this.d;
                if (aVar3 != null) {
                    aVar3.b(aVar.c, aVar.b);
                }
                a();
                return false;
            default:
                return false;
        }
    }

    private void a() {
        Log.i("RetrieverEngine", "handleMessage mRetrieveringCount: " + this.f + " size = " + this.c.b());
        MusicInfo a2 = this.c.a();
        if (a2 != null) {
            a(a2);
        }
    }

    public void a(bbr.a aVar) {
        this.d = aVar;
    }

    public void a(List<MusicInfo> list) {
        this.c.a(list);
    }

    public void b(MusicInfo musicInfo) {
        this.c.b(musicInfo);
    }

    public void b(List<baw> list) {
        ArrayList arrayList = new ArrayList();
        for (baw bawVar : list) {
            AudioParseInfo a2 = this.a.a((bj<String, AudioParseInfo>) bawVar.a());
            if (a2 != null) {
                a2.setLogo(bawVar.b());
                arrayList.add(a2);
            }
        }
        bbj.a().a(arrayList);
    }

    /* compiled from: RetrieverEngine.java */
    /* renamed from: bbs$a */
    /* loaded from: classes2.dex */
    private static class a {
        public bbr a;
        public AudioParseInfo b;
        public MusicInfo c;

        public a(bbr bbrVar, AudioParseInfo audioParseInfo, MusicInfo musicInfo) {
            this.a = bbrVar;
            this.b = audioParseInfo;
            this.c = musicInfo;
        }
    }
}
