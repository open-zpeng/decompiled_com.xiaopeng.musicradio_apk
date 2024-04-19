package com.xiaopeng.speech.vui.filter;

import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class ListClickEventFaultFilter extends BaseFaultFilter {
    @Override // com.xiaopeng.speech.vui.filter.IFilter
    public bin doFilter(bin binVar) {
        String[] split;
        if (binVar != null && !TextUtils.isEmpty(binVar.getId()) && binVar.getResultActions().contains("Click") && (split = binVar.getId().split("_")) != null && split.length > 0) {
            for (String str : split) {
                if (str.length() <= 4) {
                    binVar.setResultActions(Arrays.asList("listItemClick"));
                }
            }
        }
        return binVar;
    }
}
