package com.xiaopeng.musicradio.program.choice.view.guesslike;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.base.BaseLinearLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.presenter.guesslike.GuessLikePresenter;
import com.xiaopeng.musicradio.utils.av;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.PlayControlView;
import com.xiaopeng.musicradio.widget.recyclerview.VuiRecyclerViewWithLoading;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import defpackage.ago;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class GuessLikeLayout extends BaseLinearLayout<d, GuessLikePresenter> implements d {
    private XTextView c;
    private VuiRecyclerViewWithLoading d;
    private List<RdAlbumBean> e;
    private a f;
    private XTextView g;
    private XImageView h;
    private XTextView i;
    private final int j;
    private final int k;

    public GuessLikeLayout(Context context) {
        super(context);
        this.j = 1;
        this.k = 2;
    }

    public GuessLikeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 1;
        this.k = 2;
    }

    public GuessLikeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 1;
        this.k = 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    /* renamed from: e */
    public GuessLikePresenter a() {
        return new GuessLikePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void b() {
        this.c = (XTextView) findViewById(b.d.feel_lucky);
        this.d = (VuiRecyclerViewWithLoading) findViewById(b.d.guess_list);
        this.g = (XTextView) findViewById(b.d.guess_title);
        this.h = (XImageView) findViewById(b.d.small_back);
        this.i = (XTextView) findViewById(b.d.copy_right);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void c() {
        this.e = new ArrayList();
        this.d.setLayoutManager(new GridLayoutManager(getContext(), 2));
        h hVar = new h(2, 20, false);
        hVar.a(40);
        this.d.addItemDecoration(hVar);
        this.d.getRecycledViewPool().a(0, 6);
        this.d.setHasFixedSize(true);
        this.f = new a(getContext(), b.e.item_guess_like);
        this.d.setAdapter(this.f);
        this.d.setOnTipsViewClick(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.GuessLikeLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((GuessLikePresenter) GuessLikeLayout.this.b).d();
                u.c(new ago.e(2));
            }
        });
        this.d.initVuiAttr("MainProgramEditorChoice", VuiEngine.getInstance(getContext()), false, true);
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.g);
        com.xiaopeng.musicradio.vui.c.a((VuiView) findViewById(b.d.guess_like_root), "" + this.g.getId());
        com.xiaopeng.musicradio.vui.c.a(this.g);
        com.xiaopeng.musicradio.vui.c.a(this.c);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.GuessLikeLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                axe.c().a(true);
                axt.d();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.GuessLikeLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(b.d.guess_title)) {
                    ((GuessLikePresenter) GuessLikeLayout.this.b).c();
                    axt.c();
                }
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.GuessLikeLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(b.d.guess_title)) {
                    ((GuessLikePresenter) GuessLikeLayout.this.b).c();
                }
            }
        });
        this.f.a(new aep.c() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.GuessLikeLayout.5
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                if (ShakeUtil.canExecute(b.e.item_rank_album)) {
                    if (i != 1) {
                        if (i == 2) {
                            ((GuessLikePresenter) GuessLikeLayout.this.b).b((RdAlbumBean) GuessLikeLayout.this.e.get(i2));
                            axt.e();
                            return;
                        }
                        return;
                    }
                    sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a((RdAlbumBean) GuessLikeLayout.this.e.get(i2)))).navigation();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        this.c.setCompoundDrawableTintList(ColorStateList.valueOf(getContext().getColor(b.a.x_theme_text_01)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XLinearLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.setCompoundDrawableTintList(ColorStateList.valueOf(getContext().getColor(b.a.x_theme_text_01)));
        this.f.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public int getContentViewId() {
        return b.e.layout_guess_like;
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void a(List<RdAlbumBean> list) {
        this.d.setTipsState(0);
        this.e.clear();
        this.e.addAll(list);
        this.f.d();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void a(long j, int i) {
        this.f.a(j, i);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void ah_() {
        this.f.d();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public void a(boolean z, boolean z2) {
        if (z) {
            if (this.d.getChildCount() == 0) {
                this.d.setTipsState(1);
                this.h.setVisibility(4);
                this.c.setVisibility(4);
                this.g.setVisibility(4);
            }
        } else if (!z2) {
            a aVar = this.f;
            if (aVar == null || aVar.a() != 0) {
                return;
            }
            this.d.setTipsState(2);
            this.h.setVisibility(4);
            this.c.setVisibility(4);
            this.g.setVisibility(4);
        } else {
            this.d.setTipsState(0);
            this.h.setVisibility(0);
            this.c.setVisibility(0);
            this.g.setVisibility(0);
        }
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.d
    public boolean ai_() {
        List<RdAlbumBean> list = this.e;
        return (list == null || list.size() == 0 || this.e.size() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends aep<C0161a> {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: c */
        public C0161a a(ViewGroup viewGroup, int i) {
            return new C0161a(h());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void a(C0161a c0161a, int i) {
            boolean z;
            RdAlbumBean rdAlbumBean = (RdAlbumBean) GuessLikeLayout.this.e.get(i);
            c0161a.a(i, rdAlbumBean.getBestSizeLogo(), rdAlbumBean.getTitle(), rdAlbumBean.getShortIntro(), rdAlbumBean.getPlayCount());
            if (((GuessLikePresenter) GuessLikeLayout.this.b).b(rdAlbumBean.getId())) {
                c0161a.t.setPlayState(2);
                z = true;
            } else {
                c0161a.t.setPlayState(3);
                z = false;
            }
            c0161a.z.a(i);
            c0161a.A.a(i);
            if (rdAlbumBean.getPaymentType() != 0) {
                if (rdAlbumBean.getPaymentType() != 1) {
                    if (rdAlbumBean.getPaymentType() == 2) {
                        c0161a.B.setImageResource(b.c.ic_xmly_cover_label_payment);
                    } else {
                        c0161a.B.setImageDrawable(null);
                    }
                } else {
                    c0161a.B.setImageResource(b.c.ic_xmly_cover_label_vip);
                }
            } else {
                c0161a.B.setImageDrawable(null);
            }
            VuiView vuiView = (VuiView) c0161a.a;
            int i2 = i + 1;
            vuiView.setVuiPosition(i2);
            VuiEngine.getInstance(GuessLikeLayout.this.getContext()).setVuiElementTag(c0161a.a, "guess_like_layout_item_" + i);
            vuiView.setVuiLabel(String.format(GuessLikeLayout.this.getResources().getString(b.f.vui_play_position), com.xiaopeng.musicradio.vui.c.a(rdAlbumBean.getTitle()), Integer.valueOf(i2), Integer.valueOf(i2)));
            vuiView.setVuiAction(big.CLICK.a());
            com.xiaopeng.musicradio.vui.c.a(GuessLikeLayout.this.getContext(), c0161a.t, z);
            c0161a.t.setVuiPosition(i2);
            c0161a.t.setVuiElementId(c0161a.t.getId() + "_" + i2);
            c0161a.w.setCompoundDrawableTintList(ColorStateList.valueOf(GuessLikeLayout.this.getContext().getColor(b.a.x_theme_text_03)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int a() {
            return GuessLikeLayout.this.e.size();
        }

        public void a(long j, int i) {
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.xiaopeng.musicradio.program.choice.view.guesslike.GuessLikeLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0161a extends RecyclerView.v {
            private aep<C0161a>.e A;
            private XImageView B;
            private MusicCircleImageView s;
            private PlayControlView t;
            private XTextView u;
            private XTextView v;
            private XTextView w;
            private XTextView x;
            private XFrameLayout y;
            private aep<C0161a>.e z;

            public C0161a(View view) {
                super(view);
                this.s = (MusicCircleImageView) view.findViewById(b.d.album_logo);
                this.t = (PlayControlView) view.findViewById(b.d.play_state);
                this.u = (XTextView) view.findViewById(b.d.title);
                this.v = (XTextView) view.findViewById(b.d.desc);
                this.w = (XTextView) view.findViewById(b.d.play_count);
                this.x = (XTextView) view.findViewById(b.d.tv_speech_num);
                this.y = (XFrameLayout) view.findViewById(b.d.layout_root);
                this.A = new aep.e();
                this.A.b(1);
                this.z = new aep.e();
                this.z.b(2);
                this.B = (XImageView) view.findViewById(b.d.top_right_label);
                view.setOnClickListener(this.A);
                this.t.setOnClickListener(this.z);
            }

            public void a(int i, String str, String str2, String str3, double d) {
                this.w.setText(av.a(GuessLikeLayout.this.getContext(), d));
                this.u.setText(str2);
                if (!TextUtils.isEmpty(str3)) {
                    this.v.setText(str3);
                } else {
                    this.v.setText(b.f.detail_no_desc);
                }
                y.c(GuessLikeLayout.this.getContext(), str, b.c.pic_program_default_220, this.s);
                this.x.setText(String.valueOf(i + 1));
                this.x.setVisibility(com.xiaopeng.musicradio.model.dui.h.a().b() ? 0 : 8);
            }
        }
    }
}
