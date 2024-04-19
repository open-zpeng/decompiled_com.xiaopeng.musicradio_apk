package com.xiaopeng.musicradio.mine.common.presenter;

import android.app.Activity;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.k;
import com.xiaopeng.musicradio.mine.common.view.b;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.xui.theme.XThemeManager;
import defpackage.agq;
import java.util.List;
/* loaded from: classes.dex */
public abstract class DataBasePresenter<UIInterface> extends DataListPresenter<UIInterface> implements k {
    private boolean p;
    protected String q;
    private boolean r;

    protected void a(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
    }

    public DataBasePresenter() {
    }

    public DataBasePresenter(int i, String str) {
        super(i);
        this.q = str;
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        if (x()) {
            u();
        } else {
            a("onResume");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        this.p = h.a().b();
        this.r = XThemeManager.isNight(a.a());
    }

    public void w() {
        this.r = XThemeManager.isNight(a.a());
    }

    public boolean x() {
        boolean b = h.a().b();
        boolean isNight = XThemeManager.isNight(a.a());
        boolean z = false;
        if (this.p != b || this.r != isNight) {
            if (a() instanceof b) {
                ((b) a()).j_();
                z = true;
            }
            this.p = b;
            this.r = isNight;
        }
        return z;
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.datalist.a.InterfaceC0133a
    public void a(Object... objArr) {
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof agq.v) && i()) {
            Activity activity = (Activity) a();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.finish();
        } else if (p()) {
            h();
        }
    }

    public int b(List list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static <T> T a(Object[] objArr, int i, Class<T> cls) {
        if (objArr == null || objArr.length <= i || !cls.isInstance(objArr[i])) {
            return null;
        }
        return (T) objArr[i];
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public String t() {
        return aqh.a().c();
    }
}
