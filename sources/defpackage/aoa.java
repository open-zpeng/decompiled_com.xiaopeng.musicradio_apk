package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: QueryCache.java */
/* renamed from: aoa  reason: default package */
/* loaded from: classes2.dex */
public class aoa<T> {
    private Object a = new Object();
    private List<T> b;
    private String c;
    private final String d;
    private final int e;

    /* compiled from: QueryCache.java */
    /* renamed from: aoa$a */
    /* loaded from: classes2.dex */
    public interface a<T, K> {
        boolean a();

        boolean a(T t, K k);
    }

    public aoa(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public void a(String str, List<T> list) {
        synchronized (this.a) {
            this.b = list;
            this.c = str;
        }
        LogUtils.i("QueryCache", "mFrom=" + this.d + ",mMaxSize=" + this.e + ",uid=" + str);
    }

    public void a() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b = null;
            }
            this.c = null;
        }
    }

    public List<T> a(String str) {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = (this.b == null || this.c == null || !this.c.equals(str)) ? null : new ArrayList(this.b);
        }
        return arrayList;
    }

    public void a(int i, T t) {
        if (t == null) {
            return;
        }
        synchronized (this.a) {
            if (this.b != null) {
                if (!this.b.isEmpty()) {
                    this.b.remove(t);
                }
                this.b.add(i, t);
                if (this.b.size() > this.e) {
                    for (int size = this.b.size() - 1; size >= this.e; size--) {
                        this.b.remove(size);
                    }
                }
            }
        }
    }

    public boolean a(T t) {
        boolean z;
        int indexOf;
        synchronized (this.a) {
            if (this.b == null || this.b.isEmpty() || (indexOf = this.b.indexOf(t)) < 0) {
                z = false;
            } else {
                this.b.set(indexOf, t);
                z = true;
            }
        }
        return z;
    }

    public boolean a(List list, a aVar) {
        boolean z = false;
        if (list == null || list.isEmpty() || aVar == null) {
            return false;
        }
        synchronized (this.a) {
            if (this.b != null && !this.b.isEmpty()) {
                for (Object obj : list) {
                    int size = this.b.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        if (aVar.a(this.b.get(size), obj)) {
                            this.b.remove(size);
                            if (aVar.a()) {
                                z = true;
                                break;
                            }
                            z = true;
                        }
                        size--;
                    }
                }
            }
        }
        return z;
    }
}
