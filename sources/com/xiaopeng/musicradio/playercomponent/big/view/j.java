package com.xiaopeng.musicradio.playercomponent.big.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.xpbean.ShareProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareSongBean;
import com.xiaopeng.musicradio.playercomponent.big.presenter.ShareCommunityDialogPresenter;
import com.xiaopeng.musicradio.proto.Share;
import com.xiaopeng.musicradio.utils.ak;
import defpackage.avp;
import java.util.List;
/* compiled from: ShareCommunityViewProxy.java */
/* loaded from: classes2.dex */
public class j extends aeu<f, ShareCommunityDialogPresenter> implements f {
    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void a() {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void a(Drawable drawable) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b(String str, String str2) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b_(String str, String str2) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void c(String str) {
    }

    public j(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: h */
    public ShareCommunityDialogPresenter g() {
        Log.d("ShareCommunityViewProxy_", "createPresenter: create P");
        ShareCommunityDialogPresenter shareCommunityDialogPresenter = new ShareCommunityDialogPresenter();
        shareCommunityDialogPresenter.onCreate(null);
        return shareCommunityDialogPresenter;
    }

    private void a(int i) {
        List<String> a = avv.a(((ShareCommunityDialogPresenter) this.c).c, i);
        if (a != null && !a.isEmpty()) {
            a(avv.a(a), 0);
        } else if (i == 0) {
            a(com.xiaopeng.musicradio.a.a.getResources().getString(avp.d.default_music_content, "E38"), 0);
        } else if (i == 3) {
            a(com.xiaopeng.musicradio.a.a.getResources().getString(avp.d.default_program_content, "E38"), 0);
        }
    }

    public void a(String str, int i) {
        Log.i("ShareCommunityViewProxy_", "msgId: ShareCommunityViewProxy_share_community_content" + str);
        Share.SingleContent.a a = Share.SingleContent.newBuilder().a(i);
        if (str != null) {
            a.a(str);
        }
        a("ShareCommunityViewProxy_share_community_content", (AbstractMessageLite) a.build());
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b() {
        ak.a(this.a, avp.d.share_succeed);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.f
    public void b(String str) {
        if (str != null) {
            ak.a(this.a, str);
        } else {
            ak.a(this.a, avp.d.share_fail);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("ShareCommunityViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals("RequestSingleSongContent", str)) {
            ((ShareCommunityDialogPresenter) this.c).c();
            a(0);
        } else if (TextUtils.equals("ShareSong", str)) {
            ShareSongBean h = bhx.h(bArr);
            Log.i("ShareCommunityViewProxy_", "enter share music:  " + h);
            ((ShareCommunityDialogPresenter) this.c).a(h);
        } else if (TextUtils.equals("ShareProgram", str)) {
            ShareProgramBean i = bhx.i(bArr);
            Log.i("ShareCommunityViewProxy_", "enter share Program  " + i);
            ((ShareCommunityDialogPresenter) this.c).a(i);
        } else if (TextUtils.equals("RequestSingleProgramContent", str)) {
            ((ShareCommunityDialogPresenter) this.c).c();
            a(3);
        }
    }
}
