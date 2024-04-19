package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.ate;
/* compiled from: MsUsbDetailListAdapter.java */
/* renamed from: aty  reason: default package */
/* loaded from: classes2.dex */
public class aty extends ate {
    public aty(Context context) {
        super(context, b.e.music_item_usb_detail_list);
    }

    @Override // defpackage.ate, androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ate.a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_musiclist_foot_view, viewGroup, false));
        }
        return new a(h());
    }

    @Override // defpackage.ate, androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        super.a(vVar, i);
        if (vVar instanceof a) {
            a aVar = (a) vVar;
            aVar.t.setVisibility(8);
            MusicInfo g = g(i);
            if (g == null || g.getMusicFrom() != 61) {
                return;
            }
            y.b(aVar.u.getContext(), g.getLogo(), b.c.pic_covers_music_list_220, aVar.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ate
    public void a(int i, ate.b bVar, MusicInfo musicInfo) {
        super.a(i, bVar, musicInfo);
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            if (i == 1) {
                aVar.F.setVisibility(8);
            } else {
                aVar.F.setVisibility(0);
            }
        }
    }

    /* compiled from: MsUsbDetailListAdapter.java */
    /* renamed from: aty$a */
    /* loaded from: classes2.dex */
    public class a extends ate.b {
        public XTextView F;

        a(View view) {
            super(view);
            this.F = (XTextView) this.a.findViewById(b.d.local_txt);
        }
    }
}
