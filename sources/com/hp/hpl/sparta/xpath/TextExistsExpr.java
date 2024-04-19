package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public class TextExistsExpr extends BooleanExpr {
    static final TextExistsExpr INSTANCE = new TextExistsExpr();

    public String toString() {
        return "[text()]";
    }

    private TextExistsExpr() {
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }
}
