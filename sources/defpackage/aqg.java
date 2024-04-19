package defpackage;

import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import defpackage.apw;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ReissueModel.java */
/* renamed from: aqg  reason: default package */
/* loaded from: classes2.dex */
public class aqg extends apw {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReissueModel.java */
    /* renamed from: aqg$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final aqg a = new aqg();
    }

    public static aqg c() {
        return a.a;
    }

    private aqg() {
    }

    @Override // defpackage.apw
    public void b() {
        afi.d().b();
    }

    @Override // defpackage.apw
    public void a(ReissueInfo reissueInfo, apw.a aVar, int i, String str) {
        if (1 == reissueInfo.getReissueType()) {
            afi.d().c(a(reissueInfo));
        } else if (2 == reissueInfo.getReissueType()) {
            afi.d().d(a(reissueInfo));
        }
    }

    private List<String> a(ReissueInfo reissueInfo) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(reissueInfo.getObjectId());
        List<ReissueInfo> mergeList = reissueInfo.getMergeList();
        if (mergeList != null) {
            for (ReissueInfo reissueInfo2 : mergeList) {
                linkedList.add(reissueInfo2.getObjectId());
            }
        }
        return linkedList;
    }
}
