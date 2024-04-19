package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: Key.java */
/* renamed from: dx  reason: default package */
/* loaded from: classes3.dex */
public abstract class dx {
    public static int a = -1;
    int b;
    int c;
    String d;
    protected int e;
    HashMap<String, a> f;

    @Override // 
    /* renamed from: a */
    public abstract dx clone();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Context context, AttributeSet attributeSet);

    public abstract void a(HashMap<String, dr> hashMap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(HashSet<String> hashSet);

    public void b(HashMap<String, Integer> hashMap) {
    }

    public dx() {
        int i = a;
        this.b = i;
        this.c = i;
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        String str2 = this.d;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public dx a(dx dxVar) {
        this.b = dxVar.b;
        this.c = dxVar.c;
        this.d = dxVar.d;
        this.e = dxVar.e;
        this.f = dxVar.f;
        return this;
    }

    public dx a(int i) {
        this.c = i;
        return this;
    }
}
