package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.radio.view.MsRadioTitleLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: MsRadioTitleBinder.java */
/* renamed from: arw  reason: default package */
/* loaded from: classes2.dex */
public class arw extends biv<arq, a> {
    private aru a;
    private MsRadioTitleLayout b;

    public arw(aru aruVar) {
        this.a = aruVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_RADIO_TITLE);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_radio_layout, viewGroup, false);
            Log.d("MsRadioBinder", "get view by create.");
            bm.a().b(ax.a.MS_RADIO_TITLE);
        } else {
            Log.d("MsRadioBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, arq arqVar) {
        aVar.r.setFragment(this.a);
        this.b = aVar.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MsRadioTitleBinder.java */
    /* renamed from: arw$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private MsRadioTitleLayout r;

        a(View view) {
            super(view);
            this.r = (MsRadioTitleLayout) view.findViewById(b.d.radio_title_layout);
        }
    }
}
