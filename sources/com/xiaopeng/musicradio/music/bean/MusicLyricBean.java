package com.xiaopeng.musicradio.music.bean;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.speech.common.util.DontProguardClass;
/* loaded from: classes.dex */
public class MusicLyricBean extends BaseBean {
    private DataEntity data;

    public DataEntity a() {
        return this.data;
    }

    @DontProguardClass
    /* loaded from: classes.dex */
    public class DataEntity {
        private String songLyric;

        public DataEntity() {
        }

        public void setSongLyric(String str) {
            this.songLyric = str;
        }

        public String getSongLyric() {
            return this.songLyric;
        }
    }
}
