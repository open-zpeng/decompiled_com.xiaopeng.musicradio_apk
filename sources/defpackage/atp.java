package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.SingerMainInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.singer.main.view.MsSingerListItemLayout;
/* compiled from: MsSingerAdapter.java */
/* renamed from: atp  reason: default package */
/* loaded from: classes2.dex */
public class atp extends aes<SingerMainInfo, RecyclerView.v> {
    private Context f;

    @Override // defpackage.aep
    protected int f() {
        return 5;
    }

    @Override // defpackage.aes
    protected boolean m() {
        return false;
    }

    public atp(Context context) {
        super(context, b.e.music_item_singer_main);
        this.f = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        SingerMainInfo g;
        a aVar = (a) vVar;
        SingerMainInfo g2 = g(i);
        if (g2 != null) {
            if (g2.ismIsTitle()) {
                aVar.r.setVisibility(0);
                aVar.s.setVisibility(8);
                aVar.r.setText(g(i).getmTitle());
                return;
            }
            int i2 = 30;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aVar.s.getLayoutParams();
            if (i > 1 && (g = g(i - 1)) != null && !g.ismIsTitle()) {
                i2 = 50;
            }
            layoutParams.topMargin = i2;
            aVar.s.setLayoutParams(layoutParams);
            aVar.r.setVisibility(8);
            aVar.s.setVisibility(0);
            aVar.s.setData(g2.getmSingerBeans());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MsSingerAdapter.java */
    /* renamed from: atp$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        TextView r;
        MsSingerListItemLayout s;

        a(View view) {
            super(view);
            this.r = (TextView) view.findViewById(b.d.tv_title);
            this.s = (MsSingerListItemLayout) view.findViewById(b.d.singet_list_item_layout);
        }
    }
}
