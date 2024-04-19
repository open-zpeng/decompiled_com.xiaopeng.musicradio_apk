package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.dao.SearchHistoryBeanDao;
import com.xiaopeng.musicradio.bean.db.SearchHistoryBean;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: SearchHistoryOperation.java */
/* renamed from: ayj  reason: default package */
/* loaded from: classes2.dex */
public class ayj {
    private SearchHistoryBeanDao a;
    private List<SearchHistoryBean> b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchHistoryOperation.java */
    /* renamed from: ayj$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final ayj a = new ayj();
    }

    public static ayj a() {
        return a.a;
    }

    private ayj() {
        this.a = null;
        this.b = null;
        this.a = aff.a().b().getSearchHistoryBeanDao();
    }

    public synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.b == null) {
            c();
        }
        final SearchHistoryBean searchHistoryBean = new SearchHistoryBean();
        searchHistoryBean.setKey(str);
        searchHistoryBean.setUpdateTs(Long.valueOf(System.currentTimeMillis()));
        searchHistoryBean.setSysUid(aqi.a().c().longValue());
        if (this.a != null) {
            final SearchHistoryBean b = b(str);
            if (b == null) {
                if (this.b.size() >= 50) {
                    final SearchHistoryBean searchHistoryBean2 = this.b.get(this.b.size() - 1);
                    this.b.remove(this.b.size() - 1);
                    ban.d(new Runnable() { // from class: ayj.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ayj.this.a.delete(searchHistoryBean2);
                        }
                    });
                }
                this.b.add(0, searchHistoryBean);
                ban.d(new Runnable() { // from class: ayj.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ayj.this.a.insert(searchHistoryBean);
                    }
                });
            } else {
                this.b.remove(b);
                this.b.add(0, searchHistoryBean);
                ban.d(new Runnable() { // from class: ayj.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ayj.this.a.getKey(b) != null) {
                            ayj.this.a.delete(b);
                        }
                        ayj.this.a.insert(searchHistoryBean);
                    }
                });
            }
        }
    }

    private SearchHistoryBean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            for (SearchHistoryBean searchHistoryBean : this.b) {
                if (searchHistoryBean.getKey().equals(str)) {
                    return searchHistoryBean;
                }
            }
            return null;
        }
    }

    public synchronized void b() {
        if (this.b != null) {
            this.b.clear();
        }
        ban.d(new Runnable() { // from class: ayj.4
            @Override // java.lang.Runnable
            public void run() {
                ayj.this.a.deleteAll();
            }
        });
    }

    public synchronized List<SearchHistoryBean> c() {
        if (this.b == null) {
            this.b = this.a.queryBuilder().where(SearchHistoryBeanDao.Properties.SysUid.eq(aqi.a().c()), new WhereCondition[0]).orderDesc(SearchHistoryBeanDao.Properties.UpdateTs, SearchHistoryBeanDao.Properties.Id).list();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }
}
