package com.xiaopeng.musicradio.program.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.program.activity.presenter.ProgramSubPresenter;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.widget.c;
@Route(path = "/program/activity/sub")
/* loaded from: classes2.dex */
public class ProgramSubActivity extends c<Object, ProgramSubPresenter> {
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
    }

    @Override // com.xiaopeng.musicradio.widget.c, com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(b.d.container);
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, 150);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public ProgramSubPresenter e() {
        return new ProgramSubPresenter();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            onBackPressed();
            return true;
        }
        return true;
    }
}
