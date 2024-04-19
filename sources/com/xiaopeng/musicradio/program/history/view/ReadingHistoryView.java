package com.xiaopeng.musicradio.program.history.view;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.q;
import com.irdeto.securesdk.core.SSUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.history.presenter.ReadHistoryPresenter;
import com.xiaopeng.musicradio.utils.ac;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.o;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.DialogLeftLayout;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.lifecycle.a;
import com.xiaopeng.musicradio.widget.lifecycle.f;
import com.xiaopeng.musicradio.widget.recyclerview.VuiRecyclerViewWithLoading;
import com.xiaopeng.musicradio.widget.recyclerview.g;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import java.util.List;
/* loaded from: classes2.dex */
public class ReadingHistoryView extends VuiBaseFrameLayout<com.xiaopeng.musicradio.program.history.view.a, ReadHistoryPresenter> implements com.xiaopeng.musicradio.program.history.view.a, a.InterfaceC0182a {
    private VuiRecyclerViewWithLoading c;
    private a d;
    private DialogTopLayout e;
    private f f;
    private DialogLeftLayout g;
    private boolean h;
    private String i;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    public ReadingHistoryView(Context context) {
        super(context);
        this.h = true;
        this.i = "SubProgramHistoryList";
    }

    public ReadingHistoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = true;
        this.i = "SubProgramHistoryList";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends com.xiaopeng.musicradio.widget.recyclerview.c<ReadHistoryInfo, C0163a> {
        private boolean e;

        private a() {
            this.e = false;
        }

        public void b(boolean z) {
            this.e = z;
            d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.xiaopeng.musicradio.program.history.view.ReadingHistoryView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0163a extends g {
            XTextView A;
            XImageView B;
            XImageView C;
            MusicCircleImageView r;
            XTextView s;
            XTextView t;
            XTextView u;
            XImageView v;
            XImageView w;
            XConstraintLayout x;
            View y;
            XImageView z;

            @Override // com.xiaopeng.musicradio.widget.recyclerview.g
            protected void D() {
            }

            public C0163a(View view) {
                super(view);
                this.r = (MusicCircleImageView) c(b.d.iv_pic);
                this.s = (XTextView) c(b.d.tv_title);
                this.t = (XTextView) c(b.d.tv_sub_title);
                this.u = (XTextView) c(b.d.tv_read_percent);
                this.v = (XImageView) c(b.d.iv_delete);
                this.w = (XImageView) c(b.d.btn_love);
                this.x = (XConstraintLayout) c(b.d.content_layout);
                this.y = c(b.d.item_layout);
                this.z = (XImageView) c(b.d.iv_icon_arrow);
                this.A = (XTextView) c(b.d.btn_reading_history_oder);
                this.B = (XImageView) c(b.d.tv_index_bg);
                this.C = (XImageView) c(b.d.label_type_iv);
            }
        }

        @Override // com.xiaopeng.musicradio.widget.recyclerview.c
        /* renamed from: c */
        public C0163a d(ViewGroup viewGroup, int i) {
            return new C0163a(LayoutInflater.from(ReadingHistoryView.this.getContext()).inflate(b.e.item_reading_history, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void a(C0163a c0163a, final int i) {
            ac.a(c0163a.v, c0163a.v);
            ac.a(c0163a.w, c0163a.w);
            XTextView xTextView = c0163a.A;
            StringBuilder sb = new StringBuilder();
            int i2 = i + 1;
            sb.append(i2);
            sb.append("");
            xTextView.setText(sb.toString());
            final ReadHistoryInfo readHistoryInfo = (ReadHistoryInfo) this.b.get(i);
            if (readHistoryInfo == null) {
                return;
            }
            c0163a.x.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.history.view.ReadingHistoryView.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ShakeUtil.canExecute(b.e.item_reading_history)) {
                        RdAlbumBean a = aq.a(readHistoryInfo);
                        ReadHistoryInfo readHistoryInfo2 = readHistoryInfo;
                        if (readHistoryInfo2 != null) {
                            if (readHistoryInfo2.getCardId() > 0) {
                                a.setFromSource("near");
                                sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(a)) + "&card_id=" + readHistoryInfo.getCardId()).navigation();
                            } else if (readHistoryInfo.getPlayCount() > 0 && a != null) {
                                a.setFromSource("near");
                                sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(a))).navigation();
                            } else {
                                sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_id=" + readHistoryInfo.getAlbumId() + "&track_id=" + readHistoryInfo.getTrackId() + "&" + SSUtils.O000OO00 + "=" + readHistoryInfo.getChannelId()).navigation();
                            }
                            ReadingHistoryView.this.e.setEditMode(false);
                            a.this.b(false);
                        }
                        bci.d();
                    }
                }
            });
            c0163a.x.setVuiLabel(String.format(ReadingHistoryView.this.getContext().getString(b.f.vui_play_position), com.xiaopeng.musicradio.vui.c.a(readHistoryInfo.getAlbumName()), Integer.valueOf(i2), Integer.valueOf(i2)));
            c0163a.x.setVuiAction(big.CLICK.a());
            VuiEngine.getInstance(c0163a.x.getContext()).setExecuteVirtualTag(c0163a.x);
            c0163a.s.setText(readHistoryInfo.getAlbumName());
            if (readHistoryInfo.getCardId() > 0) {
                c0163a.w.setImageAlpha(41);
                c0163a.w.setEnabled(false);
            } else {
                c0163a.w.setImageAlpha(255);
                c0163a.w.setEnabled(true);
            }
            c0163a.w.setVuiPosition(i);
            XImageView xImageView = c0163a.w;
            xImageView.setVuiElementId(c0163a.w.getId() + "_" + i);
            c0163a.w.setSelected(axj.a().c(readHistoryInfo.getAlbumId()));
            c0163a.w.setVuiLabel(String.format(ReadingHistoryView.this.getContext().getString(b.f.vui_love_position), "收藏", Integer.valueOf(i2), Integer.valueOf(i2)));
            c0163a.t.setText(String.format(ReadingHistoryView.this.getContext().getString(b.f.history_desc), readHistoryInfo.getTrackTitle().trim()));
            if (readHistoryInfo.getTrackPaymentType() == 0) {
                c0163a.C.setVisibility(8);
            } else if (readHistoryInfo.getTrackPaymentType() == 1) {
                c0163a.C.setVisibility(0);
                c0163a.C.setImageResource(b.c.ic_label_vip_ximalaya);
            } else if (readHistoryInfo.getTrackPaymentType() == 2) {
                c0163a.C.setVisibility(0);
                if (readHistoryInfo.isTrackAuthorized() && aqh.a().e()) {
                    c0163a.C.setImageResource(b.c.ic_label_paid_ximalaya);
                } else {
                    c0163a.C.setImageResource(b.c.ic_label_payment_ximalaya);
                }
            } else {
                c0163a.C.setVisibility(8);
            }
            c0163a.u.setText(ReadingHistoryView.this.getContext().getString(b.f.history_percentage, readHistoryInfo.getPlayingPercent()));
            String logo = readHistoryInfo.getLogo();
            if (TextUtils.isEmpty(logo)) {
                logo = readHistoryInfo.getLargeLogo();
            }
            if (TextUtils.isEmpty(logo)) {
                logo = readHistoryInfo.getMediumLogo();
            }
            y.d(ReadingHistoryView.this.getContext(), logo, b.c.pic_program_default_220, c0163a.r);
            c0163a.w.setVisibility(this.e ? 8 : 0);
            c0163a.v.setVuiPosition(i);
            XImageView xImageView2 = c0163a.v;
            xImageView2.setVuiElementId(c0163a.v.getId() + "_" + i);
            c0163a.v.setVuiLabel(String.format(ReadingHistoryView.this.getContext().getString(b.f.vui_delete_position), "删除", Integer.valueOf(i2), Integer.valueOf(i2)));
            c0163a.v.setVisibility(this.e ? 0 : 8);
            c0163a.v.setOnClickListener(this.e ? new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.history.view.ReadingHistoryView.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (a.this.b == null || a.this.b.size() <= i) {
                        return;
                    }
                    ((ReadHistoryPresenter) ReadingHistoryView.this.b).a((ReadHistoryInfo) a.this.b.get(i), i);
                }
            } : null);
            c0163a.B.setVisibility(h.a().b() ? 0 : 8);
            c0163a.w.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.history.view.ReadingHistoryView.a.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (a.this.b == null || a.this.b.size() <= i) {
                        return;
                    }
                    ((ReadHistoryPresenter) ReadingHistoryView.this.b).a((ReadHistoryInfo) a.this.b.get(i));
                }
            });
            c0163a.x.setVuiPosition(i);
            XConstraintLayout xConstraintLayout = c0163a.x;
            xConstraintLayout.setVuiElementId(c0163a.x.getId() + "_" + i);
            c0163a.z.setImageTintList(ReadingHistoryView.this.getResources().getColorStateList(b.a.x_theme_text_01));
            c0163a.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public ReadHistoryPresenter a() {
        return new ReadHistoryPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.d();
        this.e.applyTheme();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.dialog_reading_history;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.e = (DialogTopLayout) findViewById(b.d.dialog_top_layout);
        this.c = (VuiRecyclerViewWithLoading) findViewById(b.d.rv_reading_history);
        this.d = new a();
        this.g = (DialogLeftLayout) findViewById(b.d.dialog_left);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.g.setVisibility(8);
        this.g.getPlayAllLayout().setVisibility(8);
        int i = w.d() ? 8 : 12;
        this.c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.c.addItemDecoration(new j(o.a(getContext(), i), o.a(getContext(), 80.0f)));
        this.c.setAdapter(this.d);
        this.e.setTitle(getResources().getString(b.f.reading_play_record));
        this.e.setOnEditModeChange(new DialogTopLayout.a() { // from class: com.xiaopeng.musicradio.program.history.view.ReadingHistoryView.1
            @Override // com.xiaopeng.musicradio.widget.DialogTopLayout.a
            public void a(boolean z) {
                if (ReadingHistoryView.this.d != null) {
                    ReadingHistoryView.this.d.b(z);
                }
            }
        });
        this.c.initVuiAttr(this.i, VuiEngine.getInstance(getContext()), true, true, true);
        this.c.enableVuiInvisibleFeature(1);
        if (this.c.getItemAnimator() != null) {
            ((q) this.c.getItemAnimator()).a(false);
        }
        this.e.setSceneId(this.i);
        this.g.getLeftImg().setImageResource(b.c.pic_read_record_cover_240);
    }

    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void a(List<ReadHistoryInfo> list) {
        if (list.size() == 0) {
            this.c.setTipsState(3);
        } else {
            this.c.setTipsState(0);
        }
        this.d.a(list);
        if (w.b()) {
            this.g.setVisibility(list.size() > 0 ? 0 : 8);
            this.e.a(list.size() > 0);
        }
    }

    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void a(int i) {
        this.d.c(i);
    }

    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void aj_() {
        this.d.d();
    }

    @Override // com.xiaopeng.musicradio.program.history.view.a
    public void ak_() {
        VuiRecyclerViewWithLoading vuiRecyclerViewWithLoading = this.c;
        if (vuiRecyclerViewWithLoading != null) {
            vuiRecyclerViewWithLoading.setTipsState(1);
        }
    }

    public void setIDialogView(f fVar) {
        this.f = fVar;
    }

    public void h() {
        this.e.c();
        a aVar = this.d;
        if (aVar != null) {
            aVar.b(false);
        }
    }

    public DialogTopLayout getDialogTopLayout() {
        return this.e;
    }
}
