package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
/* compiled from: MemoryPersistence.java */
/* renamed from: bnc  reason: default package */
/* loaded from: classes3.dex */
public class bnc implements bkp {
    private Hashtable a;

    @Override // defpackage.bkp
    public void close() {
        this.a.clear();
    }

    @Override // defpackage.bkp
    public Enumeration keys() {
        return this.a.keys();
    }

    @Override // defpackage.bkp
    public bku get(String str) {
        return (bku) this.a.get(str);
    }

    @Override // defpackage.bkp
    public void open(String str, String str2) {
        this.a = new Hashtable();
    }

    @Override // defpackage.bkp
    public void put(String str, bku bkuVar) {
        this.a.put(str, bkuVar);
    }

    @Override // defpackage.bkp
    public void remove(String str) {
        this.a.remove(str);
    }

    @Override // defpackage.bkp
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.bkp
    public boolean containsKey(String str) {
        return this.a.containsKey(str);
    }
}
