package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationItemLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bn;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XFrameLayout;
import defpackage.beo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LocalRadioAdapter.java */
/* renamed from: auk  reason: default package */
/* loaded from: classes2.dex */
public class auk extends androidx.viewpager.widget.a {
    protected a a;
    private String b = "changed";
    private ArrayList<NetRadioInfo> c = new ArrayList<>();
    private View d;

    /* compiled from: LocalRadioAdapter.java */
    /* renamed from: auk$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void a(List<NetRadioInfo> list, boolean z) {
        if (list == null) {
            return;
        }
        this.c.clear();
        this.c.addAll(list);
        if (z) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.c.size();
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, final int i) {
        View a2 = bn.a().a(ax.a.NR_LOCATION_RADIO_ITEM);
        if (a2 == null) {
            a2 = View.inflate(viewGroup.getContext(), beo.d.netradio_item_localradio, null);
            Log.d("LocalRadioAdapter", "get view by create.");
            bn.a().b(ax.a.NR_LOCATION_RADIO_ITEM);
        } else {
            Log.d("LocalRadioAdapter", "get view from cache.");
        }
        ((NrLocationItemLayout) a2.findViewById(beo.c.location_item)).setData(this.c.get(i).getPicUrl());
        viewGroup.addView(a2);
        XFrameLayout xFrameLayout = (XFrameLayout) a2.findViewById(beo.c.local_root);
        xFrameLayout.setVuiMode(bij.DISABLED);
        xFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: auk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (auk.this.a == null || !(view instanceof VuiView)) {
                    return;
                }
                auk.this.a.a(i);
            }
        });
        return a2;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public ArrayList<NetRadioInfo> a() {
        return this.c;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem((View) viewGroup, i, obj);
        this.d = (View) obj;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(Object obj) {
        return this.b.equals(((View) obj).getTag()) ? -2 : -1;
    }
}
