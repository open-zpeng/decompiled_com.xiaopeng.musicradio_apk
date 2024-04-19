package com.xiaopeng.musicradio.utils;

import android.net.Uri;
import com.irdeto.securesdk.core.SSUtils;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
/* compiled from: ProgramOpenUtil.java */
/* loaded from: classes2.dex */
public class as {
    public static void a(RdAlbumBean rdAlbumBean) {
        if (rdAlbumBean != null) {
            if (rdAlbumBean.getChannelId() > 0) {
                sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_id=" + rdAlbumBean.getId() + "&" + SSUtils.O000OO00 + "=" + rdAlbumBean.getChannelId()).navigation();
            } else if (rdAlbumBean.getCardId() > 0) {
                sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(rdAlbumBean)) + "&card_id=" + rdAlbumBean.getCardId()).navigation();
            } else {
                sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(rdAlbumBean))).navigation();
            }
        }
    }
}
