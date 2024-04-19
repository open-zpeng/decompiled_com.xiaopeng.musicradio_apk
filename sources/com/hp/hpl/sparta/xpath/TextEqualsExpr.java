package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public class TextEqualsExpr extends TextCompareExpr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public TextEqualsExpr(String str) {
        super(str);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    public String toString() {
        return toString("=");
    }
}
