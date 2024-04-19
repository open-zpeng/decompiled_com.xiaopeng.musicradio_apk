package defpackage;

import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.proto.Mine;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: LoginProtoFactory.java */
/* renamed from: ahl  reason: default package */
/* loaded from: classes2.dex */
public class ahl {
    public static AbstractMessageLite a(boolean z) {
        return Mine.MineAuthResp.newBuilder().a(z).build();
    }

    public static AbstractMessageLite a(String str, String str2, boolean z, String str3, boolean z2) {
        return Mine.MineAccountResp.newBuilder().a(be.e(str)).b(be.e(str2)).a(z).c(be.e(str3)).b(z2).build();
    }

    public static AbstractMessageLite a(String str, String str2) {
        return Mine.MineQrCodeResp.newBuilder().a(be.e(str)).b(be.e(str2)).build();
    }
}
