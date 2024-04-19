package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: CancelableCountDownLatch.java */
/* renamed from: sr  reason: default package */
/* loaded from: classes3.dex */
public class sr extends CountDownLatch {
    public sr(int i) {
        super(i);
    }

    public void a() {
        while (getCount() > 0) {
            countDown();
        }
    }
}
