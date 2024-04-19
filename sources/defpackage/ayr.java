package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.mix.view.MixItemLayout;
import defpackage.ayx;
import java.util.ArrayList;
/* compiled from: BaseSearchBinder.java */
/* renamed from: ayr  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayr<ITEM extends ayx, VIEW extends View> extends biv<ITEM, a> {
    protected axz a;

    protected abstract int a();

    protected abstract void a(MixItemLayout mixItemLayout, ITEM item);

    protected abstract int b();

    protected abstract VIEW b(Context context);

    protected abstract int c();

    protected abstract int d();

    protected int e() {
        return 190;
    }

    protected int f() {
        return -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.biv
    protected /* bridge */ /* synthetic */ void a(a aVar, Object obj) {
        a(aVar, (a) ((ayx) obj));
    }

    public ayr(axz axzVar) {
        this.a = axzVar;
    }

    protected void a(a aVar, ITEM item) {
        if (aVar.r != null) {
            a(aVar.r, (MixItemLayout) item);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(a.e.item_mix_common_layout, (ViewGroup) null);
        MixItemLayout mixItemLayout = (MixItemLayout) inflate.findViewById(a.d.mix_item_layout);
        mixItemLayout.a(a(), c(), d());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b(); i++) {
            arrayList.add(b(mixItemLayout.getContext()));
        }
        mixItemLayout.a(arrayList, f(), e());
        return new a(inflate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseSearchBinder.java */
    /* renamed from: ayr$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private MixItemLayout r;

        public a(View view) {
            super(view);
            this.r = (MixItemLayout) view.findViewById(a.d.mix_item_layout);
        }
    }
}
