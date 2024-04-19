package com.xiaopeng.musicradio.mine.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import defpackage.aht;
/* compiled from: CategoryViewHolder.java */
/* loaded from: classes.dex */
public class a {
    public final View a;
    public final ViewGroup b;
    public final ListRecyclerView c;
    public final TextView d;
    public final ImageView e;
    public final View f;
    public final TextView g;
    public final ImageView h;
    private int i;
    private LoadingTipsView j;

    public void b() {
    }

    public a(final View view) {
        this.a = view;
        this.c = (ListRecyclerView) view.findViewById(aht.c.rv_category_list);
        this.d = (TextView) view.findViewById(aht.c.tv_category_title);
        this.e = (ImageView) view.findViewById(aht.c.iv_category_title_arrow);
        this.f = view.findViewById(aht.c.ll_category_title);
        this.g = (TextView) view.findViewById(aht.c.tv_category_title_btn);
        this.h = (ImageView) view.findViewById(aht.c.iv_category_title_btn_img);
        this.b = (ViewGroup) view.findViewById(aht.c.category_content_view);
        this.j = (LoadingTipsView) view.findViewById(aht.c.loading_tips_view);
        ViewGroup viewGroup = this.b;
        if (viewGroup instanceof CategoryContentView) {
            ((CategoryContentView) viewGroup).setCategoryViewHolder(this);
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getResources().getDimensionPixelSize(aht.a.category_content_view_bottom));
        this.c.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.mine.widget.a.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    y.c(view.getContext());
                } else {
                    y.b(view.getContext());
                }
            }
        });
    }

    public void a(int i, int i2, int i3) {
        a(i, i2, 0, i3);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.i = i2;
        Context context = this.a.getContext();
        if (i4 > 1) {
            this.c.setLayoutManager(new GridLayoutManager(context, i4));
        }
        this.d.setText(context.getString(i));
        this.e.setImageResource(aht.b.x_ic_small_back);
        TextView textView = this.g;
        if (textView != null) {
            if (i2 > 0) {
                textView.setText(i2);
                if (i3 > 0) {
                    this.h.setImageResource(i3);
                    this.h.setVisibility(0);
                } else {
                    ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                    layoutParams.width = -2;
                    this.g.setLayoutParams(layoutParams);
                    TextView textView2 = this.g;
                    textView2.setPadding(textView2.getPaddingRight(), this.g.getPaddingTop(), this.g.getPaddingBottom(), this.g.getPaddingRight());
                }
                this.g.setVisibility(0);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) textView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.g);
                ImageView imageView = this.h;
                if (imageView != null) {
                    viewGroup.removeView(imageView);
                }
            }
        }
    }

    public void a(int i, int i2) {
        this.i = i;
        this.g.setText(i);
        this.h.setImageResource(i2);
    }

    public int a() {
        return this.i;
    }

    public void a(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }
}
