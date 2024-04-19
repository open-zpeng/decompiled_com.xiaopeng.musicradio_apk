package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.radio.view.MsRadioItemLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: MsRadioItemLayoutBinder.java */
/* renamed from: arv  reason: default package */
/* loaded from: classes2.dex */
public class arv extends biv<arx, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_RADIO_ITEM);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_radio_item_layout, viewGroup, false);
            Log.d("MsRadioItemLayoutBinder", "get view by create.");
            bm.a().b(ax.a.MS_RADIO_ITEM);
        } else {
            Log.d("MsRadioItemLayoutBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, arx arxVar) {
        if (arxVar.a() == null) {
            aVar.r.setVisibility(8);
            return;
        }
        aVar.r.setVisibility(0);
        aVar.r.a(arxVar.a(), arxVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MsRadioItemLayoutBinder.java */
    /* renamed from: arv$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private MsRadioItemLayout r;

        a(View view) {
            super(view);
            this.r = (MsRadioItemLayout) view.findViewById(b.d.radio_item_layout);
        }
    }
}
