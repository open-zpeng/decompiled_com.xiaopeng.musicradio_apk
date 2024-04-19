package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bfs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: AppMgrProxy.java */
/* renamed from: bhe  reason: default package */
/* loaded from: classes2.dex */
public class bhe extends bfs.a implements bep.a {
    private Context a;
    private b<bfs> b = new b<>("AppMgrProxy");
    private List<String> c = new ArrayList();

    public bhe(Context context) {
        this.a = context;
        a(this.a.getPackageName(), a(this.a));
    }

    public void a(e eVar) {
        this.b.a(eVar);
    }

    @Override // defpackage.bfs
    public void a(final String str, final String str2) {
        this.b.a((b<bfs>) new b.a<bfs, Object>() { // from class: bhe.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfs bfsVar) {
                if (!bhe.this.c.contains(str2)) {
                    bhe.this.c.add(str2);
                }
                bfsVar.a(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfs
    public String a(final String str) {
        return (String) this.b.a(new b.a<bfs, String>() { // from class: bhe.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfs bfsVar) {
                return bfsVar.a(str);
            }
        }, "");
    }

    @Override // defpackage.bfs
    public String[] b(final String str) {
        List list = (List) this.b.a(new b.a<bfs, List<String>>() { // from class: bhe.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public List<String> a(bfs bfsVar) {
                return Arrays.asList(bfsVar.b(str));
            }
        }, null);
        if (list != null) {
            return (String[]) list.toArray(new String[list.size()]);
        }
        return null;
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.b.c(bewVar.f());
            b();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        this.b.b();
    }

    @Override // defpackage.bep.a
    public void a() {
        this.b.c(null);
    }

    private void b() {
        this.b.a((b<bfs>) new b.a<bfs, Object>() { // from class: bhe.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfs bfsVar) {
                c.b(this, "reRegisterApp...");
                for (String str : bhe.this.c) {
                    bfsVar.a(bhe.this.a.getPackageName(), str);
                }
                return null;
            }
        });
    }

    private String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
