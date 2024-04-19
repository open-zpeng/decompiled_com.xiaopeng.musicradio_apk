package com.hp.hpl.sparta.xpath;
/* loaded from: classes.dex */
public interface NodeTestVisitor {
    void visit(AllElementTest allElementTest);

    void visit(AttrTest attrTest);

    void visit(ElementTest elementTest);

    void visit(ParentNodeTest parentNodeTest);

    void visit(TextTest textTest);

    void visit(ThisNodeTest thisNodeTest);
}
