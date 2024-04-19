package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.v;
import defpackage.agg;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LocalMusicModel.java */
/* renamed from: apc  reason: default package */
/* loaded from: classes2.dex */
public class apc {
    private List<a> a = new ArrayList();

    /* compiled from: LocalMusicModel.java */
    /* renamed from: apc$b */
    /* loaded from: classes2.dex */
    private static class b {
        static final apc a = new apc();
    }

    public static apc a() {
        return b.a;
    }

    public apc() {
        u.a(this);
        b();
    }

    public void b() {
        Log.i("LocalMusicModel", "init: ");
        e();
        ban.a(new Runnable() { // from class: apc.1
            @Override // java.lang.Runnable
            public void run() {
                apc.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            Log.i("LocalMusicModel", "copyLogoToSDCard: ===========");
            v.a(com.xiaopeng.musicradio.a.a, "logo", "/sdcard/xiaopengmusic/xp_local_music_logo");
        } catch (Exception e) {
            Log.e("LocalMusicModel", "copyLogoToSDCard: ", e);
        }
    }

    private void e() {
        this.a.clear();
        a aVar = new a();
        aVar.a = "Bass Beat";
        aVar.b = "file:///android_asset/mp3/Bass Beat.mp3";
        aVar.d = "纯音乐";
        aVar.c = a("Bass Beat.jpg");
        a aVar2 = new a();
        aVar2.a = "Rain";
        aVar2.b = "file:///android_asset/mp3/Rain.flac";
        aVar2.d = "纯音乐";
        aVar2.c = a("Bass Beat.jpg");
        a aVar3 = new a();
        aVar3.a = "Robot";
        aVar3.b = "file:///android_asset/mp3/Robot.mp3";
        aVar3.d = "纯音乐";
        aVar3.c = a("Bass Beat.jpg");
        a aVar4 = new a();
        aVar4.a = "Shape of My Heart";
        aVar4.b = "file:///android_asset/mp3/Shape of My Heart-Sting.flac";
        aVar4.d = "Sting";
        aVar4.c = a("Shape of My Heart-Sting.jpg");
        a aVar5 = new a();
        aVar5.a = "Rolling In The Deep";
        aVar5.b = "file:///android_asset/mp3/Rolling In The Deep-Adele.flac";
        aVar5.d = "Adele";
        aVar5.c = a("Rolling In The Deep-Adele.jpg");
        a aVar6 = new a();
        aVar6.a = "橄榄树";
        aVar6.b = "file:///android_asset/mp3/橄榄树-刘紫玲.mp3";
        aVar6.d = "刘紫玲";
        aVar6.c = a("橄榄树-刘紫玲.jpg");
        a aVar7 = new a();
        aVar7.a = "加州旅馆";
        aVar7.b = "file:///android_asset/mp3/Hotel California.flac";
        aVar7.d = "Various Artists";
        aVar7.c = a("Hotel California.jpg");
        a aVar8 = new a();
        aVar8.a = "船歌";
        aVar8.b = "file:///android_asset/mp3/船歌-赵鹏.flac";
        aVar8.d = "赵鹏";
        aVar8.c = a("船歌-赵鹏.jpg");
        a aVar9 = new a();
        aVar9.a = "被遗忘的时光";
        aVar9.b = "file:///android_asset/mp3/被遗忘的时光-蔡琴.flac";
        aVar9.d = "蔡琴";
        aVar9.c = a("被遗忘的时光-蔡琴.jpg");
        a aVar10 = new a();
        aVar10.a = "低音王";
        aVar10.b = "file:///android_asset/mp3/低音王-群星.flac";
        aVar10.d = "群星";
        aVar10.c = a("低音王-群星.jpg");
        a aVar11 = new a();
        aVar11.a = "End Credits";
        aVar11.b = "file:///android_asset/mp3/End Credits-Hans Zimmer.flac";
        aVar11.d = "Hans Zimmer";
        aVar11.c = a("End Credits-Hans Zimmer.jpg");
        a aVar12 = new a();
        aVar12.a = "Go Big or Go Extinct";
        aVar12.b = "file:///android_asset/mp3/Go Big or Go Extinct-Ramin Djawadi Tom Morello.flac";
        aVar12.d = "Ramin Djawadi Tom Morello";
        aVar12.c = a("Go Big or Go Extinct-Ramin Djawadi Tom Morello.jpg");
        a aVar13 = new a();
        aVar13.a = "Tennessee";
        aVar13.b = "file:///android_asset/mp3/Tennessee-Pearl Harbor Soundtrack.flac";
        aVar13.d = "Pearl Harbor Soundtrack";
        aVar13.c = a("Tennessee-Pearl Harbor Soundtrack.jpg");
        a aVar14 = new a();
        aVar14.a = "命运交响曲";
        aVar14.b = "file:///android_asset/mp3/命运交响曲-Ludwig van Beethoven.flac";
        aVar14.d = "Ludwig van Beethoven";
        aVar14.c = a("命运交响曲-Ludwig van Beethoven.jpg");
        a aVar15 = new a();
        aVar15.a = "XPENG多声道环绕立体声";
        aVar15.b = "file:///android_asset/mp3/XPENG多声道环绕立体声 - 小鹏汽车.flac";
        aVar15.d = "小鹏汽车";
        aVar15.c = a("XPENG多声道环绕立体声 - 小鹏汽车.png");
        this.a.add(aVar15);
        this.a.add(aVar7);
        this.a.add(aVar);
        this.a.add(aVar2);
        this.a.add(aVar3);
        this.a.add(aVar4);
        this.a.add(aVar5);
        this.a.add(aVar6);
        this.a.add(aVar8);
        this.a.add(aVar9);
        this.a.add(aVar10);
        this.a.add(aVar11);
        this.a.add(aVar12);
        this.a.add(aVar13);
        this.a.add(aVar14);
        u.c(new agg.ac());
    }

    private String a(String str) {
        String format = String.format("%s/%s", "/sdcard/xiaopengmusic/xp_local_music_logo", str);
        return new File(format).exists() ? format : String.format("%s/%s", "file:///android_asset/logo", str);
    }

    public List<a> c() {
        return this.a;
    }

    /* compiled from: LocalMusicModel.java */
    /* renamed from: apc$a */
    /* loaded from: classes2.dex */
    public static class a {
        public String a = "";
        public String b = "";
        public String c = "";
        public String d = "";

        public String toString() {
            return "LocalMusicInfo{name='" + this.a + "', path='" + this.b + "', icon='" + this.c + "', singer='" + this.d + "'}";
        }
    }
}
