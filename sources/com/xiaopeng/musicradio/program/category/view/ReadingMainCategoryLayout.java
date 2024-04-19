package com.xiaopeng.musicradio.program.category.view;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.xpbean.ReadingCategoryListBeanV3;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bo;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.c;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class ReadingMainCategoryLayout extends com.xiaopeng.musicradio.widget.mvpbase.c<e, com.xiaopeng.musicradio.program.category.presenter.a> implements e {
    private static final String TAG = "ReadingCategoryMVPLayout";
    private LoadingTipsView mLoadingTipsView;
    private a mReadingCategoryAdapter;
    private BaseRecycleView mRecyclerView;

    public ReadingMainCategoryLayout(Context context) {
        super(context);
    }

    public ReadingMainCategoryLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReadingMainCategoryLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public com.xiaopeng.musicradio.program.category.presenter.a createPresenter() {
        return new com.xiaopeng.musicradio.program.category.presenter.a();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void findView() {
        this.mRecyclerView = (BaseRecycleView) findViewById(b.d.rv_reading_category);
        this.mReadingCategoryAdapter = new a();
        this.mLoadingTipsView = (LoadingTipsView) findViewById(b.d.loading_tips);
        this.mLoadingTipsView.setVisibility(0);
        this.mLoadingTipsView.setState(1);
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        BaseRecycleView baseRecycleView = this.mRecyclerView;
        vuiEngine.setVuiElementTag(baseRecycleView, "reading_main_category_" + this.mRecyclerView.getId());
        this.mRecyclerView.setVuiCanControlScroll(false);
        this.mRecyclerView.initVuiAttr("MainProgramCategory", VuiEngine.getInstance(getContext()), false, true);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3) { // from class: com.xiaopeng.musicradio.program.category.view.ReadingMainCategoryLayout.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean h() {
                return true;
            }
        };
        com.xiaopeng.musicradio.widget.recyclerview.h hVar = new com.xiaopeng.musicradio.widget.recyclerview.h(3, 40, false);
        hVar.a(40);
        hVar.c(100);
        this.mRecyclerView.setHasFixedSize(true);
        this.mRecyclerView.addItemDecoration(hVar);
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.c, com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mRecyclerView.setAdapter(this.mReadingCategoryAdapter);
    }

    public boolean isDataEmpty() {
        return this.mReadingCategoryAdapter.f().size() <= 1;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setListener() {
        applyTheme();
        this.mReadingCategoryAdapter.a(new c.a() { // from class: com.xiaopeng.musicradio.program.category.view.ReadingMainCategoryLayout.2
            @Override // com.xiaopeng.musicradio.widget.recyclerview.c.a
            public void a(RecyclerView.v vVar, int i, View view) {
                ReadingCategoryListBeanV3.DataBean.ListBean e;
                if (!ShakeUtil.canExecuteLong(ReadingMainCategoryLayout.this.mRecyclerView.getId(), IInputController.KEYCODE_KNOB_WIND_SPD_UP) || (e = ReadingMainCategoryLayout.this.mReadingCategoryAdapter.e(i)) == null) {
                    return;
                }
                sp.a().a("/program/activity/sub").withString("fragment_uri", ("/program/fragment/sub/category?category_id=" + e.getId()) + "&category_name=" + Uri.encode(e.getName())).navigation();
                axt.c(e.getName());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mReadingCategoryAdapter.d();
    }

    private void statCategoryClick(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(VuiConstants.ELEMENT_TYPE, str);
        hashMap.put("name", str2);
        bci.h(hashMap);
    }

    public void refresh() {
        a aVar = this.mReadingCategoryAdapter;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c, defpackage.bal
    public void applyTheme() {
        super.applyTheme();
        this.mReadingCategoryAdapter.d();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public int getContentViewId() {
        return b.e.layout_reading_category;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends com.xiaopeng.musicradio.widget.recyclerview.c<ReadingCategoryListBeanV3.DataBean.ListBean, C0159a> {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.xiaopeng.musicradio.program.category.view.ReadingMainCategoryLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0159a extends com.xiaopeng.musicradio.widget.recyclerview.g {
            XImageView r;
            XTextView s;
            XRelativeLayout t;
            XTextView u;

            private C0159a(View view) {
                super(view);
                this.r = (XImageView) view.findViewById(b.d.category_logo);
                this.s = (XTextView) view.findViewById(b.d.category_title);
                this.t = (XRelativeLayout) view.findViewById(b.d.item_layout_category);
                this.u = (XTextView) view.findViewById(b.d.tv_speech_num);
            }
        }

        @Override // com.xiaopeng.musicradio.widget.recyclerview.c
        /* renamed from: c */
        public C0159a d(ViewGroup viewGroup, int i) {
            View a = bo.a().a(ax.a.READING_CATEGORY_ITEM);
            if (a == null) {
                a = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_program_category, viewGroup, false);
                Log.d(ReadingMainCategoryLayout.TAG, "get view by create.");
                bo.a().b(ax.a.READING_CATEGORY_ITEM);
            } else {
                Log.d(ReadingMainCategoryLayout.TAG, "get view from cache.");
            }
            return new C0159a(a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void a(C0159a c0159a, int i) {
            boolean d = baj.a().d();
            c0159a.r.setVisibility(0);
            ReadingCategoryListBeanV3.DataBean.ListBean listBean = (ReadingCategoryListBeanV3.DataBean.ListBean) this.b.get(i);
            c0159a.s.setText(listBean.getName());
            listBean.getName();
            c0159a.s.setTextColor(bak.a(b.a.x_theme_text_01, d));
            y.a(ReadingMainCategoryLayout.this.getContext(), baj.a().d() ? listBean.getNightLogo() : listBean.getLogo(), com.xiaopeng.musicradio.common.g.a().a(bak.b(b.c.category_default, d)), c0159a.r);
            XRelativeLayout xRelativeLayout = c0159a.t;
            xRelativeLayout.setVuiElementId(c0159a.t.getId() + "_" + i);
            c0159a.t.setVuiPosition(i);
            int i2 = i + 1;
            c0159a.t.setVuiLabel(String.format(ReadingMainCategoryLayout.this.getResources().getString(b.f.vui_play_position), com.xiaopeng.musicradio.vui.c.a(listBean.getName()), Integer.valueOf(i2), Integer.valueOf(i2)));
            c0159a.t.setVuiElementType(bih.BUTTON);
            c0159a.u.setText(String.valueOf(i2));
            c0159a.u.setVisibility(com.xiaopeng.musicradio.model.dui.h.a().b() ? 0 : 8);
        }
    }

    public void loadData() {
        ((com.xiaopeng.musicradio.program.category.presenter.a) this.mPresenter).h();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void showCategories(List<ReadingCategoryListBeanV3.DataBean.ListBean> list) {
        this.mReadingCategoryAdapter.a(new ArrayList(list));
    }

    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void onNetworkValid() {
        if (this.mReadingCategoryAdapter.f().size() < 2) {
            ((com.xiaopeng.musicradio.program.category.presenter.a) this.mPresenter).h();
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void setLoadingState(int i) {
        this.mLoadingTipsView.setState(i);
        switch (i) {
            case 1:
                this.mLoadingTipsView.setOnClickListener(null);
                return;
            case 2:
                this.mLoadingTipsView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.category.view.ReadingMainCategoryLayout.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ((com.xiaopeng.musicradio.program.category.presenter.a) ReadingMainCategoryLayout.this.mPresenter).h();
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void updateList() {
        this.mReadingCategoryAdapter.d();
    }
}
