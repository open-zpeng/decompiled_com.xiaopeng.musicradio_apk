package defpackage;

import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.mine.main.presenter.MineManagerPresenter;
/* compiled from: MineManagerViewProxy.java */
/* renamed from: alk  reason: default package */
/* loaded from: classes2.dex */
public class alk extends aeu<Object, MineManagerPresenter> {
    public alk(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MineManagerPresenter g() {
        return new MineManagerPresenter();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("init".equals(str)) {
            LogUtils.i("MineEventViewProxy", "init");
        }
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -837827782:
                    if (str.equals("isNetRadioLove")) {
                        c = 5;
                        break;
                    }
                    break;
                case -399698804:
                    if (str.equals("isProgramLove")) {
                        c = 4;
                        break;
                    }
                    break;
                case 43401378:
                    if (str.equals("isMusicLocalLove")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1079451124:
                    if (str.equals("isCustomAlbum")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1427647607:
                    if (str.equals("isAlbumLove")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1568330029:
                    if (str.equals("isMusicLove")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    MusicRadioItem b = amc.b(bArr);
                    a("MineManagerViewProxy_mine_manager_iscustomalbum", amb.a(b, aml.e(b)));
                    return;
                case 1:
                    MusicRadioItem b2 = amc.b(bArr);
                    a("MineManagerViewProxy_mine_manager_isalbumlove", amb.a(b2, aml.f(b2)));
                    return;
                case 2:
                    MusicInfo a = amc.a(bArr);
                    a("MineManagerViewProxy_mine_manager_ismusiclove", amb.a(a, aml.a(a, false)));
                    return;
                case 3:
                    MusicInfo a2 = amc.a(bArr);
                    a("MineManagerViewProxy_mine_manager_ismusiclocallove", amb.a(a2, aml.a(a2, true)));
                    return;
                case 4:
                    RdAlbumBean d = amc.d(bArr);
                    a("MineManagerViewProxy_mine_manager_isprogramlove", amb.a(d, amn.d(d)));
                    return;
                case 5:
                    NetRadioInfo c2 = amc.c(bArr);
                    a("MineManagerViewProxy_mine_manager_isnetradiolove", amb.a(c2, amm.d(c2)));
                    return;
                default:
                    return;
            }
        }
    }
}
