package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.dao.AudioLogoInfoDao;
import com.xiaopeng.musicradio.bean.db.AudioLogoInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: AudioLogoOperation.java */
/* renamed from: bbi  reason: default package */
/* loaded from: classes2.dex */
public class bbi {
    private AudioLogoInfoDao a;
    private Map<String, AudioLogoInfo> b = new ConcurrentHashMap();

    /* compiled from: AudioLogoOperation.java */
    /* renamed from: bbi$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(List<AudioLogoInfo> list);
    }

    /* compiled from: AudioLogoOperation.java */
    /* renamed from: bbi$b */
    /* loaded from: classes2.dex */
    private static class b {
        static final bbi a = new bbi(aff.a().b().getAudioLogoInfoDao());
    }

    public static bbi a() {
        return b.a;
    }

    public bbi(AudioLogoInfoDao audioLogoInfoDao) {
        this.a = audioLogoInfoDao;
    }

    public synchronized void a(List<String> list, final a aVar) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (String str : list) {
            AudioLogoInfo audioLogoInfo = this.b.get(str);
            if (audioLogoInfo != null) {
                arrayList.add(audioLogoInfo);
            } else {
                arrayList2.add(str);
            }
        }
        if (arrayList2.size() > 0) {
            ban.f(new Runnable() { // from class: bbi.1
                @Override // java.lang.Runnable
                public void run() {
                    List<AudioLogoInfo> list2 = bbi.this.a.queryBuilder().where(AudioLogoInfoDao.Properties.Name.in(arrayList2), new WhereCondition[0]).list();
                    if (list2 != null) {
                        arrayList.addAll(list2);
                    }
                    ban.g(new Runnable() { // from class: bbi.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.a(arrayList);
                        }
                    });
                }
            });
        } else {
            aVar.a(arrayList);
        }
    }

    public synchronized void a(final List<AudioLogoInfo> list) {
        ban.f(new Runnable() { // from class: bbi.2
            @Override // java.lang.Runnable
            public void run() {
                Log.i("AudioParseOperation", "run: " + list);
                bbi.this.a.insertOrReplaceInTx(list);
            }
        });
    }

    public void a(final int i, final List<String> list) {
        this.b.clear();
        ban.f(new Runnable() { // from class: bbi.3
            @Override // java.lang.Runnable
            public void run() {
                long count = bbi.this.a.count();
                Log.i("AudioParseOperation", "release run: " + list.size() + " entityCount = " + count);
                if (bbi.this.a.count() > i) {
                    bbi.this.b(list);
                }
            }
        });
    }

    public synchronized void b(List<String> list) {
        this.a.queryBuilder().where(AudioLogoInfoDao.Properties.Name.notIn(list), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }
}
