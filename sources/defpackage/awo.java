package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.common.view.CommonTitleAlbumItemView;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: AlbumCategoryAdapter.java */
/* renamed from: awo  reason: default package */
/* loaded from: classes2.dex */
public class awo extends awe<RdAlbumBean, a> {
    private Context i;
    private int j;

    @Override // defpackage.aep
    protected int f() {
        return 30;
    }

    public awo(Context context, int i, awf awfVar, int i2) {
        super(context, i, awfVar);
        this.j = 0;
        this.i = context;
        this.j = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awe
    /* renamed from: b */
    public a a(View view) {
        return new a(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awe
    public void a(RdAlbumBean rdAlbumBean, int i) {
        this.g.put(Long.valueOf(rdAlbumBean.getId()), Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, final int i) {
        boolean z;
        if (f(i) || !(vVar instanceof a)) {
            return;
        }
        a aVar = (a) vVar;
        RdAlbumBean g = g(i);
        if (g != null) {
            int i2 = i + 1;
            aVar.r.a(g.getTitle(), g.getBestSizeLogo(), i, i2, false);
            aVar.r.setOnClickListener(new View.OnClickListener() { // from class: awo.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (awo.this.a != null) {
                        awo.this.a.a(0, i);
                    }
                }
            });
            aVar.r.setPlayListener(new View.OnClickListener() { // from class: awo.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (awo.this.a != null) {
                        awo.this.a.a(1, i);
                    }
                }
            });
            if (this.h.a(g.getId())) {
                a(g, 2);
                aVar.r.a(2);
                z = true;
            } else {
                a(g, 2);
                aVar.r.a(3);
                z = false;
            }
            aVar.r.a(g.getPaymentType(), g.isAuthorized());
            VuiView vuiView = (VuiView) aVar.a;
            vuiView.setVuiPosition(i);
            switch (this.j) {
                case 0:
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.a, "program_default_list_item_" + i);
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.r.getPlayControlView(), "program_default_play_" + i);
                    break;
                case 1:
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.a, "program_category_list_item_" + i);
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.r.getPlayControlView(), "program_category_play_" + i);
                    break;
                case 2:
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.a, "program_guess_like_list_item_" + i);
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.r.getPlayControlView(), "program_guess_like_play_" + i);
                    break;
                case 3:
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.a, "program_rank_list_item_" + i);
                    VuiEngine.getInstance(this.i).setVuiElementTag(aVar.r.getPlayControlView(), "program_rank_play_" + i);
                    break;
            }
            vuiView.setVuiLabel(String.format(aVar.a.getResources().getString(b.f.vui_play_position), c.a(g.getTitle()), Integer.valueOf(i2), Integer.valueOf(i2)));
            vuiView.setVuiAction(big.CLICK.a());
            c.a(this.i, aVar.r.getPlayControlView(), z);
        }
    }

    public void a(long j) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, Integer> entry : this.g.entrySet()) {
            if (entry.getValue().intValue() != 3) {
                arrayList.add(entry.getKey());
            }
        }
        arrayList.add(Long.valueOf(j));
        for (int i = 0; i < this.c.size(); i++) {
            if (arrayList.contains(Long.valueOf(((RdAlbumBean) this.c.get(i)).getId()))) {
                c(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AlbumCategoryAdapter.java */
    /* renamed from: awo$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        CommonTitleAlbumItemView r;

        public a(View view) {
            super(view);
            this.r = (CommonTitleAlbumItemView) view.findViewById(b.d.rank_item);
        }
    }
}
