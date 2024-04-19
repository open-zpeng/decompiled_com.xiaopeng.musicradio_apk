package defpackage;

import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import java.util.LinkedList;
/* compiled from: ReissueMergeHelper.java */
/* renamed from: afu  reason: default package */
/* loaded from: classes2.dex */
public class afu {
    private afs a;

    /* compiled from: ReissueMergeHelper.java */
    /* renamed from: afu$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final afu a = new afu();
    }

    public static afu a() {
        return a.a;
    }

    private afu() {
        this.a = new aft();
    }

    public boolean a(ReissueInfo reissueInfo) {
        return this.a.a(reissueInfo);
    }

    public ReissueInfo a(ReissueInfo reissueInfo, LinkedList<ReissueInfo> linkedList) {
        return (linkedList == null || linkedList.isEmpty() || !"music_love".equals(reissueInfo.getType())) ? reissueInfo : this.a.a(reissueInfo, linkedList);
    }
}
