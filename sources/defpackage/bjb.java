package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import me.yokeyword.fragmentation.d;
/* compiled from: DebugHierarchyViewContainer.java */
/* renamed from: bjb  reason: default package */
/* loaded from: classes3.dex */
public class bjb extends ScrollView {
    private Context a;
    private LinearLayout b;
    private LinearLayout c;
    private int d;
    private int e;

    public bjb(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        this.a = context;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.b = new LinearLayout(context);
        this.b.setOrientation(1);
        horizontalScrollView.addView(this.b);
        addView(horizontalScrollView);
        this.d = a(50.0f);
        this.e = a(16.0f);
    }

    private int a(float f) {
        return (int) ((f * this.a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void a(List<bja> list) {
        this.b.removeAllViews();
        this.b.addView(getTitleLayout());
        if (list == null) {
            return;
        }
        a(list, 0, null);
    }

    private LinearLayout getTitleLayout() {
        LinearLayout linearLayout = this.c;
        if (linearLayout != null) {
            return linearLayout;
        }
        this.c = new LinearLayout(this.a);
        this.c.setPadding(a(24.0f), a(24.0f), 0, a(8.0f));
        this.c.setOrientation(0);
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextView textView = new TextView(this.a);
        textView.setText(d.C0193d.fragmentation_stack_view);
        textView.setTextSize(20.0f);
        textView.setTextColor(-16777216);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        this.c.addView(textView);
        ImageView imageView = new ImageView(this.a);
        imageView.setImageResource(d.b.fragmentation_help);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = a(16.0f);
        layoutParams2.gravity = 16;
        imageView.setLayoutParams(layoutParams2);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: bjb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Toast.makeText(bjb.this.a, d.C0193d.fragmentation_stack_help, 1).show();
            }
        });
        this.c.addView(imageView);
        return this.c;
    }

    private void a(List<bja> list, int i, TextView textView) {
        for (int size = list.size() - 1; size >= 0; size--) {
            bja bjaVar = list.get(size);
            final TextView a = a(bjaVar, i);
            a.setTag(d.c.hierarchy, Integer.valueOf(i));
            final List<bja> list2 = bjaVar.b;
            if (list2 != null && list2.size() > 0) {
                final int i2 = i + 1;
                a.setCompoundDrawablesWithIntrinsicBounds(d.b.fragmentation_ic_right, 0, 0, 0);
                a.setOnClickListener(new View.OnClickListener() { // from class: bjb.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (view.getTag(d.c.isexpand) != null) {
                            boolean booleanValue = ((Boolean) view.getTag(d.c.isexpand)).booleanValue();
                            if (!booleanValue) {
                                bjb.this.b(list2, i2, a);
                            } else {
                                a.setCompoundDrawablesWithIntrinsicBounds(d.b.fragmentation_ic_right, 0, 0, 0);
                                bjb.this.a(i2);
                            }
                            view.setTag(d.c.isexpand, Boolean.valueOf(!booleanValue));
                            return;
                        }
                        a.setTag(d.c.isexpand, true);
                        bjb.this.b(list2, i2, a);
                    }
                });
            } else {
                int paddingLeft = a.getPaddingLeft();
                int i3 = this.e;
                a.setPadding(paddingLeft + i3, 0, i3, 0);
            }
            if (textView == null) {
                this.b.addView(a);
            } else {
                LinearLayout linearLayout = this.b;
                linearLayout.addView(a, linearLayout.indexOfChild(textView) + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<bja> list, int i, TextView textView) {
        a(list, i, textView);
        textView.setCompoundDrawablesWithIntrinsicBounds(d.b.fragmentation_ic_expandable, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        for (int childCount = this.b.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.b.getChildAt(childCount);
            if (childAt.getTag(d.c.hierarchy) != null && ((Integer) childAt.getTag(d.c.hierarchy)).intValue() >= i) {
                this.b.removeView(childAt);
            }
        }
    }

    private TextView a(bja bjaVar, int i) {
        TextView textView = new TextView(this.a);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, this.d));
        if (i == 0) {
            textView.setTextColor(Color.parseColor("#333333"));
            textView.setTextSize(16.0f);
        }
        textView.setGravity(16);
        int i2 = this.e;
        textView.setPadding((int) (i2 + (i * i2 * 1.5d)), 0, i2, 0);
        textView.setCompoundDrawablePadding(this.e / 2);
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(new int[]{16843534});
        textView.setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
        textView.setText(bjaVar.a);
        return textView;
    }
}
