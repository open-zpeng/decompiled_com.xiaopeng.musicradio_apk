package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ReissueQueue.java */
/* renamed from: afj  reason: default package */
/* loaded from: classes2.dex */
public class afj {
    private int d = Integer.MAX_VALUE;
    private int e = 49;
    private LinkedList<ReissueInfo> f = new LinkedList<>();
    private final int g = this.d;
    final ReentrantLock a = new ReentrantLock();
    final Condition b = this.a.newCondition();
    final Condition c = this.a.newCondition();

    private boolean b(List<ReissueInfo> list) {
        if (this.f.size() + list.size() > this.g) {
            return false;
        }
        for (ReissueInfo reissueInfo : list) {
            if (!this.f.contains(reissueInfo)) {
                this.f.addLast(reissueInfo);
            }
        }
        this.b.signal();
        return true;
    }

    private boolean b(ReissueInfo reissueInfo) {
        if (this.f.size() == this.g) {
            return false;
        }
        if (!this.f.contains(reissueInfo)) {
            this.f.addLast(reissueInfo);
        }
        this.b.signal();
        return true;
    }

    private ReissueInfo c() {
        if (this.f.isEmpty()) {
            return null;
        }
        ReissueInfo pollFirst = this.f.pollFirst();
        if (afu.a().a(pollFirst) && !this.f.isEmpty()) {
            LinkedList<ReissueInfo> linkedList = new LinkedList<>();
            Iterator<ReissueInfo> it = this.f.iterator();
            while (it.hasNext()) {
                ReissueInfo next = it.next();
                if (Objects.equals(pollFirst.getUrl(), next.getUrl())) {
                    linkedList.add(next);
                }
                if (linkedList.size() == this.e) {
                    break;
                }
            }
            if (!linkedList.isEmpty()) {
                this.f.removeAll(linkedList);
            }
            pollFirst = afu.a().a(pollFirst, linkedList);
        }
        this.c.signal();
        return pollFirst;
    }

    public void a(List<ReissueInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            ReentrantLock reentrantLock = this.a;
            reentrantLock.lock();
            while (!b(list)) {
                this.c.await();
            }
            reentrantLock.unlock();
        } catch (Exception e) {
            LogUtils.e("ReissueOperation", "put:" + e.getLocalizedMessage());
        }
    }

    public void a(ReissueInfo reissueInfo) {
        try {
            ReentrantLock reentrantLock = this.a;
            reentrantLock.lock();
            while (!b(reissueInfo)) {
                this.c.await();
            }
            reentrantLock.unlock();
        } catch (Exception e) {
            LogUtils.e("ReissueOperation", "put:" + e.getLocalizedMessage());
        }
    }

    public ReissueInfo a() {
        try {
            ReentrantLock reentrantLock = this.a;
            reentrantLock.lock();
            while (true) {
                ReissueInfo c = c();
                if (c == null) {
                    this.b.await();
                } else {
                    reentrantLock.unlock();
                    return c;
                }
            }
        } catch (Exception e) {
            LogUtils.e("ReissueOperation", e);
            return null;
        }
    }

    public void b() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.f.clear();
            this.c.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
