package defpackage;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.rank.main.presenter.MsRankMainPresenter;
import java.util.Arrays;
import java.util.List;
/* compiled from: MsRankMainFragment.java */
@Route(path = "/music/fragment/rank")
/* renamed from: ati  reason: default package */
/* loaded from: classes2.dex */
public class ati extends b<Object, MsRankMainPresenter> {
    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MusicRank";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.music_fragment_rank;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public MsRankMainPresenter ao_() {
        return new MsRankMainPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MainMusicLocalLeft", "MainLocalTop");
    }
}
