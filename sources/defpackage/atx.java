package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.tone.view.b;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: SingleSongQualityPresenter.java */
/* renamed from: atx  reason: default package */
/* loaded from: classes2.dex */
public class atx extends e<b> {
    private MusicInfo b;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void y_() {
        super.y_();
        LogUtils.d("SingleSongQualityPresenter", "onSupportVisible..");
        bct bctVar = (bct) c.a().b(bct.class);
        if (bctVar != null) {
            bctVar.fetchUserInfo();
        }
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void e() {
        super.e();
    }

    public void a(MusicInfo musicInfo) {
        this.b = musicInfo;
    }

    public void a(int i) {
        Log.i("SingleSongQualityPresenter", "switchSongQuality: " + i);
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (bcuVar != null) {
            bcuVar.setSongQuality(i);
        }
    }

    public boolean f() {
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (bcuVar != null) {
            return bcuVar.isXpVip();
        }
        return false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSongQualityChangeEvent(agg.ag agVar) {
        if (j() == null || agVar == null || !agVar.a()) {
            return;
        }
        j().onRefreshSelected(agVar.b());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMusicInfoEvent(age.c cVar) {
        BaseInfo d;
        if (aei.a().c() != 0 || (d = aei.a().c(0).d()) == null || d.equals(this.b) || j() == null) {
            return;
        }
        j().onRefreshCurMusicInfo((MusicInfo) d);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onQualityRefreshEvent(age.s sVar) {
        BaseInfo d;
        if (aei.a().c() != 0 || (d = aei.a().c(0).d()) == null || !d.equals(this.b) || j() == null) {
            return;
        }
        MusicInfo musicInfo = (MusicInfo) d;
        int quality = musicInfo.getQuality() == 0 ? 1 : musicInfo.getQuality();
        if (j() != null) {
            j().onRefreshSelected(quality);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudioType(agg.g gVar) {
        if (aei.a().c() == 0 || j() == null) {
            return;
        }
        j().onDismiss();
    }
}
