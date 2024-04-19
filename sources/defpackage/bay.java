package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UsbMusicTreeBean.java */
/* renamed from: bay  reason: default package */
/* loaded from: classes2.dex */
public class bay implements Serializable {
    private static final long serialVersionUID = 0;
    private List<MusicInfo> beanList = new ArrayList();
    private List<bay> foldList = new ArrayList();
    private String path;

    public synchronized void a(bay bayVar) {
        this.foldList.add(bayVar);
    }

    public synchronized void a(MusicInfo musicInfo) {
        this.beanList.add(musicInfo);
    }

    public synchronized void b(MusicInfo musicInfo) {
        this.beanList.remove(musicInfo);
    }

    public synchronized MusicInfo c(MusicInfo musicInfo) {
        int indexOf = this.beanList.indexOf(musicInfo);
        if (indexOf >= 0) {
            return this.beanList.get(indexOf);
        }
        return null;
    }

    public List<MusicInfo> a() {
        return new ArrayList(this.beanList);
    }

    public List<bay> b() {
        return new ArrayList(this.foldList);
    }

    public String c() {
        return this.path;
    }

    public void a(String str) {
        this.path = str;
    }
}
