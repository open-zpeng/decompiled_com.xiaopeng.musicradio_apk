package defpackage;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.base.e;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.main.presenter.ProgramMainPresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bo;
import com.xiaopeng.musicradio.widget.MusicRecyclerTabLayout;
import defpackage.aeo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProgramMainFragment.java */
@Route(path = "/program/fragment/main")
/* renamed from: axg  reason: default package */
/* loaded from: classes2.dex */
public class axg extends b<axf, ProgramMainPresenter> implements axf {
    private MusicRecyclerTabLayout d;
    private NoScrollViewPager e;
    private aeo f;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public boolean n() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainProgramLocalLeft";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.fragment_program_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (MusicRecyclerTabLayout) a(b.d.tab_program_main);
        this.e = (NoScrollViewPager) a(b.d.program_viewpager);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        aw.a((Object) this.e, "mOffscreenPageLimit", (Object) 0);
        this.f = new aeo(getChildFragmentManager());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aeo.a("/program/fragment/choice", be.a(b.f.program_choice)));
        arrayList.add(new aeo.a("/program/fragment/category", be.a(b.f.program_category)));
        this.f.a((List<aeo.a>) arrayList);
        this.e.setAdapter(this.f);
        this.d.setUpWithViewPager(this.e);
        this.d.setVuiLayoutLoadable(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        super.d();
        this.f.a(getChildFragmentManager());
        NoScrollViewPager noScrollViewPager = this.e;
        noScrollViewPager.a(noScrollViewPager.getCurrentItem(), false, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected e b() {
        return bo.a().b();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    public View k() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public ProgramMainPresenter ao_() {
        return new ProgramMainPresenter();
    }

    @Override // defpackage.axf
    public void j_(int i) {
        this.d.a(i);
    }
}
