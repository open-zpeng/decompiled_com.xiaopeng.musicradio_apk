package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.rank.view.RankItemLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: RankItemLayoutBinder.java */
/* renamed from: ary  reason: default package */
/* loaded from: classes2.dex */
public class ary extends biv<asa, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_RANK_ITEM);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_rank_layout, viewGroup, false);
            Log.d("MsRankItemLayoutBinder", "get view by create.");
            bm.a().b(ax.a.MS_RANK_ITEM);
        } else {
            Log.d("MsRankItemLayoutBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, asa asaVar) {
        if (asaVar.a() == null) {
            aVar.r.setVisibility(8);
            return;
        }
        aVar.r.setVisibility(0);
        aVar.r.a(asaVar.a(), asaVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RankItemLayoutBinder.java */
    /* renamed from: ary$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private RankItemLayout r;

        a(View view) {
            super(view);
            this.r = (RankItemLayout) view.findViewById(b.d.rank_item_layout);
        }
    }
}
