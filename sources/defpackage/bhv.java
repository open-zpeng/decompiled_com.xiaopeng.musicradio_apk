package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.systemdelegate.ISystemDelegate;
import com.xiaopeng.lib.utils.LogUtils;
/* compiled from: SystemDelegateService.java */
/* renamed from: bhv  reason: default package */
/* loaded from: classes2.dex */
public class bhv implements ISystemDelegate {
    private Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bhv(Context context) {
        this.a = context;
        Module.register(bhu.class, new bhu(context));
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.systemdelegate.ISystemDelegate
    public String getCertificate() {
        LogUtils.d("SystemDelegateService", "start getCertificate!");
        Cursor query = this.a.getContentResolver().query(Uri.parse("content://com.xiaopeng.system.delegate/cert/ssl"), null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    LogUtils.w("SystemDelegateService", "query result success");
                    return string;
                }
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
        LogUtils.w("SystemDelegateService", "cursor is empty!");
        if (query != null) {
            query.close();
        }
        return null;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.systemdelegate.ISystemDelegate
    public void setSystemProperty(String str, String str2) {
        LogUtils.d("SystemDelegateService", "setSystemProperty " + str + ":" + str2);
        Uri parse = Uri.parse("content://com.xiaopeng.system.delegate/sysprop/set");
        ContentValues contentValues = new ContentValues();
        contentValues.put(str, str2);
        this.a.getContentResolver().update(parse, contentValues, null, null);
    }
}
