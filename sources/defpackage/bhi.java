package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.bean.Value;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bet;
/* compiled from: QueryInjectorProxy.java */
/* renamed from: bhi  reason: default package */
/* loaded from: classes2.dex */
public class bhi extends bet.a implements bep.a {
    private b<bet> a = new b<>("QueryInjectorProxy");
    private e b;

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.a.c(bewVar.j());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a.c(null);
    }

    public void a(e eVar) {
        this.b = eVar;
        this.a.a(this.b);
    }

    @Override // defpackage.bet
    public void a(final String[] strArr, final beu beuVar) {
        this.a.a((b<bet>) new b.a<bet, Object>() { // from class: bhi.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bet betVar) {
                try {
                    betVar.a(strArr, beuVar);
                    return null;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bet
    public void a(final String[] strArr) {
        this.a.a((b<bet>) new b.a<bet, Object>() { // from class: bhi.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bet betVar) {
                try {
                    betVar.a(strArr);
                    return null;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bet
    public Value a(final String str, final String str2) {
        return (Value) this.a.a(new b.a<bet, Value>() { // from class: bhi.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Value a(bet betVar) {
                try {
                    return betVar.a(str, str2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return Value.VOID;
                }
            }
        }, Value.VOID);
    }

    @Override // defpackage.bet
    public boolean a(final String str) {
        return ((Boolean) this.a.a(new b.a<bet, Boolean>() { // from class: bhi.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bet betVar) {
                try {
                    return Boolean.valueOf(betVar.a(str));
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bet
    public Value b(final String str, final String str2) {
        return (Value) this.a.a(new b.a<bet, Value>() { // from class: bhi.5
            @Override // com.xiaopeng.speech.common.util.b.a
            public Value a(bet betVar) {
                try {
                    return betVar.b(str, str2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return Value.VOID;
                }
            }
        }, Value.VOID);
    }
}
