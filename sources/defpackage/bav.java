package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UsbAlbum.java */
/* renamed from: bav  reason: default package */
/* loaded from: classes2.dex */
public class bav implements Serializable {
    private long id;
    private List<MusicInfo> list = new ArrayList();
    private String logo;
    private String name;

    public long a() {
        return this.id;
    }

    public String b() {
        return this.logo;
    }

    public void a(String str) {
        this.logo = str;
    }

    public String c() {
        return this.name;
    }

    public void b(String str) {
        this.name = str;
    }

    public void a(MusicInfo musicInfo) {
        this.list.add(musicInfo);
    }

    public List<MusicInfo> d() {
        return this.list;
    }

    public String toString() {
        return "UsbAlbum{id=" + this.id + ", logo='" + this.logo + "', name='" + this.name + "'}";
    }
}
