package defpackage;
/* compiled from: INetRadioMineService.java */
/* renamed from: aua  reason: default package */
/* loaded from: classes2.dex */
public interface aua {
    void checkoutDataCollect();

    <T> T getCollectedNetRadioList(Object obj);

    <T> T getHistoryNetRadioList(Object obj);

    int getPlayState();

    <T> T getPlayingInfo();

    boolean isCollected(Object obj);

    void play(Object obj);

    <T> T removeHistoryNetRadio(Object obj);

    <T> T setCollectedNetRadio(Object obj, boolean z);
}
