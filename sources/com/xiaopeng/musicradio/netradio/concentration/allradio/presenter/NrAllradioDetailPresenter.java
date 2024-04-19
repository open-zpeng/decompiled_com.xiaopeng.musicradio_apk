package com.xiaopeng.musicradio.netradio.concentration.allradio.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
/* loaded from: classes.dex */
public class NrAllradioDetailPresenter extends BasePresenter<Object> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NrAllradioDetailPresenter", "onResume");
        aup.c();
    }
}
