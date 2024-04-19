package com.xiaopeng.speech.vui.event;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewRootImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.speech.vui.vuiengine.R;
/* loaded from: classes2.dex */
public class SetValueEvent extends BaseEvent {
    private int value = -1;
    private String elementId = null;
    private bin mVuiElement = null;
    private RecyclerView.m mScrollListener = new RecyclerView.m() { // from class: com.xiaopeng.speech.vui.event.SetValueEvent.1
        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View c;
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager != null) {
                    int p = linearLayoutManager.p();
                    int r = linearLayoutManager.r();
                    if (SetValueEvent.this.value >= p && SetValueEvent.this.value <= r && (c = linearLayoutManager.c(SetValueEvent.this.value)) != null) {
                        SetValueEvent setValueEvent = SetValueEvent.this;
                        View findActionView = setValueEvent.findActionView(c, setValueEvent.elementId);
                        if (findActionView != null) {
                            if (!TextUtils.isEmpty(SetValueEvent.this.mSceneId)) {
                                bin unused = SetValueEvent.this.mVuiElement;
                            }
                            SetValueEvent.this.mSceneId = null;
                            SetValueEvent.this.mVuiElement = null;
                            SetValueEvent.this.performClick(findActionView);
                        }
                    }
                }
                recyclerView.removeOnScrollListener(SetValueEvent.this.mScrollListener);
            }
        }
    };
    private String mSceneId = null;

    @Override // com.xiaopeng.speech.vui.event.IVuiEvent
    public <T extends View> T run(T t, bin binVar) {
        if (t == null) {
            return null;
        }
        if (binVar != null) {
            try {
                if (binVar.getResultActions() != null && !binVar.getResultActions().isEmpty() && bih.VIRTUALLIST.a().equals(binVar.getType())) {
                    this.elementId = binVar.getId();
                    Double d = (Double) VuiUtils.getValueByName(binVar, "value");
                    if (t instanceof RecyclerView) {
                        if (((bhz) t).getVuiProps() != null) {
                            if (((bhz) t).getVuiProps().has("isReverse") ? ((bhz) t).getVuiProps().getBoolean("isReverse") : false) {
                                this.value = d.intValue();
                                if (((bhz) t).getVuiProps().has(VuiConstants.PROPS_MAXVALUE)) {
                                    this.value = ((bhz) t).getVuiProps().getInt(VuiConstants.PROPS_MAXVALUE) - this.value;
                                }
                                if (((bhz) t).getVuiProps().has("hasHeader")) {
                                    this.value = d.intValue() + 1;
                                }
                                LogUtils.d("SetValueEvent", "reverse value:" + this.value);
                            } else {
                                if (((bhz) t).getVuiProps().has("hasHeader")) {
                                    this.value = d.intValue();
                                } else {
                                    this.value = d.intValue() - 1;
                                }
                                if (((bhz) t).getVuiProps().has(VuiConstants.PROPS_MINVALUE)) {
                                    this.value = (this.value - ((bhz) t).getVuiProps().getInt(VuiConstants.PROPS_MINVALUE)) + 1;
                                }
                                LogUtils.d("SetValueEvent", "value:" + this.value);
                            }
                        }
                        RecyclerView recyclerView = (RecyclerView) t;
                        recyclerView.addOnScrollListener(this.mScrollListener);
                        recyclerView.smoothScrollToPosition(this.value);
                    }
                    this.mVuiElement = binVar;
                }
            } catch (Exception e) {
                LogUtils.e("SetValueEvent", e.fillInStackTrace());
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View findActionView(View view, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object tag = view.getTag(R.id.executeVirtualId);
        if (tag == null || !str.equals(tag.toString())) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (findActionView(childAt, str) != null) {
                        return childAt;
                    }
                }
                return null;
            }
            return null;
        }
        return view;
    }

    public boolean performClick(View view) {
        if (view == null) {
            return false;
        }
        boolean z = view instanceof bhz;
        if (z) {
            ((bhz) view).setPerformVuiAction(true);
        }
        boolean performClick = view.performClick();
        if (z) {
            ((bhz) view).setPerformVuiAction(false);
        }
        LogUtils.i("ClickEvent run :" + performClick);
        if (performClick) {
            return true;
        }
        if (view.getParent() instanceof ViewRootImpl) {
            return false;
        }
        return performClick((View) view.getParent());
    }

    public void setSceneId(String str) {
        this.mSceneId = str;
    }
}
