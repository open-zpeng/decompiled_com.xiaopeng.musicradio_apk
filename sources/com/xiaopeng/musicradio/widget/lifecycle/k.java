package com.xiaopeng.musicradio.widget.lifecycle;

import android.os.Bundle;
import android.view.animation.Animation;
import com.xiaopeng.musicradio.utils.aw;
import me.yokeyword.fragmentation.SupportFragmentDelegate;
/* compiled from: MusicSupportFragmentDelegate.java */
/* loaded from: classes2.dex */
public class k extends SupportFragmentDelegate {
    private me.yokeyword.fragmentation.helper.internal.a i;

    public k(me.yokeyword.fragmentation.c cVar) {
        super(cVar);
    }

    @Override // me.yokeyword.fragmentation.SupportFragmentDelegate
    public void a(Bundle bundle) {
        super.a(bundle);
        this.i = (me.yokeyword.fragmentation.helper.internal.a) aw.b(this, "mAnimHelper");
    }

    @Override // me.yokeyword.fragmentation.SupportFragmentDelegate
    public Animation a(int i, boolean z, int i2) {
        me.yokeyword.fragmentation.helper.internal.a aVar;
        Animation a = super.a(i, z, i2);
        if (z || (aVar = this.i) == null || a == aVar.a() || a == this.i.d || a == this.i.b) {
            return a;
        }
        return null;
    }
}
