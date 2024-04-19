package defpackage;

import android.util.Log;
/* compiled from: AfterSaveStateTransactionWarning.java */
/* renamed from: bjd  reason: default package */
/* loaded from: classes3.dex */
public class bjd extends RuntimeException {
    public bjd(String str) {
        super("Warning: Perform this " + str + " action after onSaveInstanceState!");
        Log.w("Fragmentation", getMessage());
    }
}
