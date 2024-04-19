package com.xiaopeng.musicradio.utils;

import android.view.View;
import java.lang.ref.SoftReference;
import java.util.List;
/* compiled from: ResourcePreloadUtil.java */
/* loaded from: classes2.dex */
public abstract class ax {

    /* compiled from: ResourcePreloadUtil.java */
    /* loaded from: classes2.dex */
    public enum a {
        MUSIC_SHEET,
        CATEGORY_LIST,
        MUSIC_CATEGORY_TAB,
        RECOMMEND_MUSIC_ITEM,
        NETRADIO_CATEGORY_TAB,
        NETRADIO_ITEM,
        READING_CATEGORY_ITEM,
        READING_SCENE_COLLAPSE_ITEM,
        READING_SCENE_EXPAND_ITEM,
        VIP_MUSIC_ITEM,
        LATELY_MUSIC,
        LOCAL_RADIO_ITEM,
        MS_SELECTION_TOP,
        MS_SELECTION_RMMUSIC,
        MS_SELECTION_ZONE,
        NR_LOCATION_RADIO,
        NR_ALL_RADIO,
        MS_SELECTION_RADIO,
        READING_GUESS_LIKE_BINDER,
        READING_BANNER_BINDER,
        READING_RANK_BINDER,
        NR_LOCATION_RADIO_ITEM,
        READING_RANK_TITLE_BINDER,
        MS_RM_TITLE,
        MS_RM_ITEM,
        MS_RADIO_TITLE,
        MS_RADIO_ITEM,
        MS_RANK_TITLE,
        MS_RANK_ITEM,
        MS_XP_PLAY_TITLE,
        MS_XP_PLAY_ITEM,
        MS_SINGER_TITLE,
        MS_SINGER_ITEM,
        MS_ZONE_TITLE,
        MS_ZONE_ITEM,
        READING_BANNER_HOLDER_CREATOR
    }

    public abstract List<SoftReference<View>> c(a aVar);

    public View a(a aVar) {
        List<SoftReference<View>> c = c(aVar);
        if (c == null || c.size() <= 0) {
            return null;
        }
        return c.remove(c.size() - 1).get();
    }

    public void b(a aVar) {
        List<SoftReference<View>> c = c(aVar);
        if (c == null || c.size() <= 0) {
            return;
        }
        c.remove(c.size() - 1);
    }
}
