package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.List;
/* compiled from: ViewProxyFactoryManager.java */
/* renamed from: aey  reason: default package */
/* loaded from: classes2.dex */
public class aey {
    private HashMap<String, aew> a = new HashMap<>();

    public synchronized aev a(String str) {
        Log.i("ViewProxyFactoryManager", "createViewProxy:" + str);
        aew aewVar = this.a.get(str);
        if (aewVar != null) {
            return aewVar.a(str);
        }
        Log.i("ViewProxyFactoryManager", "createViewProxy(null):" + str);
        return null;
    }

    public synchronized void a(aew aewVar) {
        Log.i("ViewProxyFactoryManager", "register:" + aewVar.getClass().getSimpleName());
        List<String> a = aewVar != null ? aewVar.a() : null;
        if (a != null && !a.isEmpty()) {
            for (String str : a) {
                Log.i("ViewProxyFactoryManager", "register(go):" + str + ", " + aewVar.getClass().getSimpleName());
                this.a.put(str, aewVar);
            }
        }
    }
}
