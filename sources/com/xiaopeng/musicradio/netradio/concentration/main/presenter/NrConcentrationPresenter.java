package com.xiaopeng.musicradio.netradio.concentration.main.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agm;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class NrConcentrationPresenter extends BasePresenter<aul> {
    private int b = 0;
    private int c = 0;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NrConcentrationPresenter", "onCreateView");
        u.a(this);
        this.b = apt.a().a(agm.d);
        this.c = apt.a().a(agm.e);
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetRadioState(agm.a aVar) {
        Log.i("NrConcentrationPresenter", "NetRadioState" + aVar.a() + " " + aVar.b());
        if (aVar.b() == agm.d) {
            this.b = aVar.a();
        } else if (aVar.b() == agm.e) {
            this.c = aVar.a();
        }
        d();
    }

    private void d() {
        if (this.b == agm.b && this.c == agm.b) {
            if (a() != null) {
                a().N_();
            }
        } else if (this.b == agm.c || this.c == agm.c) {
            if (a() != null) {
                a().a("");
            }
        } else if ((this.b == agm.a || this.c == agm.a) && a() != null) {
            a().a();
        }
    }

    public void c() {
        if (this.b != agm.b) {
            if (a() != null) {
                a().a();
            }
            this.b = agm.a;
            u.e(new agm.c(agm.d));
        }
        if (this.c != agm.b) {
            if (a() != null) {
                a().a();
            }
            this.c = agm.a;
            u.e(new agm.c(agm.e));
        }
    }
}
