package defpackage;

import java.io.Serializable;
/* compiled from: ProgramServiceBean.java */
/* renamed from: awk  reason: default package */
/* loaded from: classes2.dex */
public class awk implements Serializable {
    private long albumId;
    private String albumLogo;
    private String albumName;
    private long artistId;
    private String artistName;
    private String categoryName;
    private int duration;
    private String fromSource;
    private String intro;
    private boolean isLove;
    private String largeLogo;
    private String listenUrl;
    private String mediumLogo;
    private int orderNum;
    private long playCount;
    private String shortIntro;
    private String smallLogo;
    private String title;
    private long trackId;
    private long updateTime;
    private String type = "";
    private int position = 0;

    public void a(String str) {
        this.type = str;
    }

    public void b(String str) {
        this.fromSource = str;
    }

    public void c(String str) {
        this.categoryName = str;
    }

    public void d(String str) {
        this.albumLogo = str;
    }

    public void e(String str) {
        this.shortIntro = str;
    }

    public void a(long j) {
        this.playCount = j;
    }

    public void a(int i) {
        this.position = i;
    }

    public void b(long j) {
        this.trackId = j;
    }

    public void b(int i) {
        this.duration = i;
    }

    public void f(String str) {
        this.intro = str;
    }

    public void g(String str) {
        this.listenUrl = str;
    }

    public String a() {
        return this.title;
    }

    public void h(String str) {
        this.title = str;
    }

    public long b() {
        return this.artistId;
    }

    public void c(long j) {
        this.artistId = j;
    }

    public void i(String str) {
        this.smallLogo = str;
    }

    public void j(String str) {
        this.largeLogo = str;
    }

    public String c() {
        return this.mediumLogo;
    }

    public void k(String str) {
        this.mediumLogo = str;
    }

    public void d(long j) {
        this.updateTime = j;
    }

    public void e(long j) {
        this.albumId = j;
    }

    public long d() {
        return this.albumId;
    }

    public String e() {
        return this.albumName;
    }

    public void l(String str) {
        this.albumName = str;
    }

    public void c(int i) {
        this.orderNum = i;
    }

    public boolean f() {
        return this.isLove;
    }

    public void a(boolean z) {
        this.isLove = z;
    }

    public String toString() {
        return "ProgramBean{trackId=" + this.trackId + ", duration=" + this.duration + ", intro='" + this.intro + "', listenUrl='" + this.listenUrl + "', title='" + this.title + "', artistId=" + this.artistId + ", smallLogo='" + this.smallLogo + "', largeLogo='" + this.largeLogo + "', mediumLogo='" + this.mediumLogo + "', artistName='" + this.artistName + "', updateTime=" + this.updateTime + ", albumId=" + this.albumId + ", albumName='" + this.albumName + "', fromSource=" + this.fromSource + '}';
    }
}
