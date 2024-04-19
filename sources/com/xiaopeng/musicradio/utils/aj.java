package com.xiaopeng.musicradio.utils;

import android.app.Activity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.agg;
/* compiled from: MusicDialogUtil.java */
/* loaded from: classes2.dex */
public class aj {
    public static void a() {
        Activity c = a.a().c();
        if (c == null || a.a().f() || !(c instanceof com.xiaopeng.musicradio.commonui.base.a)) {
            LogUtils.i("MusicDialogUtil", "Activity in background");
            String string = com.xiaopeng.musicradio.a.a().getString(b.f.music_collect_count_max_title_template, new Object[]{Integer.valueOf(anv.a().f())});
            u.f(new agg.ab(string));
            ak.a(com.xiaopeng.musicradio.a.a, string);
            return;
        }
        final XDialog xDialog = new XDialog(c, 0, r.a());
        xDialog.setVuiSceneId("MineCollectMaxDialog");
        xDialog.setTitle(c.getString(b.f.music_collect_count_max_title_template, Integer.valueOf(anv.a().f()))).setMessage(b.f.music_collect_count_max_content).setPositiveButton(c.getString(b.f.to_delete), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.utils.aj.2
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog2.setNegativeButtonEnable(false);
                sp.a().a("/mine/activity/collect/music").withString("mode", RequestParameters.SUBRESOURCE_DELETE).navigation();
            }
        }).setNegativeButton(c.getString(b.f.cancel), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.utils.aj.1
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                XDialog.this.setNegativeButtonEnable(false);
            }
        });
        q.a(c, xDialog);
    }
}
