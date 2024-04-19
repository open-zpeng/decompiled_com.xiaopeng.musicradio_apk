package com.xiaopeng.lib.framework.locationmodule;

import android.content.Context;
import com.xiaopeng.lib.framework.locationmodule.provider.ServiceProvider;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocation;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationProvider;
/* loaded from: classes.dex */
public class LocationProviderImpl implements ILocationProvider {
    @Override // com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationProvider
    public void start(Context context) {
        if (ServiceProvider.getInstance().started()) {
            throw new LocationServiceException(2);
        }
        ServiceProvider.getInstance().startService(context);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationProvider
    public void publishLocation(ILocation iLocation) {
        if (!ServiceProvider.getInstance().started()) {
            throw new LocationServiceException(1);
        }
        ServiceProvider.getInstance().publishLocation((LocationImpl) iLocation);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationProvider
    public boolean serviceStarted() {
        return ServiceProvider.getInstance().started();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationProvider
    public ILocation buildLocation() {
        return new LocationImpl();
    }
}
