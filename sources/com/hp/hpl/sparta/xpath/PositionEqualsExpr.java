package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public class PositionEqualsExpr extends BooleanExpr {
    private final int position_;

    public PositionEqualsExpr(int i) {
        this.position_ = i;
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }

    public int getPosition() {
        return this.position_;
    }

    public String toString() {
        return "[" + this.position_ + "]";
    }
}
