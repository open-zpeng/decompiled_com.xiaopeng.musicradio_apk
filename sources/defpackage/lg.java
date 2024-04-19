package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: Expose.java */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: lg  reason: default package */
/* loaded from: classes3.dex */
public @interface lg {
    boolean a() default true;

    boolean b() default true;
}
