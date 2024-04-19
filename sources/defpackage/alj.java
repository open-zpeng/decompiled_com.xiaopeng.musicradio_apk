package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.base.d;
import com.xiaopeng.musicradio.commonui.widget.a;
import com.xiaopeng.musicradio.mine.main.presenter.MineMainPresenter;
import com.xiaopeng.musicradio.mine.widget.e;
import com.xiaopeng.musicradio.mine.widget.f;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import defpackage.aht;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MineMainFragment.java */
@Route(path = "/mine/fragment/main")
/* renamed from: alj  reason: default package */
/* loaded from: classes2.dex */
public class alj extends d<ajw, alh, MineMainPresenter> implements alh {
    private e e;
    private List<f.b> f;
    private f g;
    private boolean h;

    @Override // defpackage.alh
    public void a() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public boolean n() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainMineLocalLeft";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return aht.d.fragment_mine_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        Context context = ((ajw) this.d).d.getContext();
        this.f = s();
        this.e = new e(getChildFragmentManager(), this.f);
        this.g = new f(context, this.f);
        Integer a = ((MineMainPresenter) this.b).a(aox.a().b());
        if (a != null) {
            this.g.a(a.intValue(), false);
        }
        ((ajw) this.d).d.setAdapter(this.g);
        a(context, this.g.l());
        this.e.b(this.g.l());
        amk.a((BaseRecycleView) ((ajw) this.d).d, o(), false, true, "tab_list");
        ((ajw) this.d).d.setVuiLayoutLoadable(false);
        ((ajw) this.d).d.setVuiCanControlScroll(false);
    }

    private List<f.b> s() {
        Context context = ((ajw) this.d).d.getContext();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f.b("/mine/fragment/collect", context.getString(aht.e.title_mine_collect), "title_mine_collect"));
        arrayList.add(new f.b("/mine/fragment/playlist", context.getString(aht.e.title_mine_playlist), "title_mine_playlist"));
        arrayList.add(new f.b("/mine/fragment/history", context.getString(aht.e.title_mine_history), "title_mine_history"));
        arrayList.add(new f.b("/login/fragment/manager", context.getString(aht.e.title_login_manager), "title_login_manager"));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    public void E_() {
        this.g.a(new f.a() { // from class: alj.1
            @Override // com.xiaopeng.musicradio.mine.widget.f.a
            public void a(View view, int i) {
                alj.this.e.b(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public MineMainPresenter ao_() {
        return new MineMainPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        super.d();
        this.e.a(getChildFragmentManager());
        this.e.b(this.g.l());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.i("MineMainFragment", "onCreateView: =========");
        ale.a().a(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.i("MineMainFragment", "onPause: ==================");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        Log.i("MineMainFragment", "onStart: =========");
        ale.a().a(true);
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ale.a().a(false);
        Log.i("MineMainFragment", "onStop: =========");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("MineMainFragment", "onDestroyView: ==========");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.i("MineMainFragment", "onDestroy: ===============");
    }

    @Override // com.xiaopeng.musicradio.datalist.m
    public boolean i_() {
        return ale.a().c();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    public View k() {
        return ((ajw) this.d).d;
    }

    @Override // defpackage.alh
    public void d_(int i) {
        this.g.f(i);
        this.e.b(i);
    }

    private void a(Context context, int i) {
        a b;
        if (this.h || (b = aez.b(context)) == null) {
            return;
        }
        amj.a(context, b, i);
        this.h = true;
    }
}
