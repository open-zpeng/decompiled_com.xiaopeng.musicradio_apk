package com.xiaopeng.musicradio.program.main.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agh;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ProgramMainPresenter extends BasePresenter<axf> {
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
        if (TextUtils.isEmpty(bVar.b()) || (num = b.get(bVar.b())) == null || a() == null || bVar.a() != 1) {
            return;
        }
        u.d(bVar);
        a().j_(num.intValue());
        u.e(new agh.a(bVar.a(), bVar.c()));
    }
}
