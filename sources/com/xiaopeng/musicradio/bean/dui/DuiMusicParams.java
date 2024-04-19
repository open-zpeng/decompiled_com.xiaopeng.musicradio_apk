package com.xiaopeng.musicradio.bean.dui;
/* loaded from: classes.dex */
public class DuiMusicParams {
    public static final int CATEGORY_INVALID = -1;
    public static final int CATEGORY_MODULE = 1;
    public static final int CATEGORY_STYLE = 2;
    public static final int CATEGORY_TAG = 3;
    private int id;
    private String keyword;
    private int type;
    @CATEGORY
    private int category = -1;
    private int index = -1;
    private String mode = "";

    /* loaded from: classes.dex */
    public @interface CATEGORY {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public int getCategory() {
        return this.category;
    }

    public void setCategory(@CATEGORY int i) {
        this.category = i;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public String getMode() {
        return this.mode;
    }

    public void setMode(String str) {
        this.mode = str;
    }
}
