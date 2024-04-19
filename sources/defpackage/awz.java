package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.view.rank.RankTitleLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bo;
import com.xiaopeng.musicradio.widget.recyclerview.e;
/* compiled from: RankTitleBinder.java */
/* renamed from: awz  reason: default package */
/* loaded from: classes2.dex */
public class awz extends biv<axd, a> {
    private e.a a;

    public awz(e.a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.d("RankTitleBinder", "RankTitleBinder onCreateViewHolder");
        View a2 = bo.a().a(ax.a.READING_RANK_TITLE_BINDER);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.layout_rank_title_binder, viewGroup, false);
            Log.d("RankTitleBinder", "RankTitleBinder get view by create.");
            bo.a().b(ax.a.READING_RANK_TITLE_BINDER);
        } else {
            Log.d("RankTitleBinder", "RankTitleBinder get view from cache.");
        }
        return new a(a2, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, axd axdVar) {
        aVar.r.a(axdVar.b(), axdVar.a(), axdVar.c());
        aVar.s.b(3);
        aVar.s.a(a((RecyclerView.v) aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RankTitleBinder.java */
    /* renamed from: awz$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        RankTitleLayout r;
        e.c s;

        public a(View view, e.a aVar) {
            super(view);
            this.r = (RankTitleLayout) view.findViewById(b.d.rank_title_layout);
            this.s = new e.c();
            this.s.a(aVar);
            this.r.setOnClickListener(this.s);
        }
    }
}
