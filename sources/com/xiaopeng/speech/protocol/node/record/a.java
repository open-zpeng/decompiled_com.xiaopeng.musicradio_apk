package com.xiaopeng.speech.protocol.node.record;

import com.xiaopeng.speech.protocol.node.record.bean.AsrResult;
import com.xiaopeng.speech.protocol.node.record.bean.RecordErrReason;
import com.xiaopeng.speech.protocol.node.record.bean.Volume;
/* compiled from: RecordListener.java */
/* loaded from: classes2.dex */
public interface a extends bes {
    void a();

    void a(AsrResult asrResult);

    void a(RecordErrReason recordErrReason);

    void a(Volume volume);

    void a(boolean z);

    void b();

    void c();

    void d();
}
