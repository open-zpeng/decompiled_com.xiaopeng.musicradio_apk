package com.xiaopeng.musicradio.music.singer.singer.view;

import android.view.View;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class MsSingerSelectLayout extends BaseFrameLayout implements View.OnClickListener {
    private XTextView c;
    private XTextView d;
    private XTextView e;
    private XTextView f;
    private XTextView g;
    private XTextView h;
    private XTextView i;
    private XTextView j;
    private XTextView k;
    private XTextView l;
    private XRelativeLayout m;
    private a n;
    private ArrayList<XTextView> o;
    private ArrayList<XTextView> p;
    private int q;
    private int r;
    private XTextView s;
    private XTextView t;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2);
    }

    private void g() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected BasePresenter a() {
        return null;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_singer_select;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (XTextView) findViewById(b.d.all);
        this.d = (XTextView) findViewById(b.d.china);
        this.e = (XTextView) findViewById(b.d.europe_america);
        this.f = (XTextView) findViewById(b.d.korea);
        this.g = (XTextView) findViewById(b.d.japan);
        this.h = (XTextView) findViewById(b.d.other);
        this.i = (XTextView) findViewById(b.d.top_100);
        this.j = (XTextView) findViewById(b.d.male_singer);
        this.k = (XTextView) findViewById(b.d.female_singer);
        this.l = (XTextView) findViewById(b.d.group_singer);
        this.m = (XRelativeLayout) findViewById(b.d.singer_select_big);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.o.add(this.c);
        this.o.add(this.d);
        this.o.add(this.e);
        this.o.add(this.f);
        this.o.add(this.g);
        this.o.add(this.h);
        this.p.add(this.i);
        this.p.add(this.j);
        this.p.add(this.k);
        this.p.add(this.l);
        this.s = this.c;
        this.t = this.i;
        e();
        setSelectBt(this.c);
        f();
        setSelectBt(this.i);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.l.setOnClickListener(this);
    }

    public void setmStateChangeListener(a aVar) {
        this.n = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.m.getVisibility() == 8) {
            return;
        }
        int id = view.getId();
        if (id == b.d.all) {
            e();
            setSelectBt(this.c);
            this.s = this.c;
            g();
            this.q = 0;
        } else if (id == b.d.china) {
            e();
            setSelectBt(this.d);
            this.s = this.d;
            g();
            this.q = 1;
        } else if (id == b.d.europe_america) {
            e();
            setSelectBt(this.e);
            this.s = this.e;
            g();
            this.q = 2;
        } else if (id == b.d.korea) {
            e();
            setSelectBt(this.f);
            this.s = this.f;
            g();
            this.q = 6;
        } else if (id == b.d.japan) {
            e();
            setSelectBt(this.g);
            this.s = this.g;
            g();
            this.q = 5;
        } else if (id == b.d.other) {
            e();
            setSelectBt(this.h);
            this.s = this.h;
            g();
            this.q = 4;
        } else if (id == b.d.top_100) {
            f();
            setSelectBt(this.i);
            this.t = this.i;
            g();
            this.r = 4;
        } else if (id == b.d.male_singer) {
            f();
            setSelectBt(this.j);
            this.t = this.j;
            g();
            this.r = 1;
        } else if (id == b.d.female_singer) {
            f();
            setSelectBt(this.k);
            this.t = this.k;
            g();
            this.r = 2;
        } else if (id == b.d.group_singer) {
            f();
            setSelectBt(this.l);
            this.t = this.l;
            g();
            this.r = 3;
        }
        this.n.a(this.q, this.r);
    }

    private void e() {
        Iterator<XTextView> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
    }

    private void f() {
        Iterator<XTextView> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
    }

    private void setSelectBt(XTextView xTextView) {
        xTextView.setSelected(true);
    }
}
