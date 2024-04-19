package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.List;
/* compiled from: UsbSongItem.java */
/* renamed from: bbe  reason: default package */
/* loaded from: classes2.dex */
public class bbe {
    private MusicInfo a;
    private List<MusicInfo> b;
    private String c;
    private bay d;
    private int e;
    private int f;

    public bbe(MusicInfo musicInfo, List<MusicInfo> list, bay bayVar, int i, int i2, String str) {
        this.a = musicInfo;
        this.b = list;
        this.d = bayVar;
        this.e = i;
        this.f = i2;
    }

    public MusicInfo a() {
        return this.a;
    }

    public List<MusicInfo> b() {
        return this.b;
    }

    public bay c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.c;
    }
}
