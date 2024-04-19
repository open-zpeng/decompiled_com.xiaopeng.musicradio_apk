package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import defpackage.ase;
/* compiled from: MsRmCategoryListAdapter.java */
/* renamed from: asd  reason: default package */
/* loaded from: classes2.dex */
public class asd extends ase {
    private int f;

    @Override // defpackage.aes
    protected boolean m() {
        return false;
    }

    public asd(Context context) {
        super(context, 1);
        this.f = -1;
    }

    public asd(Context context, int i, int i2, aep.b bVar) {
        super(context, i, i2, bVar, 1);
        this.f = -1;
    }

    @Override // defpackage.aep
    public aep.f[] g() {
        return new aep.f[]{new aep.f(1, b.e.item_foot_view, 1)};
    }

    @Override // defpackage.ase, androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_foot_view, viewGroup, false));
        }
        return new ase.a(h());
    }

    @Override // defpackage.ase, androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        super.a(vVar, i);
        if (vVar instanceof a) {
            a aVar = (a) vVar;
            if (aVar.r != null) {
                int i2 = this.f;
                if (i2 == 0) {
                    aVar.r.setVisibility(0);
                    aVar.r.setText(b.f.rv_loading);
                    aVar.s.setVisibility(0);
                } else if (i2 == 1) {
                    aVar.r.setVisibility(4);
                    aVar.s.setVisibility(4);
                } else if (i2 == 2) {
                    aVar.r.setVisibility(4);
                    aVar.s.setVisibility(4);
                } else {
                    aVar.r.setVisibility(4);
                    aVar.s.setVisibility(4);
                }
            }
        }
    }

    public void f(int i) {
        this.f = i;
        d();
    }

    public int l() {
        return this.f;
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public int a(int i) {
        return i + 1 == a() ? 1 : 0;
    }

    /* compiled from: MsRmCategoryListAdapter.java */
    /* renamed from: asd$a */
    /* loaded from: classes2.dex */
    private class a extends RecyclerView.v {
        XTextView r;
        XLoading s;

        public a(View view) {
            super(view);
            this.r = (XTextView) view.findViewById(b.d.tv_foot);
            this.s = (XLoading) view.findViewById(b.d.foot_loading);
        }
    }

    @Override // defpackage.aes, androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        if (n() == null) {
            return 0;
        }
        return n().size() + 1;
    }
}
