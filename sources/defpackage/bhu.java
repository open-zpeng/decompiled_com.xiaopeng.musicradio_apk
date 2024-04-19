package defpackage;

import android.content.Context;
import com.xiaopeng.lib.framework.module.IModuleEntry;
import com.xiaopeng.lib.framework.moduleinterface.systemdelegate.ISystemDelegate;
/* compiled from: SystemDelegateModuleEntry.java */
/* renamed from: bhu  reason: default package */
/* loaded from: classes2.dex */
public class bhu implements IModuleEntry {
    private volatile ISystemDelegate a;
    private Context b;

    public bhu(Context context) {
        this.b = context;
    }

    @Override // com.xiaopeng.lib.framework.module.IModuleEntry
    public Object get(Class cls) {
        if (cls == ISystemDelegate.class) {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = new bhv(this.b);
                    }
                }
            }
            return this.a;
        }
        return null;
    }
}
