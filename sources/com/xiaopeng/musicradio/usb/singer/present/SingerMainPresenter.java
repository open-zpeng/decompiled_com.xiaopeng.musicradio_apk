package com.xiaopeng.musicradio.usb.singer.present;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.bbf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class SingerMainPresenter extends BasePresenter<bbw> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("SingerMainPresenter", "onCreateView");
        u.a(this);
        if (bbh.a().e() == 2) {
            if (bbh.a().f().size() > 0) {
                if (bbh.a().d()) {
                    c();
                } else if (a() != null) {
                    a().a();
                }
            } else if (a() != null) {
                a().r();
            }
        } else if (a() != null) {
            a().r();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealParseState(bbf.c cVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (a() != null) {
            a().s();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != null) {
            a().s();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealUpdateSingerLogo(bbf.e eVar) {
        if (a() != null) {
            a().t();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicReleased(agg.ae.e eVar) {
        if (a() != null) {
            a().r();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicLoading(agg.ae.d dVar) {
        if (a() != null) {
            a().a();
        }
    }

    private void c() {
        if (a() != null) {
            boolean d = bbh.a().d();
            Map<String, baz> h = bbh.a().h();
            if (d && h.size() > 0) {
                List<baz> arrayList = new ArrayList<>();
                for (String str : h.keySet()) {
                    arrayList.add(h.get(str));
                }
                a(arrayList);
                if (a() != null) {
                    ((bbw) a()).a(arrayList);
                }
            } else if (a() != null) {
                ((bbw) a()).r();
            }
        }
    }

    private void a(List<baz> list) {
        Collections.sort(list, new Comparator<baz>() { // from class: com.xiaopeng.musicradio.usb.singer.present.SingerMainPresenter.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(baz bazVar, baz bazVar2) {
                if (bazVar.b() == null) {
                    return -1;
                }
                if (bazVar2.b() == null) {
                    return 1;
                }
                return bazVar.b().compareTo(bazVar2.b());
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        if (a() != null) {
            a().av_();
        }
    }
}
