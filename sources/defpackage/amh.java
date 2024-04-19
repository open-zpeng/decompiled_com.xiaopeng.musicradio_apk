package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.h;
import defpackage.aht;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: LoadingDataListHelper.java */
/* renamed from: amh  reason: default package */
/* loaded from: classes2.dex */
public abstract class amh {
    protected final Class[] a;
    protected HashMap<Class, Integer> b = new HashMap<>();
    protected HashMap<Class, WeakReference<View>> c = new HashMap<>();
    protected a d;

    /* compiled from: LoadingDataListHelper.java */
    /* renamed from: amh$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    protected abstract void b();

    public amh(Class[] clsArr) {
        this.a = clsArr;
    }

    public void a(final View view, final int i) {
        if (view == null) {
            LogUtils.e("LoadingDataListHelper", "updateDataListCount view is null");
        } else {
            ban.g(new Runnable() { // from class: amh.1
                @Override // java.lang.Runnable
                public void run() {
                    int b = amh.this.b(view, i);
                    if (amh.this.d != null) {
                        amh.this.d.a(b);
                    }
                }
            });
        }
    }

    public void a(View view) {
        Class<?> cls = view.getClass();
        WeakReference<View> weakReference = this.c.get(cls);
        if (weakReference == null || view != weakReference.get()) {
            this.c.put(cls, new WeakReference<>(view));
        }
    }

    public int b(View view, int i) {
        Class<?> cls = view.getClass();
        WeakReference<View> weakReference = this.c.get(cls);
        if (weakReference == null || view != weakReference.get()) {
            return 0;
        }
        this.b.put(cls, Integer.valueOf(i));
        int i2 = 0;
        boolean z = false;
        for (Class cls2 : this.a) {
            Integer num = this.b.get(cls2);
            if (num == null) {
                z = true;
            } else {
                i2 += num.intValue();
            }
        }
        e();
        b();
        if (i2 > 0) {
            return 0;
        }
        return z ? 1 : 3;
    }

    public void e() {
        boolean z = false;
        for (int length = this.a.length - 1; length >= 0; length--) {
            Class cls = this.a[length];
            Integer num = this.b.get(cls);
            int intValue = num != null ? num.intValue() : 0;
            WeakReference<View> weakReference = this.c.get(cls);
            View view = weakReference != null ? weakReference.get() : null;
            if (intValue > 0 && !z) {
                a(view, intValue, true);
                z = true;
            } else {
                a(view, intValue, false);
            }
        }
    }

    protected void a(View view, int i, boolean z) {
        int dimensionPixelSize;
        if (view == null) {
            return;
        }
        Resources resources = view.getResources();
        if (i == 0) {
            dimensionPixelSize = 0;
        } else if (z) {
            dimensionPixelSize = resources.getDimensionPixelSize(aht.a.category_content_view_bottom_last);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(aht.a.category_content_view_bottom);
        }
        if (dimensionPixelSize != view.getPaddingBottom()) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), dimensionPixelSize);
        }
    }

    protected b a(Class cls) {
        WeakReference<View> weakReference = this.c.get(cls);
        View view = weakReference != null ? weakReference.get() : null;
        if (view instanceof h) {
            return ((h) view).getDataHolder();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View b(Class cls) {
        WeakReference<View> weakReference = this.c.get(cls);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f() {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            Class[] clsArr = this.a;
            if (i >= clsArr.length) {
                return z;
            }
            Class cls = clsArr[i];
            b a2 = a(cls);
            Integer num = this.b.get(cls);
            if (num != null && num.intValue() > 0 && a2 != null) {
                Integer num2 = (Integer) a2.a("SPEECH_NUM_OFFSET");
                if ((num2 == null && i2 != 0) || (num2 != null && num2.intValue() != i2)) {
                    z = true;
                }
                a2.a("SPEECH_NUM_OFFSET", Integer.valueOf(i2));
                i2 += num.intValue();
            }
            i++;
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }
}
