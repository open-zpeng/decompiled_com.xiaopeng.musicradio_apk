package defpackage;

import android.content.Context;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.ICounter;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.ICounterFactory;
/* compiled from: CounterFactory.java */
/* renamed from: abm  reason: default package */
/* loaded from: classes2.dex */
public class abm implements ICounterFactory {
    private abm() {
    }

    /* compiled from: CounterFactory.java */
    /* renamed from: abm$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private static final abm a = new abm();
    }

    public static abm a() {
        return a.a;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.datalogmodule.ICounterFactory
    public ICounter createHourlyCounter(Context context, String str) {
        return new abn(context, str, 3600000L);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.datalogmodule.ICounterFactory
    public ICounter createDailyCounter(Context context, String str) {
        return new abn(context, str, 86400000L);
    }
}
