package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.f;
import com.xiaopeng.musicradio.common.c;
import defpackage.bdm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DataBinderMapperImpl.java */
/* renamed from: bdl  reason: default package */
/* loaded from: classes2.dex */
public class bdl extends d {
    private static final SparseIntArray a = new SparseIntArray(2);

    static {
        a.put(bdm.d.activity_web_view, 1);
        a.put(bdm.d.layout_web_view_fail, 2);
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
                    if ("layout/activity_web_view_0".equals(tag)) {
                        return new bdp(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_web_view is invalid. Received: " + tag);
                case 2:
                    if ("layout/layout_web_view_fail_0".equals(tag)) {
                        return new bdr(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_web_view_fail is invalid. Received: " + tag);
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
    /* renamed from: bdl$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final HashMap<String, Integer> a = new HashMap<>(2);

        static {
            a.put("layout/activity_web_view_0", Integer.valueOf(bdm.d.activity_web_view));
            a.put("layout/layout_web_view_fail_0", Integer.valueOf(bdm.d.layout_web_view_fail));
        }
    }
}
