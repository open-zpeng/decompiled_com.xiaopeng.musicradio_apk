package com.xiaopeng.musicradio.utils;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ListViewUtils.java */
/* loaded from: classes2.dex */
public class ae {
    public static void a(ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            viewGroup.getChildAt(i2).setVisibility(i);
        }
    }

    public static void a(com.xiaopeng.musicradio.widget.recyclerview.e eVar, List list, Object obj, biv bivVar) {
        eVar.a(obj.getClass(), bivVar);
        list.add(obj);
    }

    public static <T> List<T> a(List<T> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            if (i <= 0 || list.size() <= i) {
                return new ArrayList(list);
            }
            int size = list.size();
            for (int i2 = 0; i2 < i && i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        }
        return arrayList;
    }
}
