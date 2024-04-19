package defpackage;

import android.content.Context;
import android.view.View;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.mix.view.MixItemLayout;
import java.util.List;
/* compiled from: AlbumSearchBinder.java */
/* renamed from: ayq  reason: default package */
/* loaded from: classes2.dex */
public class ayq extends ayr<ayw, azs> {
    @Override // defpackage.ayr
    protected int a() {
        return 1;
    }

    @Override // defpackage.ayr
    protected int b() {
        return 4;
    }

    @Override // defpackage.ayr
    protected int c() {
        return 33;
    }

    @Override // defpackage.ayr
    protected int d() {
        return 0;
    }

    public ayq(axz axzVar) {
        super(axzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    /* renamed from: a */
    public azs b(Context context) {
        azs azsVar = new azs(context);
        azsVar.setVisibility(8);
        return azsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    public void a(MixItemLayout mixItemLayout, ayw aywVar) {
        final List<MusicAlbumBean> b = aywVar.b();
        int childCount = mixItemLayout.getContainerLayout().getChildCount();
        mixItemLayout.setTitle(a.f.tab_search_album);
        for (final int i = 0; i < childCount; i++) {
            View childAt = mixItemLayout.getContainerLayout().getChildAt(i);
            if (i < b.size()) {
                if (childAt instanceof azs) {
                    childAt.setVisibility(0);
                    azs azsVar = (azs) childAt;
                    azsVar.a(b.get(i).getLogo(), b.get(i).getName());
                    azsVar.setItemTitle(b.get(i).getName());
                    int a = aywVar.a() + i + 1;
                    if (this.a.a(b.get(i).getId(), b.get(i).getName())) {
                        azsVar.a(2, a, b.get(i).getName());
                    } else {
                        azsVar.a(3, a, b.get(i).getName());
                    }
                    azsVar.setPosition(a);
                    azsVar.setOnPlayControlListener(new View.OnClickListener() { // from class: ayq.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ayq.this.a != null) {
                                ayq.this.a.b(((MusicAlbumBean) b.get(i)).getId(), ((MusicAlbumBean) b.get(i)).getName());
                            }
                        }
                    });
                    azsVar.setOnClickListener(new View.OnClickListener() { // from class: ayq.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ayq.this.a != null) {
                                ayq.this.a.b(((MusicAlbumBean) b.get(i)).getId(), ((MusicAlbumBean) b.get(i)).getLogo(), ((MusicAlbumBean) b.get(i)).getName());
                            }
                        }
                    });
                    azsVar.a(a, b.get(i).getName(), false);
                } else if (childAt != null) {
                    childAt.setVisibility(8);
                }
            }
        }
    }
}
