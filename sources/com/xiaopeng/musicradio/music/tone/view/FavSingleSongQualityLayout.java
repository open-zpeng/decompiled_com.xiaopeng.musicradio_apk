package com.xiaopeng.musicradio.music.tone.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.SmallLoadingView;
import com.xiaopeng.musicradio.widget.mvpbase.c;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.widget.XFrameLayout;
import java.util.List;
/* loaded from: classes.dex */
public class FavSingleSongQualityLayout extends c<b, atx> implements b {
    private boolean isHighEnable;
    private boolean isHighNeedVip;
    private boolean isPerfectEnable;
    private boolean isStandardEnable;
    private ImageView mCheckHigh;
    private ImageView mCheckPerfect;
    private ImageView mCheckStandard;
    private int mCurQuality;
    private FrameLayout mFLHigh;
    private FrameLayout mFLPerfect;
    private FrameLayout mFLStandard;
    private SmallLoadingView mHighLoading;
    private LinearLayout mLLHigh;
    private LinearLayout mLLPerfect;
    private LinearLayout mLLStandard;
    private LoadingTipsView mLoadingView;
    private MusicInfo mMusicInfo;
    private SmallLoadingView mPerfectLoading;
    private a mQualityChooseCallback;
    private LinearLayout mQualityLayout;
    private SmallLoadingView mStandardLoading;
    private TextView mTvHigh;
    private TextView mTvHighSize;
    private TextView mTvPerfect;
    private TextView mTvPerfectSize;
    private TextView mTvStandard;
    private TextView mTvStandardSize;

    public FavSingleSongQualityLayout(Context context) {
        super(context);
        this.isHighNeedVip = true;
        this.mMusicInfo = null;
    }

    public FavSingleSongQualityLayout(Context context, Bundle bundle) {
        super(context, bundle);
        this.isHighNeedVip = true;
        this.mMusicInfo = null;
    }

    public FavSingleSongQualityLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isHighNeedVip = true;
        this.mMusicInfo = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public atx createPresenter() {
        return new atx();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void findView() {
        this.mLoadingView = (LoadingTipsView) findViewById(b.d.loading);
        this.mFLStandard = (FrameLayout) findViewById(b.d.fl_quality_standard);
        this.mFLHigh = (FrameLayout) findViewById(b.d.fl_quality_high);
        this.mFLPerfect = (FrameLayout) findViewById(b.d.fl_quality_perfect);
        this.mLLStandard = (LinearLayout) findViewById(b.d.ll_quality_standard);
        this.mLLHigh = (LinearLayout) findViewById(b.d.ll_quality_high);
        this.mLLPerfect = (LinearLayout) findViewById(b.d.ll_quality_perfect);
        this.mTvStandard = (TextView) findViewById(b.d.tv_standard);
        this.mTvHigh = (TextView) findViewById(b.d.tv_high);
        this.mTvPerfect = (TextView) findViewById(b.d.tv_perfect);
        this.mTvStandardSize = (TextView) findViewById(b.d.tv_size_standard);
        this.mTvHighSize = (TextView) findViewById(b.d.tv_size_high);
        this.mTvPerfectSize = (TextView) findViewById(b.d.tv_size_perfect);
        this.mCheckStandard = (ImageView) findViewById(b.d.iv_check_standard);
        this.mCheckHigh = (ImageView) findViewById(b.d.iv_check_high);
        this.mCheckPerfect = (ImageView) findViewById(b.d.iv_check_perfect);
        this.mStandardLoading = (SmallLoadingView) findViewById(b.d.view_standard_loading);
        this.mHighLoading = (SmallLoadingView) findViewById(b.d.view_high_loading);
        this.mPerfectLoading = (SmallLoadingView) findViewById(b.d.view_perfect_loading);
        this.mQualityLayout = (LinearLayout) findViewById(b.d.quality_layout);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setView() {
        this.mTvHighSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, b.c.ic_main_list_song_label_vip, 0);
        this.mTvPerfectSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, b.c.ic_main_list_song_label_vip, 0);
        VuiUtils.addHasFeedbackProp((XFrameLayout) this.mFLStandard);
        VuiUtils.addHasFeedbackProp((XFrameLayout) this.mFLHigh);
        VuiUtils.addHasFeedbackProp((XFrameLayout) this.mFLPerfect);
    }

    public void setQualityChooseListener(a aVar) {
        this.mQualityChooseCallback = aVar;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setListener() {
        this.mFLStandard.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.tone.view.FavSingleSongQualityLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!ShakeUtil.canExecuteLong(view.getId()) || FavSingleSongQualityLayout.this.mCurQuality == 1) {
                    return;
                }
                ((atx) FavSingleSongQualityLayout.this.mPresenter).a(1);
            }
        });
        this.mFLHigh.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.tone.view.FavSingleSongQualityLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(view.getId())) {
                    bcu bcuVar = (bcu) com.xiaopeng.musicradio.service.c.a().b(bcu.class);
                    if (bcuVar != null && (bcuVar.isXpVip() || bcuVar.isMusicVip() || !FavSingleSongQualityLayout.this.isHighNeedVip)) {
                        if (FavSingleSongQualityLayout.this.mCurQuality != 2) {
                            ((atx) FavSingleSongQualityLayout.this.mPresenter).a(2);
                        }
                    } else if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                        ak.a(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getString(f.h.net_error_tip));
                    } else {
                        FavSingleSongQualityLayout favSingleSongQualityLayout = FavSingleSongQualityLayout.this;
                        favSingleSongQualityLayout.onRefreshSelected(favSingleSongQualityLayout.mCurQuality);
                        bcg.a(FavSingleSongQualityLayout.this.getContext(), "2-音质切换");
                        if (FavSingleSongQualityLayout.this.mQualityChooseCallback != null) {
                            FavSingleSongQualityLayout.this.mQualityChooseCallback.a();
                        }
                    }
                }
            }
        });
        this.mFLPerfect.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.tone.view.FavSingleSongQualityLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(view.getId())) {
                    awd.e();
                    bcu bcuVar = (bcu) com.xiaopeng.musicradio.service.c.a().b(bcu.class);
                    if (bcuVar != null && (bcuVar.isXpVip() || bcuVar.isMusicVip())) {
                        if (FavSingleSongQualityLayout.this.mCurQuality != 3) {
                            ((atx) FavSingleSongQualityLayout.this.mPresenter).a(3);
                        }
                    } else if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                        ak.a(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getString(f.h.net_error_tip));
                    } else {
                        FavSingleSongQualityLayout favSingleSongQualityLayout = FavSingleSongQualityLayout.this;
                        favSingleSongQualityLayout.onRefreshSelected(favSingleSongQualityLayout.mCurQuality);
                        bcg.a(FavSingleSongQualityLayout.this.getContext(), "2-音质切换");
                        if (FavSingleSongQualityLayout.this.mQualityChooseCallback != null) {
                            FavSingleSongQualityLayout.this.mQualityChooseCallback.a();
                        }
                    }
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public int getContentViewId() {
        return b.e.layout_song_quality_single_fav;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MusicInfo musicInfo = this.mMusicInfo;
        if (musicInfo != null) {
            setStatus(musicInfo);
            onRefreshSelected(this.mCurQuality);
        }
    }

    @Override // com.xiaopeng.musicradio.music.tone.view.b
    public void onRefreshSelected(int i) {
        this.mCurQuality = i;
        setSelected(this.mLLStandard, this.mTvStandard, this.mTvStandardSize, this.mCheckStandard, false);
        setSelected(this.mLLHigh, this.mTvHigh, this.mTvHighSize, this.mCheckHigh, false);
        setSelected(this.mLLPerfect, this.mTvPerfect, this.mTvPerfectSize, this.mCheckPerfect, false);
        switch (i) {
            case 1:
                setSelected(this.mLLStandard, this.mTvStandard, this.mTvStandardSize, this.mCheckStandard, true);
                return;
            case 2:
                setSelected(this.mLLHigh, this.mTvHigh, this.mTvHighSize, this.mCheckHigh, true);
                return;
            case 3:
                setSelected(this.mLLPerfect, this.mTvPerfect, this.mTvPerfectSize, this.mCheckPerfect, true);
                return;
            default:
                return;
        }
    }

    public void onQualityDatasSucceed(MusicInfo musicInfo) {
        MusicInfo musicInfo2;
        this.mLoadingView.setState(0);
        this.mQualityLayout.setVisibility(0);
        setStatus(musicInfo);
        BaseInfo d = aei.a().c(0).d();
        if (d == null || (musicInfo2 = (MusicInfo) d) == null) {
            return;
        }
        onRefreshSelected(musicInfo2.getQuality() == 0 ? 1 : musicInfo2.getQuality());
    }

    public void onQualityDatasFailure() {
        error();
    }

    @Override // com.xiaopeng.musicradio.music.tone.view.b
    public void onRefreshCurMusicInfo(MusicInfo musicInfo) {
        setMusicInfo(musicInfo);
    }

    public void onShowLoading(boolean z, int i) {
        if (z) {
            this.mFLStandard.setClickable(false);
            this.mFLHigh.setClickable(false);
            this.mFLPerfect.setClickable(false);
            switch (i) {
                case 1:
                    this.mStandardLoading.a();
                    return;
                case 2:
                    this.mHighLoading.a();
                    return;
                case 3:
                    this.mPerfectLoading.a();
                    return;
                default:
                    return;
            }
        }
        this.mFLStandard.setClickable(this.isStandardEnable);
        this.mFLHigh.setClickable(this.isHighEnable);
        this.mFLPerfect.setClickable(this.isPerfectEnable);
        this.mStandardLoading.b();
        this.mHighLoading.b();
        this.mPerfectLoading.b();
    }

    public void setMusicInfo(MusicInfo musicInfo) {
        if (musicInfo == null || musicInfo.getFileList() == null || musicInfo.getFileList().size() == 0) {
            error();
            return;
        }
        ((atx) this.mPresenter).a(musicInfo);
        onQualityDatasSucceed(musicInfo);
    }

    public void setStatus(MusicInfo musicInfo) {
        this.mMusicInfo = musicInfo;
        this.isStandardEnable = false;
        this.isHighEnable = false;
        this.isPerfectEnable = false;
        this.mFLStandard.setEnabled(false);
        this.mFLHigh.setEnabled(false);
        this.mFLPerfect.setEnabled(false);
        this.mFLStandard.setAlpha(0.16f);
        this.mFLHigh.setAlpha(0.16f);
        this.mFLPerfect.setAlpha(0.16f);
        this.mTvStandardSize.setText("暂不支持此音质");
        this.mTvHighSize.setText("暂不支持此音质");
        this.mTvPerfectSize.setText("暂不支持此音质");
        this.mCheckHigh.setVisibility(0);
        this.mCheckPerfect.setVisibility(0);
        List<SongQualityBean.DataBean.SongQuality> fileList = musicInfo.getFileList();
        for (int i = 0; i < fileList.size(); i++) {
            SongQualityBean.DataBean.SongQuality songQuality = fileList.get(i);
            if (songQuality.getQuality() == 1) {
                this.isStandardEnable = true;
                this.mFLStandard.setEnabled(true);
                this.mFLStandard.setClickable(true);
                this.mFLStandard.setAlpha(1.0f);
                if (songQuality.getFileSize() > 0) {
                    this.mTvStandardSize.setText(calculateCache(songQuality.getFileSize()));
                    this.mTvHighSize.setCompoundDrawablePadding(12);
                } else {
                    this.mTvStandardSize.setText(b.f.music_quality_size_no);
                    this.mTvHighSize.setCompoundDrawablePadding(0);
                }
            } else if (songQuality.getQuality() == 2) {
                if (((atx) this.mPresenter).f()) {
                    if (!TextUtils.isEmpty(songQuality.getPlayUrl())) {
                        this.isHighEnable = true;
                        this.mFLHigh.setEnabled(true);
                        this.mFLHigh.setClickable(true);
                        this.mFLHigh.setAlpha(1.0f);
                        if (songQuality.getFileSize() > 0) {
                            this.mTvHighSize.setText(calculateCache(songQuality.getFileSize()));
                            this.mTvHighSize.setCompoundDrawablePadding(12);
                        } else {
                            this.mTvHighSize.setText(b.f.music_quality_size_no);
                            this.mTvHighSize.setCompoundDrawablePadding(0);
                        }
                        this.mTvHighSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, b.c.ic_main_list_song_label_vip, 0);
                    } else {
                        this.mTvHighSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                } else {
                    this.isHighEnable = true;
                    this.mFLHigh.setEnabled(true);
                    this.mFLHigh.setClickable(true);
                    this.mFLHigh.setAlpha(1.0f);
                    if (songQuality.getFileSize() > 0) {
                        this.mTvHighSize.setText(calculateCache(songQuality.getFileSize()));
                        this.mTvHighSize.setCompoundDrawablePadding(12);
                    } else {
                        this.mTvHighSize.setText(b.f.music_quality_size_no);
                        this.mTvHighSize.setCompoundDrawablePadding(0);
                    }
                    this.isHighNeedVip = true;
                    this.mTvHighSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, b.c.ic_main_list_song_label_vip, 0);
                    this.mCheckHigh.setVisibility(8);
                }
            } else if (songQuality.getQuality() == 3) {
                if (((atx) this.mPresenter).f()) {
                    if (!TextUtils.isEmpty(songQuality.getPlayUrl())) {
                        this.isPerfectEnable = true;
                        this.mFLPerfect.setEnabled(true);
                        this.mFLPerfect.setClickable(true);
                        this.mFLPerfect.setAlpha(1.0f);
                        if (songQuality.getFileSize() > 0) {
                            this.mTvPerfectSize.setText(calculateCache(songQuality.getFileSize()));
                            this.mTvPerfectSize.setCompoundDrawablePadding(12);
                        } else {
                            this.mTvPerfectSize.setText(b.f.music_quality_size_no);
                            this.mTvPerfectSize.setCompoundDrawablePadding(0);
                        }
                        this.mTvPerfectSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, b.c.ic_main_list_song_label_vip, 0);
                    } else {
                        this.mTvPerfectSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                } else {
                    this.isPerfectEnable = true;
                    this.mFLPerfect.setEnabled(true);
                    this.mFLPerfect.setClickable(true);
                    this.mFLPerfect.setAlpha(1.0f);
                    if (songQuality.getFileSize() > 0) {
                        this.mTvPerfectSize.setText(calculateCache(songQuality.getFileSize()));
                        this.mTvPerfectSize.setCompoundDrawablePadding(12);
                    } else {
                        this.mTvPerfectSize.setText(b.f.music_quality_size_no);
                        this.mTvPerfectSize.setCompoundDrawablePadding(0);
                    }
                    this.mTvPerfectSize.setCompoundDrawablesWithIntrinsicBounds(0, 0, b.c.ic_main_list_song_label_vip, 0);
                    this.mCheckPerfect.setVisibility(8);
                }
            }
        }
    }

    private String calculateCache(int i) {
        return String.format("%.1fMB", Float.valueOf((i / 1024.0f) / 1024.0f));
    }

    public void error() {
        this.mQualityLayout.setVisibility(0);
        this.mCurQuality = 0;
        this.isStandardEnable = false;
        this.isHighEnable = false;
        this.isPerfectEnable = false;
        this.mLoadingView.setState(0);
        setSelected(this.mLLStandard, this.mTvStandard, this.mTvStandardSize, this.mCheckStandard, false);
        setSelected(this.mLLHigh, this.mTvHigh, this.mTvHighSize, this.mCheckHigh, false);
        setSelected(this.mLLPerfect, this.mTvPerfect, this.mTvPerfectSize, this.mCheckPerfect, false);
        this.mFLStandard.setEnabled(false);
        this.mFLHigh.setEnabled(false);
        this.mFLPerfect.setEnabled(false);
        this.mFLStandard.setAlpha(0.16f);
        this.mFLHigh.setAlpha(0.16f);
        this.mFLPerfect.setAlpha(0.16f);
        this.mTvStandardSize.setText("暂无数据");
        this.mTvHighSize.setText("暂无数据");
        this.mTvPerfectSize.setText("暂无数据");
    }

    private void setSelected(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, boolean z) {
        if (z) {
            linearLayout.setBackgroundResource(b.c.bg_item_quality_stroke_focus);
            textView.setTextColor(getResources().getColor(b.a.primary_normal));
            textView2.setTextColor(getResources().getColor(b.a.primary_normal));
            imageView.setImageResource(b.c.btn_selected_hl);
            return;
        }
        linearLayout.setBackgroundResource(0);
        textView.setTextColor(getResources().getColor(b.a.text_01));
        textView2.setTextColor(getResources().getColor(b.a.text_03));
        imageView.setImageResource(b.c.btn_selected_nor);
    }

    @Override // com.xiaopeng.musicradio.music.tone.view.b
    public void onDismiss() {
        a aVar = this.mQualityChooseCallback;
        if (aVar != null) {
            aVar.a();
        }
    }
}
