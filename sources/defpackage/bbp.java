package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.utils.be;
import java.util.List;
/* compiled from: UsbSingerRequestManager.java */
/* renamed from: bbp  reason: default package */
/* loaded from: classes2.dex */
public class bbp extends bbl<baz> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UsbSingerRequestManager.java */
    /* renamed from: bbp$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final bbp a = new bbp();
    }

    @Override // defpackage.bbn
    protected int b() {
        return 4;
    }

    public static bbp a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: a */
    public String b(baz bazVar) {
        return bazVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: b */
    public boolean c(baz bazVar) {
        Log.i("UsbSingerRequestManager", "shouldRequestLogo: " + bazVar);
        return bazVar.a() == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    public void a(List<baw> list) {
        bbh.a().c(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: c */
    public String a(baz bazVar) {
        if (TextUtils.equals(bazVar.b(), be.a(a.d.music_unknow_singer))) {
            return null;
        }
        return bazVar.b();
    }
}
