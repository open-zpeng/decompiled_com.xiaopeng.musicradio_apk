package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.dao.ReissueInfoDao;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import java.util.List;
/* compiled from: AbsReissueOperation.java */
/* renamed from: afe  reason: default package */
/* loaded from: classes2.dex */
public abstract class afe {
    protected Handler c;
    protected afj b = new afj();
    protected ReissueInfoDao a = aff.a().b().getReissueInfoDao();

    public afe() {
        HandlerThread handlerThread = new HandlerThread("queue-thread");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    public void a(final List<ReissueInfo> list) {
        ban.e(new Runnable() { // from class: afe.1
            @Override // java.lang.Runnable
            public void run() {
                afe.this.b(list);
            }
        });
    }

    public void a(final ReissueInfo reissueInfo) {
        ban.e(new Runnable() { // from class: afe.2
            @Override // java.lang.Runnable
            public void run() {
                afe.this.b(reissueInfo);
            }
        });
    }

    public void b(final List<ReissueInfo> list) {
        try {
            this.a.insertOrReplaceInTx(list);
        } catch (Exception e) {
            LogUtils.e("ReissueOperation", "insertOrReplace:" + e.getLocalizedMessage());
        }
        this.c.post(new Runnable() { // from class: afe.3
            @Override // java.lang.Runnable
            public void run() {
                afe.this.b.a(list);
            }
        });
    }

    public void b(final ReissueInfo reissueInfo) {
        try {
            this.a.insertOrReplace(reissueInfo);
        } catch (Exception e) {
            LogUtils.e("ReissueOperation", "insertOrReplace:" + e.getLocalizedMessage());
        }
        this.c.post(new Runnable() { // from class: afe.4
            @Override // java.lang.Runnable
            public void run() {
                afe.this.b.a(reissueInfo);
            }
        });
    }

    public void c(ReissueInfo reissueInfo) {
        try {
            this.a.delete(reissueInfo);
        } catch (Exception e) {
            LogUtils.e("ReissueOperation", "deleteSync:" + e.getLocalizedMessage());
        }
    }

    public ReissueInfo a() {
        return this.b.a();
    }

    public void b() {
        try {
            final List<ReissueInfo> loadAll = this.a.loadAll();
            this.c.post(new Runnable() { // from class: afe.5
                @Override // java.lang.Runnable
                public void run() {
                    afe.this.b.a(loadAll);
                }
            });
        } catch (Exception e) {
            LogUtils.e("ReissueOperation", e);
        }
    }

    public ReissueInfo a(String str) {
        return this.a.load(str);
    }

    public void c() {
        this.b.b();
        this.a.deleteAll();
    }
}
