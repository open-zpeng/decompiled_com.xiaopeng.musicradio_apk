package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmItemLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: MsRmItemLayoutBinder.java */
/* renamed from: asf  reason: default package */
/* loaded from: classes2.dex */
public class asf extends biv<ash, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_RM_ITEM);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_rm_item_layout, viewGroup, false);
            Log.i("MsRmItemLayoutBinder", "get view by create.");
            bm.a().b(ax.a.MS_RM_ITEM);
        } else {
            Log.i("MsRmItemLayoutBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, ash ashVar) {
        if (ashVar.a() == null) {
            aVar.r.setVisibility(8);
            return;
        }
        aVar.r.setVisibility(0);
        aVar.r.a(ashVar.a(), ashVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MsRmItemLayoutBinder.java */
    /* renamed from: asf$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private MsRmItemLayout r;

        a(View view) {
            super(view);
            this.r = (MsRmItemLayout) view.findViewById(b.d.rm_item_layout);
        }
    }
}
