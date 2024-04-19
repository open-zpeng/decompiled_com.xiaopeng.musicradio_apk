package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.List;
/* compiled from: MsRankAdapter.java */
/* renamed from: atk  reason: default package */
/* loaded from: classes2.dex */
public class atk extends aes<MusicRadioItem, RecyclerView.v> {
    private int f;
    private int g;
    private StringBuffer h;
    private boolean i;

    @Override // defpackage.aep
    protected int f() {
        return 6;
    }

    public atk(Context context) {
        super(context, b.e.music_item_rank);
        this.f = -1;
        this.g = 1;
        this.i = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i, List list) {
        if (list.isEmpty()) {
            a(vVar, i);
        } else if (list.size() <= 0 || g(i) == null) {
        } else {
            if (list.contains("payload_playstate")) {
                a(g(i), i, (a) vVar);
            }
            if (list.contains("payload")) {
                a aVar = (a) vVar;
                aVar.D.setVisibility(h.a().b() ? 0 : 8);
                b(g(i), aVar);
            }
            if (list.contains("payload_song_name")) {
                a(g(i), (a) vVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        a aVar = (a) vVar;
        MusicRadioItem g = g(i);
        if (g != null) {
            aVar.w.setText(g.getRankName());
            aVar.E.a(i);
            aVar.E.b(0);
            aVar.F.a(i);
            aVar.F.b(1);
            a(g, aVar);
            b(g, aVar);
            a(g, i, aVar);
            aVar.D.setText(String.valueOf(this.g + i));
            aVar.D.setVisibility(h.a().b() ? 0 : 8);
        }
    }

    private void a(MusicRadioItem musicRadioItem, a aVar) {
        List<MusicRadioItem.SongInfo> a2 = atj.a().a(musicRadioItem.getId());
        if (a2 == null) {
            a2 = musicRadioItem.getSongInfos();
        }
        if (a2 != null) {
            if (a2.size() < 3) {
                if (a2.size() != 2) {
                    if (a2.size() == 1) {
                        aVar.x.setText(a(a2.get(0).getSongName()));
                        return;
                    }
                    return;
                }
                aVar.x.setText(a(a2.get(0).getSongName()));
                aVar.y.setText(a(a2.get(1).getSongName()));
                return;
            }
            aVar.x.setText(a(a2.get(0).getSongName()));
            aVar.y.setText(a(a2.get(1).getSongName()));
            aVar.z.setText(a(a2.get(2).getSongName()));
        }
    }

    private void b(MusicRadioItem musicRadioItem, a aVar) {
        String b = atj.a().b(musicRadioItem.getId());
        if (TextUtils.isEmpty(b)) {
            b = musicRadioItem.getImgUrl();
        }
        y.b(aVar.t.getContext(), b, b.c.pic_covers_music_220, aVar.t);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.xiaopeng.musicradio.bean.db.MusicRadioItem r8, int r9, defpackage.atk.a r10) {
        /*
            r7 = this;
            long r0 = r8.getId()
            aei r2 = defpackage.aei.a()
            int r2 = r2.c()
            apk r3 = defpackage.apk.i()
            java.lang.String r3 = r3.x()
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L44
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "listsign_rank_music"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "\"collectId\":"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L44
            r0 = r4
            goto L45
        L44:
            r0 = r5
        L45:
            if (r0 == 0) goto L60
            r7.f = r9
            apk r0 = defpackage.apk.i()
            int r0 = r0.getPlayState()
            r8.setPlayState(r0)
            switch(r0) {
                case 1: goto L5c;
                case 2: goto L5b;
                case 3: goto L5c;
                default: goto L57;
            }
        L57:
            r7.a(r5, r10)
            goto L67
        L5b:
            r5 = r4
        L5c:
            r7.a(r0, r10)
            goto L67
        L60:
            r0 = -1
            r8.setPlayState(r0)
            r7.a(r5, r10)
        L67:
            r7.a(r9, r10, r8, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atk.a(com.xiaopeng.musicradio.bean.db.MusicRadioItem, int, atk$a):void");
    }

    private void a(int i, a aVar, MusicRadioItem musicRadioItem, boolean z) {
        if (this.h == null) {
            this.h = new StringBuffer();
        }
        this.h.setLength(0);
        List<MusicRadioItem.SongInfo> songInfos = musicRadioItem.getSongInfos();
        if (songInfos.size() >= 2) {
            StringBuffer stringBuffer = this.h;
            stringBuffer.append(musicRadioItem.getRankName());
            stringBuffer.append("|");
            stringBuffer.append(a(musicRadioItem.getSongInfos().get(0).getSongName()));
            stringBuffer.append("|");
            stringBuffer.append(a(musicRadioItem.getSongInfos().get(1).getSongName()));
        } else if (songInfos.size() == 1) {
            StringBuffer stringBuffer2 = this.h;
            stringBuffer2.append(musicRadioItem.getRankName());
            stringBuffer2.append("|");
            stringBuffer2.append(a(musicRadioItem.getSongInfos().get(0).getSongName()));
        }
        aVar.C.setVuiLabel(String.format(aVar.D.getContext().getResources().getString(b.f.vui_play_position), this.h.toString(), Integer.valueOf(this.g + i), Integer.valueOf(this.g + i)));
        aVar.C.setVuiPosition(i);
        XFrameLayout xFrameLayout = aVar.C;
        xFrameLayout.setVuiElementId(aVar.C.getId() + "_" + i);
        aVar.B.setVuiPosition(i);
        aVar.B.setVuiElementType(bih.BUTTON);
        XFrameLayout xFrameLayout2 = aVar.B;
        xFrameLayout2.setVuiElementId(aVar.B.getId() + "_" + i);
        aVar.v.setVuiPosition(i);
        XFrameLayout xFrameLayout3 = aVar.v;
        xFrameLayout3.setVuiElementId(aVar.v.getId() + "_" + i);
        c.a(aVar.v.getContext(), aVar.v, z);
        XFrameLayout xFrameLayout4 = aVar.C;
        c.a(xFrameLayout4, aVar.B.getId() + "_" + i);
    }

    private void a(int i, a aVar) {
        boolean z;
        switch (i) {
            case 1:
                aVar.u.setImageResource(b.c.ic_btn_stop);
                z = false;
                break;
            case 2:
                z = true;
                aVar.u.setImageResource(b.c.ic_btn_stop);
                break;
            case 3:
                aVar.u.setImageResource(b.c.ic_btn_playall);
                z = false;
                break;
            default:
                aVar.u.setImageResource(b.c.ic_btn_playall);
                z = false;
                break;
        }
        if (this.i != z) {
            c.a(aVar.v.getContext(), aVar.v, z);
            VuiEngine.getInstance(aVar.v.getContext()).updateScene("MusicRank", aVar.v);
            this.i = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MsRankAdapter.java */
    /* renamed from: atk$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private XFrameLayout A;
        private XFrameLayout B;
        private XFrameLayout C;
        private XTextView D;
        private aep<RecyclerView.v>.e E;
        private aep<RecyclerView.v>.e F;
        private MusicCircleImageView s;
        private MusicCircleImageView t;
        private XImageView u;
        private XFrameLayout v;
        private XTextView w;
        private XTextView x;
        private XTextView y;
        private XTextView z;

        a(View view) {
            super(view);
            this.s = (MusicCircleImageView) this.a.findViewById(b.d.item_logo_bg);
            this.t = (MusicCircleImageView) this.a.findViewById(b.d.item_logo);
            this.u = (XImageView) this.a.findViewById(b.d.play_icon);
            this.v = (XFrameLayout) this.a.findViewById(b.d.play_item_layout);
            this.w = (XTextView) this.a.findViewById(b.d.rank_title);
            this.x = (XTextView) this.a.findViewById(b.d.song_one);
            this.y = (XTextView) this.a.findViewById(b.d.song_tow);
            this.z = (XTextView) this.a.findViewById(b.d.song_three);
            this.A = (XFrameLayout) this.a.findViewById(b.d.img_play_layout);
            this.B = (XFrameLayout) this.a.findViewById(b.d.root_play_layout);
            this.C = (XFrameLayout) this.a.findViewById(b.d.rank_root);
            this.D = (XTextView) this.a.findViewById(b.d.tv_speech_num);
            this.E = new aep.e();
            this.F = new aep.e();
            this.v.setOnClickListener(this.E);
            this.A.setOnClickListener(this.F);
            this.B.setOnClickListener(this.F);
        }
    }

    public int l() {
        return this.f;
    }

    public List<MusicRadioItem> o() {
        return n();
    }

    private String a(String str) {
        if (str.contains(" - ")) {
            String[] split = str.split(" - ");
            if (split.length > 1) {
                return split[1];
            }
        }
        return c.a(str);
    }
}
