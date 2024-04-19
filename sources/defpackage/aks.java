package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.mine.history.album.view.HistoryAlbumView;
import com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicView;
import com.xiaopeng.musicradio.mine.history.netradio.view.HistoryNetradioView;
import com.xiaopeng.musicradio.mine.history.program.view.HistoryProgramView;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.u;
/* compiled from: HistoryLoadingModel.java */
/* renamed from: aks  reason: default package */
/* loaded from: classes2.dex */
public class aks extends amh {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HistoryLoadingModel.java */
    /* renamed from: aks$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final aks a = new aks();
    }

    public aks() {
        super(new Class[]{HistoryMusicView.class, HistoryAlbumView.class, HistoryProgramView.class, HistoryNetradioView.class});
    }

    public static aks a() {
        return a.a;
    }

    @Override // defpackage.amh
    protected void b() {
        if (f() && h.a().b()) {
            u.c(new akq());
        }
    }

    public Integer c() {
        Integer num;
        View b = b(HistoryMusicView.class);
        if (b != null) {
            ae.a((ViewGroup) b, 8);
            num = Integer.valueOf(b(b, 0));
        } else {
            num = null;
        }
        View b2 = b(HistoryAlbumView.class);
        if (b2 != null) {
            ae.a((ViewGroup) b2, 8);
            return Integer.valueOf(b(b2, 0));
        }
        return num;
    }
}
