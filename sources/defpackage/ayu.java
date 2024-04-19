package defpackage;

import android.content.Context;
import android.view.View;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.mix.view.MixItemLayout;
/* compiled from: ProgramSearchBinder.java */
/* renamed from: ayu  reason: default package */
/* loaded from: classes2.dex */
public class ayu extends ayr<aza, azs> {
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

    public ayu(axz axzVar) {
        super(axzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    /* renamed from: a */
    public azs b(Context context) {
        return new azs(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    public void a(MixItemLayout mixItemLayout, aza azaVar) {
        boolean z;
        int childCount = mixItemLayout.getContainerLayout().getChildCount();
        mixItemLayout.setTitle(a.f.tab_search_program);
        for (int i = 0; i < childCount; i++) {
            if (i < azaVar.b().size()) {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(0);
                View childAt = mixItemLayout.getContainerLayout().getChildAt(i);
                final RdAlbumBean rdAlbumBean = azaVar.b().get(i);
                if (childAt instanceof azs) {
                    azs azsVar = (azs) childAt;
                    azsVar.a(rdAlbumBean.getMediumLogo(), rdAlbumBean.getTitle());
                    azsVar.setItemTitle(rdAlbumBean.getTitle());
                    azsVar.setPosition(azaVar.a() + i + 1);
                    azsVar.a(rdAlbumBean.getPaymentType(), rdAlbumBean.isAuthorized());
                    if (this.a.a(rdAlbumBean.getId())) {
                        azsVar.a(2, azaVar.a() + i + 1, rdAlbumBean.getTitle());
                        z = true;
                    } else {
                        azsVar.a(3, azaVar.a() + i + 1, rdAlbumBean.getTitle());
                        z = false;
                    }
                    azsVar.setOnPlayControlListener(new View.OnClickListener() { // from class: ayu.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ayu.this.a != null) {
                                ayu.this.a.a(rdAlbumBean);
                            }
                        }
                    });
                    azsVar.setOnClickListener(new View.OnClickListener() { // from class: ayu.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ayu.this.a != null) {
                                ayu.this.a.b(rdAlbumBean);
                            }
                        }
                    });
                    azsVar.a(azaVar.a() + i + 1, rdAlbumBean.getTitle(), z);
                }
            } else {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(8);
            }
        }
    }
}
