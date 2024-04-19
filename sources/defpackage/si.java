package defpackage;

import android.content.Context;
import android.util.LruCache;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.AutowiredService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AutowiredServiceImpl.java */
@Route(path = "/arouter/service/autowired")
/* renamed from: si  reason: default package */
/* loaded from: classes3.dex */
public class si implements AutowiredService {
    private LruCache<String, ISyringe> a;
    private List<String> b;

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        this.a = new LruCache<>(66);
        this.b = new ArrayList();
    }

    @Override // com.alibaba.android.arouter.facade.service.AutowiredService
    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        try {
            if (this.b.contains(name)) {
                return;
            }
            ISyringe iSyringe = this.a.get(name);
            if (iSyringe == null) {
                iSyringe = (ISyringe) Class.forName(obj.getClass().getName() + "$$ARouter$$Autowired").getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            iSyringe.inject(obj);
            this.a.put(name, iSyringe);
        } catch (Exception unused) {
            this.b.add(name);
        }
    }
}
