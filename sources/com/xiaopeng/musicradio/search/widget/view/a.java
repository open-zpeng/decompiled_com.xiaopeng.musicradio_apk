package com.xiaopeng.musicradio.search.widget.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.nex3z.flowlayout.FlowLayout;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XTextView;
import java.util.Arrays;
import java.util.List;
/* compiled from: SearchHistoryLayout.java */
/* loaded from: classes2.dex */
public class a extends LinearLayout {
    private FlowLayout a;
    private InterfaceC0174a b;
    private XTextView c;
    private View d;
    private String e;
    private XDialog f;
    private XButton g;

    /* compiled from: SearchHistoryLayout.java */
    /* renamed from: com.xiaopeng.musicradio.search.widget.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0174a {
        void a();

        void a(String str);
    }

    public a(Context context) {
        super(context);
        this.e = "SearchHistoryLayout";
        b();
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(a.e.layout_search_history, this);
        this.a = (FlowLayout) findViewById(a.d.tag_layout);
        this.a.setMaxRows(2);
        this.c = (XTextView) findViewById(a.d.hot_title);
        this.c.setVisibility(8);
        this.d = findViewById(a.d.history_title);
        this.g = (XButton) findViewById(a.d.clear_history);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.search.widget.view.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.a();
                if (a.this.f == null) {
                    a aVar = a.this;
                    aVar.f = new XDialog(aVar.getContext(), 0, r.a());
                    a.this.f.setVuiEngine(VuiEngine.getInstance(a.this.getContext()));
                    a.this.f.setVuiSceneId("SearchClearConfirmDialog");
                    a.this.f.setMessage(a.this.getResources().getText(a.f.confirm_clear_hisotry));
                    a.this.f.setPositiveButtonInterceptDismiss(false).setPositiveButton("确定", new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.search.widget.view.a.1.1
                        @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
                        public void onClick(XDialog xDialog, int i) {
                            if (a.this.b != null) {
                                a.this.b.a();
                            }
                        }
                    }).setNegativeButtonInterceptDismiss(true).setNegativeButton("取消", (XDialogInterface.OnClickListener) null);
                    a.this.f.setSystemDialog(2008);
                }
                a.this.f.show();
                a.this.f.initVuiScene("SearchClearConfirmDialog", VuiEngine.getInstance(a.this.getContext()));
            }
        });
    }

    private void b(List<String> list) {
        this.a.removeAllViews();
        int i = 0;
        for (String str : list) {
            LogUtils.i(this.e, "create history tag:" + str + " start");
            XButton xButton = (XButton) LayoutInflater.from(getContext()).inflate(a.e.item_history_keyword, (ViewGroup) this.a, false);
            xButton.setText(str);
            xButton.setClickable(false);
            xButton.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.search.widget.view.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (a.this.b != null) {
                        a.this.b.a(((XButton) view).getText().toString());
                    }
                }
            });
            xButton.setVuiPosition(i);
            VuiEngine.getInstance(getContext()).setVuiElementTag(xButton, "historyvui_" + i);
            this.a.addView(xButton);
            i++;
            if (i > 12) {
                break;
            }
        }
        LogUtils.i(this.e, "create history end, mTagLayout height:" + this.a.getHeight() + ", mTagLayout visibility:" + this.a.getVisibility());
    }

    public void a(List<String> list) {
        if (list == null || list.size() == 0) {
            LogUtils.i(this.e, "updateHistoryQuerys null, hide");
            this.d.setVisibility(8);
            this.a.setVisibility(8);
            this.g.setVisibility(8);
            this.a.removeAllViews();
        } else {
            String str = this.e;
            LogUtils.i(str, "updateHistoryQuerys show, size:" + list.size());
            this.d.setVisibility(0);
            this.a.setVisibility(0);
            this.g.setVisibility(0);
            b(list);
        }
        VuiEngine.getInstance(getContext()).updateScene("SearchMain", Arrays.asList(this.a, this.g));
    }

    public void setHotTitleVisible(boolean z) {
        if (z) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
    }

    public void setCallback(InterfaceC0174a interfaceC0174a) {
        this.b = interfaceC0174a;
    }

    public void a() {
        XDialog xDialog = this.f;
        if (xDialog == null || !xDialog.isShowing()) {
            return;
        }
        this.f.dismiss();
    }
}
