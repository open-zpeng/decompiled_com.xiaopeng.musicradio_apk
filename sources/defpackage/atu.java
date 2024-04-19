package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import com.xiaopeng.musicradio.bean.xpbean.MusicArtistBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.mvpbase.b;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import java.util.List;
/* compiled from: SeleteSingerDlg.java */
/* renamed from: atu  reason: default package */
/* loaded from: classes2.dex */
public class atu extends b<att, ats> implements View.OnClickListener, att {
    private Context a;
    private View b;
    private BaseRecycleView l;
    private atr m;
    private GridLayoutManager n;
    private LoadingTipsView o;
    private String p;

    public atu(Context context, String str) {
        super(context, f.i.NewBaseDialog, true);
        this.c = "MusicSongSingerDialog";
        this.p = str;
        this.a = context;
        c();
        d();
        e();
        Window window = getWindow();
        if (window != null) {
            window.setType(2038);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.height = -2;
                attributes.width = -2;
                attributes.gravity = 17;
            }
        }
        ((ats) this.d).a(this.p);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    /* renamed from: h */
    public ats f() {
        return new ats();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected int b() {
        return b.e.dialog_selete_singer_layout;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void c() {
        this.b = findViewById(b.d.btn_close);
        this.l = (BaseRecycleView) findViewById(b.d.hot_recycleview);
        this.o = (LoadingTipsView) findViewById(b.d.loading_item);
        LoadingTipsView loadingTipsView = this.o;
        if (loadingTipsView != null) {
            loadingTipsView.setAutoClickLoadingEnable(false);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void d() {
        this.m = new atr(getContext());
        this.l.setItemAnimator(new e());
        ((q) this.l.getItemAnimator()).a(false);
        this.l.setAdapter(this.m);
        this.l.initVuiAttr("MusicSongSinger", VuiEngine.getInstance(getContext()), true, true, true);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void e() {
        this.b.setOnClickListener(this);
        this.m.a(new aep.c() { // from class: atu.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                MusicArtistBean g = atu.this.m.g(i2);
                if (g != null && i == 1) {
                    atv.j();
                    sp.a().a("/music/activity/fav_singer_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", g.getId()).withString("detail_LOGO", g.getLogo()).withString("detail_title", g.getName()).navigation();
                    atu.this.dismiss();
                }
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: atu.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (atu.this.o.getState() == 2) {
                    ((ats) atu.this.d).a(atu.this.p);
                }
            }
        });
    }

    @Override // defpackage.att
    public void a() {
        this.l.setVisibility(8);
        a(1);
    }

    @Override // defpackage.att
    public void a(String str) {
        this.l.setVisibility(8);
        a(2);
    }

    @Override // defpackage.att
    public void a(List<MusicArtistBean> list) {
        this.m.a((List) list, true);
        a(0);
        int i = 2;
        if (list.size() == 1) {
            i = 1;
        } else if (list.size() != 2) {
            i = 3;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        if (list.size() > 3) {
            layoutParams.topMargin = Opcodes.IF_ICMPNE;
        } else {
            layoutParams.topMargin = IRadioController.TEF663x_PCHANNEL;
        }
        this.l.setLayoutParams(layoutParams);
        this.n = new GridLayoutManager(getContext(), i);
        this.l.setLayoutManager(this.n);
        this.l.setHasFixedSize(true);
        this.l.setVisibility(0);
    }

    @Override // defpackage.att
    public void g() {
        if (isShowing()) {
            dismiss();
        }
    }

    private void a(int i) {
        this.o.setState(i);
        if (i == 1) {
            this.o.setClickable(false);
        } else {
            this.o.setClickable(true);
        }
    }
}
