package com.xiaopeng.musicradio.bean.xpbean;

import android.text.SpannableStringBuilder;
import java.io.Serializable;
/* loaded from: classes.dex */
public class MusicAlbumBean implements Serializable {
    private static final long serialVersionUID = 1;
    private long id;
    private String logo;
    private transient SpannableStringBuilder mHighlightName;
    private String name;

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public SpannableStringBuilder getHighlightName() {
        return this.mHighlightName;
    }

    public void setHighlightName(SpannableStringBuilder spannableStringBuilder) {
        this.mHighlightName = spannableStringBuilder;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MusicAlbumBean) {
            return ((MusicAlbumBean) obj).getId() == this.id;
        }
        return super.equals(obj);
    }
}
