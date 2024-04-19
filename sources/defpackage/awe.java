package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import com.xiaopeng.musicradio.music.b;
import java.util.HashMap;
import java.util.List;
/* compiled from: BaseProgramListAdapter.java */
/* renamed from: awe  reason: default package */
/* loaded from: classes2.dex */
public abstract class awe<T, VH extends RecyclerView.v> extends aeq<T, VH> {
    protected HashMap<Integer, List<T>> f;
    protected HashMap<Long, Integer> g;
    protected awf h;

    protected abstract VH a(View view);

    protected abstract void a(T t, int i);

    public awe(Context context, int i, awf awfVar) {
        super(context, i);
        this.g = new HashMap<>();
        this.f = new HashMap<>();
        this.h = awfVar;
        c(true);
    }

    @Override // defpackage.aeq
    public VH a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(h());
    }

    @Override // defpackage.aeq
    protected View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_foot_view, viewGroup, false);
        inflate.setVisibility(8);
        return inflate;
    }

    private void o() {
        this.c.clear();
        this.g.clear();
        int size = this.f.size();
        int i = 0;
        while (i < size) {
            i++;
            List<T> list = this.f.get(Integer.valueOf(i));
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!this.c.contains(list.get(i2))) {
                        this.c.add(list.get(i2));
                        a((awe<T, VH>) list.get(i2), 3);
                    }
                }
            }
        }
    }

    @Override // defpackage.aes
    public void a(List<T> list) {
        a((List) list, 1);
    }

    public void a(List<T> list, int i) {
        this.f.put(Integer.valueOf(i), list);
        o();
        d();
    }
}
