package com.xiaopeng.lib.framework.netchannelmodule.websocket;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import okhttp3.WebSocket;
import okio.ByteString;
@Deprecated
/* loaded from: classes.dex */
abstract class WebSocketConsumer implements Consumer<WebSocketInfo> {
    public abstract void onClosed(@NonNull WebSocket webSocket);

    public abstract void onMessage(@NonNull String str);

    public abstract void onMessage(@NonNull ByteString byteString);

    public abstract void onOpen(@NonNull WebSocket webSocket);

    WebSocketConsumer() {
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(WebSocketInfo webSocketInfo) {
        if (webSocketInfo.isOnOpen()) {
            onOpen(webSocketInfo.getWebSocket());
        } else if (webSocketInfo.isClosed()) {
            onClosed(webSocketInfo.getWebSocket());
        } else if (webSocketInfo.stringMessage() != null) {
            onMessage(webSocketInfo.stringMessage());
        } else if (webSocketInfo.byteStringMessage() != null) {
            onMessage(webSocketInfo.byteStringMessage());
        }
    }
}
