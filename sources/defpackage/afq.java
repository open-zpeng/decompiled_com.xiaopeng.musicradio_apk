package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.xpbean.TryFileInfo;
import com.xiaopeng.musicradio.utils.z;
import org.greenrobot.greendao.converter.PropertyConverter;
/* compiled from: TryListenFileConverter.java */
/* renamed from: afq  reason: default package */
/* loaded from: classes2.dex */
public class afq implements PropertyConverter<TryFileInfo, String> {
    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public TryFileInfo convertToEntityProperty(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (TryFileInfo) z.a(str, new TypeToken<TryFileInfo>() { // from class: afq.1
        }.getType());
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public String convertToDatabaseValue(TryFileInfo tryFileInfo) {
        if (tryFileInfo == null) {
            return null;
        }
        return z.a(tryFileInfo);
    }
}
