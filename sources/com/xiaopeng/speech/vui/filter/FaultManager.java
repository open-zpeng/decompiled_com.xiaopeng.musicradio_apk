package com.xiaopeng.speech.vui.filter;
/* loaded from: classes2.dex */
public class FaultManager {
    private static volatile FaultManager faultManager;
    private FaultFilterChain mFaultChain = new FaultFilterChain();

    private FaultManager() {
        init();
    }

    public static FaultManager getInstance() {
        if (faultManager == null) {
            synchronized (FaultManager.class) {
                if (faultManager == null) {
                    faultManager = new FaultManager();
                }
            }
        }
        return faultManager;
    }

    private void init() {
        this.mFaultChain.addFilter(new ListClickEventFaultFilter());
    }

    public bin startFault(bin binVar) {
        return this.mFaultChain.doFilter(binVar);
    }

    public void addFilter(IFilter iFilter) {
        if (iFilter != null) {
            this.mFaultChain.addFilter(iFilter);
        }
    }

    public void removeAllFilter() {
        this.mFaultChain.mFilters.clear();
    }

    public void removeFilter(IFilter iFilter) {
        this.mFaultChain.mFilters.remove(iFilter);
    }
}
