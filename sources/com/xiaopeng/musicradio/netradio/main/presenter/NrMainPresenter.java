package com.xiaopeng.musicradio.netradio.main.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.netradio.main.view.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agh;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class NrMainPresenter extends BasePresenter<c> {
    private static final Map<String, Integer> b = new HashMap();

    static {
        b.put("concentration", 0);
        b.put("category", 1);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onSwitchTab(agh.b bVar) {
        Integer num;
        if (TextUtils.isEmpty(bVar.b()) || (num = b.get(bVar.b())) == null || a() == null || bVar.a() != 2) {
            return;
        }
        u.d(bVar);
        a().g_(num.intValue());
    }
}
