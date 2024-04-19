package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ViewUtils.java */
/* renamed from: amo  reason: default package */
/* loaded from: classes2.dex */
public class amo {
    public static void a(View view, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.removeRule(7);
        layoutParams.addRule(5, i);
        view.setLayoutParams(layoutParams);
    }

    public static void b(View view, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.removeRule(5);
        layoutParams.addRule(7, i);
        view.setLayoutParams(layoutParams);
    }

    public static void a(RecyclerView recyclerView, int i) {
        a(recyclerView, 0, i);
    }

    public static void a(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getRecycledViewPool().a(i, i2);
    }
}
