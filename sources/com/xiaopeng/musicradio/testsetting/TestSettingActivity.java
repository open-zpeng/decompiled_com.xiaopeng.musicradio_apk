package com.xiaopeng.musicradio.testsetting;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.base.a;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.model.dui.g;
import com.xiaopeng.speech.vui.utils.LogUtils;
import defpackage.aho;
@Route(path = "/test/setting")
/* loaded from: classes2.dex */
public class TestSettingActivity extends a {
    private Switch f;

    @Override // com.xiaopeng.musicradio.commonui.base.a
    protected BasePresenter e() {
        return new BasePresenter() { // from class: com.xiaopeng.musicradio.testsetting.TestSettingActivity.1
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aho.d.activity_test_setting;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (Switch) findViewById(aho.c.switch_vui_log);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.f.setChecked(LogUtils.isLogEnable());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        LogUtils.i("TestSettingActivity", "isMusicAccountLogin:" + g.a().n());
        LogUtils.i("TestSettingActivity", "isQualityPageOpend:" + g.a().o());
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.xiaopeng.musicradio.testsetting.TestSettingActivity.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LogUtils.setLogEnable(z);
            }
        });
        findViewById(aho.c.btn_wx_login).setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.testsetting.TestSettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                adp.c();
            }
        });
        findViewById(aho.c.btn_qq_login).setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.testsetting.TestSettingActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                adp.d();
            }
        });
        findViewById(aho.c.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.testsetting.TestSettingActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TestSettingActivity.this.finish();
            }
        });
    }
}
