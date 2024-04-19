package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.mine.playlist.user.presenter.a;
import com.xiaopeng.musicradio.widget.mvpbase.b;
import defpackage.aht;
/* compiled from: ImportCustomDlg.java */
/* renamed from: ama  reason: default package */
/* loaded from: classes2.dex */
public class ama extends b<Object, a> implements View.OnClickListener {
    private Context a;
    private View b;

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void d() {
    }

    public ama(Context context) {
        super(context, f.i.NewBaseDialog, true);
        this.c = "MineCustomImportDialog";
        this.a = context;
        c();
        d();
        e();
        Window window = getWindow();
        if (window != null) {
            window.setType(2038);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.height = -2;
                attributes.width = -2;
                attributes.gravity = 17;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    /* renamed from: a */
    public a f() {
        return new a();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected int b() {
        return aht.d.dialog_import_custom_layout;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void c() {
        this.b = findViewById(aht.c.btn_close);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void e() {
        this.b.setOnClickListener(this);
    }
}
