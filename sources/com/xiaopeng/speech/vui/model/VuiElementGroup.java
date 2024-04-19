package com.xiaopeng.speech.vui.model;

import java.util.List;
/* loaded from: classes2.dex */
public class VuiElementGroup extends bin {
    private boolean dynamic = false;
    private int position = -1;
    private List<bin> elements = null;

    @Override // defpackage.bin
    public int getPosition() {
        return this.position;
    }

    public void setDynamic(boolean z) {
        this.dynamic = z;
    }

    public boolean isDynamic() {
        return this.dynamic;
    }

    @Override // defpackage.bin
    public void setPosition(int i) {
        this.position = i;
    }

    @Override // defpackage.bin
    public List<bin> getElements() {
        return this.elements;
    }

    @Override // defpackage.bin
    public void setElements(List<bin> list) {
        this.elements = list;
    }
}
