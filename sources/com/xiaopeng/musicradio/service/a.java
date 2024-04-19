package com.xiaopeng.musicradio.service;
/* compiled from: AbstractService.java */
/* loaded from: classes2.dex */
public abstract class a {
    private boolean mHasStart;

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        a();
    }

    public void setStart(boolean z) {
        this.mHasStart = z;
    }

    public boolean hasStart() {
        return this.mHasStart;
    }
}
