package defpackage;

import android.util.Log;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.FileCallback;
import com.lzy.okgo.model.Response;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicUrlInfo;
import com.xiaopeng.musicradio.utils.af;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.al;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: AbsDataProvider.java */
/* renamed from: ape  reason: default package */
/* loaded from: classes2.dex */
public abstract class ape {
    List<Integer> b = new ArrayList();
    int c = 2;
    int d = -1;
    String e = "";
    private Runnable f = new Runnable() { // from class: ape.2
        @Override // java.lang.Runnable
        public void run() {
            LogUtils.i("AbsDataProvider", "start check play cache");
            if (!apk.i().w()) {
                ape.this.j();
                return;
            }
            final ArrayList arrayList = new ArrayList();
            ArrayList<MusicInfo> arrayList2 = new ArrayList();
            arrayList2.addAll(ape.this.a);
            for (MusicInfo musicInfo : arrayList2) {
                MusicUrlInfo a = anz.a().a(musicInfo.getHash());
                if (a != null && apk.i().d(a.getUrl())) {
                    arrayList.add(musicInfo);
                } else if (musicInfo.getHash() != null && musicInfo.getHash().startsWith(ListSignBean.LOCAL_USB_PREFIX) && ape.this.f() != null && !ape.this.f().getHash().equalsIgnoreCase(musicInfo.getHash()) && new File(musicInfo.getData()).exists()) {
                    arrayList.add(musicInfo);
                }
            }
            ban.g(new Runnable() { // from class: ape.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aei.a().c() != 0) {
                        Log.i("AbsDataProvider", "run: play is not music");
                    } else if (arrayList.size() > 0 && ape.this.d >= 0) {
                        for (int i = ape.this.d; i < ape.this.b.size(); i++) {
                            MusicInfo musicInfo2 = ape.this.a.get(ape.this.b.get(i).intValue());
                            if (musicInfo2 != null && arrayList.contains(musicInfo2)) {
                                ape.this.e(musicInfo2);
                                if (musicInfo2.getHash().startsWith(ListSignBean.LOCAL_USB_PREFIX)) {
                                    return;
                                }
                                ak.a(a.a, "该文件未缓存，已切换到缓存完成的歌曲");
                                return;
                            }
                        }
                        for (int i2 = 0; i2 < ape.this.d; i2++) {
                            MusicInfo musicInfo3 = ape.this.a.get(ape.this.b.get(i2).intValue());
                            if (musicInfo3 != null && arrayList.contains(musicInfo3)) {
                                if (!musicInfo3.getHash().startsWith(ListSignBean.LOCAL_USB_PREFIX)) {
                                    ak.a(a.a, "该文件未缓存，已切换到缓存完成的歌曲");
                                }
                                ape.this.e(musicInfo3);
                                return;
                            }
                        }
                    }
                }
            });
        }
    };
    List<MusicInfo> a = a();

    public abstract void a(boolean z);

    public abstract void b(boolean z);

    public abstract void c(int i);

    public abstract void c(MusicInfo musicInfo);

    public abstract void d(int i);

    public abstract void d(MusicInfo musicInfo);

    protected abstract void e(MusicInfo musicInfo);

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract String o();

    public abstract int p();

    public abstract void q();

    public void r() {
    }

    protected List<MusicInfo> a() {
        return new ArrayList();
    }

    public void b() {
        Log.i("AbsDataProvider", "updateIndexLis: ");
        af.a();
        this.b.clear();
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(Integer.valueOf(i));
        }
        if (this.c == 4) {
            Collections.shuffle(this.b);
        } else {
            Collections.sort(this.b);
        }
        u.c(new age.b(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(MusicInfo musicInfo) {
        af.a();
        if (musicInfo == null || this.a.size() == 0) {
            return -1;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (this.a.get(this.b.get(i).intValue()).equals(musicInfo)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MusicInfo a(int i) {
        if (i == -1) {
            return null;
        }
        return this.a.get(this.b.get(i).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        af.a();
        if (this.a.size() == 0) {
            return -1;
        }
        int i = this.d + 1;
        if (i >= this.b.size()) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        af.a();
        if (this.a.size() == 0) {
            return -1;
        }
        int i = this.d - 1;
        return i < 0 ? this.b.size() - 1 : i;
    }

    public List<MusicInfo> e() {
        return this.a;
    }

    public MusicInfo f() {
        int i = this.d;
        if (i == -1) {
            return null;
        }
        return a(i);
    }

    public int g() {
        return this.d;
    }

    public void b(int i) {
        af.a();
        this.c = i;
        if (this.d != -1) {
            MusicInfo f = f();
            b();
            this.d = a(f);
        }
        c(i);
        u.c(new age.a(0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final MusicInfo musicInfo) {
        String lrcData = musicInfo.getLrcData();
        File a = al.a(lrcData);
        if (a != null) {
            musicInfo.setLrcData(a.getPath());
            u.c(new agl.b());
            return;
        }
        OkGo.get(lrcData).execute(new FileCallback("/mnt/sdcard/xiaopengmusic/lrc", lrcData.substring(lrcData.lastIndexOf("/"))) { // from class: ape.1
            @Override // com.lzy.okgo.callback.Callback
            public void onSuccess(Response<File> response) {
                musicInfo.setLrcData(response.body().getPath());
                LatelyMusicInfo a2 = anr.a().a(musicInfo.getHash());
                if (a2 != null) {
                    a2.setLrcData(response.body().getPath());
                    anr.a().b(a2);
                }
                u.c(new agl.b());
            }
        });
    }

    public int h() {
        return this.c;
    }

    public List<Integer> i() {
        return this.b;
    }

    public void j() {
        ban.a(this.f, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        ban.b(this.f);
    }
}
