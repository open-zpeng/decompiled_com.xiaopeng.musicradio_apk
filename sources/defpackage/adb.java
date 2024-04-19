package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.ap;
/* compiled from: XpAccountManager.java */
/* renamed from: adb  reason: default package */
/* loaded from: classes2.dex */
public class adb {
    public static ada a(Context context) {
        AccountManager accountManager = AccountManager.get(context);
        Account[] accountsByType = accountManager.getAccountsByType("com.xiaopeng.accountservice.ACCOUNT_TYPE_XP_VEHICLE");
        ada adaVar = new ada();
        if (accountsByType != null && accountsByType.length > 0) {
            Account account = accountsByType[0];
            LogUtils.i("XpAccountManager", "getCurrentUserInfo accounts.length=" + accountsByType.length + ";account[0].name=" + account.name);
            try {
                String userData = accountManager.getUserData(account, "name");
                String userData2 = accountManager.getUserData(account, "avatar");
                String userData3 = accountManager.getUserData(account, "update");
                String userData4 = accountManager.getUserData(account, "uid");
                String userData5 = accountManager.getUserData(account, "user_type");
                String userData6 = accountManager.getUserData(account, "user_data_encrypted_phone");
                adaVar.a = userData;
                if (TextUtils.isEmpty(userData) && account != null) {
                    adaVar.a = account.name;
                }
                adaVar.b = userData2;
                adaVar.c = ap.a(userData3, 0);
                adaVar.d = ap.a(userData4, -1L);
                adaVar.e = ap.a(userData5, 0);
                adaVar.f = userData6;
            } catch (Exception e) {
                LogUtils.i("XpAccountManager", "getCurrentUserInfo Exception=" + e.getMessage());
            }
            LogUtils.i("XpAccountManager", "getCurrentAccountInfo userInfo=" + adaVar);
            return adaVar;
        }
        LogUtils.i("XpAccountManager", "getCurrentUserInfo account is empty");
        LogUtils.i("XpAccountManager", "getCurrentAccountInfo userInfo=" + adaVar);
        return adaVar;
    }
}
