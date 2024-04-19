package defpackage;

import com.xiaopeng.musicradio.bean.CollectRadioBean;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.utils.z;
/* compiled from: ReissueInfoFactory.java */
/* renamed from: ank  reason: default package */
/* loaded from: classes2.dex */
public class ank {
    public static ReissueInfo a(NetRadioInfo netRadioInfo) {
        String a = z.a(new CollectRadioBean(netRadioInfo.getId() + ""));
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("netradio_love" + netRadioInfo.getId());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/reading/user/favourite/addFm");
        reissueInfo.setType("netradio_love");
        reissueInfo.setValue(a);
        reissueInfo.setReissueType(2);
        return reissueInfo;
    }

    public static ReissueInfo b(NetRadioInfo netRadioInfo) {
        String a = z.a(new CollectRadioBean(netRadioInfo.getId() + ""));
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("netradio_un_love" + netRadioInfo.getId());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/reading/user/favourite/cancelFm");
        reissueInfo.setType("netradio_un_love");
        reissueInfo.setValue(a);
        reissueInfo.setReissueType(2);
        return reissueInfo;
    }
}
