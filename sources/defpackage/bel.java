package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.vui.VuiView;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: VuiRecyclerView.java */
/* renamed from: bel  reason: default package */
/* loaded from: classes2.dex */
public class bel extends RecyclerView implements bic, VuiView {
    public boolean a;
    public boolean b;
    private boolean c;
    private boolean d;
    private bem e;
    private ben f;
    private bid g;
    private Handler h;
    private Runnable i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final RecyclerView.c n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private List<String[]> s;

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public bel(Context context) {
        super(context);
        this.c = true;
        this.d = false;
        this.h = new Handler(Looper.getMainLooper()) { // from class: bel.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.i = new Runnable() { // from class: bel.2
            @Override // java.lang.Runnable
            public void run() {
                Log.d("VuiRecyclerView", "updateVuiScene run");
                if (bel.this.g == null || TextUtils.isEmpty(bel.this.j)) {
                    return;
                }
                bel.this.g.updateScene(bel.this.j, bel.this);
            }
        };
        this.k = true;
        this.l = true;
        this.m = false;
        this.n = new RecyclerView.c() { // from class: bel.3
            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onChanged() {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeChanged(int i, int i2) {
                if (bel.this.m) {
                    Log.d("VuiRecyclerView", "onItemRangeChanged：positionStart:" + i + ",itemCount:" + i2);
                    if (i2 == 1) {
                        bel.this.b(100);
                    } else {
                        bel.this.b(800);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeChanged(int i, int i2, Object obj) {
                if (bel.this.m) {
                    Log.d("VuiRecyclerView", "onItemRangeChanged：positionStart:" + i + ",itemCount:" + i2 + ",payload:" + obj);
                    if (i2 == 1) {
                        bel.this.b(100);
                    } else {
                        bel.this.b(800);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeInserted(int i, int i2) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeRemoved(int i, int i2) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeMoved(int i, int i2, int i3) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }
        };
        this.a = false;
        this.b = false;
        this.o = false;
        this.p = 0;
        this.q = -1;
        this.r = false;
        this.s = null;
        a();
    }

    public bel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        this.d = false;
        this.h = new Handler(Looper.getMainLooper()) { // from class: bel.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.i = new Runnable() { // from class: bel.2
            @Override // java.lang.Runnable
            public void run() {
                Log.d("VuiRecyclerView", "updateVuiScene run");
                if (bel.this.g == null || TextUtils.isEmpty(bel.this.j)) {
                    return;
                }
                bel.this.g.updateScene(bel.this.j, bel.this);
            }
        };
        this.k = true;
        this.l = true;
        this.m = false;
        this.n = new RecyclerView.c() { // from class: bel.3
            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onChanged() {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeChanged(int i, int i2) {
                if (bel.this.m) {
                    Log.d("VuiRecyclerView", "onItemRangeChanged：positionStart:" + i + ",itemCount:" + i2);
                    if (i2 == 1) {
                        bel.this.b(100);
                    } else {
                        bel.this.b(800);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeChanged(int i, int i2, Object obj) {
                if (bel.this.m) {
                    Log.d("VuiRecyclerView", "onItemRangeChanged：positionStart:" + i + ",itemCount:" + i2 + ",payload:" + obj);
                    if (i2 == 1) {
                        bel.this.b(100);
                    } else {
                        bel.this.b(800);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeInserted(int i, int i2) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeRemoved(int i, int i2) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeMoved(int i, int i2, int i3) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }
        };
        this.a = false;
        this.b = false;
        this.o = false;
        this.p = 0;
        this.q = -1;
        this.r = false;
        this.s = null;
        initVui(this, attributeSet);
        a();
    }

    public bel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.d = false;
        this.h = new Handler(Looper.getMainLooper()) { // from class: bel.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.i = new Runnable() { // from class: bel.2
            @Override // java.lang.Runnable
            public void run() {
                Log.d("VuiRecyclerView", "updateVuiScene run");
                if (bel.this.g == null || TextUtils.isEmpty(bel.this.j)) {
                    return;
                }
                bel.this.g.updateScene(bel.this.j, bel.this);
            }
        };
        this.k = true;
        this.l = true;
        this.m = false;
        this.n = new RecyclerView.c() { // from class: bel.3
            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onChanged() {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeChanged(int i2, int i22) {
                if (bel.this.m) {
                    Log.d("VuiRecyclerView", "onItemRangeChanged：positionStart:" + i2 + ",itemCount:" + i22);
                    if (i22 == 1) {
                        bel.this.b(100);
                    } else {
                        bel.this.b(800);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeChanged(int i2, int i22, Object obj) {
                if (bel.this.m) {
                    Log.d("VuiRecyclerView", "onItemRangeChanged：positionStart:" + i2 + ",itemCount:" + i22 + ",payload:" + obj);
                    if (i22 == 1) {
                        bel.this.b(100);
                    } else {
                        bel.this.b(800);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeInserted(int i2, int i22) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeRemoved(int i2, int i22) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public void onItemRangeMoved(int i2, int i22, int i3) {
                if (!bel.this.l || bel.this.e == null) {
                    return;
                }
                bel.this.e.a();
            }
        };
        this.a = false;
        this.b = false;
        this.o = false;
        this.p = 0;
        this.q = -1;
        this.r = false;
        this.s = null;
        initVui(this, attributeSet);
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ben benVar;
        super.onAttachedToWindow();
        this.d = true;
        Log.i("VuiRecyclerView", "onAttachedToWindow:" + this.j);
        if (this.l && this.e != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.e);
        }
        if (!this.k || (benVar = this.f) == null) {
            return;
        }
        addOnScrollListener(benVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ben benVar;
        super.onDetachedFromWindow();
        this.d = false;
        Log.i("VuiRecyclerView", "onDetachedFromWindow:" + this.j);
        if (this.l && this.e != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.e);
        }
        if (!this.k || (benVar = this.f) == null) {
            return;
        }
        removeOnScrollListener(benVar);
    }

    protected void finalize() {
        super.finalize();
        releaseVui();
    }

    private void a() {
        this.e = new bem(this);
        this.f = new ben(this);
        setVuiLayoutLoadable(true);
    }

    public void b() {
        if (!TextUtils.isEmpty(this.j) && this.g != null) {
            Log.d("VuiRecyclerView", "updateVuiScene:" + this.j);
            this.h.removeCallbacks(this.i);
            this.h.post(this.i);
            return;
        }
        Log.i("VuiRecyclerView", "updateVuiScene sceneid is empty");
    }

    public void b(int i) {
        if (!TextUtils.isEmpty(this.j) && this.g != null) {
            this.h.removeCallbacks(this.i);
            this.h.postDelayed(this.i, i);
            return;
        }
        Log.i("VuiRecyclerView", "updateVuiScene sceneid is empty");
    }

    public void a(String str, bid bidVar, boolean z, boolean z2) {
        this.j = str;
        this.k = z;
        this.l = z2;
        this.g = bidVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        bem bemVar;
        RecyclerView.a adapter = getAdapter();
        if (adapter != null) {
            adapter.b(this.n);
        }
        super.setAdapter(aVar);
        if (aVar != null) {
            aVar.a(this.n);
        }
        if (!this.l || (bemVar = this.e) == null) {
            return;
        }
        bemVar.a();
    }

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        RecyclerView.LayoutManager layoutManager;
        int i;
        int K;
        if (this.c) {
            boolean canScrollVertically = canScrollVertically(-1);
            boolean z = true;
            boolean canScrollVertically2 = canScrollVertically(1);
            boolean canScrollHorizontally = canScrollHorizontally(-1);
            boolean canScrollHorizontally2 = canScrollHorizontally(1);
            if (canScrollVertically || canScrollVertically2 || this.a) {
                setVuiAction(big.SCROLLBYY.a());
            } else if (canScrollHorizontally || canScrollHorizontally2 || this.b) {
                setVuiAction(big.SCROLLBYX.a());
            }
            try {
                JSONObject vuiProps = getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                if (this.o && (layoutManager = getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    vuiProps.put(VuiConstants.PROPS_MINVALUE, this.p);
                    if (this.q != -1) {
                        i = this.p;
                        K = this.q;
                    } else {
                        i = this.p;
                        K = layoutManager.K();
                    }
                    int i2 = i + K;
                    vuiProps.put(VuiConstants.PROPS_MAXVALUE, i2);
                    vuiProps.put("displayStart", this.r ? i2 - linearLayoutManager.s() : this.p + linearLayoutManager.q());
                    vuiProps.put("displayEnd", this.r ? i2 - linearLayoutManager.q() : this.p + linearLayoutManager.s());
                    if (this.s != null && this.s.size() > 0) {
                        vuiProps.put("supportVuiLabels", this.s);
                    }
                    vuiProps.put("isReverse", this.r);
                }
                if (getVuiAction() == null) {
                    return null;
                }
                if (getVuiAction().equals(big.SCROLLBYY.a())) {
                    vuiProps.put(VuiConstants.PROPS_SCROLLUP, canScrollVertically);
                    if (!canScrollVertically2 && !this.a) {
                        z = false;
                    }
                    vuiProps.put(VuiConstants.PROPS_SCROLLDOWN, z);
                } else {
                    vuiProps.put(VuiConstants.PROPS_SCROLLLEFT, canScrollHorizontally);
                    if (!canScrollHorizontally2 && !this.b) {
                        z = false;
                    }
                    vuiProps.put(VuiConstants.PROPS_SCROLLRIGHT, z);
                }
                setVuiProps(vuiProps);
                return null;
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public void setCanVuiScrollDown(boolean z) {
        this.a = z;
    }

    public void setCanVuiScrollRight(boolean z) {
        this.b = z;
    }

    public void setVuiCanControlScroll(boolean z) {
        this.c = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() == i) {
            return;
        }
        super.setVisibility(i);
        if (this.l) {
            return;
        }
        b();
    }

    public void c(int i) {
        Log.i("VuiRecyclerView", "enableVuiInvisibleFeature:" + i);
        this.o = true;
        this.p = i;
    }

    public void setOrderState(boolean z) {
        this.r = z;
    }
}
