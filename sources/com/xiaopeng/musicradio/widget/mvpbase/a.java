package com.xiaopeng.musicradio.widget.mvpbase;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import java.util.Collections;
import java.util.Set;
/* compiled from: DialogContextWrapper.java */
/* loaded from: classes2.dex */
public class a extends ContextWrapper {
    private RequestManager a;

    public a(Context context) {
        super(context);
    }

    public RequestManager a() {
        if (this.a == null) {
            this.a = new RequestManager(Glide.get(this), new Lifecycle() { // from class: com.xiaopeng.musicradio.widget.mvpbase.a.1
                @Override // com.bumptech.glide.manager.Lifecycle
                public void addListener(LifecycleListener lifecycleListener) {
                }

                @Override // com.bumptech.glide.manager.Lifecycle
                public void removeListener(LifecycleListener lifecycleListener) {
                }
            }, new C0183a(), this);
        }
        return this.a;
    }

    public void b() {
        RequestManager requestManager = this.a;
        if (requestManager != null) {
            requestManager.onStop();
            this.a.onDestroy();
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DialogContextWrapper.java */
    /* renamed from: com.xiaopeng.musicradio.widget.mvpbase.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0183a implements RequestManagerTreeNode {
        private C0183a() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set<RequestManager> getDescendants() {
            return Collections.emptySet();
        }
    }
}
