package defpackage;

import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.proto.Mine;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: VipProtoFactory.java */
/* renamed from: bdi  reason: default package */
/* loaded from: classes2.dex */
public class bdi {
    public static AbstractMessageLite a(boolean z, String str, String str2) {
        return Mine.MineVipBuyingResp.newBuilder().a(z).a(be.e(str)).b(be.e(str2)).build();
    }
}
