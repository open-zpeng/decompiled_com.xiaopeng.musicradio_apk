package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import defpackage.apw;
import java.util.LinkedList;
import java.util.List;
/* compiled from: AddSongsCallback.java */
/* renamed from: anp  reason: default package */
/* loaded from: classes2.dex */
public class anp implements apw.a {
    @Override // defpackage.apw.a
    public void a(ReissueInfo reissueInfo, int i, String str) {
    }

    @Override // defpackage.apw.a
    public void a(ReissueInfo reissueInfo, BaseBean baseBean) {
        LogUtils.i("AddSongsCallback", "onReissueOk:" + reissueInfo.getValue());
        final List<String> a = a(reissueInfo);
        if (a.isEmpty()) {
            return;
        }
        ban.e(new Runnable() { // from class: anp.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                for (String str : a) {
                    MusicInfo a2 = anv.a().a(str);
                    if (a2 != null && a2.getMusicFrom() == 50) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> a(ReissueInfo reissueInfo) {
        LinkedList linkedList = new LinkedList();
        String b = b(reissueInfo);
        if (b != null) {
            linkedList.add(b);
        }
        List<ReissueInfo> mergeList = reissueInfo.getMergeList();
        if (mergeList != null) {
            for (ReissueInfo reissueInfo2 : mergeList) {
                String b2 = b(reissueInfo2);
                if (b2 != null) {
                    linkedList.add(b2);
                }
            }
        }
        return linkedList;
    }

    private static String b(ReissueInfo reissueInfo) {
        String objectId = reissueInfo.getObjectId();
        if (objectId != null) {
            return objectId.replace("music_love", "");
        }
        return null;
    }
}
