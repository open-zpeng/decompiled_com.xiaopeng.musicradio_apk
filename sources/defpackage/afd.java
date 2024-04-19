package defpackage;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XRecyclerView;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: VuiUpdateHandler.java */
/* renamed from: afd  reason: default package */
/* loaded from: classes2.dex */
public class afd {
    private static HashSet<String> a = new HashSet<>();
    private static SparseArray<a> b = new SparseArray<>();
    private static Handler c = new Handler(Looper.getMainLooper()) { // from class: afd.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int size = afd.b.size();
            if (size <= 0) {
                return;
            }
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < size; i++) {
                linkedList.add(afd.b.valueAt(i));
            }
            afd.b.clear();
            linkedList.sort(new Comparator<a>() { // from class: afd.1.1
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(a aVar, a aVar2) {
                    if ((aVar.b instanceof XRecyclerView) || !(aVar2.b instanceof XRecyclerView)) {
                        if (!(aVar.b instanceof XRecyclerView) || (aVar2.b instanceof XRecyclerView)) {
                            return Long.compare(aVar.c, aVar2.c);
                        }
                        return 1;
                    }
                    return -1;
                }
            });
            LogUtils.i("VuiUpdateHandler", "updateScene:size=" + linkedList.size());
            Application a2 = com.xiaopeng.musicradio.a.a();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (afd.a.contains(aVar.a)) {
                    VuiEngine.getInstance(a2).updateScene(aVar.a, aVar.b);
                    LogUtils.i("VuiUpdateHandler", "updateScene:" + aVar);
                } else {
                    LogUtils.i("VuiUpdateHandler", "updateScene(skip):" + aVar);
                }
            }
        }
    };

    public static void a(String str, View view) {
        if (view == null) {
            return;
        }
        c.removeMessages(100);
        b.put(view.hashCode(), new a(str, view, System.currentTimeMillis()));
        c.sendEmptyMessageDelayed(100, 800L);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtils.i("VuiUpdateHandler", "enterScene:" + str);
        a.add(str);
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtils.i("VuiUpdateHandler", "exitScene:" + str);
        a.remove(str);
    }

    /* compiled from: VuiUpdateHandler.java */
    /* renamed from: afd$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final String a;
        public final View b;
        public final long c;

        public a(String str, View view, long j) {
            this.a = str;
            this.b = view;
            this.c = j;
        }

        public String toString() {
            return "UpdateItem{sceneId='" + this.a + "', view=" + this.b + ", timestamp=" + this.c + '}';
        }
    }
}
