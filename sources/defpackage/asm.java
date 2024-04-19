package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.xpplay.view.XpPlayItemLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: XpPlayItemLayoutBinder.java */
/* renamed from: asm  reason: default package */
/* loaded from: classes2.dex */
public class asm extends biv<aso, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_XP_PLAY_ITEM);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_xp_play_layout, viewGroup, false);
            Log.d("MsRankItemLayoutBinder", "get view by create.");
            bm.a().b(ax.a.MS_XP_PLAY_ITEM);
        } else {
            Log.d("MsRankItemLayoutBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, aso asoVar) {
        if (asoVar.c() == null) {
            aVar.r.setVisibility(8);
            return;
        }
        aVar.r.setVisibility(0);
        aVar.r.a(asoVar.a(), asoVar.b(), asoVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: XpPlayItemLayoutBinder.java */
    /* renamed from: asm$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private XpPlayItemLayout r;

        a(View view) {
            super(view);
            this.r = (XpPlayItemLayout) view.findViewById(b.d.xp_play_item_layout);
        }
    }
}
