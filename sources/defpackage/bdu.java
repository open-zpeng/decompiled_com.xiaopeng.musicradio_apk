package defpackage;

import android.app.Dialog;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DialogManager.java */
/* renamed from: bdu  reason: default package */
/* loaded from: classes2.dex */
public class bdu {
    private List<WeakReference<Dialog>> a = new ArrayList();

    /* compiled from: DialogManager.java */
    /* renamed from: bdu$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bdu a = new bdu();
    }

    public static bdu a() {
        return a.a;
    }

    public void a(Dialog dialog) {
        Log.i("DialogManager", "setCurrentDialog: " + dialog);
        this.a.add(new WeakReference<>(dialog));
    }

    public void b(Dialog dialog) {
        if (dialog != null) {
            for (WeakReference<Dialog> weakReference : this.a) {
                if (weakReference.get() == dialog) {
                    this.a.remove(weakReference);
                    return;
                }
            }
        }
    }
}
