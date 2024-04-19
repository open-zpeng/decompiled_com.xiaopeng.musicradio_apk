package defpackage;

import android.content.Context;
import android.view.View;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.mix.view.MixItemLayout;
/* compiled from: NetRadioSearchBinder.java */
/* renamed from: ayt  reason: default package */
/* loaded from: classes2.dex */
public class ayt extends ayr<ayz, azd> {
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
        return 20;
    }

    @Override // defpackage.ayr
    protected int d() {
        return 0;
    }

    @Override // defpackage.ayr
    protected int e() {
        return 200;
    }

    @Override // defpackage.ayr
    protected int f() {
        return -2;
    }

    public ayt(axz axzVar) {
        super(axzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    /* renamed from: a */
    public azd b(Context context) {
        return new azd(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    public void a(MixItemLayout mixItemLayout, ayz ayzVar) {
        boolean z;
        int childCount = mixItemLayout.getContainerLayout().getChildCount();
        mixItemLayout.setTitle(a.f.tab_search_net_radio);
        for (int i = 0; i < childCount; i++) {
            if (i < ayzVar.b().size()) {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(0);
                View childAt = mixItemLayout.getContainerLayout().getChildAt(i);
                final NetRadioInfo netRadioInfo = ayzVar.b().get(i);
                if (childAt instanceof azd) {
                    azd azdVar = (azd) childAt;
                    azdVar.a(netRadioInfo.getPicUrl(), netRadioInfo.getName());
                    azdVar.setPosition(i + 1 + ayzVar.a());
                    if (this.a.k_(netRadioInfo.getId())) {
                        azdVar.a(2, ayzVar.a() + i + 1, netRadioInfo.getName());
                        z = true;
                    } else {
                        azdVar.a(3, ayzVar.a() + i + 1, netRadioInfo.getName());
                        z = false;
                    }
                    azdVar.setOnPlayControlListener(new View.OnClickListener() { // from class: ayt.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ayt.this.a != null) {
                                ayt.this.a.a(netRadioInfo);
                            }
                        }
                    });
                    azdVar.a(ayzVar.a() + i + 1, netRadioInfo.getName(), z);
                }
            } else {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(8);
            }
        }
    }
}
