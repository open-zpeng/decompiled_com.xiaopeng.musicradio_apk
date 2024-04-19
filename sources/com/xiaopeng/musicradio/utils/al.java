package com.xiaopeng.musicradio.utils;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.io.File;
import java.util.regex.Pattern;
/* compiled from: MusicUtils.java */
/* loaded from: classes2.dex */
public class al {
    private static final String a = "al";
    private static final BitmapFactory.Options b = new BitmapFactory.Options();
    private static final Uri c = Uri.parse("content://media/external/audio/albumart");
    private static String[] d = {"_id", "title", "_data", "album_id", "artist", "artist_id", "duration", "_size"};
    private static final Pattern e = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static boolean a(MusicInfo musicInfo) {
        return (musicInfo == null || TextUtils.isEmpty(musicInfo.getLrcData()) || !musicInfo.getLrcData().startsWith("http")) ? false : true;
    }

    public static File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("http")) {
            File file = new File("/mnt/sdcard/xiaopengmusic/lrc", str.substring(str.lastIndexOf("/")));
            if (file.exists()) {
                return file;
            }
            return null;
        }
        File file2 = new File(str);
        if (file2.exists()) {
            return file2;
        }
        return null;
    }
}
