package defpackage;

import androidx.fragment.app.FragmentManager;
/* compiled from: Action.java */
/* renamed from: bjf  reason: default package */
/* loaded from: classes3.dex */
public abstract class bjf {
    public FragmentManager h;
    public int i;
    public long j;

    public abstract void a();

    public bjf() {
        this.i = 0;
        this.j = 0L;
    }

    public bjf(int i) {
        this.i = 0;
        this.j = 0L;
        this.i = i;
    }

    public bjf(int i, FragmentManager fragmentManager) {
        this(i);
        this.h = fragmentManager;
    }
}
