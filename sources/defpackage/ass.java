package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.detail.view.ZoneMusicMoreItemLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ZoneMusicItemBinder.java */
/* renamed from: ass  reason: default package */
/* loaded from: classes2.dex */
public class ass extends biv<ast, a> {
    private ZoneMusicMoreItemLayout a;
    private VipMusicMoreInfo.ModuleBean b;
    private List<MusicRadioItem> d = new ArrayList();
    private int e;
    private int f;

    public ass(int i, int i2) {
        this.f = 1;
        this.e = i;
        this.f = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_layout_zone_main_binder, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, ast astVar) {
        this.a = aVar.r;
        this.a.setTitle(this.b.getName());
        this.a.a(this.b, this.e == 0, this.f, this.e);
        try {
            if (a((RecyclerView.v) aVar) > 0 && this.b.getIsShowAll() > 0) {
                this.a.f();
            }
            if (this.b.getCollectInfo() != null && this.b.getCollectInfo().getCollectList() != null && this.b.getCollectInfo().getCollectList().size() != 0) {
                this.a.setVisibility(0);
                return;
            }
            this.a.setVisibility(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(VipMusicMoreInfo.ModuleBean moduleBean) {
        try {
            this.d.clear();
            this.b = moduleBean;
            ArrayList arrayList = new ArrayList();
            if (moduleBean.getCollectInfo() != null && moduleBean.getCollectInfo().getCollectList() != null) {
                for (VipMusicMoreInfo.CollectBean collectBean : moduleBean.getCollectInfo().getCollectList()) {
                    arrayList.add(collectBean.getCollect());
                }
            }
            this.d.addAll(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZoneMusicItemBinder.java */
    /* renamed from: ass$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        ZoneMusicMoreItemLayout r;

        a(View view) {
            super(view);
            this.r = (ZoneMusicMoreItemLayout) view.findViewById(b.d.main_layout);
        }
    }
}
