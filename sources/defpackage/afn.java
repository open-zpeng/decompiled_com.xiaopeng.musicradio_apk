package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.converter.PropertyConverter;
/* compiled from: NetRadioProgramListConverter.java */
/* renamed from: afn  reason: default package */
/* loaded from: classes2.dex */
public class afn implements PropertyConverter<List<NetRadioProgramInfo>, String> {
    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public List<NetRadioProgramInfo> convertToEntityProperty(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return (List) z.a(str, new TypeToken<List<NetRadioProgramInfo>>() { // from class: afn.1
        }.getType());
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public String convertToDatabaseValue(List<NetRadioProgramInfo> list) {
        if (list == null) {
            return null;
        }
        return z.a(list);
    }
}
