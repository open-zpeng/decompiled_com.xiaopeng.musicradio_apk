package defpackage;
/* compiled from: Mode.java */
/* renamed from: aab  reason: default package */
/* loaded from: classes.dex */
public enum aab {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    private final int bits;
    private final int[] characterCountBitsForVersions;

    aab(int[] iArr, int i) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i;
    }

    public int a(aac aacVar) {
        int a = aacVar.a();
        return this.characterCountBitsForVersions[a <= 9 ? (char) 0 : a <= 26 ? (char) 1 : (char) 2];
    }

    public int a() {
        return this.bits;
    }
}
