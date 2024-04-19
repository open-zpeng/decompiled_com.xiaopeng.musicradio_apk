package com.xiaopeng.musicradio.widget.lifecycle;

import android.content.Intent;
/* compiled from: IViewLifecycle.java */
/* loaded from: classes2.dex */
public interface h {
    void onActivityResult(int i, int i2, Intent intent);

    void onCreate();

    void onCreateView();

    void onDestroy();

    void onDestroyView();

    void onNewIntent(Intent intent);

    void onParentAnimationEnd();

    void onParentAnimationStart();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void onSupportInvisible();

    void onSupportVisible();
}
