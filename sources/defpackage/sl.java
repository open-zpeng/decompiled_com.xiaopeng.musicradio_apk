package defpackage;

import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Warehouse.java */
/* renamed from: sl  reason: default package */
/* loaded from: classes3.dex */
public class sl {
    static Map<String, Class<? extends IRouteGroup>> a = new HashMap();
    static Map<String, RouteMeta> b = new HashMap();
    static Map<Class, IProvider> c = new HashMap();
    static Map<String, RouteMeta> d = new HashMap();
    static Map<Integer, Class<? extends IInterceptor>> e = new sh("More than one interceptors use same priority [%s]");
    static List<IInterceptor> f = new ArrayList();
}
