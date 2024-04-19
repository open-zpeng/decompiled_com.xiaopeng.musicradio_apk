package com.hp.hpl.sparta;

import com.hp.hpl.sparta.Sparta;
import com.hp.hpl.sparta.xpath.Step;
import com.hp.hpl.sparta.xpath.XPath;
import com.hp.hpl.sparta.xpath.XPathException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
/* loaded from: classes.dex */
public class Document extends Node {
    private static final boolean DEBUG = false;
    private final Hashtable indexible_;
    private Sparta.Cache indices_;
    private Vector observers_;
    private Element rootElement_;
    private String systemId_;
    private static final Integer ONE = new Integer(1);
    static final Enumeration EMPTY = new EmptyEnumeration();

    /* loaded from: classes.dex */
    public interface Observer {
        void update(Document document);
    }

    void monitor(XPath xPath) {
    }

    Document(String str) {
        this.rootElement_ = null;
        this.indices_ = Sparta.newCache();
        this.observers_ = new Vector();
        this.indexible_ = null;
        this.systemId_ = str;
    }

    public Document() {
        this.rootElement_ = null;
        this.indices_ = Sparta.newCache();
        this.observers_ = new Vector();
        this.indexible_ = null;
        this.systemId_ = "MEMORY";
    }

    @Override // com.hp.hpl.sparta.Node
    public Object clone() {
        Document document = new Document(this.systemId_);
        document.rootElement_ = (Element) this.rootElement_.clone();
        return document;
    }

    public String getSystemId() {
        return this.systemId_;
    }

    public void setSystemId(String str) {
        this.systemId_ = str;
        notifyObservers();
    }

    @Override // com.hp.hpl.sparta.Node
    public String toString() {
        return this.systemId_;
    }

    public Element getDocumentElement() {
        return this.rootElement_;
    }

    public void setDocumentElement(Element element) {
        this.rootElement_ = element;
        this.rootElement_.setOwnerDocument(this);
        notifyObservers();
    }

    private XPathVisitor visitor(String str, boolean z) {
        if (str.charAt(0) != '/') {
            str = "/" + str;
        }
        return visitor(XPath.get(str), z);
    }

    XPathVisitor visitor(XPath xPath, boolean z) {
        if (xPath.isStringValue() != z) {
            String str = z ? "evaluates to element not string" : "evaluates to string not element";
            throw new XPathException(xPath, "\"" + xPath + "\" evaluates to " + str);
        }
        return new XPathVisitor(this, xPath);
    }

    @Override // com.hp.hpl.sparta.Node
    public Enumeration xpathSelectElements(String str) {
        try {
            if (str.charAt(0) != '/') {
                str = "/" + str;
            }
            XPath xPath = XPath.get(str);
            monitor(xPath);
            return visitor(xPath, false).getResultEnumeration();
        } catch (XPathException e) {
            throw new ParseException("XPath problem", e);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public Enumeration xpathSelectStrings(String str) {
        try {
            return visitor(str, true).getResultEnumeration();
        } catch (XPathException e) {
            throw new ParseException("XPath problem", e);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public Element xpathSelectElement(String str) {
        try {
            if (str.charAt(0) != '/') {
                str = "/" + str;
            }
            XPath xPath = XPath.get(str);
            monitor(xPath);
            return visitor(xPath, false).getFirstResultElement();
        } catch (XPathException e) {
            throw new ParseException("XPath problem", e);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public String xpathSelectString(String str) {
        try {
            return visitor(str, true).getFirstResultString();
        } catch (XPathException e) {
            throw new ParseException("XPath problem", e);
        }
    }

    public boolean xpathEnsure(String str) {
        try {
            if (xpathSelectElement(str) != null) {
                return false;
            }
            XPath xPath = XPath.get(str);
            Enumeration steps = xPath.getSteps();
            int i = 0;
            while (steps.hasMoreElements()) {
                steps.nextElement();
                i++;
            }
            Enumeration steps2 = xPath.getSteps();
            Step step = (Step) steps2.nextElement();
            Step[] stepArr = new Step[i - 1];
            for (int i2 = 0; i2 < stepArr.length; i2++) {
                stepArr[i2] = (Step) steps2.nextElement();
            }
            if (this.rootElement_ == null) {
                setDocumentElement(makeMatching(null, step, str));
            } else {
                if (xpathSelectElement("/" + step) == null) {
                    throw new ParseException("Existing root element <" + this.rootElement_.getTagName() + "...> does not match first step \"" + step + "\" of \"" + str);
                }
            }
            if (stepArr.length == 0) {
                return true;
            }
            return this.rootElement_.xpathEnsure(XPath.get(false, stepArr).toString());
        } catch (XPathException e) {
            throw new ParseException(str, e);
        }
    }

    /* loaded from: classes.dex */
    public class Index implements Observer {
        private final String attrName_;
        private transient Sparta.Cache dict_ = null;
        private final XPath xpath_;

        Index(XPath xPath) {
            this.attrName_ = xPath.getIndexingAttrName();
            this.xpath_ = xPath;
            Document.this.addObserver(this);
        }

        public synchronized Enumeration get(String str) {
            Vector vector;
            if (this.dict_ == null) {
                regenerate();
            }
            vector = (Vector) this.dict_.get(str);
            return vector == null ? Document.EMPTY : vector.elements();
        }

        public synchronized int size() {
            if (this.dict_ == null) {
                regenerate();
            }
            return this.dict_.size();
        }

        @Override // com.hp.hpl.sparta.Document.Observer
        public synchronized void update(Document document) {
            this.dict_ = null;
        }

        private void regenerate() {
            try {
                this.dict_ = Sparta.newCache();
                Enumeration resultEnumeration = Document.this.visitor(this.xpath_, false).getResultEnumeration();
                while (resultEnumeration.hasMoreElements()) {
                    Element element = (Element) resultEnumeration.nextElement();
                    String attribute = element.getAttribute(this.attrName_);
                    Vector vector = (Vector) this.dict_.get(attribute);
                    if (vector == null) {
                        vector = new Vector(1);
                        this.dict_.put(attribute, vector);
                    }
                    vector.addElement(element);
                }
            } catch (XPathException e) {
                throw new ParseException("XPath problem", e);
            }
        }
    }

    public boolean xpathHasIndex(String str) {
        return this.indices_.get(str) != null;
    }

    public Index xpathGetIndex(String str) {
        try {
            Index index = (Index) this.indices_.get(str);
            if (index == null) {
                Index index2 = new Index(XPath.get(str));
                this.indices_.put(str, index2);
                return index2;
            }
            return index;
        } catch (XPathException e) {
            throw new ParseException("XPath problem", e);
        }
    }

    public void addObserver(Observer observer) {
        this.observers_.addElement(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers_.removeElement(observer);
    }

    @Override // com.hp.hpl.sparta.Node
    public void toString(Writer writer) {
        this.rootElement_.toString(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.hp.hpl.sparta.Node
    public void notifyObservers() {
        Enumeration elements = this.observers_.elements();
        while (elements.hasMoreElements()) {
            ((Observer) elements.nextElement()).update(this);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public void toXml(Writer writer) {
        writer.write("<?xml version=\"1.0\" ?>\n");
        this.rootElement_.toXml(writer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Document) {
            return this.rootElement_.equals(((Document) obj).rootElement_);
        }
        return false;
    }

    @Override // com.hp.hpl.sparta.Node
    protected int computeHashCode() {
        return this.rootElement_.hashCode();
    }
}
