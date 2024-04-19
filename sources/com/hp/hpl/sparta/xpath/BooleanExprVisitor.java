package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public interface BooleanExprVisitor {
    void visit(AttrEqualsExpr attrEqualsExpr);

    void visit(AttrExistsExpr attrExistsExpr);

    void visit(AttrGreaterExpr attrGreaterExpr);

    void visit(AttrLessExpr attrLessExpr);

    void visit(AttrNotEqualsExpr attrNotEqualsExpr);

    void visit(PositionEqualsExpr positionEqualsExpr);

    void visit(TextEqualsExpr textEqualsExpr);

    void visit(TextExistsExpr textExistsExpr);

    void visit(TextNotEqualsExpr textNotEqualsExpr);

    void visit(TrueExpr trueExpr);
}
