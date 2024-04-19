package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.speech.protocol.bean.recommend.RecommendBean;
/* compiled from: BaseQueryCommand.java */
/* renamed from: bag  reason: default package */
/* loaded from: classes2.dex */
public abstract class bag {
    private static final String TAG = "BaseQueryCommand";
    protected String mCallback;
    protected String mData;
    protected String mEvent;

    protected abstract void a(String str, String str2, String str3);

    public abstract String getCommand();

    public bag(String str, String str2, String str3) {
        this.mEvent = str;
        this.mData = str2;
        this.mCallback = str3;
    }

    public void onEvent() {
        if (a.b) {
            a(this.mEvent, this.mData, this.mCallback);
        } else {
            bah.a().a(this);
        }
    }

    public void doCommand() {
        a(this.mEvent, this.mData, this.mCallback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || obj == null) {
            return;
        }
        try {
            Log.i(TAG, "reply: event = " + str + " result = " + obj);
            abt.a(Uri.parse(str2).buildUpon().appendQueryParameter(RecommendBean.SHOW_TIME_RESULT, new bgl(str, obj).toString()).build());
        } catch (RemoteException e) {
            Log.e(TAG, "reply: " + e.getMessage());
        }
    }
}
