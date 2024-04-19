package com.xiaopeng.xui.app.delegate;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.d;
/* loaded from: classes2.dex */
public abstract class XActivityDelegate {
    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract boolean dispatchTouchEvent(MotionEvent motionEvent);

    public abstract void dispatchUserEvent();

    public abstract XActivityDismiss getActivityDismiss();

    public abstract <T extends XActivityTemplate> T getActivityTemplate();

    public abstract XActivityWindowAttributes getWindowAttributes();

    public abstract XActivityWindowVisible getWindowVisible();

    public abstract void installViewFactory();

    public abstract void onBackPressed();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onRecreate();

    public abstract void onResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean onTouchEvent(MotionEvent motionEvent);

    public static XActivityDelegate create(d dVar) {
        return new XActivityDelegateImpl(dVar);
    }
}
