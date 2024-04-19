package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.tone.view.FavSingleSongQualityLayout;
import com.xiaopeng.musicradio.music.tone.view.a;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import com.xiaopeng.musicradio.widget.mvpbase.b;
import com.xiaopeng.xui.widget.XImageButton;
/* compiled from: SongQualityChooseDialog.java */
/* renamed from: atw  reason: default package */
/* loaded from: classes2.dex */
public class atw extends b {
    public MusicInfo a;
    public FavSingleSongQualityLayout b;
    private RelativeLayout l;
    private XImageButton m;

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void d() {
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected e f() {
        return null;
    }

    public atw(Context context) {
        super(context, b.g.NewBaseDialog);
        a();
    }

    protected void a() {
        this.c = "PlayerQualityDialog";
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = 900;
            attributes.height = 666;
            attributes.gravity = 17;
            window.setAttributes(attributes);
            window.setType(2038);
        }
        c();
        e();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected int b() {
        return b.e.layout_song_quality_choose_dialog;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void c() {
        this.b = (FavSingleSongQualityLayout) this.h.findViewById(b.d.layout_single_song_quality);
        this.l = (RelativeLayout) this.h.findViewById(b.d.root_layout);
        this.m = (XImageButton) this.h.findViewById(b.d.close);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void e() {
        this.m.setOnClickListener(new View.OnClickListener() { // from class: atw.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atw.this.dismiss();
            }
        });
        this.b.setQualityChooseListener(new a() { // from class: atw.2
            @Override // com.xiaopeng.musicradio.music.tone.view.a
            public void a() {
                atw.this.dismiss();
            }
        });
    }

    public void a(MusicInfo musicInfo) {
        this.a = musicInfo;
        this.b.setMusicInfo(this.a);
    }
}
