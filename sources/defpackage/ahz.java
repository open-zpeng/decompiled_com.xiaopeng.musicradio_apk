package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.mine.collect.album.view.CollectedAlbumView;
import com.xiaopeng.musicradio.mine.collect.music.view.CollectedMusicView;
import com.xiaopeng.musicradio.mine.collect.netradio.view.CollectedNetradioView;
import com.xiaopeng.musicradio.mine.collect.program.view.CollectedProgramView;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.u;
/* compiled from: CollectLoadingModel.java */
/* renamed from: ahz  reason: default package */
/* loaded from: classes2.dex */
public class ahz extends amh {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CollectLoadingModel.java */
    /* renamed from: ahz$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final ahz a = new ahz();
    }

    public ahz() {
        super(new Class[]{CollectedMusicView.class, CollectedAlbumView.class, CollectedProgramView.class, CollectedNetradioView.class});
    }

    public static ahz a() {
        return a.a;
    }

    @Override // defpackage.amh
    protected void b() {
        if (f() && h.a().b()) {
            u.c(new ahy());
        }
    }

    public Integer c() {
        Integer num;
        View b = b(CollectedMusicView.class);
        if (b != null) {
            ae.a((ViewGroup) b, 8);
            num = Integer.valueOf(b(b, 0));
        } else {
            num = null;
        }
        View b2 = b(CollectedAlbumView.class);
        if (b2 != null) {
            ae.a((ViewGroup) b2, 8);
            return Integer.valueOf(b(b2, 0));
        }
        return num;
    }

    public Integer d() {
        Integer num;
        View b = b(CollectedProgramView.class);
        if (b != null) {
            ae.a((ViewGroup) b, 8);
            num = Integer.valueOf(b(b, 0));
        } else {
            num = null;
        }
        View b2 = b(CollectedNetradioView.class);
        if (b2 != null) {
            ae.a((ViewGroup) b2, 8);
            return Integer.valueOf(b(b2, 0));
        }
        return num;
    }
}
