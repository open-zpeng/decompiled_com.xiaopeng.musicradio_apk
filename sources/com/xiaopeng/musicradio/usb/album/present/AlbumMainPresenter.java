package com.xiaopeng.musicradio.usb.album.present;

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
public class AlbumMainPresenter extends BasePresenter<bar> {
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
    public void dealUpdateAlbumLogo(bbf.d dVar) {
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
            Map<String, bav> i = bbh.a().i();
            if (d && i.size() > 0) {
                List<bav> arrayList = new ArrayList<>();
                for (String str : i.keySet()) {
                    arrayList.add(i.get(str));
                }
                a(arrayList);
                if (a() != null) {
                    ((bar) a()).a(arrayList);
                }
            } else if (a() != null) {
                ((bar) a()).r();
            }
        }
    }

    private void a(List<bav> list) {
        Collections.sort(list, new Comparator<bav>() { // from class: com.xiaopeng.musicradio.usb.album.present.AlbumMainPresenter.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(bav bavVar, bav bavVar2) {
                if (bavVar.c() == null) {
                    return -1;
                }
                if (bavVar2.c() == null) {
                    return 1;
                }
                return bavVar.c().compareTo(bavVar2.c());
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        if (a() != null) {
            a().z();
        }
    }
}
