package defpackage;
/* compiled from: BinderNotFoundException.java */
/* renamed from: bit  reason: default package */
/* loaded from: classes3.dex */
class bit extends RuntimeException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bit(Class<?> cls) {
        super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
