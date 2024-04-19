package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.ListSignBean;
/* compiled from: RecommendHandler.java */
/* renamed from: aop  reason: default package */
/* loaded from: classes2.dex */
public class aop extends aoc {
    private aoc c;

    public aop(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aoj
    public void a(ListSignBean listSignBean, boolean z, int i, int i2, int i3, boolean z2) {
        long collectId = listSignBean.getCollectId();
        if (collectId == -1000) {
            Log.i("AbsFindHandler", "playDailyMusic");
            if (!apx.a().d()) {
                this.a.a(z, 0, "");
            } else {
                new aoi(this.a).a(listSignBean, z, i, i2, i3, z2);
            }
        } else if (collectId == ListSignBean.PERSONAL_MUSIC_ID) {
            new aol(this.a).a(listSignBean, z, i, i2, i3, z2);
        } else if (collectId == ListSignBean.RECOMMEND_VIP_ID) {
            new aor(this.a).a(listSignBean, z, i, i2, i3, z2);
        } else {
            this.c = new aog(this.a);
            this.c.a(listSignBean, z, i, i2, i3, z2);
        }
    }

    @Override // defpackage.aoc
    public void a() {
        super.a();
        aoc aocVar = this.c;
        if (aocVar != null) {
            aocVar.a();
        }
    }
}
