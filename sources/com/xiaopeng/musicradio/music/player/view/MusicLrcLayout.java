package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.xiaopeng.musicradio.bean.lyrics.LrcEntry;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.presenter.MusicLrcPresenter;
import com.xiaopeng.musicradio.music.player.widget.LyricView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MusicLrcLayout extends BaseFrameLayout<e, MusicLrcPresenter> implements e, LyricView.d {
    private boolean c;
    private LyricView d;
    private int e;

    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a_(String str, String str2) {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    public MusicLrcLayout(Context context) {
        super(context);
        this.c = false;
    }

    public MusicLrcLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
    }

    public MusicLrcLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public MusicLrcPresenter a() {
        return new MusicLrcPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (LyricView) findViewById(b.d.lrcview);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.setOnLoadLrcListener(this);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.MusicLrcLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicLrcLayout.this.callOnClick();
            }
        });
        this.d.setOnSeekListener(new LyricView.e() { // from class: com.xiaopeng.musicradio.music.player.view.MusicLrcLayout.2
            @Override // com.xiaopeng.musicradio.music.player.widget.LyricView.e
            public void a(int i) {
                Log.i("MusicLrcLayout", "seekLrcTime: " + i);
                ((MusicLrcPresenter) MusicLrcLayout.this.b).a(i / 1000);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a(boolean z) {
        this.d.a(z);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.layout_lrc;
    }

    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a(int i) {
        if (this.c) {
            return;
        }
        if (this.e > i) {
            this.d.a(i * 1000);
        } else {
            this.d.b(i * 1000);
        }
        this.e = i;
    }

    @Override // com.xiaopeng.musicradio.music.player.view.e
    public void a(String str, int i) {
        LyricView lyricView = this.d;
        if (lyricView == null) {
            return;
        }
        lyricView.a();
        if (TextUtils.isEmpty(str)) {
            this.c = false;
            if (str == null) {
                this.d.setLrcLabel(getResources().getString(b.f.main_searching_lrc));
                return;
            } else {
                this.d.setLrcLabel(getResources().getString(b.f.main_lrc_no));
                return;
            }
        }
        this.d.a(str);
        a(i);
    }

    @Override // com.xiaopeng.musicradio.music.player.widget.LyricView.d
    public void f() {
        this.c = true;
        this.d.setLrcLabel(getResources().getString(b.f.main_searching_lrc));
    }

    @Override // com.xiaopeng.musicradio.music.player.widget.LyricView.d
    public void a(ArrayList<LrcEntry> arrayList) {
        this.c = false;
        if (arrayList == null || arrayList.isEmpty()) {
            g();
        }
    }

    @Override // com.xiaopeng.musicradio.music.player.widget.LyricView.d
    public void g() {
        this.c = false;
        this.d.a();
        this.d.setLrcLabel(getResources().getString(b.f.main_lrc_no));
    }

    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            ((MusicLrcPresenter) this.b).c();
        }
    }
}
