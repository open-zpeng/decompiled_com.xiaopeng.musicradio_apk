package com.xiaopeng.musicradio.home.presenter;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.service.c;
/* loaded from: classes.dex */
public class HomePresenter extends BasePresenter<Object> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onStart(i iVar) {
        super.onStart(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onPause(i iVar) {
        super.onPause(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onStop(i iVar) {
        super.onStop(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            return true;
        }
        String queryParameter = uri.getQueryParameter("sub");
        if (TextUtils.equals(queryParameter, "guesslike")) {
            ((awh) c.a().b(awh.class)).openGuessLike();
            return true;
        } else if (TextUtils.equals(queryParameter, "programhistory")) {
            ((awh) c.a().b(awh.class)).openProgramHistory();
            return true;
        } else {
            return false;
        }
    }
}
