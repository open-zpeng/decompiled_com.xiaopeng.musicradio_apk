package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
/* compiled from: MusicEvent.java */
/* renamed from: agl  reason: default package */
/* loaded from: classes2.dex */
public class agl {

    /* compiled from: MusicEvent.java */
    /* renamed from: agl$b */
    /* loaded from: classes2.dex */
    public static class b {
    }

    /* compiled from: MusicEvent.java */
    /* renamed from: agl$c */
    /* loaded from: classes2.dex */
    public static class c {
    }

    /* compiled from: MusicEvent.java */
    /* renamed from: agl$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final MusicInfo a;
        public final boolean b;

        public a() {
            this(null);
        }

        public a(MusicInfo musicInfo) {
            this(musicInfo, false);
        }

        public a(MusicInfo musicInfo, boolean z) {
            if (musicInfo != null) {
                this.a = musicInfo.clone();
            } else {
                this.a = null;
            }
            this.b = z;
        }

        public boolean a(int i) {
            MusicInfo musicInfo = this.a;
            return musicInfo == null || musicInfo.getMusicFrom() == i;
        }
    }
}
