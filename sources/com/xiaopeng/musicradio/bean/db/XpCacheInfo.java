package com.xiaopeng.musicradio.bean.db;
/* loaded from: classes.dex */
public class XpCacheInfo {
    public static final String KEY_DSP_CUSTOM_MUSIC = "dsp_custom_music";
    public static final String KEY_DSP_CUSTOM_PROGRAM = "dsp_custom_program";
    public static final String KEY_FM_PLAY_LIST = "fm_play_list";
    public static final String KEY_MUSIC_DATA_PREFIX = "music_data_";
    public static final String KEY_MUSIC_PLAY_LIST = "music_play_list";
    public static final String KEY_MUSIC_PLAY_LIST_COUNT = "music_play_list_count";
    public static final String KEY_MUSIC_SIMILAR_PLAY_LIST = "music_similar_play_list";
    public static final String KEY_PROGRAM_PLAY_LIST = "program_play_list";
    public static final String KEY_PROGRAM_PLAY_LIST_COUNT = "program_play_list_count";
    public String key;
    public String value;

    public XpCacheInfo(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public XpCacheInfo() {
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
