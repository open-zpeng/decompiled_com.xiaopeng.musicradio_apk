package defpackage;

import com.xiaopeng.speech.protocol.bean.recommend.RecommendBean;
/* compiled from: SupportWidget.java */
/* renamed from: bht  reason: default package */
/* loaded from: classes2.dex */
public class bht extends bhs {
    public bht() {
        super("custom");
    }

    public bht a(boolean z) {
        return (bht) super.c("status", z ? "1" : "0");
    }

    public bht a(String str) {
        return (bht) super.c(RecommendBean.SHOW_TIME_TTS, str);
    }
}
