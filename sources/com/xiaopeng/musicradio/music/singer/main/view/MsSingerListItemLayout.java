package com.xiaopeng.musicradio.music.singer.main.view;

import android.content.Context;
import android.util.AttributeSet;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.singer.main.presenter.MsSingerListItemPresenter;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class MsSingerListItemLayout extends BaseFrameLayout<Object, MsSingerListItemPresenter> {
    private Context c;
    private MsSingerItemLayout d;
    private MsSingerItemLayout e;
    private MsSingerItemLayout f;
    private MsSingerItemLayout g;
    private ArrayList<MsSingerItemLayout> h;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    public MsSingerListItemLayout(Context context) {
        super(context);
        this.c = context;
    }

    public MsSingerListItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
    }

    public MsSingerListItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public MsSingerListItemPresenter a() {
        return new MsSingerListItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_singer_list_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (MsSingerItemLayout) findViewById(b.d.first_item_layout);
        this.e = (MsSingerItemLayout) findViewById(b.d.second_item_layout);
        this.f = (MsSingerItemLayout) findViewById(b.d.third_item_layout);
        this.g = (MsSingerItemLayout) findViewById(b.d.forth_item_layout);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.h = new ArrayList<>();
        this.h.add(this.d);
        this.h.add(this.e);
        this.h.add(this.f);
        this.h.add(this.g);
        setVuiElementType(bih.UNKNOWN);
    }

    public void setData(ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> arrayList) {
        Iterator<MsSingerItemLayout> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            MsSingerItemLayout msSingerItemLayout = this.h.get(i);
            msSingerItemLayout.setVisibility(0);
            msSingerItemLayout.setData(arrayList.get(i));
        }
    }
}
