package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* compiled from: BaseDuiNode.java */
/* renamed from: baa  reason: default package */
/* loaded from: classes2.dex */
public abstract class baa {
    private Map<String, Class<? extends bae>> a = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Class<? extends bae> cls) {
        this.a.put(str, cls);
    }

    public void a(String str, String str2) {
        if (this.a.containsKey(str)) {
            try {
                this.a.get(str).getConstructor(String.class, String.class).newInstance(str, str2).onEvent();
            } catch (Exception e) {
                Log.e("BaseDuiNode", "onEvent: ", e);
            }
        }
    }
}
