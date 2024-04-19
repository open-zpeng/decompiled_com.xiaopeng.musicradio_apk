package com.xiaopeng.lib.framework.netchannelmodule.messaging.profile;

import android.os.SystemProperties;
import android.text.TextUtils;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.messaging.IMessaging;
import com.xiaopeng.lib.framework.netchannelmodule.common.GlobalConfig;
/* loaded from: classes.dex */
public final class ReportingChannelProfile extends AbstractChannelProfile {
    private static final boolean FUNCTION_PUBLISH = true;
    private static final boolean FUNCTION_SUBSCRIBE = false;
    private static final int MAX_CACHABLE_BUFFER_SIZE = 1000;

    public ReportingChannelProfile() {
        super(true, false);
    }

    @Override // com.xiaopeng.lib.framework.netchannelmodule.messaging.profile.AbstractChannelProfile
    public String serverUrl() {
        String decode = decode(SystemProperties.get(SYSTEM_PROPERTY_MQTT_REPORTING_URL));
        if (TextUtils.isEmpty(decode)) {
            return "";
        }
        return resolveWithDns("ssl://" + decode);
    }

    @Override // com.xiaopeng.lib.framework.netchannelmodule.messaging.profile.AbstractChannelProfile
    public String clientId() {
        return super.clientId();
    }

    @Override // com.xiaopeng.lib.framework.netchannelmodule.messaging.profile.AbstractChannelProfile
    public IMessaging.CHANNEL channel() {
        return IMessaging.CHANNEL.REPORTING;
    }

    @Override // com.xiaopeng.lib.framework.netchannelmodule.messaging.profile.AbstractChannelProfile
    public int defaultQoSLevel() {
        return IMessaging.QOS.LEVEL_1.value();
    }

    @Override // com.xiaopeng.lib.framework.netchannelmodule.messaging.profile.AbstractChannelProfile
    public bkq buildConnectOptions() {
        bkq buildConnectOptions = super.buildConnectOptions();
        buildConnectOptions.a(GlobalConfig.getSocketFactory());
        buildConnectOptions.a(getMQTTUserName());
        buildConnectOptions.a(getMQTTPassword().toCharArray());
        return buildConnectOptions;
    }

    @Override // com.xiaopeng.lib.framework.netchannelmodule.messaging.profile.AbstractChannelProfile
    public bkg buildBufferOptions() {
        bkg bkgVar = new bkg();
        bkgVar.a(true);
        bkgVar.a(1000);
        bkgVar.c(true);
        bkgVar.b(true);
        return bkgVar;
    }

    private String getMQTTUserName() {
        return decode(SystemProperties.get(SYSTEM_PROPERTY_MQTT_USER));
    }

    private String getMQTTPassword() {
        return decode(SystemProperties.get(SYSTEM_PROPERTY_MQTT_PASS));
    }
}
