package defpackage;

import android.content.Context;
/* compiled from: IProgramMineService.java */
/* renamed from: awg  reason: default package */
/* loaded from: classes2.dex */
public interface awg {
    void checkoutDataCollect();

    <T> T getCollectedProgramList(Object obj);

    <T> T getHistoryProgramList(Object obj);

    int getPlayState();

    <T> T getPlayingProgram();

    boolean isCollected(Object obj);

    void play(Object obj);

    <T> T removeHistoryProgram(Object obj);

    <T> T setCollectedProgram(Object obj, boolean z);

    void startDetail(Context context, Object obj, String str);
}
