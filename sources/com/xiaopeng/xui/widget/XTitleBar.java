package com.xiaopeng.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.utils.XTouchAreaUtils;
import defpackage.bip;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes2.dex */
public class XTitleBar extends XLinearLayout implements View.OnClickListener, bic {
    private static final int MODE_BUTTON = 2;
    private static final int MODE_CUSTOM = 4;
    private static final int MODE_ICON = 1;
    private static final int MODE_LOADING = 3;
    private static final int MODE_NONE = 0;
    private XImageButton mBtnBack;
    private XImageButton mBtnClose;
    private ViewGroup mBtnCloseLay;
    private OnTitleBarClickListener mOnTitleBarClickListener;
    private ViewGroup mRightContainer;
    private TextView mTitle;

    /* loaded from: classes2.dex */
    public interface OnTitleBarClickListener {
        void onTitleBarActionClick(View view, int i);

        void onTitleBarBackClick();

        void onTitleBarCloseClick();
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public XTitleBar(Context context) {
        this(context, null);
    }

    public XTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XTitleBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public XTitleBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(bip.i.x_titlebar, this);
        initView();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bip.l.XTitleBar);
        setBackVisibility(obtainStyledAttributes.getInt(bip.l.XTitleBar_title_back, 8));
        setCloseVisibility(obtainStyledAttributes.getInt(bip.l.XTitleBar_title_close, 0));
        setTitle(obtainStyledAttributes.getString(bip.l.XTitleBar_title_text));
        switch (obtainStyledAttributes.getInt(bip.l.XTitleBar_title_action_mode, 0)) {
            case 0:
                this.mRightContainer.setVisibility(8);
                break;
            case 1:
                int resourceId = obtainStyledAttributes.getResourceId(bip.l.XTitleBar_title_action_1, -1);
                int resourceId2 = obtainStyledAttributes.getResourceId(bip.l.XTitleBar_title_action_2, -1);
                if (resourceId != -1) {
                    setActionWithIcon(resourceId);
                }
                if (resourceId != -1 && resourceId2 != -1) {
                    setActionWithIcon(resourceId, resourceId2);
                    break;
                }
                break;
            case 2:
                String string = obtainStyledAttributes.getString(bip.l.XTitleBar_title_action_1);
                if (string != null) {
                    setActionWithButton(string);
                    break;
                }
                break;
            case 4:
                int resourceId3 = obtainStyledAttributes.getResourceId(bip.l.XTitleBar_title_action_1, -1);
                if (resourceId3 != -1) {
                    setActionWithCustom(resourceId3);
                    break;
                }
                break;
        }
        obtainStyledAttributes.recycle();
    }

    private void initView() {
        this.mBtnClose = (XImageButton) findViewById(bip.g.x_titlebar_btn_close);
        this.mBtnBack = (XImageButton) findViewById(bip.g.x_titlebar_btn_back);
        this.mTitle = (TextView) findViewById(bip.g.x_titlebar_tv_title);
        this.mRightContainer = (ViewGroup) findViewById(bip.g.x_titlebar_right_container);
        this.mBtnCloseLay = (ViewGroup) findViewById(bip.g.x_titlebar_btn_close_lay);
        this.mBtnClose.setOnClickListener(this);
        this.mBtnBack.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        XTouchAreaUtils.extendTouchAreaAsParentSameSize(this.mBtnClose, this.mBtnCloseLay);
    }

    private void addActionWithIcon(int... iArr) {
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                ImageButton imageButton = (ImageButton) LayoutInflater.from(getContext()).inflate(bip.i.x_titlebar_action_icon, this.mRightContainer, false);
                imageButton.setImageResource(iArr[i]);
                imageButton.setOnClickListener(this);
                imageButton.setId(i);
                this.mRightContainer.addView(imageButton);
            }
        }
    }

    private void addActionWithButton(CharSequence... charSequenceArr) {
        for (int i = 0; i < charSequenceArr.length; i++) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(bip.i.x_titlebar_action_ghostbtn, this.mRightContainer, false);
            textView.setOnClickListener(this);
            textView.setId(i);
            textView.setText(charSequenceArr[i]);
            this.mRightContainer.addView(textView);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle.setText(charSequence);
    }

    public void setCloseVisibility(int i) {
        this.mBtnClose.setVisibility(i);
    }

    public void setBackVisibility(int i) {
        this.mBtnBack.setVisibility(i);
    }

    public void setActionWithIcon(int i) {
        this.mRightContainer.removeAllViews();
        addActionWithIcon(i);
        this.mRightContainer.setVisibility(0);
    }

    public void setActionWithIcon(int i, int i2) {
        this.mRightContainer.removeAllViews();
        addActionWithIcon(i, i2);
        this.mRightContainer.setVisibility(0);
    }

    public void setActionWithButton(CharSequence charSequence) {
        this.mRightContainer.removeAllViews();
        addActionWithButton(charSequence);
        this.mRightContainer.setVisibility(0);
    }

    public void setActionWithCustom(int i) {
        setActionWithCustom(LayoutInflater.from(getContext()).inflate(i, this.mRightContainer, false));
    }

    public void setActionWithCustom(View view) {
        this.mRightContainer.removeAllViews();
        this.mRightContainer.addView(view);
        this.mRightContainer.setVisibility(0);
    }

    public void clearAction() {
        this.mRightContainer.removeAllViews();
        this.mRightContainer.setVisibility(8);
        this.mTitle.requestLayout();
    }

    public void setOnTitleBarClickListener(OnTitleBarClickListener onTitleBarClickListener) {
        this.mOnTitleBarClickListener = onTitleBarClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == bip.g.x_titlebar_btn_close) {
            OnTitleBarClickListener onTitleBarClickListener = this.mOnTitleBarClickListener;
            if (onTitleBarClickListener != null) {
                onTitleBarClickListener.onTitleBarCloseClick();
            }
        } else if (id == bip.g.x_titlebar_btn_back) {
            OnTitleBarClickListener onTitleBarClickListener2 = this.mOnTitleBarClickListener;
            if (onTitleBarClickListener2 != null) {
                onTitleBarClickListener2.onTitleBarBackClick();
            }
        } else {
            OnTitleBarClickListener onTitleBarClickListener3 = this.mOnTitleBarClickListener;
            if (onTitleBarClickListener3 != null) {
                onTitleBarClickListener3.onTitleBarActionClick(view, id);
            }
        }
    }

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        try {
            if (this.mBtnBack != null) {
                if (this.mBtnBack.getVisibility() != 0) {
                    this.mBtnBack.setVuiMode(bij.DISABLED);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(VuiConstants.PROPS_GENERALACT, VuiConstants.GENERALACT_RETURN);
                    this.mBtnBack.setVuiProps(jSONObject);
                }
            }
            if (this.mBtnClose != null) {
                if (this.mBtnClose.getVisibility() != 0) {
                    this.mBtnClose.setVuiMode(bij.DISABLED);
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(VuiConstants.PROPS_GENERALACT, VuiConstants.GENERALACT_CLOSE);
                this.mBtnClose.setVuiProps(jSONObject2);
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
