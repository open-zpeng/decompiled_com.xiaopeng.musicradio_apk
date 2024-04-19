package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicMatchBean;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.ak;
/* compiled from: MusicPlayAisuggest.java */
/* renamed from: aee  reason: default package */
/* loaded from: classes2.dex */
public class aee {
    public static void a(String str, long j) {
        Log.i("MusicPlayAisuggest", "playSingleMusic: " + str);
        ath.a().a(str, new avc<MusicMatchBean>() { // from class: aee.1
            @Override // defpackage.avc
            public void a(MusicMatchBean musicMatchBean) {
                if (musicMatchBean != null && musicMatchBean.getData() != null) {
                    MusicInfo a = ab.a(musicMatchBean.getData());
                    String unplayableMsg = a.getUnplayableMsg();
                    Log.i("MusicPlayAisuggest", "response: unplayableCode is " + a.getUnplayableCode());
                    if (!TextUtils.isEmpty(unplayableMsg) && a.getUnplayableCode() != 2) {
                        ak.b(a.a, unplayableMsg);
                    }
                    apk.i().b(a);
                    return;
                }
                LogUtils.i("MusicPlayAisuggest", "bean or bean.getData is null");
            }

            @Override // defpackage.avc
            public void a(int i, String str2) {
                LogUtils.i("MusicPlayAisuggest", "err == " + str2);
            }
        });
    }
}
