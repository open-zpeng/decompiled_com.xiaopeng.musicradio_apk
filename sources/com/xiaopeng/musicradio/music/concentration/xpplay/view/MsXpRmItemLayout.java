package com.xiaopeng.musicradio.music.concentration.xpplay.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmItemLayout;
/* loaded from: classes.dex */
public class MsXpRmItemLayout extends MsRmItemLayout {
    public MsXpRmItemLayout(Context context) {
        super(context);
    }

    public MsXpRmItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsXpRmItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmItemLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_xp_rm_item;
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmItemLayout
    public void setOpenDetailListener(final MusicRadioItem musicRadioItem) {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.xpplay.view.MsXpRmItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atv.k();
                atz.a(musicRadioItem.getId(), musicRadioItem.getLogoUrl(), musicRadioItem.getName(), musicRadioItem.getDescription());
            }
        });
    }
}
