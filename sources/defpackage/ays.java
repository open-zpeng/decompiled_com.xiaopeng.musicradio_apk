package defpackage;

import android.content.Context;
import android.view.View;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.mix.view.MixItemLayout;
/* compiled from: CollectionSearchBinder.java */
/* renamed from: ays  reason: default package */
/* loaded from: classes2.dex */
public class ays extends ayr<ayy, azs> {
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

    public ays(axz axzVar) {
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
    public void a(MixItemLayout mixItemLayout, ayy ayyVar) {
        boolean z;
        int childCount = mixItemLayout.getContainerLayout().getChildCount();
        mixItemLayout.setTitle(a.f.tab_search_song_list);
        for (int i = 0; i < childCount; i++) {
            if (i < ayyVar.b().size()) {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(0);
                View childAt = mixItemLayout.getContainerLayout().getChildAt(i);
                final MixSearchResultBean.CollectBean collectBean = ayyVar.b().get(i);
                if (childAt instanceof azs) {
                    azs azsVar = (azs) childAt;
                    azsVar.a(collectBean.getLogo(), collectBean.getName());
                    if (this.a.c(collectBean.getId(), collectBean.getName())) {
                        azsVar.a(2, ayyVar.a() + i + 1, collectBean.getName());
                        z = true;
                    } else {
                        azsVar.a(3, ayyVar.a() + i + 1, collectBean.getName());
                        z = false;
                    }
                    azsVar.setPosition(ayyVar.a() + i + 1);
                    azsVar.setOnPlayControlListener(new View.OnClickListener() { // from class: ays.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ays.this.a != null) {
                                ays.this.a.a(collectBean.getId(), collectBean.getName(), collectBean.getLogo());
                            }
                        }
                    });
                    azsVar.setOnClickListener(new View.OnClickListener() { // from class: ays.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ays.this.a != null) {
                                ays.this.a.c(collectBean.getId(), collectBean.getLogo(), collectBean.getName());
                            }
                        }
                    });
                    azsVar.a(ayyVar.a() + i + 1, collectBean.getName(), z);
                }
            } else {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(8);
            }
        }
    }
}
