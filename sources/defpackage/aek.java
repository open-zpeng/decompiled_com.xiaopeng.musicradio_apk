package defpackage;

import com.xiaopeng.musicradio.bean.BaseInfo;
/* compiled from: IControlModel.java */
/* renamed from: aek  reason: default package */
/* loaded from: classes2.dex */
public interface aek {
    void a();

    void a(int i);

    void b();

    int c();

    BaseInfo d();

    void e();

    boolean enablePlayMode();

    void f();

    boolean g();

    int getDuration();

    int getPlayState();

    default boolean getPlayWhenReady() {
        return true;
    }

    int getPosition();

    int getSecondPosition();

    int getStartPosition();

    void h();

    void pause();

    void play();

    void rebootPlay(boolean z);

    void register();

    void seekTo(int i);

    boolean setVolume(float f);

    void stop();

    void unregister();
}
