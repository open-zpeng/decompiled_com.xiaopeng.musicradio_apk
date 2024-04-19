package defpackage;

import android.content.Context;
import com.xiaopeng.lib.framework.module.IModuleEntry;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IDataLog;
/* compiled from: DataLogModuleEntry.java */
/* renamed from: abh  reason: default package */
/* loaded from: classes2.dex */
public class abh implements IModuleEntry {
    private volatile IDataLog a;
    private Context b;

    public abh(Context context) {
        this.b = context;
    }

    @Override // com.xiaopeng.lib.framework.module.IModuleEntry
    public Object get(Class cls) {
        if (cls == IDataLog.class) {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = new abi(this.b);
                    }
                }
            }
            return this.a;
        }
        return null;
    }
}
