package com.xiaopeng.musicradio.common;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: CommonIndex.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: CommonIndex.java */
    /* renamed from: com.xiaopeng.musicradio.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0129a {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCommon(C0129a c0129a) {
    }

    public a() {
        EventBus.getDefault().register(this);
    }
}
