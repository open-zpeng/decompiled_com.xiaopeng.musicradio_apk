package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.utils.z;
import org.greenrobot.greendao.converter.PropertyConverter;
/* compiled from: NetRadioProgramInfoConverter.java */
/* renamed from: afm  reason: default package */
/* loaded from: classes2.dex */
public class afm implements PropertyConverter<NetRadioProgramInfo, String> {
    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public NetRadioProgramInfo convertToEntityProperty(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (NetRadioProgramInfo) z.a(str, (Class<Object>) NetRadioProgramInfo.class);
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public String convertToDatabaseValue(NetRadioProgramInfo netRadioProgramInfo) {
        if (netRadioProgramInfo == null) {
            return null;
        }
        return z.a(netRadioProgramInfo);
    }
}
