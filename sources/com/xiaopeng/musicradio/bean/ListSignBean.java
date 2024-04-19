package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
/* loaded from: classes.dex */
public class ListSignBean {
    public static final String COLLECTID_PREFIX = "\"collectId\":";
    public static final String COLLECTID_SUFFIX = ",";
    public static final String FIND_MUSIC_RADIO_SING_EXTRA = "find_music_radio";
    public static final String LISTSIGN_ALBUM = "listsign_album";
    public static final String LISTSIGN_ARTIST_RADIO = "listsign_artist_radio";
    public static final String LISTSIGN_BILLBOARD = "listsign_billboard";
    public static final String LISTSIGN_BLUE_MUSIC = "listsign_blue_music";
    public static final String LISTSIGN_COLLECT = "listsign_collect";
    public static final String LISTSIGN_COLLECT_MUSIC = "listsign_collect_music";
    public static final String LISTSIGN_HISTORY_MUSIC = "listsign_history_music";
    public static final String LISTSIGN_LOCAL_RM_MUSIC = "listsign_local_rm_music";
    public static final String LISTSIGN_PHONE_MUSIC = "listsign_phone_music";
    public static final String LISTSIGN_RANK_MUSIC = "listsign_rank_music";
    public static final String LISTSIGN_RECOMMEN_MUSIC = "listsign_recommend_music";
    public static final String LISTSIGN_SEARCH_SONG = "listsign_search_song";
    public static final String LISTSIGN_SIMILAR = "listsign_similar";
    public static final String LISTSIGN_SINGER_COLLECT_MUSIC = "listsign_singer_single_music";
    public static final String LISTSIGN_SINGER_SINGLE_MUSIC = "listsign_singer_single_music";
    public static final String LISTSIGN_STYLE = "listsign_style";
    public static final String LISTSIGN_TAGS = "listsign_tags";
    public static final String LISTSIGN_USB_MUSIC = "listsign_usb_music";
    public static final String LISTSIGN_USER_ALBUM = "listsign_user_album";
    public static final String LOCAL_MUSIC_EXTRA = "local_music_extra";
    public static final long LOCAL_MUSIC_ID = 2000;
    public static final String LOCAL_PREFIX = "local_prefix_";
    public static final String LOCAL_USB_PREFIX = "local_usb_prefix_";
    public static final String MUSIC_EXTRA_AISUGEST = "music_extra_aisugest";
    public static final String MUSIC_PHONE_SING_EXTRA = "new_phone_collect";
    public static final String MUSIC_RADIO_SING_EXTRA = "new_music_radio";
    public static final String MUSIC_SINGER_EXTRA = "singer_music";
    public static final long PERSONAL_MUSIC_ID = -1003;
    public static final long RECOMMEND_DAILY_ID = -1000;
    public static final long RECOMMEND_VIP_ID = -1002;
    public static final String USB_ALBUM_PREFIX = "usb_album_prefix_";
    public static final String USB_DIR_PREFIX = "usb_dir_prefix_";
    public static final String USB_MUSIC_EXTRA = "usb_music_extra";
    public static final long USB_MUSIC_ID = 3000;
    public static final String USB_SINGER_PREFIX = "usb_singer_prefix_";
    public static final String USB_SONG_PREFIX = "usb_song_prefix_";
    public int mIsUserCollect;
    public int nType;
    public static final String LOCAL_MUSIC_TITLE = be.a(f.h.local_music_title);
    public static final String USB_MUSIC_TITLE = be.a(f.h.usb_music_title);
    public String prefix = "";
    public String extra = "";
    public String tag = "";
    public long collectId = -1;

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public long getCollectId() {
        return this.collectId;
    }

    public void setCollectId(long j) {
        this.collectId = j;
    }

    public int getNType() {
        return this.nType;
    }

    public void setNType(int i) {
        this.nType = i;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public int getIsUserCollect() {
        return this.mIsUserCollect;
    }

    public void setIsUserCollect(int i) {
        this.mIsUserCollect = i;
    }

    public String toJson() {
        return z.a(this);
    }

    public static ListSignBean fromJson(String str) {
        return (ListSignBean) z.a(str, (Class<Object>) ListSignBean.class);
    }
}
