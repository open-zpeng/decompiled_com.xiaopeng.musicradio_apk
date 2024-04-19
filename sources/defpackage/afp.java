package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.converter.PropertyConverter;
/* compiled from: SongInfoListConverter.java */
/* renamed from: afp  reason: default package */
/* loaded from: classes2.dex */
public class afp implements PropertyConverter<List<MusicRadioItem.SongInfo>, String> {
    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public List<MusicRadioItem.SongInfo> convertToEntityProperty(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return (List) z.a(str, new TypeToken<List<MusicRadioItem.SongInfo>>() { // from class: afp.1
        }.getType());
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public String convertToDatabaseValue(List<MusicRadioItem.SongInfo> list) {
        if (list == null) {
            return null;
        }
        return z.a(list);
    }
}
