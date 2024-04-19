package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.commonui.widget.a;
import defpackage.aht;
/* compiled from: MinePreLoaderImpl.java */
/* renamed from: ami  reason: default package */
/* loaded from: classes2.dex */
public class ami implements ame {
    @Override // defpackage.ame
    public Runnable a(Context context, final a aVar, int i) {
        if (i != 0) {
            if (i != 2) {
                return null;
            }
            return new Runnable() { // from class: ami.2
                @Override // java.lang.Runnable
                public void run() {
                    aVar.a(aht.d.history_music_view_layout, 1);
                    aVar.a(aht.d.history_album_view_layout, 1);
                    aVar.a(aht.d.history_program_view_layout, 1);
                    aVar.a(aht.d.history_netradio_view_layout, 1);
                    aVar.a("mine2");
                }
            };
        }
        return new Runnable() { // from class: ami.1
            @Override // java.lang.Runnable
            public void run() {
                aVar.a(aht.d.collected_music_view_layout, 1);
                aVar.a(aht.d.collected_album_view_layout, 1);
                aVar.a(aht.d.collected_program_view_layout, 1);
                aVar.a(aht.d.collected_netradio_view_layout, 1);
                aVar.a("mine1");
            }
        };
    }
}
