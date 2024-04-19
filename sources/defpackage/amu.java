package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.Date;
/* compiled from: SongQualityModel.java */
/* renamed from: amu  reason: default package */
/* loaded from: classes2.dex */
public class amu {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SongQualityModel.java */
    /* renamed from: amu$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final amu a = new amu();
    }

    public static amu a() {
        return a.a;
    }

    private amu() {
        u.a(this);
    }

    public int b() {
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (bcuVar != null) {
            return bcuVar.getSongQuality();
        }
        return 1;
    }

    public void a(final int i) {
        aqz.a().b(i, new avc<BaseBean>() { // from class: amu.1
            @Override // defpackage.avc
            public void a(BaseBean baseBean) {
                LogUtils.d("SongQualityModel", "Succeed saveSongQualityConfig type: " + i);
                bcu bcuVar = (bcu) c.a().b(bcu.class);
                if (bcuVar != null) {
                    bcuVar.setSongQuality(i);
                }
                u.c(new agg.ag(true, i));
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                LogUtils.d("SongQualityModel", "Failure saveSongQualityConfig type: " + i + " ,code : " + i2 + " ,msg: " + str);
                ak.a(com.xiaopeng.musicradio.a.a, str);
                u.c(new agg.ag(false, -1));
            }
        });
        b(i);
    }

    private void b(int i) {
        switch (i) {
            case 1:
                bci.a("1-音乐标准音质");
                return;
            case 2:
                bci.a("2-音乐高品音质");
                return;
            case 3:
                bci.a("3-音乐无损音质");
                return;
            default:
                return;
        }
    }

    public void c() {
        if (ay.c("sp_song_quality_guide", false)) {
            return;
        }
        ay.a("sp_song_quality_guide", true);
    }

    public void d() {
        ay.a("sp_song_quality_guide_time", bg.c(new Date()));
    }

    public boolean e() {
        if (!ay.c("sp_song_quality_guide", false)) {
            if (bg.c(new Date()) - ay.b("sp_song_quality_guide_time", 0L) > 259200000) {
                return true;
            }
        }
        return false;
    }
}
