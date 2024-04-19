package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.MusicListPlayReq;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.ak;
import defpackage.aht;
import java.util.List;
/* compiled from: MusicUtils.java */
/* renamed from: aml  reason: default package */
/* loaded from: classes2.dex */
public class aml {
    public static LiveData<f<MusicInfo>> a(e eVar) {
        return (LiveData) ((ard) c.a().b(ard.class)).getCollectedMusicList(eVar);
    }

    public static LiveData<f<MusicRadioItem>> b(e eVar) {
        return (LiveData) ((ard) c.a().b(ard.class)).getCollectedAlbumList(eVar);
    }

    public static LiveData<List<MusicInfo>> a(int i) {
        return (LiveData) ((ard) c.a().b(ard.class)).getHistoryMusicList(i);
    }

    public static LiveData<f<MusicRadioItem>> c(e eVar) {
        return (LiveData) ((ard) c.a().b(ard.class)).getHistoryAlbumList(eVar);
    }

    public static LiveData<List<MusicAlbumCollect>> b(int i) {
        return (LiveData) ((ard) c.a().b(ard.class)).getMobileAlbumList(i);
    }

    public static LiveData<f<MusicRadioItem>> d(e eVar) {
        return (LiveData) ((ard) c.a().b(ard.class)).getUserAlbumList(eVar);
    }

    public static LiveData<List<MusicInfo>> c(int i) {
        return (LiveData) ((ard) c.a().b(ard.class)).getBlueMusicList(i);
    }

    public static void a(List<MusicInfo> list, MusicInfo musicInfo, String str) {
        ((ard) c.a().b(ard.class)).play(list, musicInfo, str);
    }

    public static void a(List<MusicInfo> list, String str) {
        ((ard) c.a().b(ard.class)).playMusicInfo(list, str);
    }

    public static void a(MusicListPlayReq musicListPlayReq) {
        ((ard) c.a().b(ard.class)).play(musicListPlayReq, new ari() { // from class: aml.1
            @Override // defpackage.ari
            public boolean a() {
                return true;
            }

            @Override // defpackage.ari
            public void a(boolean z, int i, String str) {
                ak.a(a.a, str);
            }
        });
    }

    public static void a(MusicRadioItem musicRadioItem) {
        ((ard) c.a().b(ard.class)).play(musicRadioItem, new ari() { // from class: aml.2
            @Override // defpackage.ari
            public boolean a() {
                return true;
            }

            @Override // defpackage.ari
            public void a(boolean z, int i, String str) {
                ak.a(a.a, str);
            }
        });
    }

    public static MusicInfo a() {
        return (MusicInfo) ((ard) c.a().b(ard.class)).getPlayingMusic();
    }

    public static int b() {
        return ((ard) c.a().b(ard.class)).getPlayState();
    }

    public static boolean c() {
        return aei.a().c() == 0 && a() != null;
    }

    public static boolean d() {
        return aei.a().c() == 0 && !TextUtils.isEmpty(e());
    }

    public static boolean a(String str) {
        int c = aei.a().c();
        String e = e();
        return c == 0 && !TextUtils.isEmpty(e) && e.contains(str);
    }

    public static boolean a(MusicInfo musicInfo) {
        if (musicInfo != null) {
            return aei.a().c() == 0 && musicInfo.equals(a());
        }
        return false;
    }

    public static boolean b(MusicRadioItem musicRadioItem) {
        String e = e();
        int c = aei.a().c();
        if (musicRadioItem == null || TextUtils.isEmpty(e) || c != 0) {
            return false;
        }
        String c2 = c(musicRadioItem);
        if (c2.contains("-1000")) {
            return e.contains("-1000") && c2.contains("-1000");
        }
        return e.equals(c2);
    }

    public static String e() {
        return ((arf) c.a().b(arf.class)).getListSign();
    }

    public static String a(Integer num) {
        return ((ard) c.a().b(ard.class)).getListSign(num);
    }

    public static String c(MusicRadioItem musicRadioItem) {
        return ((ard) c.a().b(ard.class)).getListSign(musicRadioItem);
    }

    public static boolean a(MusicInfo musicInfo, boolean z) {
        if (z || musicInfo.isHttpCache()) {
            return ((are) c.a().b(are.class)).isLocalLoveMusic(musicInfo);
        }
        return ((ard) c.a().b(ard.class)).isCollectedMusic(musicInfo);
    }

    public static void a(List<MusicInfo> list) {
        ((ard) c.a().b(ard.class)).setCollectedMusic(list, false);
    }

    public static void b(MusicInfo musicInfo, boolean z) {
        ((ard) c.a().b(ard.class)).setCollectedMusic(musicInfo, z);
    }

    public static LiveData<Boolean> a(MusicRadioItem musicRadioItem, boolean z) {
        return (LiveData) ((ard) c.a().b(ard.class)).setCollectedAlbum(musicRadioItem, z);
    }

    public static void b(List<MusicInfo> list) {
        ((ard) c.a().b(ard.class)).removeHistoryMusic(list);
    }

    public static void d(MusicRadioItem musicRadioItem) {
        ((ard) c.a().b(ard.class)).removeHistoryAlbum(musicRadioItem);
    }

    public static void c(List<MusicInfo> list) {
        ((ard) c.a().b(ard.class)).removeBlueMusic(list);
    }

    public static void a(Context context, Object obj, String str) {
        ((ard) c.a().b(ard.class)).startDetail(context, obj, str);
    }

    public static void a(View view, MusicListPlayReq musicListPlayReq) {
        if (view.getId() != aht.c.iv_icon) {
            a(musicListPlayReq);
        }
    }

    public static void a(View view, List<MusicInfo> list, MusicInfo musicInfo, String str) {
        if (view.getId() != aht.c.iv_icon) {
            a(list, musicInfo, str);
        }
    }

    public static void a(View view, MusicRadioItem musicRadioItem, String str) {
        if (view.getTag(aht.c.tag_play) != null) {
            a(musicRadioItem);
        } else {
            a(view.getContext(), musicRadioItem, str);
        }
    }

    public static gn<Integer, Integer> a(int i, int i2) {
        return a(ad.b(i), i2);
    }

    public static gn<Integer, Integer> a(String str, int i) {
        String e = e();
        int b = (e != null && e.equals(str) && aei.a().c() == 0) ? b() : -1;
        int i2 = aht.e.bt_play_all;
        switch (b) {
            case 1:
            case 2:
                i2 = aht.e.bt_pause_all;
                break;
            case 3:
                i2 = aht.e.bt_continue_all;
                break;
        }
        return new gn<>(Integer.valueOf(i2), Integer.valueOf(b));
    }

    public static gn<Integer, Integer> b(int i, int i2) {
        String e = e();
        int b = (e != null && e.equals(ad.b(i)) && aei.a().c() == 0) ? b() : -1;
        int i3 = aht.e.bt_play_all;
        int i4 = aht.b.ic_btn_playall_text_color;
        switch (b) {
            case 1:
            case 2:
                i3 = aht.e.bt_pause_all;
                i4 = aht.b.ic_btn_stop_text_color;
                break;
            case 3:
                i3 = aht.e.bt_continue_all;
                break;
        }
        return new gn<>(Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static int d(int i) {
        return i == aht.e.bt_pause_all ? aht.e.bt_continue_all : aht.e.bt_pause_all;
    }

    public static void e(int i) {
        ((are) c.a().b(are.class)).checkoutDataCollect(i);
    }

    public static void f() {
        ((ard) c.a().b(ard.class)).fetchCollectedAlbum();
    }

    public static void f(int i) {
        ((ard) c.a().b(ard.class)).fetchCollectedAlbum(i);
    }

    public static void g() {
        ((ard) c.a().b(ard.class)).fetchCustomAlbumIfRequire();
    }

    public static LiveData<f<MusicInfo>> a(long j, e eVar) {
        return (LiveData) ((ard) c.a().b(ard.class)).getDetailPlayList(j, eVar);
    }

    public static boolean b(MusicInfo musicInfo) {
        return ((ard) c.a().b(ard.class)).isNewMatchedBlue(musicInfo);
    }

    public static void c(MusicInfo musicInfo) {
        ((are) c.a().b(are.class)).updateLocalLove(musicInfo);
    }

    public static int h() {
        return ((are) c.a().b(are.class)).getCollectedMusicCount();
    }

    public static boolean e(MusicRadioItem musicRadioItem) {
        return ((are) c.a().b(are.class)).isCustomAlbum(musicRadioItem);
    }

    public static boolean f(MusicRadioItem musicRadioItem) {
        return ((ard) c.a().b(ard.class)).isCollectedAlbum(musicRadioItem);
    }
}
