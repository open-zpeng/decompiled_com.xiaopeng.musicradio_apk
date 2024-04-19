package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.dao.MusicUrlInfoDao;
import com.xiaopeng.musicradio.bean.db.MusicUrlInfo;
import com.xiaopeng.musicradio.utils.be;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MusicUrlOperation.java */
/* renamed from: anz  reason: default package */
/* loaded from: classes2.dex */
public class anz {
    MusicUrlInfoDao a;
    private CopyOnWriteArrayList<MusicUrlInfo> b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicUrlOperation.java */
    /* renamed from: anz$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final anz a = new anz(aff.a().b().getMusicUrlInfoDao());
    }

    public static anz a() {
        return a.a;
    }

    public anz(MusicUrlInfoDao musicUrlInfoDao) {
        this.a = musicUrlInfoDao;
        ban.e(new Runnable() { // from class: anz.1
            @Override // java.lang.Runnable
            public void run() {
                anz.this.b();
            }
        });
    }

    public synchronized void a(MusicUrlInfo musicUrlInfo) {
        if (musicUrlInfo != null) {
            if (!TextUtils.isEmpty(musicUrlInfo.getHash())) {
                this.a.insertOrReplace(musicUrlInfo);
                if (this.b != null) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.b.size()) {
                            break;
                        } else if (be.a(musicUrlInfo.getHash(), this.b.get(i2).getHash())) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        this.b.set(i, musicUrlInfo);
                    } else {
                        this.b.add(musicUrlInfo);
                    }
                }
                c();
            }
        }
    }

    public synchronized List<MusicUrlInfo> b() {
        Log.i("MusicUrlOperation", "loadAll: list = " + this.b);
        if (this.b == null) {
            this.b = new CopyOnWriteArrayList<>();
            this.b.addAll(this.a.loadAll());
        }
        return this.b;
    }

    public synchronized MusicUrlInfo a(String str) {
        if (!be.a((CharSequence) str) && this.b != null) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= this.b.size()) {
                    break;
                } else if (be.a(str, this.b.get(i2).getHash())) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                return this.b.get(i);
            }
            return null;
        }
        return null;
    }

    private void c() {
        int count = (int) this.a.count();
        if (count > 750) {
            List<MusicUrlInfo> list = this.a.queryBuilder().orderAsc(MusicUrlInfoDao.Properties.UpdateTime).limit(count - 750).list();
            for (int i = 0; i < list.size(); i++) {
                this.a.deleteByKey(list.get(i).getHash());
                if (this.b != null) {
                    int i2 = -1;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.b.size()) {
                            break;
                        } else if (be.a(list.get(i).getHash(), this.b.get(i3).getHash())) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i2 >= 0) {
                        this.b.remove(i2);
                    }
                }
            }
        }
    }
}
