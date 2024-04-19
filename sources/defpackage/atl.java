package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.xui.widget.XImageView;
import defpackage.aep;
import defpackage.ate;
/* compiled from: MsRankDetailListAdapter.java */
/* renamed from: atl  reason: default package */
/* loaded from: classes2.dex */
public class atl extends ate {
    private int[] f;

    public atl(Context context, int i, int i2, aep.b bVar) {
        super(context, i, i2, bVar);
        this.f = new int[]{b.c.img_no_1, b.c.img_no_2, b.c.img_no_3};
    }

    @Override // defpackage.ate, androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ate.a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_musiclist_foot_view, viewGroup, false));
        }
        return new a(h());
    }

    @Override // defpackage.ate, androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        super.a(vVar, i);
        if (vVar instanceof a) {
            a aVar = (a) vVar;
            switch (i) {
                case 0:
                case 1:
                case 2:
                    aVar.F.setImageResource(this.f[i]);
                    return;
                default:
                    aVar.F.setImageResource(0);
                    return;
            }
        }
    }

    /* compiled from: MsRankDetailListAdapter.java */
    /* renamed from: atl$a */
    /* loaded from: classes2.dex */
    public class a extends ate.b {
        public XImageView F;

        a(View view) {
            super(view);
            this.F = (XImageView) this.a.findViewById(b.d.ms_no);
        }
    }
}
