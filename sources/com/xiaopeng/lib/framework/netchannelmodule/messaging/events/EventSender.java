package com.xiaopeng.lib.framework.netchannelmodule.messaging.events;

import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.messaging.IEvent;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.messaging.IMessaging;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.messaging.MessagingException;
import com.xiaopeng.lib.framework.netchannelmodule.common.BackgroundHandler;
import org.greenrobot.eventbus.EventBus;
/* loaded from: classes.dex */
public class EventSender {
    private static final String THREAD_NAME = "EventSender";
    private static BackgroundHandler mHandler;
    private static volatile EventSender sCurrentSender;
    private IMessaging.CHANNEL mChannel;

    public static EventSender getCurrent() {
        return sCurrentSender;
    }

    public EventSender(IMessaging.CHANNEL channel) {
        this.mChannel = channel;
        sCurrentSender = this;
        mHandler = new BackgroundHandler(THREAD_NAME);
    }

    public void changeChannel(IMessaging.CHANNEL channel) {
        this.mChannel = channel;
    }

    public void postDeliveryCompleted(long j, byte[] bArr) {
        post(new ReportingEvent(IEvent.TYPE.DELIVERY_COMPLETED).channel(this.mChannel).messageId(j).message(bArr));
    }

    public void postDeliveryCompleted(long j) {
        post(new ReportingEvent(IEvent.TYPE.DELIVERY_COMPLETED).channel(this.mChannel).messageId(j));
    }

    public void postDeliveryFailure(long j, int i) {
        post(new ReportingEvent(IEvent.TYPE.DELIVERY_FAILURE).channel(this.mChannel).messageId(j).reasonCode(i));
    }

    public void postReceivedMessage(String str, byte[] bArr) {
        postAtFront(new ReceivedMessageEvent(IEvent.TYPE.RECEIVED_MESSAGE).channel(this.mChannel).topic(str).message(bArr));
    }

    public void postConnected(String str) {
        postAtFront(new ConnectionEvent(IEvent.TYPE.CONNECTED).channel(this.mChannel).serverUri(str));
    }

    public void postDisconnected(Throwable th) {
        String str;
        int i;
        int i2 = 0;
        if (th != null) {
            str = th.getMessage();
            if (th instanceof bks) {
                i2 = 1;
                i = ((bks) th).a();
            } else if (th instanceof MessagingException) {
                i2 = ((MessagingException) th).getReasonCode();
                i = 0;
            } else {
                i = 0;
            }
        } else {
            str = null;
            i = 0;
        }
        ConnectionEvent reasonCode = new ConnectionEvent(IEvent.TYPE.DISCONNECTED).channel(this.mChannel).reasonCode(i2);
        if (str == null) {
            str = "";
        }
        postAtFront(reasonCode.serverUri(str).protocolReasonCode(i));
    }

    public void postSubscribed(String str) {
        post(new SubscribeEvent(IEvent.TYPE.SUBSCRIBED).channel(this.mChannel).topic(str));
    }

    public void postUnsubscribed() {
        post(new SubscribeEvent(IEvent.TYPE.UNSUBSCRIBED).channel(this.mChannel));
    }

    public void postTracingLog(String str) {
        post(new TracingEvent().channel(this.mChannel).message(str));
    }

    public void close() {
        mHandler.stop();
    }

    private void post(final IEvent iEvent) {
        mHandler.post(new Runnable() { // from class: com.xiaopeng.lib.framework.netchannelmodule.messaging.events.EventSender.1
            @Override // java.lang.Runnable
            public void run() {
                EventBus.getDefault().post(iEvent);
            }
        });
    }

    private void postAtFront(final IEvent iEvent) {
        mHandler.postAtFront(new Runnable() { // from class: com.xiaopeng.lib.framework.netchannelmodule.messaging.events.EventSender.2
            @Override // java.lang.Runnable
            public void run() {
                EventBus.getDefault().post(iEvent);
            }
        });
    }
}
