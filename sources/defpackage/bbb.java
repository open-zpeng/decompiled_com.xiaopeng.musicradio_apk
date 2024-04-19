package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.dir.view.SongItemLayout;
/* compiled from: UsbSongBinder.java */
/* renamed from: bbb  reason: default package */
/* loaded from: classes2.dex */
public class bbb extends biv<bbe, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(a.c.usb_song_item_layout, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, bbe bbeVar) {
        if (bbeVar.a() == null) {
            aVar.r.setVisibility(8);
            return;
        }
        aVar.r.setVisibility(0);
        aVar.r.a(bbeVar.a(), bbeVar.d(), bbeVar.b(), bbeVar.c(), bbeVar.e(), bbeVar.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UsbSongBinder.java */
    /* renamed from: bbb$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private SongItemLayout r;

        a(View view) {
            super(view);
            this.r = (SongItemLayout) view.findViewById(a.b.item_layout);
        }
    }
}
