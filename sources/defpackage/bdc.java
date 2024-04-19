package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: SongQualityModel.java */
/* renamed from: bdc  reason: default package */
/* loaded from: classes2.dex */
public class bdc {
    private Integer a;

    /* compiled from: SongQualityModel.java */
    /* renamed from: bdc$a */
    /* loaded from: classes2.dex */
    static class a {
        static final bdc a = new bdc();
    }

    public static bdc a() {
        return a.a;
    }

    private bdc() {
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onVipChangeEvent(agg.ah ahVar) {
        Log.i("SongQualityModel", "onVipChangeEvent: ======== " + ahVar.a());
        if (ahVar.a()) {
            if (TextUtils.isEmpty(c())) {
                Log.i("SongQualityModel", "onVipChangeEvent: openid is empty");
            } else if (b() < 2) {
                a(2);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogout(agq.m mVar) {
        this.a = null;
    }

    private String c() {
        return ((aqs) apx.a().b()).a();
    }

    public void a(int i) {
        Log.e("SongQualityModel", "setSongQuality: ", new Throwable("type = " + i + " quality = " + this.a));
        a(c(), i);
    }

    public void a(String str, int i) {
        Integer num = this.a;
        boolean z = num == null || num.intValue() != i;
        this.a = Integer.valueOf(i);
        ay.a("key_song_quality_" + str, i);
        u.c(new agg.ag(z, i));
    }

    public int b() {
        String c = c();
        if (TextUtils.isEmpty(c)) {
            return 1;
        }
        if (this.a == null) {
            this.a = Integer.valueOf(ay.b("key_song_quality_" + c, 1));
        }
        return this.a.intValue();
    }
}
