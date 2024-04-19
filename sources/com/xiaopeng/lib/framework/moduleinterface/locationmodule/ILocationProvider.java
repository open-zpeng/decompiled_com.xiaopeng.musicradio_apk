package com.xiaopeng.lib.framework.moduleinterface.locationmodule;

import android.content.Context;
/* loaded from: classes.dex */
public interface ILocationProvider {
    ILocation buildLocation();

    void publishLocation(ILocation iLocation);

    boolean serviceStarted();

    void start(Context context);
}
