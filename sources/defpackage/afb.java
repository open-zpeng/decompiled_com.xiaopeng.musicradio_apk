package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: IMMLeaks.java */
/* renamed from: afb  reason: default package */
/* loaded from: classes2.dex */
public class afb {

    /* compiled from: IMMLeaks.java */
    /* renamed from: afb$a */
    /* loaded from: classes2.dex */
    static class a implements MessageQueue.IdleHandler, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {
        private final InputMethodManager a;
        private final Field b;
        private final Field c;
        private final Method d;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        a(InputMethodManager inputMethodManager, Field field, Field field2, Method method) {
            this.a = inputMethodManager;
            this.b = field;
            this.c = field2;
            this.d = method;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            if (view2 == null) {
                return;
            }
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
            Looper.myQueue().removeIdleHandler(this);
            view2.addOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            Looper.myQueue().removeIdleHandler(this);
            Looper.myQueue().addIdleHandler(this);
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            a();
            return false;
        }

        private void a() {
            try {
                Object obj = this.b.get(this.a);
                if (obj != null) {
                    synchronized (obj) {
                        View view = (View) this.c.get(this.a);
                        if (view != null) {
                            boolean z = true;
                            if (view.getWindowVisibility() != 8) {
                                view.removeOnAttachStateChangeListener(this);
                                view.addOnAttachStateChangeListener(this);
                            } else {
                                Activity a = a(view.getContext());
                                if (a != null && a.getWindow() != null) {
                                    View peekDecorView = a.getWindow().peekDecorView();
                                    if (peekDecorView.getWindowVisibility() == 8) {
                                        z = false;
                                    }
                                    if (!z) {
                                        this.d.invoke(this.a, new Object[0]);
                                    } else {
                                        peekDecorView.requestFocusFromTouch();
                                    }
                                }
                                this.d.invoke(this.a, new Object[0]);
                            }
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e("IMMLeaks", "Unexpected reflection exception", e);
            }
        }

        private Activity a(Context context) {
            Context baseContext;
            while (!(context instanceof Application)) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
                    return null;
                }
                context = baseContext;
            }
            return null;
        }
    }

    public static void a(Application application) {
        if (Build.VERSION.SDK_INT < 19 || Build.VERSION.SDK_INT > 28) {
            return;
        }
        final InputMethodManager inputMethodManager = (InputMethodManager) application.getSystemService("input_method");
        try {
            final Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            final Field declaredField2 = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField2.setAccessible(true);
            final Method declaredMethod = InputMethodManager.class.getDeclaredMethod("finishInputLocked", new Class[0]);
            declaredMethod.setAccessible(true);
            InputMethodManager.class.getDeclaredMethod("focusIn", View.class).setAccessible(true);
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: afb.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    activity.getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalFocusChangeListener(new a(inputMethodManager, declaredField2, declaredField, declaredMethod));
                }
            });
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("IMMLeaks", "Unexpected reflection exception", e);
        }
    }
}
