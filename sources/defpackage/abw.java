package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jaudiotagger.tag.datatype.DataTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: RemoteOperator.java */
/* renamed from: abw  reason: default package */
/* loaded from: classes2.dex */
class abw {
    private static String a = "abw";
    private IBinder b;
    private IBinder.DeathRecipient c;
    private Map<String, abv> d;
    private String e;
    private String f;
    private AtomicBoolean g = new AtomicBoolean(true);

    public static abw a(IBinder iBinder, String str) {
        ArrayList arrayList;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("DESCRIPTOR");
            String optString = jSONObject.optString("authority", string);
            JSONArray jSONArray = jSONObject.getJSONArray("TRANSACTION");
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONArray optJSONArray = jSONObject2.optJSONArray("parameter");
                if (optJSONArray != null) {
                    arrayList = new ArrayList(optJSONArray.length());
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                        arrayList.add(new Pair(jSONObject3.getString("alias"), jSONObject3.getString("name")));
                    }
                } else {
                    arrayList = null;
                }
                String string2 = jSONObject2.getString("METHOD");
                String optString2 = jSONObject2.optString("path", string2);
                abv abvVar = new abv(string2, jSONObject2.getInt(DataTypes.OBJ_ID), arrayList);
                hashMap.put(string2, abvVar);
                if (!string2.equals(optString2)) {
                    hashMap.put(optString2, abvVar);
                }
            }
            return new abw(iBinder, hashMap, string, optString);
        } catch (JSONException unused) {
            Log.e(a, "Remote IDL parsed error");
            return null;
        }
    }

    private abw(IBinder iBinder, Map<String, abv> map, String str, String str2) {
        this.b = iBinder;
        this.d = map;
        this.e = str;
        this.f = str2;
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.e;
    }

    public boolean c() {
        IBinder iBinder = this.b;
        return iBinder != null && iBinder.isBinderAlive() && this.g.get();
    }

    public Object a(Uri uri, boolean z, byte[] bArr) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 0) {
            throw new RemoteException("Can not find uri path segment");
        }
        String str = pathSegments.get(0);
        Map<String, abv> map = this.d;
        if (map == null || map.size() == 0) {
            throw new RemoteException("Server do not provide any method");
        }
        abv abvVar = this.d.get(str);
        if (abvVar == null) {
            throw new RemoteException("No matching method");
        }
        Uri.Builder builder = new Uri.Builder();
        builder.authority(this.e).path(abvVar.a());
        if (abvVar.c() != null) {
            for (Pair<String, String> pair : abvVar.c()) {
                String queryParameter = uri.getQueryParameter((String) pair.second);
                if (!TextUtils.isEmpty(queryParameter)) {
                    builder.appendQueryParameter((String) pair.second, queryParameter);
                } else {
                    String queryParameter2 = uri.getQueryParameter((String) pair.first);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        builder.appendQueryParameter((String) pair.second, queryParameter2);
                    }
                }
            }
        } else {
            for (String str2 : uri.getQueryParameterNames()) {
                builder.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        Uri build = builder.build();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(this.e);
            Uri.writeToParcel(obtain, build);
            if (z) {
                obtain.writeBlob(bArr);
            }
            this.b.transact(abvVar.b(), obtain, obtain2, 0);
            obtain2.readException();
            return a(obtain2);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    private Object a(Parcel parcel) {
        return parcel.readValue(getClass().getClassLoader());
    }

    public synchronized void d() {
        if (this.c == null) {
            this.c = new IBinder.DeathRecipient() { // from class: abw.1
                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    String str = abw.a;
                    Log.d(str, "binderDied:desc=" + abw.this.e + ", auth=" + abw.this.f + ",rec=" + Integer.toHexString(hashCode()) + ",obj=" + Integer.toHexString(abw.this.hashCode()));
                    abw.this.a("binderDied");
                }
            };
            try {
                String str = a;
                Log.d(str, "linkToDeath:desc=" + this.e + ",auth=" + this.f + ",rec=" + Integer.toHexString(this.c.hashCode()) + ",obj=" + Integer.toHexString(hashCode()));
                this.b.linkToDeath(this.c, 0);
            } catch (RemoteException unused) {
                this.g.set(false);
                String str2 = a;
                Log.e(str2, "linkToDeath:" + this.f + "'s process has already died");
            }
        }
    }

    public synchronized void a(String str) {
        this.g.set(false);
        if (this.c != null) {
            String str2 = a;
            Log.d(str2, "unLinkToDeath(" + str + "):desc=" + this.e + ",auth= " + this.f + ",rec=" + Integer.toHexString(this.c.hashCode()) + ",obj=" + Integer.toHexString(hashCode()));
            if (!this.b.unlinkToDeath(this.c, 0)) {
                String str3 = a;
                Log.e(str3, "unLinkToDeath(" + str + "):" + this.f + "'s process has already died");
            }
            this.c = null;
        }
    }
}
