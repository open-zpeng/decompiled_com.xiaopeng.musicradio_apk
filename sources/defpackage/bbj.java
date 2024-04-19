package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.dao.AudioParseInfoDao;
import com.xiaopeng.musicradio.bean.db.AudioParseInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: AudioParseOperation.java */
/* renamed from: bbj  reason: default package */
/* loaded from: classes2.dex */
public class bbj {
    private AudioParseInfoDao a;
    private Map<String, AudioParseInfo> b = new ConcurrentHashMap();

    /* compiled from: AudioParseOperation.java */
    /* renamed from: bbj$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bbj a = new bbj(aff.a().b().getAudioParseInfoDao());
    }

    public static bbj a() {
        return a.a;
    }

    public bbj(AudioParseInfoDao audioParseInfoDao) {
        this.a = audioParseInfoDao;
    }

    public synchronized AudioParseInfo a(String str) {
        if (!this.b.containsKey(str)) {
            AudioParseInfo load = this.a.load(str);
            if (load != null) {
                this.b.put(str, load);
            }
            return load;
        }
        return this.b.get(str);
    }

    public void a(final AudioParseInfo audioParseInfo) {
        ban.f(new Runnable() { // from class: bbj.1
            @Override // java.lang.Runnable
            public void run() {
                bbj.this.b(audioParseInfo);
            }
        });
    }

    public synchronized void b(AudioParseInfo audioParseInfo) {
        Log.i("AudioParseOperation", "saveSync: " + audioParseInfo.getPath() + " hash = " + audioParseInfo.getId());
        this.a.insertOrReplace(audioParseInfo);
    }

    public synchronized void a(final List<AudioParseInfo> list) {
        ban.f(new Runnable() { // from class: bbj.2
            @Override // java.lang.Runnable
            public void run() {
                bbj.this.a.insertOrReplaceInTx(list);
            }
        });
    }

    public void a(final int i, final List<String> list) {
        this.b.clear();
        ban.f(new Runnable() { // from class: bbj.3
            @Override // java.lang.Runnable
            public void run() {
                long count = bbj.this.a.count();
                Log.i("AudioParseOperation", "release run: " + list.size() + " entityCount = " + count);
                if (bbj.this.a.count() <= i || list.size() <= 0) {
                    return;
                }
                bbj.this.b(list);
            }
        });
    }

    public synchronized void b(List<String> list) {
        Log.i("AudioParseOperation", "deleteNotIn: ====== " + list.size());
        this.a.queryBuilder().where(AudioParseInfoDao.Properties.Id.notIn(list), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }
}
