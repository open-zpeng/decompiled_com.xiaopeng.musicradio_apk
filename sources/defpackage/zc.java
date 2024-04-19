package defpackage;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: Maps.java */
/* renamed from: zc  reason: default package */
/* loaded from: classes3.dex */
public final class zc {

    /* compiled from: Maps.java */
    /* renamed from: zc$a */
    /* loaded from: classes3.dex */
    private enum a implements yh<Map.Entry<?, ?>, Object> {
        KEY { // from class: zc.a.1
            @Override // defpackage.yh
            @NullableDecl
            public Object a(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: zc.a.2
            @Override // defpackage.yh
            @NullableDecl
            public Object a(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> yh<Map.Entry<?, V>, V> a() {
        return a.VALUE;
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    /* renamed from: zc$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static class AnonymousClass1<K, V> extends zn<Map.Entry<K, V>, K> {
        @Override // defpackage.zn
        /* bridge */ /* synthetic */ Object a(Object obj) {
            return a((Map.Entry) ((Map.Entry) obj));
        }

        K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Map<?, ?> map) {
        StringBuilder a2 = yr.a(map.size());
        a2.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                a2.append(", ");
            }
            z = false;
            a2.append(entry.getKey());
            a2.append('=');
            a2.append(entry.getValue());
        }
        a2.append('}');
        return a2.toString();
    }
}
