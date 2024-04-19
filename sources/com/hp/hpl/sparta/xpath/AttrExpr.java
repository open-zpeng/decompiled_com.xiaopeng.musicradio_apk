package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public abstract class AttrExpr extends BooleanExpr {
    private final String attrName_;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AttrExpr(String str) {
        this.attrName_ = str;
    }

    public String getAttrName() {
        return this.attrName_;
    }

    public String toString() {
        return "@" + this.attrName_;
    }
}
