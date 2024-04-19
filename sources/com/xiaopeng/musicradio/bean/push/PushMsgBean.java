package com.xiaopeng.musicradio.bean.push;
/* loaded from: classes.dex */
public class PushMsgBean {
    private String data;
    int scene;

    public String getData() {
        return this.data;
    }

    public void setData(String str) {
        this.data = str;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        int source;

        public int getSource() {
            return this.source;
        }

        public void setSource(int i) {
            this.source = i;
        }
    }

    public int getScene() {
        return this.scene;
    }

    public void setScene(int i) {
        this.scene = i;
    }
}
