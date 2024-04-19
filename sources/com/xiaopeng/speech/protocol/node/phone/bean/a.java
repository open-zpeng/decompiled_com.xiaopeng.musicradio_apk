package com.xiaopeng.speech.protocol.node.phone.bean;

import java.io.Serializable;
import java.util.List;
/* compiled from: Contact.java */
/* loaded from: classes2.dex */
public class a implements Serializable, Cloneable {
    private String name;
    private final List<C0184a> phoneInfos;

    /* compiled from: Contact.java */
    /* renamed from: com.xiaopeng.speech.protocol.node.phone.bean.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0184a {
        private String a;
        private String b;
        private String c;

        public void a(String str) {
            this.c = str;
        }

        public void b(String str) {
            this.a = str;
        }

        public void c(String str) {
            this.b = str;
        }
    }
}
