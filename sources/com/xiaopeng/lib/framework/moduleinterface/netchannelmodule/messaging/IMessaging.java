package com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.messaging;

import android.app.Application;
/* loaded from: classes.dex */
public interface IMessaging {
    public static final long DEFAULT_MESSAGE_ID = 0;

    /* loaded from: classes.dex */
    public enum CHANNEL {
        COMMUNICATION,
        REPORTING,
        TESTING
    }

    boolean available();

    void initChannelWithContext(CHANNEL channel, Application application);

    long publish(String str, String str2);

    long publish(String str, String str2, QOS qos);

    long publish(String str, byte[] bArr);

    long publish(String str, byte[] bArr, QOS qos);

    void subscribe(String str);

    /* loaded from: classes.dex */
    public enum QOS {
        LEVEL_0(0),
        LEVEL_1(1),
        LEVEL_2(2);
        
        private int value;

        QOS(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }
}
