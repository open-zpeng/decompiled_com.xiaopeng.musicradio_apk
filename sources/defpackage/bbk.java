package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.utils.be;
import java.util.List;
/* compiled from: UsbAlbumRequestManager.java */
/* renamed from: bbk  reason: default package */
/* loaded from: classes2.dex */
public class bbk extends bbl<bav> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UsbAlbumRequestManager.java */
    /* renamed from: bbk$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final bbk a = new bbk();
    }

    @Override // defpackage.bbn
    protected int b() {
        return 2;
    }

    public static bbk a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: a */
    public String b(bav bavVar) {
        return bavVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: b */
    public boolean c(bav bavVar) {
        Log.i("UsbAlbumRequestManager", "shouldRequestLogo: " + bavVar);
        return bavVar.b() == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    public void a(List<baw> list) {
        bbh.a().d(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: c */
    public String a(bav bavVar) {
        if (TextUtils.equals(bavVar.c(), be.a(a.d.radio_unknown_album))) {
            return null;
        }
        return bavVar.c();
    }
}
