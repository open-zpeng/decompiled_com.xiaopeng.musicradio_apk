package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.view.rank.RankLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bo;
import com.xiaopeng.musicradio.widget.recyclerview.e;
/* compiled from: RankBinder.java */
/* renamed from: awy  reason: default package */
/* loaded from: classes2.dex */
public class awy extends biv<axc, a> {
    private e.a a;

    public awy(e.a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.d("RankBinder", "RankBinder onCreateViewHolder ");
        View a2 = bo.a().a(ax.a.READING_RANK_BINDER);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.layout_rank_binder, viewGroup, false);
            Log.d("RankBinder", "RankBinder get view by create.");
            bo.a().b(ax.a.READING_RANK_BINDER);
        } else {
            Log.d("RankBinder", "RankBinder get view from cache.");
        }
        return new a(a2, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, axc axcVar) {
        if (axcVar.d() != null) {
            aVar.r.setVisibility(0);
            aVar.r.a(axcVar.b(), axcVar.d(), axcVar.a(), axcVar.c(), axcVar.e());
            aVar.s.a(a((RecyclerView.v) aVar));
            aVar.s.b(1);
            aVar.t.a(a((RecyclerView.v) aVar));
            aVar.t.b(0);
            return;
        }
        aVar.r.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RankBinder.java */
    /* renamed from: awy$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        RankLayout r;
        e.c s;
        e.c t;

        public a(View view, e.a aVar) {
            super(view);
            this.r = (RankLayout) view.findViewById(b.d.rank_layout);
            this.s = new e.c();
            this.s.a(aVar);
            this.t = new e.c();
            this.t.a(aVar);
            this.r.setItemClickListener(this.s);
            this.r.setItemPlayListener(this.t);
        }
    }
}
