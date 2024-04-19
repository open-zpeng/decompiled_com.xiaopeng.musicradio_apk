package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.List;
/* compiled from: FindMusicMediaSource.java */
/* renamed from: amq  reason: default package */
/* loaded from: classes2.dex */
public class amq extends ahp<MusicInfo> {
    private aoc a;

    public amq(String str, int i) {
        super(str, i);
    }

    public amq(String str, int i, int i2, List<MusicInfo> list, int i3) {
        super(str, i, i2, "timeAsc", list, i3);
    }

    public amq(String str, int i, int i2) {
        this(str, i);
    }

    @Override // defpackage.ahp
    public void a(boolean z, int i, int i2, List<MusicInfo> list) {
        apb.a().a(list, false);
        super.a(z, i, i2, list);
    }

    @Override // defpackage.ahp
    public void a(boolean z, int i, int i2, String str, boolean z2) {
        B();
        ListSignBean fromJson = ListSignBean.fromJson(b());
        if (fromJson == null) {
            a(z, -1, "暂无内容");
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_COLLECT)) {
            this.a = new aog(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_ALBUM)) {
            this.a = new aod(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_TAGS)) {
            this.a = new aoq(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_ARTIST_RADIO)) {
            this.a = new aof(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_RANK_MUSIC)) {
            this.a = new aoo(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            this.a = new aop(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, "listsign_singer_single_music")) {
            this.a = new aoe(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_PHONE_MUSIC)) {
            this.a = new aom(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else if (TextUtils.equals(fromJson.prefix, ListSignBean.LISTSIGN_COLLECT_MUSIC)) {
            this.a = new aoh(this);
            this.a.a(fromJson, z, i, i2, h(), z2);
        } else {
            a(z, -1, "加载失败，稍后重试");
        }
    }

    @Override // defpackage.ahp
    public void a() {
        super.a();
        B();
    }

    private void B() {
        aoc aocVar = this.a;
        if (aocVar != null) {
            aocVar.a();
        }
    }
}
