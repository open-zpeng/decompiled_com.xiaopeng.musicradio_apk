package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public class AttrExistsExpr extends AttrExpr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AttrExistsExpr(String str) {
        super(str);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    @Override // com.hp.hpl.sparta.xpath.AttrExpr
    public String toString() {
        return "[" + super.toString() + "]";
    }
}
