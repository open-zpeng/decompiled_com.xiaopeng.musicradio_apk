package defpackage;

import com.xiaopeng.musicradio.bean.xpbean.ReCollectLabelsResult;
import com.xiaopeng.musicradio.bean.xpbean.ReMusicTagInfo;
import java.util.ArrayList;
/* compiled from: MsRmCategoryDataHandler.java */
/* renamed from: asc  reason: default package */
/* loaded from: classes2.dex */
public class asc {

    /* compiled from: MsRmCategoryDataHandler.java */
    /* renamed from: asc$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);

        void a(ArrayList<ReMusicTagInfo> arrayList);

        void b(String str);
    }

    public void a(final a aVar) {
        aqz.a().k(new avc<ReCollectLabelsResult>() { // from class: asc.1
            @Override // defpackage.avc
            public void a(ReCollectLabelsResult reCollectLabelsResult) {
                ArrayList<ReMusicTagInfo> arrayList = new ArrayList<>();
                if (reCollectLabelsResult.getData() != null && reCollectLabelsResult.getData().getList() != null && reCollectLabelsResult.getData().getList().size() >= 0) {
                    if (reCollectLabelsResult.getData().getList().size() == 0) {
                        aVar.b("");
                        return;
                    }
                    for (ReMusicTagInfo reMusicTagInfo : reCollectLabelsResult.getData().getList()) {
                        if (!arrayList.contains(reMusicTagInfo)) {
                            arrayList.add(reMusicTagInfo);
                        }
                    }
                    if (arrayList.size() > 0) {
                        aVar.a(arrayList);
                        return;
                    } else {
                        aVar.b("");
                        return;
                    }
                }
                aVar.a("");
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                aVar.a(str);
            }
        });
    }
}
