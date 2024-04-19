package com.xiaopeng.lib.themeswitch.bean;

import java.util.List;
/* loaded from: classes.dex */
public class PageTheme {
    private String pageName;
    private List<ThemeView> viewList;

    /* loaded from: classes.dex */
    public static class ThemeView {
        private List<ViewAttr> attrList;
        private String id;

        /* loaded from: classes.dex */
        public static class ViewAttr {
            private String attrName;
            private String attrValue;

            public String getAttrName() {
                return this.attrName;
            }

            public void setAttrName(String str) {
                this.attrName = str;
            }

            public String getAttrValue() {
                return this.attrValue;
            }

            public void setAttrValue(String str) {
                this.attrValue = str;
            }
        }

        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            this.id = str;
        }

        public List<ViewAttr> getAttrList() {
            return this.attrList;
        }

        public void setAttrList(List<ViewAttr> list) {
            this.attrList = list;
        }
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public List<ThemeView> getViewList() {
        return this.viewList;
    }

    public void setViewList(List<ThemeView> list) {
        this.viewList = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        sb.append("<Page name=");
        sb.append(this.pageName);
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
