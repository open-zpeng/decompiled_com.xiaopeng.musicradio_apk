package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.datalist.m;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.i;
import java.util.HashMap;
import java.util.Objects;
/* compiled from: BaseAlbumViewProxy.java */
/* renamed from: aim  reason: default package */
/* loaded from: classes2.dex */
public abstract class aim<UIInterface, Presenter extends DataListPresenter<UIInterface>> extends aiq<UIInterface, Presenter> implements h, m, i {
    public aim(Context context, String str) {
        super(context, str);
    }

    public void i() {
        int i;
        String str;
        int c = aei.a().c();
        if (c == 0) {
            i = aml.b();
            str = aml.e();
        } else {
            i = -1;
            str = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioType", Integer.valueOf(c));
        hashMap.put("playState", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        hashMap.put("listSign", str);
        c_("UpdatePlayingStatus", z.a(hashMap));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MusicRadioItem a(long j, String str) {
        for (MusicRadioItem musicRadioItem : ((DataListPresenter) this.c).g()) {
            if (Objects.equals(Long.valueOf(j), Long.valueOf(musicRadioItem.getId())) && Objects.equals(str, musicRadioItem.getType())) {
                return musicRadioItem;
            }
        }
        return null;
    }

    @Override // defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("play".equals(str)) {
            a(amc.b(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aiq
    public void a(boolean z) {
        super.a(z);
        if (z) {
            return;
        }
        if (this instanceof alu) {
            aml.g();
        } else {
            aml.f(1);
        }
    }

    protected void a(MusicRadioItem musicRadioItem) {
        if (musicRadioItem != null) {
            aml.a(musicRadioItem);
        }
    }
}
