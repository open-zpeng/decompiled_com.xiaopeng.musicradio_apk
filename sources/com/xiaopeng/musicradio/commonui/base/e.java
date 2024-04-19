package com.xiaopeng.musicradio.commonui.base;

import android.content.Context;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import java.util.Collections;
import java.util.Set;
/* compiled from: FragmentContextWrapper.java */
/* loaded from: classes.dex */
public class e extends ContextThemeWrapper {
    private RequestManager a;

    public e(Context context) {
        super(context, context.getTheme());
        Log.i("FragmentContextWrapper", "FragmentContextWrapper: ============" + getResources());
    }

    public RequestManager a() {
        if (this.a == null) {
            this.a = new RequestManager(Glide.get(this), new Lifecycle() { // from class: com.xiaopeng.musicradio.commonui.base.e.1
                @Override // com.bumptech.glide.manager.Lifecycle
                public void addListener(LifecycleListener lifecycleListener) {
                }

                @Override // com.bumptech.glide.manager.Lifecycle
                public void removeListener(LifecycleListener lifecycleListener) {
                }
            }, new a(), getBaseContext());
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
    /* compiled from: FragmentContextWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements RequestManagerTreeNode {
        private a() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set<RequestManager> getDescendants() {
            return Collections.emptySet();
        }
    }
}
