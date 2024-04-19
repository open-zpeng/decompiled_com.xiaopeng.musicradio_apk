package com.xiaopeng.musicradio.bean.xpbean;
/* loaded from: classes.dex */
public class MusicAlbumType {
    public static final int CLASSIFIED_TYPE_APP_CUSTOM = 2;
    public static final int CLASSIFIED_TYPE_APP_FAV = 3;
    public static final int CLASSIFIED_TYPE_ERROR = -1;
    public static final int CLASSIFIED_TYPE_MY_FAV = 4;
    public static final int CLASSIFIED_TYPE_PHONE_IMPORT = 1;
    private static final int TYPE_IMPORT_LIST = 3;
    private static final int TYPE_KUGOU_SYNC_LIST = 2;
    private static final int TYPE_OTHER_BUILD_KUGOU_LIST = 6;

    public static int getType(int i, boolean z) {
        return i == 6 ? z ? 4 : 3 : i == 2 ? z ? -1 : 2 : i == 3 ? 1 : -1;
    }

    public static int revertType(int i) {
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 2;
            default:
                return 6;
        }
    }
}
