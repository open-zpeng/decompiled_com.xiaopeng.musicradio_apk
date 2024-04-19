package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DataBinderMapperImpl.java */
/* renamed from: ir  reason: default package */
/* loaded from: classes3.dex */
public class ir extends d {
    private static final SparseIntArray a = new SparseIntArray(0);

    /* compiled from: DataBinderMapperImpl.java */
    /* renamed from: ir$a */
    /* loaded from: classes3.dex */
    private static class a {
        static final HashMap<String, Integer> a = new HashMap<>(0);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding a(f fVar, View view, int i) {
        if (a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
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
        return new ArrayList(0);
    }
}
