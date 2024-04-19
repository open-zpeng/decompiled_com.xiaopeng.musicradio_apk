package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerPresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.e;
/* compiled from: PlayerViewProxy.java */
/* renamed from: avl  reason: default package */
/* loaded from: classes2.dex */
public class avl extends aeu<e, PlayerPresenter> implements e {
    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void U_() {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void a(int i) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void h() {
    }

    public avl(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public PlayerPresenter g() {
        return new PlayerPresenter();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        if (((str.hashCode() == 178599290 && str.equals("getAudioType")) ? (char) 0 : (char) 65535) != 0) {
            return;
        }
        ((PlayerPresenter) this.c).c();
    }
}
