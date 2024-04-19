package com.xiaopeng.musicradio.program.history.view;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.program.activity.ProgramSubActivity;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.history.presenter.ProgramHistoryPresenter;
import com.xiaopeng.musicradio.widget.d;
/* compiled from: ProgramHistoryFragment.java */
@Route(path = "/program/fragment/sub/history")
/* loaded from: classes2.dex */
public class b extends d<Object, ProgramHistoryPresenter> {
    private ReadingHistoryView d;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SubProgramHistoryList";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.layout_history_fragment;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (ReadingHistoryView) a(b.d.history_layout);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.d.getDialogTopLayout().setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.history.view.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (b.this.d.getDialogTopLayout().a()) {
                    b.this.d.h();
                } else if (b.this.getActivity() instanceof ProgramSubActivity) {
                    ((ProgramSubActivity) b.this.getActivity()).u();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public ProgramHistoryPresenter ao_() {
        return new ProgramHistoryPresenter();
    }
}
