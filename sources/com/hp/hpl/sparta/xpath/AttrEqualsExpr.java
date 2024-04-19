package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public class AttrEqualsExpr extends AttrCompareExpr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AttrEqualsExpr(String str, String str2) {
        super(str, str2);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    @Override // com.hp.hpl.sparta.xpath.AttrExpr
    public String toString() {
        return toString("=");
    }
}
