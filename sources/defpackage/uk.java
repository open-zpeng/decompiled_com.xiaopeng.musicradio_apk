package defpackage;

import java.util.Map;
/* compiled from: UTMCVariables.java */
/* renamed from: uk  reason: default package */
/* loaded from: classes3.dex */
public class uk {
    public static final uk a = new uk();
    private boolean b = false;
    private boolean c = false;
    private String d = null;
    private Map<String, String> e = null;
    private boolean f = false;
    private boolean g = false;
    private String h = null;
    private String i = null;
    private String j = null;
    private boolean k = false;

    public static uk a() {
        return a;
    }

    public synchronized void a(String str) {
        this.h = str;
    }

    public synchronized void b() {
        this.g = true;
    }

    public synchronized boolean c() {
        return this.g;
    }

    public synchronized void a(Map<String, String> map) {
        this.e = map;
    }

    public synchronized Map<String, String> d() {
        return this.e;
    }
}
