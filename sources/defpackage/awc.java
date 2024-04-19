package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.xiaopeng.musicradio.commonui.widget.MusicalNoteTextureView;
import com.xiaopeng.musicradio.playercomponent.small.presenter.SmallPlayerPresenter;
import com.xiaopeng.musicradio.utils.aa;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.SmallLoadingView;
import com.xiaopeng.musicradio.widget.b;
import com.xiaopeng.xui.widget.XCircularProgressBar;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.avp;
/* compiled from: SmallPlayerServiceWindow.java */
/* renamed from: awc  reason: default package */
/* loaded from: classes2.dex */
public class awc extends b<SmallPlayerPresenter> implements avz {
    private MusicCircleImageView e;
    private MusicalNoteTextureView f;
    private XCircularProgressBar g;
    private SmallLoadingView h;
    private View i;
    private FrameLayout j;
    private XTextView k;
    private XTextView l;
    private XImageView m;
    private View n;
    private XImageView o;
    private XImageView p;
    private XTextView q;
    private FrameLayout r;
    private SparseArray<View> s;
    private int t;

    public awc(Context context) {
        super(context);
        this.s = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.b
    public void a(WindowManager.LayoutParams layoutParams) {
        super.a(layoutParams);
        layoutParams.width = -1;
        layoutParams.height = 150;
        layoutParams.gravity = 3;
        layoutParams.x = 0;
        layoutParams.y = 707;
    }

    @Override // com.xiaopeng.musicradio.widget.b
    protected View a(Context context) {
        return LayoutInflater.from(context).inflate(avp.c.layout_small_player, (ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.b
    /* renamed from: a */
    public SmallPlayerPresenter d() {
        return new SmallPlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.widget.b
    protected void a(View view) {
        a(false);
        this.e = (MusicCircleImageView) view.findViewById(avp.b.img_album);
        this.f = (MusicalNoteTextureView) view.findViewById(avp.b.iv_play_list_state);
        this.g = (XCircularProgressBar) view.findViewById(avp.b.progress_bar);
        this.h = (SmallLoadingView) view.findViewById(avp.b.img_loading);
        this.i = view.findViewById(avp.b.layout_root);
        this.p = (XImageView) view.findViewById(avp.b.view_bg);
        this.j = (FrameLayout) view.findViewById(avp.b.layout_sub);
        this.k = (XTextView) view.findViewById(avp.b.tv_title);
        this.l = (XTextView) view.findViewById(avp.b.tv_sub_title);
        this.n = view.findViewById(avp.b.view_touch);
        this.q = (XTextView) view.findViewById(avp.b.tv_default);
        this.r = (FrameLayout) view.findViewById(avp.b.layout_play);
        this.m = (XImageView) view.findViewById(avp.b.img_love);
        this.m.setEnabled(false);
        this.m.setClickable(false);
        this.o = (XImageView) view.findViewById(avp.b.img_ctrl);
        this.r.setOnClickListener(new View.OnClickListener() { // from class: awc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ((SmallPlayerPresenter) awc.this.d).g();
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: awc.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                awd.a();
                sp.a().a("/player/player").navigation();
                Log.i("SmallPlayerServiceWindo", "onClick: ==========");
            }
        });
        aa.a(avp.a.bg_miniplayer, (ImageView) this.p);
        aa.a(avp.a.img_small_player_bg, this.i);
    }

    @Override // com.xiaopeng.musicradio.widget.b
    public void c() {
        super.c();
        if (this.i != null) {
            aa.a(avp.a.img_small_player_bg, this.i);
            aa.a(avp.a.bg_miniplayer, (ImageView) this.p);
        }
    }

    @Override // defpackage.awb
    public void a(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    @Override // defpackage.awb
    public void a(int i, int i2, int i3) {
        this.g.setProgress(i);
        this.g.setMax(i2);
    }

    @Override // defpackage.awb
    public void a(int i) {
        this.t = i;
        this.o.setAlpha(1.0f);
        if (i != -1 && i != 5) {
            switch (i) {
                case 1:
                    this.f.setVisibility(8);
                    this.h.a();
                    this.o.setImageResource(avp.a.ic_40_stop);
                    return;
                case 2:
                    this.h.b();
                    this.f.setVisibility(0);
                    this.o.setImageResource(avp.a.ic_40_stop);
                    return;
                case 3:
                    break;
                default:
                    return;
            }
        }
        this.h.b();
        this.f.setVisibility(8);
        this.o.setImageResource(avp.a.ic_40_play);
    }

    @Override // defpackage.awb
    public void b() {
        this.f.setVisibility(8);
        this.h.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.widget.b, defpackage.awb
    public void a(boolean z) {
        super.a(z);
        Log.i("SmallPlayerServiceWindo", "setVisible: ==== " + z + " view = " + this);
    }

    @Override // defpackage.avz
    public void b(String str, String str2) {
        this.k.setText(Html.fromHtml(str, new a(), null));
        this.l.setText(str2);
        this.q.setVisibility(8);
    }

    @Override // defpackage.avz
    public void b(int i) {
        if (this.s.get(i) == null) {
            awa a2 = avy.a().a(i);
            Log.i("SmallPlayerServiceWindo", "refreshType: ====== " + a2);
            if (a2 != null) {
                View a3 = a2.a(this.a);
                if (a3 != null) {
                    this.s.put(i, a3);
                    this.j.addView(a3);
                    this.m.setVisibility(8);
                } else {
                    this.m.setVisibility(0);
                }
            } else {
                this.m.setVisibility(0);
            }
        } else {
            this.m.setVisibility(8);
        }
        awa a4 = avy.a().a(i);
        if (a4 != null) {
            this.l.setVisibility(a4.b() ? 0 : 8);
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            int keyAt = this.s.keyAt(i2);
            View view = this.s.get(keyAt);
            Log.i("SmallPlayerServiceWindo", "refreshType:" + keyAt + " type = " + i);
            if (view != null) {
                view.setVisibility(keyAt == i ? 0 : 8);
            }
        }
    }

    @Override // defpackage.avz
    public void i() {
        this.q.setVisibility(0);
        this.k.setText("");
        this.l.setText("");
        this.m.setAlpha(0.16f);
        this.o.setAlpha(0.16f);
        b(-1);
        this.t = 0;
    }

    /* compiled from: SmallPlayerServiceWindow.java */
    /* renamed from: awc$a */
    /* loaded from: classes2.dex */
    private class a implements Html.ImageGetter {
        private a() {
        }

        @Override // android.text.Html.ImageGetter
        public Drawable getDrawable(String str) {
            Drawable drawable = null;
            try {
                drawable = com.xiaopeng.musicradio.a.a.getResources().getDrawable(Integer.parseInt(str));
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                return drawable;
            } catch (Resources.NotFoundException e) {
                Log.e("SmallPlayerServiceWindo", "Image not found. Check the ID.", e);
                return drawable;
            } catch (NumberFormatException e2) {
                Log.e("SmallPlayerServiceWindo", "Source string not a valid resource ID.", e2);
                return drawable;
            }
        }
    }

    @Override // defpackage.awb
    public void h() {
        int i = this.t;
        if (i != 0) {
            a(i);
        }
    }
}
