package com.xiaopeng.musicradio.model.mediacenter.command;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
/* loaded from: classes.dex */
public class MediaCenterCommand extends bae {
    public static final String TAG = "MediaCenterControlCommand";

    @Override // defpackage.bae
    public String getCommand() {
        return TAG;
    }

    public MediaCenterCommand(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.bae
    protected void a(String str, String str2) {
        LogUtils.d("liangyc", "do MediaCenterCommand", new Throwable());
        try {
            MediaCenterModel.getInstance().onPlaybackControl(Integer.parseInt(str), Integer.parseInt(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
