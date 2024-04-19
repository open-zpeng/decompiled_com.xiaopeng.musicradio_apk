package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.detail.view.ZoneMusicChildrenLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ZoneMusicChildrenBinder.java */
/* renamed from: asr  reason: default package */
/* loaded from: classes2.dex */
public class asr extends biv<ast, a> {
    private ZoneMusicChildrenLayout a;
    private VipMusicMoreInfo.ModuleBean b;
    private List<VipMusicMoreInfo.ModuleBean> d = new ArrayList();
    private int e;

    public asr(int i) {
        this.e = 1;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_layout_zone_children_binder, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, ast astVar) {
        this.a = aVar.r;
        this.a.a(this.b.getName());
        this.a.a(this.d, this.e);
    }

    public void a(VipMusicMoreInfo.ModuleBean moduleBean) {
        this.d.clear();
        this.b = moduleBean;
        this.d.addAll(moduleBean.getChildList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZoneMusicChildrenBinder.java */
    /* renamed from: asr$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        ZoneMusicChildrenLayout r;

        a(View view) {
            super(view);
            this.r = (ZoneMusicChildrenLayout) view.findViewById(b.d.child_layout);
        }
    }
}
