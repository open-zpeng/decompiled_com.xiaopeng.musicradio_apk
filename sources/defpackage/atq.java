package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.bean.ListSignBean;
/* compiled from: MsSingerCollectListAdapter.java */
/* renamed from: atq  reason: default package */
/* loaded from: classes2.dex */
public class atq extends asd {
    public atq(Context context) {
        super(context);
    }

    @Override // defpackage.ase
    public boolean a(String str, long j) {
        if (str.contains("listsign_singer_single_music")) {
            StringBuilder sb = new StringBuilder();
            sb.append(ListSignBean.COLLECTID_PREFIX);
            sb.append(j);
            sb.append(ListSignBean.COLLECTID_SUFFIX);
            return str.contains(sb.toString());
        }
        return false;
    }
}
