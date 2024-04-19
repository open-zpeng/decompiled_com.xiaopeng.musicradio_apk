package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import defpackage.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ActivityResultContracts.java */
/* renamed from: y  reason: default package */
/* loaded from: classes3.dex */
public final class y {

    /* compiled from: ActivityResultContracts.java */
    /* renamed from: y$b */
    /* loaded from: classes3.dex */
    public static final class b extends x<Intent, ActivityResult> {
        @Override // defpackage.x
        public Intent a(Context context, Intent intent) {
            return intent;
        }

        @Override // defpackage.x
        /* renamed from: b */
        public ActivityResult a(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* compiled from: ActivityResultContracts.java */
    /* renamed from: y$a */
    /* loaded from: classes3.dex */
    public static final class a extends x<String[], Map<String, Boolean>> {
        @Override // defpackage.x
        public Intent a(Context context, String[] strArr) {
            return a(strArr);
        }

        @Override // defpackage.x
        public x.a<Map<String, Boolean>> b(Context context, String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return new x.a<>(Collections.emptyMap());
            }
            bf bfVar = new bf();
            boolean z = true;
            for (String str : strArr) {
                boolean z2 = es.a(context, str) == 0;
                bfVar.put(str, Boolean.valueOf(z2));
                if (!z2) {
                    z = false;
                }
            }
            if (z) {
                return new x.a<>(bfVar);
            }
            return null;
        }

        @Override // defpackage.x
        /* renamed from: b */
        public Map<String, Boolean> a(int i, Intent intent) {
            if (i != -1) {
                return Collections.emptyMap();
            }
            if (intent == null) {
                return Collections.emptyMap();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
            }
            return hashMap;
        }

        static Intent a(String[] strArr) {
            return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        }
    }
}
