package com.xiaopeng.musicradio.model.dui;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.model.dui.f;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
/* compiled from: DuiFmMediaModel.java */
/* loaded from: classes.dex */
public class a implements f.a {
    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a(float f) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void a(String str, CompositeDisposable compositeDisposable) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void b() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void b(String str, CompositeDisposable compositeDisposable) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void c(String str, CompositeDisposable compositeDisposable) {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void d() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void g() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void h() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void i() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void j() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void k() {
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void c() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.a.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<NetRadioInfo> b = apt.a().b();
                if (b.size() > 0) {
                    aps.i().a(b.get(0));
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void e() {
        a(true);
    }

    @Override // com.xiaopeng.musicradio.model.dui.f.a
    public void f() {
        a(false);
    }

    public void a(boolean z) {
        NetRadioInfo parentInfo;
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || (parentInfo = d.getParentInfo()) == null) {
            return;
        }
        ane.a().a(parentInfo, z);
    }
}
