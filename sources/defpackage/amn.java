package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.service.c;
import defpackage.aht;
/* compiled from: ProgramUtils.java */
/* renamed from: amn  reason: default package */
/* loaded from: classes2.dex */
public class amn {
    public static LiveData<f<RdAlbumBean>> a(e eVar) {
        return (LiveData) ((awg) c.a().b(awg.class)).getCollectedProgramList(eVar);
    }

    public static LiveData<f<RdAlbumBean>> b(e eVar) {
        return (LiveData) ((awg) c.a().b(awg.class)).getHistoryProgramList(eVar);
    }

    public static void a(RdAlbumBean rdAlbumBean) {
        ((awg) c.a().b(awg.class)).play(rdAlbumBean);
    }

    public static ProgramBean a() {
        return (ProgramBean) ((awg) c.a().b(awg.class)).getPlayingProgram();
    }

    public static int b() {
        return ((awg) c.a().b(awg.class)).getPlayState();
    }

    public static boolean c() {
        return (aei.a().c() != 3 || TextUtils.isEmpty(d()) || a() == null) ? false : true;
    }

    public static boolean b(RdAlbumBean rdAlbumBean) {
        int c = aei.a().c();
        if (rdAlbumBean != null) {
            ProgramBean a = a();
            return c == 3 && a != null && a.getAlbumId() == rdAlbumBean.getId();
        }
        return false;
    }

    public static String d() {
        return ((awh) c.a().b(awh.class)).getListSign();
    }

    public static void a(RdAlbumBean rdAlbumBean, boolean z) {
        ((awg) c.a().b(awg.class)).setCollectedProgram(rdAlbumBean, z);
    }

    public static void c(RdAlbumBean rdAlbumBean) {
        ((awg) c.a().b(awg.class)).removeHistoryProgram(rdAlbumBean);
    }

    public static void a(Context context, RdAlbumBean rdAlbumBean, String str) {
        ((awg) c.a().b(awg.class)).startDetail(context, rdAlbumBean, str);
    }

    public static void a(View view, RdAlbumBean rdAlbumBean, String str) {
        if (view.getTag(aht.c.tag_play) != null) {
            a(rdAlbumBean);
        } else {
            a(view.getContext(), rdAlbumBean, str);
        }
    }

    public static void e() {
        ((awg) c.a().b(awg.class)).checkoutDataCollect();
    }

    public static boolean d(RdAlbumBean rdAlbumBean) {
        return ((awg) c.a().b(awg.class)).isCollected(rdAlbumBean);
    }
}
