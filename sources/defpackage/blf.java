package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
/* compiled from: CommsTokenStore.java */
/* renamed from: blf  reason: default package */
/* loaded from: classes3.dex */
public class blf {
    private static final String a = "blf";
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private Hashtable c;
    private String d;
    private bks e = null;

    public blf(String str) {
        b.setResourceName(str);
        this.c = new Hashtable();
        this.d = str;
        b.fine(a, "<Init>", "308");
    }

    public bky a(bmw bmwVar) {
        return (bky) this.c.get(bmwVar.e());
    }

    public bky a(String str) {
        return (bky) this.c.get(str);
    }

    public bky b(bmw bmwVar) {
        if (bmwVar != null) {
            return b(bmwVar.e());
        }
        return null;
    }

    public bky b(String str) {
        b.fine(a, "removeToken", "306", new Object[]{str});
        if (str != null) {
            return (bky) this.c.remove(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bkr a(bmq bmqVar) {
        bkr bkrVar;
        synchronized (this.c) {
            String num = new Integer(bmqVar.j()).toString();
            if (this.c.containsKey(num)) {
                bkrVar = (bkr) this.c.get(num);
                b.fine(a, "restoreToken", "302", new Object[]{num, bmqVar, bkrVar});
            } else {
                bkrVar = new bkr(this.d);
                bkrVar.a.a(num);
                this.c.put(num, bkrVar);
                b.fine(a, "restoreToken", "303", new Object[]{num, bmqVar, bkrVar});
            }
        }
        return bkrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bky bkyVar, bmw bmwVar) {
        synchronized (this.c) {
            if (this.e == null) {
                String e = bmwVar.e();
                b.fine(a, "saveToken", "300", new Object[]{e, bmwVar});
                a(bkyVar, e);
            } else {
                throw this.e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bky bkyVar, String str) {
        synchronized (this.c) {
            b.fine(a, "saveToken", "307", new Object[]{str, bkyVar.toString()});
            bkyVar.a.a(str);
            this.c.put(str, bkyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bks bksVar) {
        synchronized (this.c) {
            b.fine(a, "quiesce", "309", new Object[]{bksVar});
            this.e = bksVar;
        }
    }

    public void a() {
        synchronized (this.c) {
            b.fine(a, "open", "310");
            this.e = null;
        }
    }

    public bkr[] b() {
        bkr[] bkrVarArr;
        synchronized (this.c) {
            b.fine(a, "getOutstandingDelTokens", "311");
            Vector vector = new Vector();
            Enumeration elements = this.c.elements();
            while (elements.hasMoreElements()) {
                bky bkyVar = (bky) elements.nextElement();
                if (bkyVar != null && (bkyVar instanceof bkr) && !bkyVar.a.p()) {
                    vector.addElement(bkyVar);
                }
            }
            bkrVarArr = (bkr[]) vector.toArray(new bkr[vector.size()]);
        }
        return bkrVarArr;
    }

    public Vector c() {
        Vector vector;
        synchronized (this.c) {
            b.fine(a, "getOutstandingTokens", "312");
            vector = new Vector();
            Enumeration elements = this.c.elements();
            while (elements.hasMoreElements()) {
                bky bkyVar = (bky) elements.nextElement();
                if (bkyVar != null) {
                    vector.addElement(bkyVar);
                }
            }
        }
        return vector;
    }

    public void d() {
        b.fine(a, "clear", "305", new Object[]{new Integer(this.c.size())});
        synchronized (this.c) {
            this.c.clear();
        }
    }

    public int e() {
        int size;
        synchronized (this.c) {
            size = this.c.size();
        }
        return size;
    }

    public String toString() {
        String stringBuffer;
        String property = System.getProperty("line.separator", "\n");
        StringBuffer stringBuffer2 = new StringBuffer();
        synchronized (this.c) {
            Enumeration elements = this.c.elements();
            while (elements.hasMoreElements()) {
                stringBuffer2.append("{" + ((bky) elements.nextElement()).a + "}" + property);
            }
            stringBuffer = stringBuffer2.toString();
        }
        return stringBuffer;
    }
}
