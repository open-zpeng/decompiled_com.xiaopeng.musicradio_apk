package com.xiaopeng.musicradio.program.common.presenter;

import com.xiaopeng.musicradio.program.common.view.b;
/* loaded from: classes2.dex */
public abstract class BaseProgramListPresenter<UIInterface extends b> extends BaseProgramPresenter<UIInterface> {
    protected int b;
    protected int c;

    protected abstract void a(int i);

    public void d() {
        int i = this.b;
        if (i + 1 <= this.c) {
            a(i + 1);
        } else if (a() != 0) {
            ((b) a()).a(false, this.b, this.c);
        }
    }
}
