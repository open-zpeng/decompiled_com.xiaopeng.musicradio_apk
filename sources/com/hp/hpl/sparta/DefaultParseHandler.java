package com.hp.hpl.sparta;
/* loaded from: classes.dex */
public class DefaultParseHandler implements ParseHandler {
    private ParseSource parseSource_ = null;

    @Override // com.hp.hpl.sparta.ParseHandler
    public void characters(char[] cArr, int i, int i2) {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void endDocument() {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void endElement(Element element) {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void startDocument() {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void startElement(Element element) {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void setParseSource(ParseSource parseSource) {
        this.parseSource_ = parseSource;
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public ParseSource getParseSource() {
        return this.parseSource_;
    }
}
