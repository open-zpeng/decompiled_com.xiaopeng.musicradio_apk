package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Field;
/* compiled from: ScrollingUtil.java */
/* renamed from: aas  reason: default package */
/* loaded from: classes2.dex */
public class aas {
    public static boolean a(View view, int i) {
        return view instanceof AbsListView ? a((AbsListView) view) : view instanceof RecyclerView ? a((RecyclerView) view) : view != null && Math.abs(view.getScrollY()) <= i * 2;
    }

    public static boolean b(View view, int i) {
        if (view instanceof AbsListView) {
            return b((AbsListView) view);
        }
        if (view instanceof RecyclerView) {
            return b((RecyclerView) view);
        }
        if (view instanceof WebView) {
            return a((WebView) view, i);
        }
        if (view instanceof ViewGroup) {
            return a((ViewGroup) view);
        }
        return false;
    }

    public static boolean a(AbsListView absListView) {
        if (absListView != null) {
            int top = absListView.getChildCount() > 0 ? absListView.getChildAt(0).getTop() - absListView.getPaddingTop() : 0;
            if (absListView.getFirstVisiblePosition() == 0 && top == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(RecyclerView recyclerView) {
        int i;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || layoutManager.K() == 0) {
                return true;
            }
            if (recyclerView.getChildCount() > 0) {
                View childAt = recyclerView.getChildAt(0);
                if (childAt != null && childAt.getMeasuredHeight() >= recyclerView.getMeasuredHeight()) {
                    if (Build.VERSION.SDK_INT < 14) {
                        return !hq.b((View) recyclerView, -1) && recyclerView.getScrollY() <= 0;
                    }
                    return !hq.b((View) recyclerView, -1);
                }
                View childAt2 = recyclerView.getChildAt(0);
                RecyclerView.i iVar = (RecyclerView.i) childAt2.getLayoutParams();
                i = ((childAt2.getTop() - iVar.topMargin) - a(iVar)) - recyclerView.getPaddingTop();
            } else {
                i = 0;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                if (((LinearLayoutManager) layoutManager).q() < 1 && i == 0) {
                    return true;
                }
            } else if ((layoutManager instanceof StaggeredGridLayoutManager) && ((StaggeredGridLayoutManager) layoutManager).a((int[]) null)[0] < 1 && i == 0) {
                return true;
            }
        }
        return false;
    }

    private static int a(RecyclerView.i iVar) {
        try {
            Field declaredField = RecyclerView.i.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            return ((Rect) declaredField.get(iVar)).top;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean a(WebView webView, int i) {
        return webView != null && (((float) webView.getContentHeight()) * webView.getScale()) - ((float) (webView.getHeight() + webView.getScrollY())) <= ((float) (i * 2));
    }

    public static boolean a(ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(0);
        return childAt != null && childAt.getMeasuredHeight() <= viewGroup.getScrollY() + viewGroup.getHeight();
    }

    public static boolean b(AbsListView absListView) {
        return absListView != null && absListView.getAdapter() != null && absListView.getChildCount() > 0 && absListView.getLastVisiblePosition() == ((ListAdapter) absListView.getAdapter()).getCount() - 1 && absListView.getChildAt(absListView.getChildCount() - 1).getBottom() <= absListView.getMeasuredHeight();
    }

    public static boolean b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || layoutManager.K() == 0) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            if (childAt != null && childAt.getMeasuredHeight() >= recyclerView.getMeasuredHeight()) {
                if (Build.VERSION.SDK_INT < 14) {
                    return !hq.b((View) recyclerView, 1) && recyclerView.getScrollY() >= 0;
                }
                return !hq.b((View) recyclerView, 1);
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.s() == linearLayoutManager.K() - 1) {
                return true;
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] b = staggeredGridLayoutManager.b((int[]) null);
            int K = staggeredGridLayoutManager.K() - 1;
            for (int i : b) {
                if (i == K) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c(View view, int i) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).scrollBy(0, i);
        } else if (view instanceof ScrollView) {
            ((ScrollView) view).smoothScrollBy(0, i);
        } else if (view instanceof AbsListView) {
            ((AbsListView) view).smoothScrollBy(i, 0);
        } else {
            try {
                view.getClass().getDeclaredMethod("smoothScrollBy", Integer.class, Integer.class).invoke(view, 0, Integer.valueOf(i));
            } catch (Exception unused) {
                view.scrollBy(0, i);
            }
        }
    }
}
