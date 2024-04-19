package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UsbSinger.java */
/* renamed from: baz  reason: default package */
/* loaded from: classes2.dex */
public class baz implements Serializable {
    private List<MusicInfo> list = new ArrayList();
    private String logo;
    private String name;

    public String a() {
        return this.logo;
    }

    public void a(String str) {
        this.logo = str;
    }

    public String b() {
        return this.name;
    }

    public void b(String str) {
        this.name = str;
    }

    public void a(MusicInfo musicInfo) {
        this.list.add(musicInfo);
    }

    public List<MusicInfo> c() {
        return this.list;
    }

    public String toString() {
        return "UsbSinger{logo='" + this.logo + "', name='" + this.name + "'}";
    }
}
