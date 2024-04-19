package com.xiaopeng.musicradio.mine.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.ClickableLoadingTipsView;
import defpackage.aht;
/* loaded from: classes.dex */
public class MineLoadingTipsView extends ClickableLoadingTipsView {
    private TextView k;
    private a l;
    private String m;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();
    }

    public MineLoadingTipsView(Context context) {
        this(context, null);
    }

    public MineLoadingTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MineLoadingTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
        setVuiElementType(bih.UNKNOWN);
    }

    private void b() {
        if (this.k != null) {
            return;
        }
        this.k = (TextView) this.e.findViewById(aht.c.btn_goto_login);
        TextView textView = this.k;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    u.c(new ahv());
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.widget.LoadingTipsView
    public void setState(int i) {
        b();
        super.setState(i);
        if (i == 3) {
            a aVar = this.l;
            if (aVar != null ? aVar.a() : false) {
                this.f.setText(this.m);
                this.k.setVisibility(0);
                return;
            }
            this.f.setText(this.h);
            this.k.setVisibility(8);
            return;
        }
        this.k.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.widget.LoadingTipsView
    public int getContentViewId() {
        return aht.d.layout_mine_loading_tips_view;
    }

    public void setGotoLoginCallback(a aVar) {
        this.l = aVar;
    }

    public void setGotoLoginText(int i) {
        this.m = be.a(i);
    }
}
