package com.xiaopeng.xui.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.xiaopeng.xui.Xui;
import com.xiaopeng.xui.utils.XDialogUtils;
import com.xiaopeng.xui.utils.XLogUtils;
import com.xiaopeng.xui.vui.VuiViewScene;
import com.xiaopeng.xui.widget.XFrameLayout;
import defpackage.acv;
import defpackage.bip;
/* loaded from: classes2.dex */
public class XDialogPure extends VuiViewScene {
    private Context mContext;
    private Dialog mDialog;
    private int mSystemDialogOffsetY;
    private int mWindowBackgroundId;
    private XDialogContentView mXDialogContentView;

    @Override // com.xiaopeng.xui.vui.VuiViewScene
    public void onBuildScenePrepare() {
    }

    public XDialogPure(Context context) {
        this(context, null);
    }

    public XDialogPure(Context context, Parameters parameters) {
        this.mContext = context;
        parameters = parameters == null ? Parameters.Builder() : parameters;
        if (parameters.mTheme != 0) {
            this.mDialog = new Dialog(context, parameters.mTheme);
        } else {
            this.mDialog = new Dialog(context, bip.k.XAppTheme_XDialog);
        }
        if (parameters.mFullScreen) {
            XDialogUtils.requestFullScreen(this.mDialog);
        }
        this.mSystemDialogOffsetY = (int) context.getResources().getDimension(bip.e.x_dialog_system_offset_y);
        this.mXDialogContentView = new XDialogContentView(context);
        if (parameters.mLayoutParams == null) {
            this.mDialog.setContentView(this.mXDialogContentView);
        } else {
            this.mDialog.setContentView(this.mXDialogContentView, parameters.mLayoutParams);
        }
        this.mXDialogContentView.setThemeCallback(new acv.a() { // from class: com.xiaopeng.xui.app.-$$Lambda$XDialogPure$b7jsZ9UPCD52zzaYoOAFcPGFvlQ
            @Override // defpackage.acv.a
            public final void onThemeChanged() {
                XDialogPure.lambda$new$0(XDialogPure.this);
            }
        });
        TypedArray obtainStyledAttributes = this.mDialog.getContext().obtainStyledAttributes(new int[]{16842836});
        this.mWindowBackgroundId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void lambda$new$0(XDialogPure xDialogPure) {
        xDialogPure.logs("onThemeChanged, mWindowBackgroundId " + xDialogPure.mWindowBackgroundId);
        if (xDialogPure.mWindowBackgroundId == 0) {
            xDialogPure.mWindowBackgroundId = bip.f.x_bg_dialog;
        }
        if (xDialogPure.mDialog.getWindow() == null || xDialogPure.mWindowBackgroundId <= 0) {
            return;
        }
        xDialogPure.mDialog.getWindow().setBackgroundDrawableResource(xDialogPure.mWindowBackgroundId);
    }

    public void setThemeCallback(acv.a aVar) {
        this.mXDialogContentView.setThemeCallback(aVar);
    }

    public void setContentView(int i) {
        setContentView(LayoutInflater.from(this.mContext).inflate(i, (ViewGroup) this.mXDialogContentView, false));
    }

    public void setContentView(View view) {
        this.mXDialogContentView.removeAllViews();
        this.mXDialogContentView.addView(view);
        setVuiView(view);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public void show() {
        if (this.mDialog.getWindow() != null) {
            WindowManager.LayoutParams attributes = this.mDialog.getWindow().getAttributes();
            attributes.gravity = 17;
            attributes.y = attributes.type != 9 ? this.mSystemDialogOffsetY : 0;
            this.mDialog.getWindow().setAttributes(attributes);
        }
        this.mDialog.show();
    }

    public void dismiss() {
        this.mDialog.dismiss();
    }

    public void cancel() {
        this.mDialog.cancel();
    }

    public boolean isShowing() {
        return this.mDialog.isShowing();
    }

    public void setSystemDialog(int i) {
        if (this.mDialog.getWindow() != null) {
            this.mDialog.getWindow().setType(i);
        }
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mDialog.setOnDismissListener(onDismissListener);
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.mDialog.setOnCancelListener(onCancelListener);
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.mDialog.setOnShowListener(onShowListener);
    }

    public void setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.mDialog.setOnKeyListener(onKeyListener);
    }

    public void setCancelable(boolean z) {
        this.mDialog.setCancelable(z);
    }

    public void setCanceledOnTouchOutside(boolean z) {
        this.mDialog.setCanceledOnTouchOutside(z);
    }

    public void setScreenId(int i) {
        XDialogUtils.setScreenId(this.mDialog, i);
    }

    public int getScreenId() {
        return XDialogUtils.getScreenId(this.mDialog);
    }

    @Override // com.xiaopeng.xui.vui.IVuiViewScene
    public int getVuiDisplayLocation() {
        Dialog dialog = this.mDialog;
        if (dialog == null) {
            return 0;
        }
        return XDialogUtils.getScreenId(dialog);
    }

    /* loaded from: classes2.dex */
    public static class Parameters {
        private boolean mFullScreen = Xui.isDialogFullScreen();
        private ViewGroup.LayoutParams mLayoutParams;
        private int mTheme;

        public static Parameters Builder() {
            return new Parameters();
        }

        private Parameters() {
        }

        public Parameters setTheme(int i) {
            this.mTheme = i;
            return this;
        }

        public Parameters setFullScreen(boolean z) {
            this.mFullScreen = z;
            return this;
        }

        public Parameters setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            this.mLayoutParams = layoutParams;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class XDialogContentView extends XFrameLayout {
        public XDialogContentView(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (this.mXViewDelegate != null) {
                this.mXViewDelegate.onWindowFocusChanged(z);
            }
        }

        public void setThemeCallback(acv.a aVar) {
            if (this.mXViewDelegate == null || this.mXViewDelegate.getThemeViewModel() == null) {
                return;
            }
            this.mXViewDelegate.getThemeViewModel().a(aVar);
        }
    }

    private void logs(String str) {
        XLogUtils.i("XDialogPure", str + "--hashcode " + hashCode());
    }
}
