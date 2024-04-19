package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.framework.locationmodule.LocationModuleEntry;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocation;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationConsumer;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationEvent;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.ILocationServiceException;
import com.xiaopeng.lib.framework.moduleinterface.locationmodule.IStateEvent;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.ArrayList;
import java.util.Arrays;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: LocationModel.java */
/* renamed from: apd  reason: default package */
/* loaded from: classes2.dex */
public class apd {
    private static ArrayList<String> e = new ArrayList<>(Arrays.asList("440100", "430100", "410100", "370100", "350100", "360600"));
    private static ArrayList<String> f = new ArrayList<>(Arrays.asList("广州市", "长沙市", "郑州市", "济南市", "福州市", "鹰潭市"));
    private ILocation a;
    private boolean b;
    private String c;
    private String d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationModel.java */
    /* renamed from: apd$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final apd a = new apd();
    }

    public static apd a() {
        return a.a;
    }

    public apd() {
        this.c = ay.c("sp_key_location_adcode", "440100");
        if (TextUtils.equals(this.c, "-1")) {
            this.c = "440100";
            ay.a("sp_key_location_adcode", this.c);
        }
        this.d = ay.c("sp_key_location_city", "广州市");
        String str = this.d;
        if (str == null || TextUtils.isEmpty(str)) {
            this.d = "广州市";
            ay.a("sp_key_location_city", this.d);
        }
        c();
    }

    private void c() {
        Log.i("LocationModel", "init: ");
        u.a(this);
        Module.register(LocationModuleEntry.class, new LocationModuleEntry());
        try {
            ((ILocationConsumer) Module.get(LocationModuleEntry.class).get(ILocationConsumer.class)).init(com.xiaopeng.musicradio.a.a);
        } catch (ILocationServiceException e2) {
            Log.e("LocationModel", "init: " + e2);
        }
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onMessageEventPosting(IStateEvent iStateEvent) {
        Log.i("LocationModel", "Service State changed:" + iStateEvent.type());
        if (iStateEvent.type() == IStateEvent.TYPE.BOUND) {
            Log.i("LocationModel", "onMessageEventPosting: ");
            d();
            return;
        }
        this.b = false;
    }

    private void d() {
        if (this.b) {
            return;
        }
        try {
            ((ILocationConsumer) Module.get(LocationModuleEntry.class).get(ILocationConsumer.class)).subscribe(ILocation.Category.DR_LOCATION);
            this.b = true;
        } catch (ILocationServiceException e2) {
            Log.e("LocationModel", "Failed to subscribe location, exception:" + e2);
        }
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onMessageEventPosting(ILocationEvent iLocationEvent) {
        if (this.a == null) {
            this.a = iLocationEvent.location();
            this.c = this.a.adCode();
            this.d = this.a.city();
            ay.a("sp_key_location_adcode", this.a.adCode());
            ay.a("sp_key_location_city", this.a.city());
        }
        if (TextUtils.equals(this.a.adCode(), iLocationEvent.location().adCode()) || TextUtils.equals(iLocationEvent.location().adCode(), "-1")) {
            return;
        }
        this.a = iLocationEvent.location();
        this.c = iLocationEvent.location().adCode();
        this.d = iLocationEvent.location().city();
        ay.a("sp_key_location_adcode", this.c);
        ay.a("sp_key_location_city", this.d);
        u.c(new agg.q());
    }

    public String b() {
        return this.c;
    }
}
