package defpackage;

import android.content.ContentProviderClient;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaopeng.lib.apirouter.server.ApiPublisherProvider;
import java.util.List;
/* compiled from: ApiRouter.java */
/* renamed from: abt  reason: default package */
/* loaded from: classes2.dex */
public class abt {
    private static abs a = new abs();

    private static abw a(abx abxVar, IBinder iBinder, String str) {
        abw a2 = abw.a(iBinder, str);
        a.a(abxVar, a2);
        return a2;
    }

    private static abw a(abx abxVar) {
        if (ApiPublisherProvider.a == null) {
            throw new RemoteException("ApiRouter can not route. If it is an asynchronous thread, please check your Context first!");
        }
        Uri.Builder builder = new Uri.Builder();
        if (TextUtils.isEmpty(abxVar.c)) {
            Uri.Builder scheme = builder.scheme("content");
            scheme.authority(abxVar.a + ".api.publisher");
        } else {
            Uri.Builder scheme2 = builder.scheme("content");
            scheme2.authority(abxVar.a + "." + abxVar.c + ".api.publisher");
        }
        ContentProviderClient acquireContentProviderClient = ApiPublisherProvider.a.getContentResolver().acquireContentProviderClient(builder.build());
        if (acquireContentProviderClient == null) {
            throw new RemoteException("Unknown service " + abxVar);
        }
        try {
            Bundle call = acquireContentProviderClient.call(abxVar.b, null, null);
            if (call == null) {
                throw new RemoteException("Server does not implement call");
            }
            IBinder binder = call.getBinder("binder");
            String string = call.getString("manifest");
            if (binder == null || TextUtils.isEmpty(string)) {
                throw new RemoteException("No matching method");
            }
            return a(abxVar, binder, string);
        } finally {
            acquireContentProviderClient.release();
        }
    }

    public static <T> T a(Uri uri) {
        return (T) a(uri, false, (byte[]) null);
    }

    public static <T> T a(Uri uri, byte[] bArr) {
        return (T) a(uri, true, bArr);
    }

    private static <T> T a(Uri uri, boolean z, byte[] bArr) {
        abx b = b(uri);
        abw b2 = a.b(b);
        if (b2 == null) {
            b2 = a(b);
        } else if (!b2.c()) {
            a.a(b);
            b2 = a(b);
        }
        return (T) b2.a(uri, z, bArr);
    }

    private static abx b(Uri uri) {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new RemoteException("Can not find authority in uri");
        }
        int lastIndexOf = authority.lastIndexOf(".");
        if (lastIndexOf == -1) {
            throw new RemoteException("Illegal uri authority");
        }
        String substring = authority.substring(0, lastIndexOf);
        String substring2 = authority.substring(lastIndexOf + 1);
        abx abxVar = new abx();
        abxVar.a = substring;
        abxVar.b = substring2;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null && pathSegments.size() > 1) {
            abxVar.c = pathSegments.get(1);
        }
        return abxVar;
    }
}
