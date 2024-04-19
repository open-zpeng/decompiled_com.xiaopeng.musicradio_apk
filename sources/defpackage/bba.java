package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.dir.view.DirItemLayout;
/* compiled from: UsbDirBinder.java */
/* renamed from: bba  reason: default package */
/* loaded from: classes2.dex */
public class bba extends biv<bbd, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(a.c.usb_dir_item_layout, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, bbd bbdVar) {
        if (bbdVar.b() == null) {
            aVar.r.setVisibility(8);
            return;
        }
        aVar.r.setVisibility(0);
        aVar.r.a(bbdVar.b(), bbdVar.a(), bbdVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UsbDirBinder.java */
    /* renamed from: bba$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private DirItemLayout r;

        a(View view) {
            super(view);
            this.r = (DirItemLayout) view.findViewById(a.b.item_layout);
        }
    }
}
