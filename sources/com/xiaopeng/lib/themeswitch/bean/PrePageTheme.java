package com.xiaopeng.lib.themeswitch.bean;

import android.view.View;
import java.util.List;
/* loaded from: classes.dex */
public class PrePageTheme {
    private View rootView;
    private List<ThemeView> viewList;

    /* loaded from: classes.dex */
    public static class ThemeView {
        private List<ViewAttr> attrList;
        private int id;

        /* loaded from: classes.dex */
        public static class ViewAttr {
            private String attrName;
            private Object attrValue;

            public String getAttrName() {
                return this.attrName;
            }

            public void setAttrName(String str) {
                this.attrName = str;
            }

            public Object getAttrValue() {
                return this.attrValue;
            }

            public void setAttrValue(Object obj) {
                this.attrValue = obj;
            }
        }

        public int getId() {
            return this.id;
        }

        public void setId(int i) {
            this.id = i;
        }

        public List<ViewAttr> getAttrList() {
            return this.attrList;
        }

        public void setAttrList(List<ViewAttr> list) {
            this.attrList = list;
        }
    }

    public View getRootView() {
        return this.rootView;
    }

    public void setRootView(View view) {
        this.rootView = view;
    }

    public List<ThemeView> getViewList() {
        return this.viewList;
    }

    public void setViewList(List<ThemeView> list) {
        this.viewList = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        sb.append("<RootView=");
        sb.append(this.rootView);
        sb.append(">\n");
        for (ThemeView themeView : this.viewList) {
            sb.append("  <View id=");
            sb.append(themeView.getId());
            sb.append(">\n");
            for (ThemeView.ViewAttr viewAttr : themeView.getAttrList()) {
                sb.append("    <");
                sb.append(viewAttr.getAttrName());
                sb.append(" value=");
                sb.append(viewAttr.getAttrValue());
                sb.append("/>\n");
            }
            sb.append("  </View>\n");
        }
        sb.append("</Page>");
        return sb.toString();
    }
}
