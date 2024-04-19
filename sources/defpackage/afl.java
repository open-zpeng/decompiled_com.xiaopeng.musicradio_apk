package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.utils.z;
import org.greenrobot.greendao.converter.PropertyConverter;
/* compiled from: MusicSongBeanConverter.java */
/* renamed from: afl  reason: default package */
/* loaded from: classes2.dex */
public class afl implements PropertyConverter<MusicSongBean, String> {
    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public MusicSongBean convertToEntityProperty(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (MusicSongBean) z.a(str, (Class<Object>) MusicSongBean.class);
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    /* renamed from: a */
    public String convertToDatabaseValue(MusicSongBean musicSongBean) {
        if (musicSongBean == null) {
            return null;
        }
        return z.a(musicSongBean);
    }
}
