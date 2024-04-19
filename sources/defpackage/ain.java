package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.datalist.m;
import com.xiaopeng.musicradio.mine.collect.music.view.a;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: BaseMusicViewProxy.java */
/* renamed from: ain  reason: default package */
/* loaded from: classes2.dex */
public abstract class ain<UIInterface, Presenter extends DataListPresenter<UIInterface>> extends aiq<UIInterface, Presenter> implements h, m, i {
    protected List<MusicInfo> e;
    protected ConcurrentHashMap<String, MusicInfo> f;
    protected boolean g;

    protected abstract void a(MusicInfo musicInfo);

    public ain(Context context, String str) {
        super(context, str);
        this.f = new ConcurrentHashMap<>();
    }

    @Override // defpackage.aiq, com.xiaopeng.musicradio.datalist.j
    public void a(f fVar) {
        if (!fVar.l) {
            b((List<MusicInfo>) fVar.o);
        } else {
            c(fVar.o);
        }
        super.a(fVar);
    }

    public void b(List<MusicInfo> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.e = list;
        this.f.clear();
        for (MusicInfo musicInfo : list) {
            this.f.put(musicInfo.getHash(), musicInfo);
        }
    }

    public void c(List<MusicInfo> list) {
        if (list != null) {
            for (MusicInfo musicInfo : list) {
                this.e.add(musicInfo);
                this.f.put(musicInfo.getHash(), musicInfo);
            }
        }
    }

    public void a(final String str, final boolean z) {
        if (str == null) {
            return;
        }
        ban.g(new Runnable() { // from class: ain.1
            @Override // java.lang.Runnable
            public void run() {
                MusicInfo musicInfo = ain.this.f.get(str);
                if (musicInfo != null) {
                    Log.i("MusicViewProxy", "setLove:" + musicInfo + ListSignBean.COLLECTID_SUFFIX + z);
                    aml.b(musicInfo, z);
                    return;
                }
                Log.i("MusicViewProxy", "setLove(null):" + str + ListSignBean.COLLECTID_SUFFIX + z);
            }
        });
    }

    public void i() {
        int i;
        String str;
        int c = aei.a().c();
        String str2 = null;
        long j = 0;
        if (c == 0) {
            i = aml.b();
            str = aml.e();
            MusicInfo a = aml.a();
            if (a != null) {
                str2 = a.getHash();
                j = a.getAlbumId();
            }
        } else {
            i = -1;
            str = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioType", Integer.valueOf(c));
        hashMap.put("playState", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        hashMap.put("listSign", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("hash", str2);
        hashMap.put("albumId", Long.valueOf(j));
        c_("UpdatePlayingStatus", z.a(hashMap));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aiq
    public void a(boolean z) {
        super.a(z);
        if (z) {
            return;
        }
        if (this instanceof a) {
            aml.e(1);
        } else {
            aml.e(2);
        }
    }

    @Override // defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        MusicInfo a;
        super.a(str, bArr);
        if ("play".equals(str)) {
            a(amc.a(bArr));
        } else if ("musicAddLove".equals(str)) {
            MusicInfo a2 = amc.a(bArr);
            if (a2 != null) {
                a(a2.getHash(), true);
            }
        } else if (!"musicRemoveLove".equals(str) || (a = amc.a(bArr)) == null) {
        } else {
            a(a.getHash(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MusicInfo a(String str, long j, List<MusicInfo> list) {
        if (!TextUtils.isEmpty(str)) {
            for (MusicInfo musicInfo : list) {
                if (Objects.equals(str, musicInfo.getHash()) && j == musicInfo.getAlbumId()) {
                    return musicInfo;
                }
            }
        }
        return null;
    }
}
