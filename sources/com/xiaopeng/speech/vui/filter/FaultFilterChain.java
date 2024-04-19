package com.xiaopeng.speech.vui.filter;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FaultFilterChain implements IFilter {
    public List<IFilter> mFilters = new ArrayList();

    public FaultFilterChain addFilter(IFilter iFilter) {
        this.mFilters.add(iFilter);
        return this;
    }

    @Override // com.xiaopeng.speech.vui.filter.IFilter
    public bin doFilter(bin binVar) {
        for (IFilter iFilter : this.mFilters) {
            binVar = iFilter.doFilter(binVar);
        }
        return binVar;
    }
}
