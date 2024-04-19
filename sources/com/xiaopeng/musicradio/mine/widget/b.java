package com.xiaopeng.musicradio.mine.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
/* compiled from: ContentViewBinder.java */
/* loaded from: classes.dex */
public class b extends biv<Object, c> {
    private final int a;
    private c b;
    private String d;
    private amh e;

    public b(int i, String str, amh amhVar) {
        this.a = i;
        this.d = str;
        this.e = amhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public c b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new c(aez.a(viewGroup, this.a, this.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(c cVar, Object obj) {
        amh amhVar = this.e;
        if (amhVar != null) {
            amhVar.a(cVar.r);
        }
        this.b = cVar;
    }
}
