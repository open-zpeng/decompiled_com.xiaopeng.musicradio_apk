package defpackage;
/* compiled from: IXmlyVipService.java */
/* renamed from: bcv  reason: default package */
/* loaded from: classes2.dex */
public interface bcv {
    void clearUserData();

    void fetchUserInfo();

    String getNickName();

    String getUserLogo();

    String getVipEndTime();

    boolean isVip();

    void loadUserInfo();

    void onServerPush(String str);
}
