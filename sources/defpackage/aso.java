package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import java.util.List;
/* compiled from: XpPlayItemBean.java */
/* renamed from: aso  reason: default package */
/* loaded from: classes2.dex */
public class aso {
    private int a;
    private String b;
    private List<MusicRadioItem> c;

    public aso(int i, String str, List<MusicRadioItem> list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public String b() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public List<MusicRadioItem> c() {
        return this.c;
    }

    public void a(List<MusicRadioItem> list) {
        this.c = list;
    }
}
