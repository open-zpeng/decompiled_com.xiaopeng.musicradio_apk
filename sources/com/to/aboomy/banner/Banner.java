package com.to.aboomy.banner;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Banner extends RelativeLayout implements ViewPager.f {
    private static final long DEFAULT_AUTO_TIME = 2500;
    private static final int NORMAL_COUNT = 2;
    private a adapter;
    private long autoTurningTime;
    private int currentPage;
    private HolderCreator holderCreator;
    private Indicator indicator;
    private boolean isAutoPlay;
    private int needCount;
    private int needPage;
    private OnPageItemClickListener onPageClickListener;
    private ViewPager.f outerPageChangeListener;
    private int realCount;
    private int sidePage;
    private final Runnable task;
    private BannerViewPager viewPager;
    private List<View> views;

    static /* synthetic */ int access$008(Banner banner) {
        int i = banner.currentPage;
        banner.currentPage = i + 1;
        return i;
    }

    public Banner(Context context) {
        this(context, null);
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Banner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isAutoPlay = true;
        this.autoTurningTime = DEFAULT_AUTO_TIME;
        this.needPage = 2;
        this.task = new Runnable() { // from class: com.to.aboomy.banner.Banner.1
            @Override // java.lang.Runnable
            public void run() {
                if (Banner.this.isAutoPlay()) {
                    Banner.access$008(Banner.this);
                    if (Banner.this.currentPage == Banner.this.realCount + Banner.this.sidePage + 1) {
                        Banner.this.viewPager.setCurrentItem(Banner.this.sidePage, false);
                        Banner banner = Banner.this;
                        banner.post(banner.task);
                        return;
                    }
                    Banner.this.viewPager.setCurrentItem(Banner.this.currentPage);
                    Banner banner2 = Banner.this;
                    banner2.postDelayed(banner2.task, Banner.this.autoTurningTime);
                }
            }
        };
        this.views = new ArrayList();
        initViews(context);
    }

    private void initViews(Context context) {
        this.viewPager = new BannerViewPager(context);
        this.viewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.viewPager.setClipToPadding(false);
        this.viewPager.addOnPageChangeListener(this);
        addView(this.viewPager);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAutoPlay()) {
            startTurning();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isAutoPlay()) {
            stopTurning();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.f
    public void onPageScrolled(int i, float f, int i2) {
        int realPosition = toRealPosition(i);
        ViewPager.f fVar = this.outerPageChangeListener;
        if (fVar != null) {
            fVar.onPageScrolled(realPosition, f, i2);
        }
        Indicator indicator = this.indicator;
        if (indicator != null) {
            indicator.onPageScrolled(realPosition, f, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    @Override // androidx.viewpager.widget.ViewPager.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageSelected(int r5) {
        /*
            r4 = this;
            int r0 = r4.currentPage
            int r1 = r4.sidePage
            int r2 = r1 + (-1)
            if (r0 == r2) goto L18
            int r2 = r4.needCount
            int r3 = r1 + (-1)
            int r3 = r2 - r3
            if (r0 == r3) goto L18
            if (r5 == r0) goto L16
            int r2 = r2 - r0
            if (r2 != r1) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            r4.currentPage = r5
            if (r0 == 0) goto L1e
            return
        L1e:
            int r5 = r4.toRealPosition(r5)
            androidx.viewpager.widget.ViewPager$f r0 = r4.outerPageChangeListener
            if (r0 == 0) goto L29
            r0.onPageSelected(r5)
        L29:
            com.to.aboomy.banner.Indicator r0 = r4.indicator
            if (r0 == 0) goto L30
            r0.onPageSelected(r5)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.to.aboomy.banner.Banner.onPageSelected(int):void");
    }

    @Override // androidx.viewpager.widget.ViewPager.f
    public void onPageScrollStateChanged(int i) {
        ViewPager.f fVar = this.outerPageChangeListener;
        if (fVar != null) {
            fVar.onPageScrollStateChanged(i);
        }
        Indicator indicator = this.indicator;
        if (indicator != null) {
            indicator.onPageScrollStateChanged(i);
        }
        if (i == 1) {
            int i2 = this.currentPage;
            int i3 = this.sidePage;
            if (i2 == i3 - 1) {
                this.viewPager.setCurrentItem(this.realCount + i2, false);
            } else if (i2 == this.needCount - i3) {
                this.viewPager.setCurrentItem(i3, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class BannerAdapter extends a {
        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        private BannerAdapter() {
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return Banner.this.realCount > 1 ? Banner.this.needCount : Banner.this.realCount;
        }

        @Override // androidx.viewpager.widget.a
        public Object instantiateItem(ViewGroup viewGroup, final int i) {
            View view = (View) Banner.this.views.get(i);
            if (Banner.this.onPageClickListener != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.to.aboomy.banner.Banner.BannerAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Banner.this.onPageClickListener.onPageItemClick(view2, Banner.this.toRealPosition(i));
                    }
                });
            }
            viewGroup.addView(view);
            return view;
        }

        @Override // androidx.viewpager.widget.a
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isAutoPlay()) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                startTurning();
            } else if (action == 0) {
                stopTurning();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void startPager(int i) {
        if (this.adapter == null) {
            this.adapter = new BannerAdapter();
        }
        this.viewPager.setAdapter(this.adapter);
        this.currentPage = i + this.sidePage;
        this.viewPager.setScrollable(this.realCount > 1);
        this.viewPager.setFirstLayoutToField(false);
        this.viewPager.setFocusable(true);
        this.viewPager.setCurrentItem(this.currentPage);
        Indicator indicator = this.indicator;
        if (indicator != null) {
            indicator.initIndicatorCount(this.realCount);
        }
        if (isAutoPlay()) {
            startTurning();
        }
    }

    private void createImages(List<?> list) {
        this.views.clear();
        if (list == null || list.size() == 0 || this.holderCreator == null) {
            this.realCount = 0;
            this.needCount = 0;
            return;
        }
        this.realCount = list.size();
        int i = this.needPage;
        this.sidePage = i / 2;
        this.needCount = this.realCount + i;
        for (int i2 = 0; i2 < this.needCount; i2++) {
            int realPosition = toRealPosition(i2);
            this.views.add(this.holderCreator.createView(getContext(), realPosition, list.get(realPosition)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toRealPosition(int i) {
        int i2 = this.realCount;
        int i3 = i2 != 0 ? (i - this.sidePage) % i2 : 0;
        return i3 < 0 ? i3 + this.realCount : i3;
    }

    public Banner setPageMargin(int i, int i2) {
        return setPageMargin(i, i, i2);
    }

    public Banner setPageMargin(int i, int i2, int i3) {
        this.viewPager.setPageMargin(i3);
        this.viewPager.setOverlapStyle(i3 < 0);
        this.viewPager.setPadding(i + Math.abs(i3), this.viewPager.getPaddingTop(), i2 + Math.abs(i3), this.viewPager.getPaddingBottom());
        this.viewPager.setOffscreenPageLimit(2);
        this.needPage = 4;
        return this;
    }

    public Banner setPageTransformer(boolean z, ViewPager.g gVar) {
        this.viewPager.setPageTransformer(z, gVar);
        return this;
    }

    public Banner setAutoTurningTime(long j) {
        this.autoTurningTime = j;
        return this;
    }

    public Banner setOuterPageChangeListener(ViewPager.f fVar) {
        this.outerPageChangeListener = fVar;
        return this;
    }

    public Banner setPagerScrollDuration(int i) {
        this.viewPager.setPagerScrollDuration(i);
        return this;
    }

    public Banner setOffscreenPageLimit(int i) {
        this.viewPager.setOffscreenPageLimit(i);
        return this;
    }

    public Banner setRoundCorners(final float f) {
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.to.aboomy.banner.Banner.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), f);
            }
        });
        setClipToOutline(true);
        return this;
    }

    public Banner setAutoPlay(boolean z) {
        this.isAutoPlay = z;
        if (this.isAutoPlay && this.realCount > 1) {
            startTurning();
        }
        return this;
    }

    public Banner setIndicator(Indicator indicator) {
        return setIndicator(indicator, true);
    }

    public Banner setIndicator(Indicator indicator, boolean z) {
        Indicator indicator2 = this.indicator;
        if (indicator2 != null) {
            removeView(indicator2.getView());
        }
        if (indicator != null) {
            this.indicator = indicator;
            if (z) {
                addView(this.indicator.getView(), this.indicator.getParams());
            }
        }
        return this;
    }

    public Banner setHolderCreator(HolderCreator holderCreator) {
        this.holderCreator = holderCreator;
        return this;
    }

    public Banner setOnPageClickListener(OnPageItemClickListener onPageItemClickListener) {
        this.onPageClickListener = onPageItemClickListener;
        return this;
    }

    public void setPages(List<?> list, int i) {
        createImages(list);
        startPager(i);
    }

    public void setPages(List<?> list) {
        setPages(list, 0);
    }

    public boolean isAutoPlay() {
        return this.isAutoPlay && this.realCount > 1;
    }

    public int getCurrentPager() {
        return Math.max(toRealPosition(this.currentPage), 0);
    }

    public void startTurning() {
        stopTurning();
        postDelayed(this.task, this.autoTurningTime);
    }

    public void stopTurning() {
        removeCallbacks(this.task);
    }
}
