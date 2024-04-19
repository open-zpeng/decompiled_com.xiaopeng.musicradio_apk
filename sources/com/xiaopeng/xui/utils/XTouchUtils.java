package com.xiaopeng.xui.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.xiaopeng.musicradio.common.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class XTouchUtils {
    public static final int ANIMATION = 1;
    public static final int ANIMATOR = 2;
    public static final int ANIM_ALPHA = 2;
    public static final int ANIM_DOWN = 1;
    public static final int ANIM_SCALE = 1;
    public static final int ANIM_SCALE_X = 3;
    public static final int ANIM_SCALE_Y = 4;
    public static final int ANIM_UP = 2;
    public static final Interpolator DEFAULT_INTERPOLATOR = new bdt(0.2f, 0.0f, 0.2f, 1.0f);

    /* loaded from: classes2.dex */
    private @interface AnimationTouch {
    }

    /* loaded from: classes2.dex */
    private @interface AnimationType {
    }

    /* loaded from: classes2.dex */
    private @interface Type {
    }

    public static void wrapTouchAnim(View view, List<TouchParams> list) {
        TouchDelegate touchDelegate = view.getTouchDelegate();
        if (touchDelegate instanceof AnimTouchDelegate) {
            touchDelegate = ((AnimTouchDelegate) touchDelegate).getDelegate();
        }
        view.setTouchDelegate(new AnimTouchDelegate(null, view, touchDelegate, list));
    }

    public static TouchParams getDefaultScaleTouchParam(View view) {
        return new TouchParams.TouchParamsBulider().setAnimationType(1).setStartValue(1.0f).setEndValue(0.8f).setDuration(100).setInterpolator(DEFAULT_INTERPOLATOR).setTarget(view).build();
    }

    public static TouchParams getDefaultAlphaTouchParam(View view) {
        return new TouchParams.TouchParamsBulider().setAnimationType(2).setStartValue(0.0f).setEndValue(1.0f).setDuration(100).setInterpolator(DEFAULT_INTERPOLATOR).setTarget(view).build();
    }

    public static TouchResParams getTouchResParam(View view, int i, int i2) {
        return new TouchResParams.TouchResParamsBulider().setDownRes(i).setUpRes(i2).setTarget(view).build();
    }

    public static void wrapTouchAnimRes(View view, List<TouchResParams> list) {
        TouchDelegate touchDelegate = view.getTouchDelegate();
        if (touchDelegate instanceof AnimTouchDelegate) {
            touchDelegate = ((AnimTouchDelegate) touchDelegate).getDelegate();
        }
        view.setTouchDelegate(new AnimTouchResDelegate(null, view, touchDelegate, list));
    }

    /* loaded from: classes2.dex */
    public static class TouchParams extends TouchParamsParent {
        @AnimationTouch
        private int mAnimTouch;
        @AnimationType
        private int mAnimType;
        private int mDelay;
        private int mDuration;
        private float mEndValue;
        private boolean mHasReverse;
        private Interpolator mInterpolator;
        private float mStartValue;
        private View.OnTouchListener mTouchListener;
        @Type
        private int mType;

        @Override // com.xiaopeng.xui.utils.XTouchUtils.TouchParamsParent
        public /* bridge */ /* synthetic */ View getTarget() {
            return super.getTarget();
        }

        private TouchParams(TouchParamsBulider touchParamsBulider) {
            super();
            this.mInterpolator = touchParamsBulider.mInterpolator;
            this.mStartValue = touchParamsBulider.mStartValue;
            this.mEndValue = touchParamsBulider.mEndValue;
            this.mDuration = touchParamsBulider.mDuration;
            this.mDelay = touchParamsBulider.mDelay;
            this.mAnimType = touchParamsBulider.mAnimType;
            this.mTarget = touchParamsBulider.mTarget;
            this.mTouchListener = touchParamsBulider.mTouchListener;
            this.mAnimTouch = touchParamsBulider.mAnimTouch;
            this.mHasReverse = touchParamsBulider.mHasReverse;
            this.mType = touchParamsBulider.mType;
        }

        /* loaded from: classes2.dex */
        public static class TouchParamsBulider {
            @AnimationType
            private int mAnimType;
            private int mDelay;
            private int mDuration;
            private float mEndValue;
            private Interpolator mInterpolator;
            private float mStartValue;
            private View mTarget;
            private View.OnTouchListener mTouchListener;
            @AnimationTouch
            private int mAnimTouch = 1;
            private boolean mHasReverse = true;
            @Type
            private int mType = 1;

            public TouchParamsBulider setStartValue(float f) {
                this.mStartValue = f;
                return this;
            }

            public TouchParamsBulider setEndValue(float f) {
                this.mEndValue = f;
                return this;
            }

            public TouchParamsBulider setDuration(int i) {
                this.mDuration = i;
                return this;
            }

            public TouchParamsBulider setDelay(int i) {
                this.mDelay = i;
                return this;
            }

            public TouchParamsBulider setInterpolator(Interpolator interpolator) {
                this.mInterpolator = interpolator;
                return this;
            }

            public TouchParamsBulider setAnimationType(@AnimationType int i) {
                this.mAnimType = i;
                return this;
            }

            public TouchParamsBulider setTarget(View view) {
                this.mTarget = view;
                return this;
            }

            public TouchParamsBulider setOnTouchListener(View.OnTouchListener onTouchListener) {
                this.mTouchListener = onTouchListener;
                return this;
            }

            public TouchParamsBulider setAnimTouch(@AnimationTouch int i) {
                this.mAnimTouch = i;
                return this;
            }

            public TouchParamsBulider setHasReverse(boolean z) {
                this.mHasReverse = z;
                return this;
            }

            public TouchParamsBulider setType(@Type int i) {
                this.mType = i;
                return this;
            }

            public TouchParams build() {
                return new TouchParams(this);
            }
        }

        public float getStartValue() {
            return this.mStartValue;
        }

        public float getEndValue() {
            return this.mEndValue;
        }

        public int getDuration() {
            return this.mDuration;
        }

        public int getDelay() {
            return this.mDelay;
        }

        @AnimationTouch
        public int getAnimTouch() {
            return this.mAnimTouch;
        }

        public boolean hasReverse() {
            return this.mHasReverse;
        }

        public View.OnTouchListener getTouchListener() {
            return this.mTouchListener;
        }

        @AnimationType
        public int getAnimationType() {
            return this.mAnimType;
        }

        @Type
        public int getType() {
            return this.mType;
        }

        public Interpolator getInterpolator() {
            return this.mInterpolator;
        }
    }

    /* loaded from: classes2.dex */
    public static class TouchResParams extends TouchParamsParent {
        private int mDownRes;
        private int mUpRes;

        @Override // com.xiaopeng.xui.utils.XTouchUtils.TouchParamsParent
        public /* bridge */ /* synthetic */ View getTarget() {
            return super.getTarget();
        }

        private TouchResParams(TouchResParamsBulider touchResParamsBulider) {
            super();
            this.mDownRes = touchResParamsBulider.mDownRes;
            this.mUpRes = touchResParamsBulider.mUpRes;
            this.mTarget = touchResParamsBulider.mTarget;
        }

        /* loaded from: classes2.dex */
        public static class TouchResParamsBulider {
            private int mDownRes;
            private View mTarget;
            private int mUpRes;

            public TouchResParamsBulider setDownRes(int i) {
                this.mDownRes = i;
                return this;
            }

            public TouchResParamsBulider setUpRes(int i) {
                this.mUpRes = i;
                return this;
            }

            public TouchResParamsBulider setTarget(View view) {
                this.mTarget = view;
                return this;
            }

            public TouchResParams build() {
                return new TouchResParams(this);
            }
        }

        public int getDownRes() {
            return this.mDownRes;
        }

        public int getUpRes() {
            return this.mUpRes;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class TouchParamsParent {
        protected View mTarget;

        private TouchParamsParent() {
        }

        public View getTarget() {
            return this.mTarget;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class AnimTouchDelegateParent<T extends TouchParamsParent> extends TouchDelegate {
        protected TouchDelegate mDelegate;
        protected View mDelegateView;
        protected List<T> mParamList;

        protected abstract void doAnim(boolean z, MotionEvent motionEvent);

        public AnimTouchDelegateParent(Rect rect, View view, TouchDelegate touchDelegate, List<T> list) {
            super(rect, view);
            this.mDelegateView = view;
            this.mDelegate = touchDelegate;
            this.mParamList = list;
            this.mDelegateView.setClickable(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[RETURN] */
        @Override // android.view.TouchDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouchEvent(android.view.MotionEvent r4) {
            /*
                r3 = this;
                int r0 = r4.getActionMasked()
                r1 = 3
                r2 = 0
                if (r0 == r1) goto L10
                switch(r0) {
                    case 0: goto Lc;
                    case 1: goto L10;
                    default: goto Lb;
                }
            Lb:
                goto L14
            Lc:
                r3.doAnim(r2, r4)
                goto L14
            L10:
                r0 = 1
                r3.doAnim(r0, r4)
            L14:
                android.view.TouchDelegate r0 = r3.mDelegate
                if (r0 == 0) goto L1d
                boolean r4 = r0.onTouchEvent(r4)
                return r4
            L1d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.xui.utils.XTouchUtils.AnimTouchDelegateParent.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public TouchDelegate getDelegate() {
            return this.mDelegate;
        }
    }

    /* loaded from: classes2.dex */
    private static class AnimTouchDelegate extends AnimTouchDelegateParent<TouchParams> {
        private SparseArray<Map<View, List<TouchParams>>> mParamsArray;

        public AnimTouchDelegate(Rect rect, View view, TouchDelegate touchDelegate, List<TouchParams> list) {
            super(rect, view, touchDelegate, list);
            this.mParamsArray = new SparseArray<>();
            initParamsArray();
        }

        private void initParamsArray() {
            this.mParamsArray.put(1, new HashMap());
            this.mParamsArray.put(2, new HashMap());
            for (T t : this.mParamList) {
                if (t.getAnimTouch() == 1) {
                    putParams(1, t);
                }
                if (t.hasReverse() || t.getAnimTouch() == 2) {
                    putParams(2, t);
                }
            }
        }

        private void putParams(@AnimationTouch int i, TouchParams touchParams) {
            Map<View, List<TouchParams>> map = this.mParamsArray.get(i);
            List<TouchParams> list = map.get(touchParams.getTarget());
            if (list == null) {
                list = new ArrayList<>();
                map.put(touchParams.getTarget(), list);
            }
            list.add(touchParams);
        }

        @Override // com.xiaopeng.xui.utils.XTouchUtils.AnimTouchDelegateParent
        protected void doAnim(boolean z, MotionEvent motionEvent) {
            Map<View, List<TouchParams>> map = this.mParamsArray.get(z ? 2 : 1);
            if (map != null && map.size() > 0) {
                for (Map.Entry<View, List<TouchParams>> entry : map.entrySet()) {
                    doAnim(z, motionEvent, entry.getKey(), entry.getValue());
                }
            }
            if (z) {
                return;
            }
            this.mDelegateView.setPressed(true);
        }

        private void doAnim(boolean z, MotionEvent motionEvent, View view, List<TouchParams> list) {
            AnimationSet animationSet = null;
            AnimatorSet animatorSet = null;
            for (TouchParams touchParams : list) {
                float startValue = touchParams.getStartValue();
                float endValue = touchParams.getEndValue();
                if (z && touchParams.getAnimTouch() != 2) {
                    startValue = touchParams.getEndValue();
                    endValue = touchParams.getStartValue();
                }
                if (touchParams.getTouchListener() != null) {
                    touchParams.getTouchListener().onTouch(touchParams.getTarget(), motionEvent);
                }
                if (touchParams.getType() == 1) {
                    if (animationSet == null) {
                        animationSet = new AnimationSet(false);
                        animationSet.setFillAfter(true);
                    }
                    animationSet.addAnimation(getAnimation(startValue, endValue, touchParams));
                } else if (touchParams.getType() == 2) {
                    if (animatorSet == null) {
                        animatorSet = new AnimatorSet();
                    }
                    animatorSet.playSequentially(getAnimator(startValue, endValue, touchParams));
                }
            }
            startAnimation(animationSet, view);
            startAnimator(animatorSet, view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Animator getAnimator(float f, float f2, TouchParams touchParams) {
            ObjectAnimator objectAnimator;
            if (touchParams.getAnimationType() == 1) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ObjectAnimator.ofFloat(touchParams.getTarget(), View.SCALE_X, f, f2));
                animatorSet.playSequentially(ObjectAnimator.ofFloat(touchParams.getTarget(), View.SCALE_Y, f, f2));
                objectAnimator = animatorSet;
            } else if (touchParams.getAnimationType() == 3) {
                objectAnimator = ObjectAnimator.ofFloat(touchParams.getTarget(), View.SCALE_X, f, f2);
            } else if (touchParams.getAnimationType() == 4) {
                objectAnimator = ObjectAnimator.ofFloat(touchParams.getTarget(), View.SCALE_Y, f, f2);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(touchParams.getTarget(), View.ALPHA, f, f2);
            }
            if (touchParams.getDelay() > 0) {
                objectAnimator.setStartDelay(touchParams.getDelay());
            }
            if (touchParams.getInterpolator() != null) {
                objectAnimator.setInterpolator(touchParams.getInterpolator());
            }
            objectAnimator.setDuration(touchParams.getDuration());
            return objectAnimator;
        }

        private void startAnimator(Animator animator, View view) {
            if (animator == null || view == null) {
                return;
            }
            Object tag = view.getTag(f.C0131f.xui_touch_animtor);
            if (tag != null && (tag instanceof Animator)) {
                ((Animator) tag).cancel();
            }
            animator.start();
            view.setTag(f.C0131f.xui_touch_animtor, animator);
        }

        private Animation getAnimation(float f, float f2, TouchParams touchParams) {
            Animation alphaAnimation;
            if (touchParams.getAnimationType() == 1) {
                alphaAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
            } else if (touchParams.getAnimationType() == 3) {
                alphaAnimation = new ScaleAnimation(f, f2, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            } else if (touchParams.getAnimationType() == 4) {
                alphaAnimation = new ScaleAnimation(1.0f, 1.0f, f, f2, 1, 0.5f, 1, 0.5f);
            } else {
                alphaAnimation = new AlphaAnimation(f, f2);
            }
            if (touchParams.getDelay() > 0) {
                alphaAnimation.setStartOffset(touchParams.getDelay());
            }
            alphaAnimation.setDuration(touchParams.getDuration());
            alphaAnimation.setFillAfter(true);
            if (touchParams.getInterpolator() != null) {
                alphaAnimation.setInterpolator(touchParams.getInterpolator());
            }
            return alphaAnimation;
        }

        private void startAnimation(Animation animation, View view) {
            if (animation == null || view == null) {
                return;
            }
            view.clearAnimation();
            view.startAnimation(animation);
        }
    }

    /* loaded from: classes2.dex */
    private static class AnimTouchResDelegate extends AnimTouchDelegateParent<TouchResParams> {
        public AnimTouchResDelegate(Rect rect, View view, TouchDelegate touchDelegate, List<TouchResParams> list) {
            super(rect, view, touchDelegate, list);
        }

        @Override // com.xiaopeng.xui.utils.XTouchUtils.AnimTouchDelegateParent
        protected void doAnim(boolean z, MotionEvent motionEvent) {
            if (this.mParamList != null) {
                for (T t : this.mParamList) {
                    doAnim(t, z);
                }
                if (z) {
                    return;
                }
                this.mDelegateView.setPressed(true);
            }
        }

        private void doAnim(TouchResParams touchResParams, boolean z) {
            if (touchResParams == null || touchResParams.getTarget() == null) {
                return;
            }
            View target = touchResParams.getTarget();
            int downRes = touchResParams.getDownRes();
            if (z) {
                downRes = touchResParams.getUpRes();
            }
            target.clearAnimation();
            Animation loadAnimation = AnimationUtils.loadAnimation(target.getContext(), downRes);
            if (loadAnimation == null) {
                return;
            }
            target.startAnimation(loadAnimation);
        }
    }

    public static void enlargeTouchDelegate(final View view, final int i) {
        final View view2 = (View) view.getParent();
        view2.post(new Runnable() { // from class: com.xiaopeng.xui.utils.XTouchUtils.1
            @Override // java.lang.Runnable
            public void run() {
                Rect rect = new Rect();
                view.setEnabled(true);
                view.getHitRect(rect);
                rect.top -= i;
                rect.bottom += i;
                rect.left -= i;
                rect.right += i;
                view2.setTouchDelegate(new TouchDelegate(rect, view));
                if (view.getParent() instanceof View) {
                    ((View) view.getParent()).setTouchDelegate(new TouchDelegate(rect, view));
                }
            }
        });
    }
}
