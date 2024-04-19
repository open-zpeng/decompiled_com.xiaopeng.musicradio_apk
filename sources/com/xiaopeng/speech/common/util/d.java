package com.xiaopeng.speech.common.util;

import java.util.ArrayList;
import java.util.List;
/* compiled from: SimpleCallbackList.java */
/* loaded from: classes2.dex */
public class d<E> {
    private List<E> a = new ArrayList();

    public void a(E e) {
        synchronized (this.a) {
            if (e != null) {
                if (!this.a.contains(e)) {
                    this.a.add(e);
                }
            }
        }
    }

    public E[] a() {
        E[] eArr;
        synchronized (this.a) {
            eArr = this.a.size() > 0 ? (E[]) this.a.toArray() : null;
        }
        return eArr;
    }
}
