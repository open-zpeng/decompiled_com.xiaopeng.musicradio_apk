package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import defpackage.apw;
import java.util.List;
/* compiled from: DeleteSongsCallback.java */
/* renamed from: anq  reason: default package */
/* loaded from: classes2.dex */
public class anq implements apw.a {
    @Override // defpackage.apw.a
    public void a(ReissueInfo reissueInfo, int i, String str) {
    }

    @Override // defpackage.apw.a
    public void a(ReissueInfo reissueInfo, BaseBean baseBean) {
        LogUtils.i("DeleteSongsCallback", "onReissueOk:" + reissueInfo.getValue());
        final List<String> a = anp.a(reissueInfo);
        if (a.isEmpty()) {
            return;
        }
        ban.e(new Runnable() { // from class: anq.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                for (String str : a) {
                    MusicInfo a2 = anv.a().a(str);
                    if (a2 != null && a2.getMusicFrom() == 0) {
                        a2.setAppend(false);
                        anv.a().a(a2, true);
                        z = true;
                    }
                }
                if (z) {
                    and.b().d();
                }
            }
        });
    }
}
