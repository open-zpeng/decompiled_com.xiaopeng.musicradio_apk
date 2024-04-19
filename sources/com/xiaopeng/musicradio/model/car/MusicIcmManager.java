package com.xiaopeng.musicradio.model.car;

import android.car.Car;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.icm.CarIcmManager;
import android.util.Log;
import androidx.annotation.Keep;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.model.car.b;
import com.xiaopeng.musicradio.model.car.c;
import com.xiaopeng.musicradio.utils.u;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MusicIcmManager implements CarIcmManager.CarIcmEventCallback, c.a {
    private CarIcmManager a;

    @Override // com.xiaopeng.musicradio.model.car.c.a
    public void a(final Car car) {
        Log.i("MusicIcmManager", "onServiceConnected: =======");
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.model.car.MusicIcmManager.1
            @Override // java.lang.Runnable
            public void run() {
                Log.i("MusicIcmManager", "run: ======== ");
                try {
                    MusicIcmManager.this.a = (CarIcmManager) car.getCarManager("xp_icm");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(554702353);
                    arrayList.add(557848078);
                    MusicIcmManager.this.a.registerPropCallback(arrayList, MusicIcmManager.this);
                } catch (Exception e) {
                    LogUtils.e("MusicIcmManager", e);
                }
            }
        });
    }

    @Keep
    public void onChangeEvent(CarPropertyValue carPropertyValue) {
        Log.i("MusicIcmManager", "onChangeEvent: ===== " + carPropertyValue.getPropertyId());
        if (carPropertyValue.getPropertyId() == 554702353) {
            u.c(new b.a());
        } else if (carPropertyValue.getPropertyId() == 557848078) {
            u.c(new b.a());
        }
    }

    @Keep
    public void onErrorEvent(int i, int i2) {
        Log.e("MusicIcmManager", "onErrorEvent: i = " + i + " i1 = " + i2);
    }
}
