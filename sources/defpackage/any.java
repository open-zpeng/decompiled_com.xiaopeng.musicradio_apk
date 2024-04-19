package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.z;
import java.util.LinkedList;
import java.util.List;
/* compiled from: MusicLoginUidCache.java */
/* renamed from: any  reason: default package */
/* loaded from: classes2.dex */
public class any {
    private LinkedList<String> a;

    /* compiled from: MusicLoginUidCache.java */
    /* renamed from: any$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final any a = new any();
    }

    public static any a() {
        return a.a;
    }

    private any() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        LogUtils.i("MusicLoginUidCache", "onRemoved:uid=" + str);
        anr.a().b(str);
    }

    public void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ban.e(new Runnable() { // from class: any.1
            @Override // java.lang.Runnable
            public void run() {
                List b;
                LinkedList linkedList = any.this.a;
                if (linkedList == null) {
                    String a2 = afk.a().a("music_login_uid_cache");
                    if (!TextUtils.isEmpty(a2) && (b = z.b(a2, String.class)) != null) {
                        LogUtils.i("MusicLoginUidCache", "put:tempUidList=" + b.size());
                        linkedList = new LinkedList(b);
                        any.this.a = linkedList;
                    }
                }
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    any.this.a = linkedList;
                }
                linkedList.remove(str);
                linkedList.addFirst(str);
                while (linkedList.size() > 5) {
                    any.this.b((String) linkedList.removeLast());
                }
                afk.a().a("music_login_uid_cache", z.a(linkedList));
                LogUtils.i("MusicLoginUidCache", "put:uid=" + str + ",size=" + linkedList.size());
            }
        });
    }
}
