package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.playlist.main.presenter.MinePlaylistPresenter;
import java.util.List;
/* compiled from: MinePlaylistViewProxy.java */
/* renamed from: alu  reason: default package */
/* loaded from: classes2.dex */
public class alu extends aim<als, MinePlaylistPresenter> implements als {
    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "MinePlaylistViewProxy_mine_playlist_datalist";
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    public alu(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MinePlaylistPresenter g() {
        return new MinePlaylistPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }
}
