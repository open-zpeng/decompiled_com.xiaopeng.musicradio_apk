package defpackage;

import com.xiaopeng.lib.utils.FileUtils;
/* compiled from: Collections2.java */
/* renamed from: yr  reason: default package */
/* loaded from: classes3.dex */
public final class yr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder a(int i) {
        yq.a(i, "size");
        return new StringBuilder((int) Math.min(i * 8, (long) FileUtils.SIZE_1GB));
    }
}
