package com.hp.hpl.sparta;

import java.util.Hashtable;
/* loaded from: classes.dex */
public class Sparta {
    private static Internment internment_ = new Internment() { // from class: com.hp.hpl.sparta.Sparta.1
        private final Hashtable strings_ = new Hashtable();

        @Override // com.hp.hpl.sparta.Sparta.Internment
        public String intern(String str) {
            String str2 = (String) this.strings_.get(str);
            if (str2 == null) {
                this.strings_.put(str, str);
                return str;
            }
            return str2;
        }
    };
    private static CacheFactory cacheFactory_ = new CacheFactory() { // from class: com.hp.hpl.sparta.Sparta.2
        @Override // com.hp.hpl.sparta.Sparta.CacheFactory
        public Cache create() {
            return new HashtableCache();
        }
    };

    /* loaded from: classes.dex */
    public interface Cache {
        Object get(Object obj);

        Object put(Object obj, Object obj2);

        int size();
    }

    /* loaded from: classes.dex */
    public interface CacheFactory {
        Cache create();
    }

    /* loaded from: classes.dex */
    public interface Internment {
        String intern(String str);
    }

    public static String intern(String str) {
        return internment_.intern(str);
    }

    public static void setInternment(Internment internment) {
        internment_ = internment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Cache newCache() {
        return cacheFactory_.create();
    }

    public static void setCacheFactory(CacheFactory cacheFactory) {
        cacheFactory_ = cacheFactory;
    }

    /* loaded from: classes.dex */
    private static class HashtableCache extends Hashtable implements Cache {
        private HashtableCache() {
        }
    }
}
