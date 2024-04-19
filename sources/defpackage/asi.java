package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.singer.view.SingerItemLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: SingerItemLayoutBinder.java */
/* renamed from: asi  reason: default package */
/* loaded from: classes2.dex */
public class asi extends biv<ask, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_SINGER_ITEM);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_singer_layout, viewGroup, false);
            Log.d("SingerItemLayoutBinder", "get view by create.");
            bm.a().b(ax.a.MS_SINGER_ITEM);
        } else {
            Log.d("SingerItemLayoutBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, ask askVar) {
        if (askVar.a() == null) {
            aVar.r.setVisibility(8);
            return;
        }
        aVar.r.setVisibility(0);
        aVar.r.a(askVar.a(), askVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingerItemLayoutBinder.java */
    /* renamed from: asi$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private SingerItemLayout r;

        a(View view) {
            super(view);
            this.r = (SingerItemLayout) view.findViewById(b.d.singer_item_layout);
        }
    }
}
