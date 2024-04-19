package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.f;
import com.xiaopeng.musicradio.common.c;
import defpackage.agy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DataBinderMapperImpl.java */
/* renamed from: agw  reason: default package */
/* loaded from: classes2.dex */
public class agw extends d {
    private static final SparseIntArray a = new SparseIntArray(2);

    static {
        a.put(agy.c.activity_login, 1);
        a.put(agy.c.fragment_login_manager, 2);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding a(f fVar, View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_login_0".equals(tag)) {
                        return new ahb(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
                case 2:
                    if ("layout/fragment_login_manager_0".equals(tag)) {
                        return new ahd(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_login_manager is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // androidx.databinding.d
    public ViewDataBinding a(f fVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.d
    public int a(String str) {
        Integer num;
        if (str == null || (num = a.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public List<d> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new ir());
        arrayList.add(new c());
        return arrayList;
    }

    /* compiled from: DataBinderMapperImpl.java */
    /* renamed from: agw$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final HashMap<String, Integer> a = new HashMap<>(2);

        static {
            a.put("layout/activity_login_0", Integer.valueOf(agy.c.activity_login));
            a.put("layout/fragment_login_manager_0", Integer.valueOf(agy.c.fragment_login_manager));
        }
    }
}
