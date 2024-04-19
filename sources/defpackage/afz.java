package defpackage;

import com.xiaopeng.musicradio.common.a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.meta.SimpleSubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;
import org.greenrobot.eventbus.meta.SubscriberMethodInfo;
/* compiled from: FrameworkEventBusIndexes.java */
/* renamed from: afz  reason: default package */
/* loaded from: classes2.dex */
public class afz implements SubscriberInfoIndex {
    private static final Map<Class<?>, SubscriberInfo> a = new HashMap();

    static {
        a(new SimpleSubscriberInfo(a.class, true, new SubscriberMethodInfo[]{new SubscriberMethodInfo("onCommon", a.C0129a.class, ThreadMode.MAIN)}));
    }

    private static void a(SubscriberInfo subscriberInfo) {
        a.put(subscriberInfo.getSubscriberClass(), subscriberInfo);
    }

    @Override // org.greenrobot.eventbus.meta.SubscriberInfoIndex
    public SubscriberInfo getSubscriberInfo(Class<?> cls) {
        SubscriberInfo subscriberInfo = a.get(cls);
        if (subscriberInfo != null) {
            return subscriberInfo;
        }
        return null;
    }
}
