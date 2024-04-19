package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public class AttrLessExpr extends AttrRelationalExpr {
    public AttrLessExpr(String str, int i) {
        super(str, i);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    @Override // com.hp.hpl.sparta.xpath.AttrExpr
    public String toString() {
        return toString("<");
    }
}
