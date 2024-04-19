package com.xiaopeng.musicradio.search.widget.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseLinearLayout;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.widget.presenter.SearchTopBarPresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ba;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.agh;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class SearchTopBar extends VuiBaseLinearLayout<Object, SearchTopBarPresenter> {
    private XMusicSearchBar c;
    private a d;
    private XTextView e;
    private XTextView f;
    private LinearLayout g;
    private XImageButton h;
    private Disposable i;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str);

        void b();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseLinearLayout
    public boolean e() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseLinearLayout
    public String getSceneId() {
        return "vui_search_local_top";
    }

    public SearchTopBar(Context context) {
        super(context);
    }

    public SearchTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchTopBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    /* renamed from: f */
    public SearchTopBarPresenter a() {
        return new SearchTopBarPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void b() {
        this.h = (XImageButton) findViewById(a.d.dialog_back);
        this.c = (XMusicSearchBar) findViewById(a.d.search_bar);
        this.e = (XTextView) findViewById(a.d.countdown_seconds);
        this.g = (LinearLayout) findViewById(a.d.countdown_area);
        this.f = (XTextView) findViewById(a.d.countdown_text);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void c() {
        this.c.getEditText().setImeOptions(3);
        this.c.getEditText().setImportantForAutofill(2);
        this.c.setVuiScene(VuiEngine.getInstance(getContext()), getSceneId());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void d() {
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchTopBar.this.d != null) {
                    SearchTopBar.this.d.a();
                }
            }
        });
        this.c.getEditText().setOnKeyListener(new View.OnKeyListener() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 66 && keyEvent.getAction() == 1) {
                    if (SearchTopBar.this.c.getText().length() != 0) {
                        if (!TextUtils.isEmpty(SearchTopBar.this.c.getText().trim())) {
                            ba.b(SearchTopBar.this.c.getEditText());
                            SearchTopBar.this.c.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.2.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    SearchTopBar.this.h();
                                }
                            }, 1000L);
                            SearchTopBar.this.i();
                            return false;
                        }
                        ak.a(SearchTopBar.this.getContext(), SearchTopBar.this.getResources().getString(a.f.search_blank_keyword));
                        ba.b(SearchTopBar.this.c.getEditText());
                        SearchTopBar.this.c.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                SearchTopBar.this.c.getEditText().requestFocus();
                            }
                        }, 1000L);
                        return false;
                    }
                    ak.a(SearchTopBar.this.getContext(), SearchTopBar.this.getResources().getString(a.f.search_no_keyword));
                    ba.b(SearchTopBar.this.c.getEditText());
                    SearchTopBar.this.c.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SearchTopBar.this.c.getEditText().requestFocus();
                        }
                    }, 1000L);
                    return false;
                }
                return false;
            }
        });
        this.c.getEditText().addTextChangedListener(new TextWatcher() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                u.c(new agh.d(false));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                u.c(new agh.d(true));
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0 || SearchTopBar.this.d == null) {
                    return;
                }
                SearchTopBar.this.d.b();
            }
        });
        this.c.getEditText().setOnTouchListener(new View.OnTouchListener() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    u.c(new agh.d(false));
                    u.c(new agh.d(true));
                }
                return false;
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public int getContentViewId() {
        return a.e.layout_search_topbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this.c.getText());
        }
    }

    public void setCallback(a aVar) {
        this.d = aVar;
    }

    public void setSearchText(String str) {
        this.c.getEditText().setText(str);
        this.c.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.5
            @Override // java.lang.Runnable
            public void run() {
                SearchTopBar.this.h();
            }
        }, 1000L);
    }

    public String getSearchText() {
        return this.c.getEditText().getText().toString();
    }

    public void g() {
        this.c.getEditText().requestFocus();
        ba.a(this.c.getEditText());
    }

    public void h() {
        XMusicSearchBar xMusicSearchBar = this.c;
        if (xMusicSearchBar != null) {
            EditText editText = xMusicSearchBar.getEditText();
            ba.b(editText);
            if (editText != null) {
                editText.clearFocus();
            }
        }
    }

    public void a(final int i) {
        Disposable disposable = this.i;
        if (disposable != null && !disposable.isDisposed()) {
            this.i.dispose();
        }
        this.i = Observable.timer(650L, TimeUnit.MICROSECONDS).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchTopBar.6
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                if (w.e()) {
                    SearchTopBar.this.g.setVisibility(0);
                } else {
                    SearchTopBar.this.g.setVisibility(8);
                }
                if (w.f() == 2) {
                    SearchTopBar.this.g.setVisibility(0);
                }
                if (SearchTopBar.this.g != null) {
                    if (i < 0) {
                        SearchTopBar.this.g.setAlpha(0.16f);
                        SearchTopBar.this.e.setText(String.format("%ds", 10));
                        return;
                    }
                    SearchTopBar.this.g.setAlpha(1.0f);
                    SearchTopBar.this.e.setText(String.format("%ds", Integer.valueOf(i)));
                }
            }
        });
    }
}
