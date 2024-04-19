package defpackage;

import android.content.Context;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.mine.main.presenter.MineEventPresenter;
/* compiled from: MineEventViewProxy.java */
/* renamed from: ali  reason: default package */
/* loaded from: classes2.dex */
public class ali extends aeu<alg, MineEventPresenter> implements alg {
    public ali(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: k */
    public MineEventPresenter g() {
        return new MineEventPresenter();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("init".equals(str)) {
            LogUtils.i("MineEventViewProxy", "init");
        }
    }

    @Override // defpackage.alg
    public void a(boolean z) {
        a("MineEventViewProxy_mine_event_musiclogin", amb.a(z));
    }

    @Override // defpackage.alg
    public void b(boolean z) {
        a("MineEventViewProxy_mine_event_readinglogin", amb.a(z));
    }

    @Override // defpackage.alg
    public void a(String str, long j, boolean z) {
        a("MineEventViewProxy_mine_event_musiclove", amb.a(str, j, z));
    }

    @Override // defpackage.alg
    public void a(long j, boolean z) {
        a("MineEventViewProxy_mine_event_albumlove", amb.a(j, z));
    }

    @Override // defpackage.alg
    public void b(long j, boolean z) {
        a("MineEventViewProxy_mine_event_readlove", amb.b(j, z));
    }

    @Override // defpackage.alg
    public void c(long j, boolean z) {
        a("MineEventViewProxy_mine_event_netradiolove", amb.c(j, z));
    }

    @Override // defpackage.alg
    public void a() {
        a("MineEventViewProxy_mine_event_musichistory", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void b() {
        a("MineEventViewProxy_mine_event_albumhistory", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void k_() {
        a("MineEventViewProxy_mine_event_readhistory", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void l_() {
        a("MineEventViewProxy_mine_event_netradiohistory", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void m_() {
        a("MineEventViewProxy_mine_event_musiclovefetched", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void n_() {
        a("MineEventViewProxy_mine_event_albumlovefetched", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void h() {
        a("MineEventViewProxy_mine_event_albumcustomfetched", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void i() {
        a("MineEventViewProxy_mine_event_readlovefetched", (AbstractMessageLite) null);
    }

    @Override // defpackage.alg
    public void j() {
        a("MineEventViewProxy_mine_event_netradiolovefetched", (AbstractMessageLite) null);
    }
}
