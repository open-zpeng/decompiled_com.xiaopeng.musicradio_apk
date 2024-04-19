package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.ListSignBean;
import defpackage.bbo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: UsbRequestManager.java */
/* renamed from: bbn  reason: default package */
/* loaded from: classes2.dex */
public abstract class bbn<T> implements bbo.a<T> {
    private Map<String, T> a = new HashMap();
    private bbo b = new bbo(10, 300);

    protected abstract String a(T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(List<baw> list);

    protected abstract int b();

    protected abstract String b(T t);

    protected void b(List<baw> list) {
    }

    protected abstract boolean c(T t);

    public bbn() {
        this.b.a((bbo.a) this);
    }

    public void c(List<T> list) {
        if (!apx.a().d()) {
            Log.i("UsbRequestManager", "request: no login======");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            boolean containsKey = this.a.containsKey(b((bbn<T>) t));
            Log.i("UsbRequestManager", "request: " + containsKey + " info.name = " + t);
            if (c((bbn<T>) t) && !containsKey) {
                arrayList.add(t);
            }
        }
        Log.i("UsbRequestManager", "request: " + list + " requestList = " + arrayList);
        this.b.a((List) arrayList);
    }

    public void d(T t) {
        if (c((bbn<T>) t)) {
            this.b.a((bbo) t);
        }
    }

    @Override // defpackage.bbo.a
    public void d(List<T> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Log.i("UsbRequestManager", "onSlide1: ====== " + list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            String a = a((bbn<T>) t);
            if (!TextUtils.isEmpty(a)) {
                arrayList.add(a);
                String b = b((bbn<T>) t);
                arrayList2.add(b);
                this.a.put(b, t);
                Log.i("UsbRequestManager", "onSlide request : " + b + " info = " + t);
            }
        }
        Log.i("UsbRequestManager", "onSlide2: " + arrayList);
        if (arrayList.size() == 0) {
            return;
        }
        a(list, arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(List<T> list, List<String> list2, List<String> list3) {
        b(list, list2, list3);
    }

    protected void b(final List<T> list, List<String> list2, List<String> list3) {
        String join = String.join(ListSignBean.COLLECTID_SUFFIX, list2);
        String join2 = String.join(ListSignBean.COLLECTID_SUFFIX, list3);
        Log.i("UsbRequestManager", "onSlide: " + join);
        bbg.a().a(join, join2, b(), new avc<bax>() { // from class: bbn.1
            @Override // defpackage.avc
            public void a(bax baxVar) {
                Log.i("UsbRequestManager", "response: " + baxVar);
                bbn.this.e(list);
                if (baxVar == null || baxVar.a() == null || baxVar.a().a() == null) {
                    return;
                }
                bbn.this.a(baxVar.a().a());
                bbn.this.b(baxVar.a().a());
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                Log.i("UsbRequestManager", "error: " + i);
                bbn.this.e(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(List<T> list) {
        for (T t : list) {
            this.a.remove(b((bbn<T>) t));
        }
    }
}
