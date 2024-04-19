package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.VipDetail;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.base.d;
import com.xiaopeng.musicradio.login.manager.main.presenter.LoginManagerPresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.q;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.agy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LoginManagerFragment.java */
@Route(path = "/login/fragment/manager")
/* renamed from: ahj  reason: default package */
/* loaded from: classes2.dex */
public class ahj extends d<ahc, ahi, LoginManagerPresenter> implements ahi, View.OnClickListener {
    private boolean e;
    private boolean f;

    private void r() {
    }

    private void s() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainMineManager";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        agz.a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    protected void d() {
        super.d();
        this.e = true;
        this.f = true;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return agy.c.fragment_login_manager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        ((LoginManagerPresenter) this.b).c();
    }

    @Override // defpackage.ahi
    public void a_(boolean z) {
        int visibility = ((ahc) this.d).e.getVisibility();
        if (z) {
            ((LoginManagerPresenter) this.b).f();
            ((ahc) this.d).l.setVisibility(8);
            ((ahc) this.d).j.setVisibility(0);
            ((ahc) this.d).k.setVisibility(0);
            ((ahc) this.d).t.setVisibility(0);
            ((ahc) this.d).d.setVisibility(8);
            ((ahc) this.d).c.setVisibility(8);
            ((ahc) this.d).v.setVisibility(8);
            ((ahc) this.d).u.setVisibility(0);
            ((ahc) this.d).r.setVisibility(0);
            ((ahc) this.d).e.setVisibility(0);
            ((ahc) this.d).f.setVisibility(0);
            ((ahc) this.d).e.setEnabled(true);
            r();
        } else {
            ((ahc) this.d).l.setVisibility(0);
            ((ahc) this.d).j.setVisibility(8);
            ((ahc) this.d).k.setVisibility(8);
            ((ahc) this.d).t.setVisibility(8);
            y.a((String) null, agy.a.img_header_default, ((ahc) this.d).j);
            ((ahc) this.d).d.setVisibility(0);
            ((ahc) this.d).c.setVisibility(0);
            ((ahc) this.d).v.setVisibility(0);
            ((ahc) this.d).u.setVisibility(8);
            ((ahc) this.d).r.setVisibility(8);
            ((ahc) this.d).w.setVisibility(8);
            ((ahc) this.d).e.setVisibility(8);
            ((ahc) this.d).f.setVisibility(8);
        }
        if (visibility != ((ahc) this.d).e.getVisibility() || this.e) {
            ahm.a(o(), ((ahc) this.d).p);
            this.e = false;
        }
    }

    @Override // defpackage.ahi
    public void a(String str, String str2, boolean z, boolean z2, String str3, List<VipDetail> list) {
        ((ahc) this.d).u.setText(str);
        y.a(str2, f.e.img_header_default, ((ahc) this.d).j);
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (VipDetail vipDetail : list) {
                if (TextUtils.isEmpty(vipDetail.getText())) {
                    arrayList.add(vipDetail);
                }
            }
            list.removeAll(arrayList);
            ArrayList<String> arrayList2 = new ArrayList<>();
            String str4 = "";
            for (int i = 0; i < list.size(); i++) {
                VipDetail vipDetail2 = list.get(i);
                if (!TextUtils.isEmpty(vipDetail2.getLogo())) {
                    arrayList2.add(vipDetail2.getLogo());
                }
                if (!TextUtils.isEmpty(vipDetail2.getText())) {
                    str4 = str4 + vipDetail2.getText() + bdk.a(list.get(0).getExpireTime());
                    if (i != list.size() - 1) {
                        str4 = str4 + "\n";
                    }
                }
            }
            ((ahc) this.d).r.setData(arrayList2);
            ((ahc) this.d).r.setVisibility(0);
            ((ahc) this.d).w.setText(str4);
            ((ahc) this.d).w.setVisibility(0);
        } else {
            ((ahc) this.d).r.setVisibility(8);
            ((ahc) this.d).w.setVisibility(8);
        }
        ((ahc) this.d).f.setText(agy.d.buy_vip);
        r();
    }

    @Override // defpackage.ahi
    public void b(boolean z) {
        int visibility = ((ahc) this.d).h.getVisibility();
        if (z) {
            ((LoginManagerPresenter) this.b).h();
            ((ahc) this.d).o.setVisibility(8);
            ((ahc) this.d).m.setVisibility(0);
            ((ahc) this.d).n.setVisibility(0);
            ((ahc) this.d).x.setVisibility(0);
            ((ahc) this.d).g.setVisibility(8);
            ((ahc) this.d).z.setVisibility(8);
            ((ahc) this.d).y.setVisibility(0);
            ((ahc) this.d).h.setVisibility(0);
            ((ahc) this.d).i.setVisibility(0);
            ((ahc) this.d).h.setEnabled(true);
            s();
        } else {
            ((ahc) this.d).o.setVisibility(0);
            ((ahc) this.d).m.setVisibility(8);
            ((ahc) this.d).n.setVisibility(8);
            ((ahc) this.d).x.setVisibility(8);
            y.a((String) null, agy.a.img_header_default, ((ahc) this.d).m);
            ((ahc) this.d).g.setVisibility(0);
            ((ahc) this.d).z.setVisibility(0);
            ((ahc) this.d).y.setVisibility(8);
            ((ahc) this.d).A.setVisibility(8);
            ((ahc) this.d).h.setVisibility(8);
            ((ahc) this.d).i.setVisibility(8);
        }
        if (visibility != ((ahc) this.d).h.getVisibility() || this.f) {
            ahm.a(o(), ((ahc) this.d).q);
            this.f = false;
        }
    }

    @Override // defpackage.ahi
    public void a(String str, String str2, boolean z, String str3) {
        ((ahc) this.d).y.setText(str);
        y.a(str2, agy.a.img_header_default, ((ahc) this.d).m);
        Context context = ((ahc) this.d).A.getContext();
        if (z && !TextUtils.isEmpty(str3)) {
            ((ahc) this.d).y.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, agy.a.ic_xmly_vip, 0);
            XTextView xTextView = ((ahc) this.d).A;
            xTextView.setText(context.getString(agy.d.vip_xmly_tips_time) + str3);
            ((ahc) this.d).A.setVisibility(0);
        } else {
            ((ahc) this.d).y.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            ((ahc) this.d).A.setText(agy.d.vip_xmly_tips_none);
            ((ahc) this.d).A.setVisibility(8);
        }
        s();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        ahm.a(((ahc) this.d).p, bih.UNKNOWN);
        ahm.a(((ahc) this.d).q, bih.UNKNOWN);
        ahm.a(((ahc) this.d).s, bih.UNKNOWN);
        ((ahc) this.d).B.setVipSaleType(3);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        ((ahc) this.d).d.setOnClickListener(this);
        ((ahc) this.d).c.setOnClickListener(this);
        ((ahc) this.d).e.setOnClickListener(this);
        ((ahc) this.d).f.setOnClickListener(this);
        ((ahc) this.d).g.setOnClickListener(this);
        ((ahc) this.d).h.setOnClickListener(this);
        ((ahc) this.d).i.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == agy.b.btn_logout) {
            t();
        } else if (view.getId() == agy.b.btn_vip_buying) {
            a(view.getContext());
        } else if (view.getId() == agy.b.btn_login_wx) {
            agz.b();
            adp.a("LoginManagerFragment");
        } else if (view.getId() == agy.b.btn_login_qq) {
            agz.c();
            adp.b("LoginManagerFragment");
        } else if (view.getId() == agy.b.btn_xmly_logout) {
            u();
        } else if (view.getId() == agy.b.btn_xmly_vip_buying) {
            b(view.getContext());
        } else if (view.getId() == agy.b.btn_xmly_login) {
            agz.e();
            aqf.a().a(new apz() { // from class: ahj.1
                @Override // defpackage.apz
                public void a(boolean z) {
                    LogUtils.i("LoginManagerFragment", "onLogin:" + z);
                }

                @Override // defpackage.apz
                public void a() {
                    LogUtils.i("LoginManagerFragment", "onLoginFail");
                }
            });
        }
    }

    private void a(Context context) {
        agz.g();
        ((bdn) c.a().b(bdn.class)).startVipBuy(0);
    }

    private void t() {
        if (q.a(getActivity())) {
            return;
        }
        agz.d();
        Context context = ((ahc) this.d).e.getContext();
        final XDialog xDialog = new XDialog(context, 0, r.a());
        xDialog.setVuiSceneId("LoginLogoutDialog");
        xDialog.setMessage(agy.d.text_dialog_logout).setPositiveButton(context.getString(agy.d.user_logout), new XDialogInterface.OnClickListener() { // from class: ahj.3
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog2.setNegativeButtonEnable(false);
                ((LoginManagerPresenter) ahj.this.b).g();
            }
        }).setNegativeButton(context.getString(agy.d.cancel), new XDialogInterface.OnClickListener() { // from class: ahj.2
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog.setNegativeButtonEnable(false);
            }
        });
        q.a(getActivity(), xDialog);
    }

    private void b(Context context) {
        agz.h();
        ((bdn) c.a().b(bdn.class)).startVipBuy(2);
    }

    private void u() {
        if (q.a(getActivity())) {
            return;
        }
        agz.f();
        Context context = ((ahc) this.d).h.getContext();
        final XDialog xDialog = new XDialog(context, 0, r.a());
        xDialog.setVuiSceneId("LoginLogoutDialog");
        xDialog.setMessage(agy.d.text_dialog_xmly_logout).setPositiveButton(context.getString(agy.d.user_logout), new XDialogInterface.OnClickListener() { // from class: ahj.5
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog2.setNegativeButtonEnable(false);
                ((LoginManagerPresenter) ahj.this.b).i();
            }
        }).setNegativeButton(context.getString(agy.d.cancel), new XDialogInterface.OnClickListener() { // from class: ahj.4
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog.setNegativeButtonEnable(false);
            }
        });
        q.a(getActivity(), xDialog);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public LoginManagerPresenter ao_() {
        return new LoginManagerPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return ahm.a();
    }
}
