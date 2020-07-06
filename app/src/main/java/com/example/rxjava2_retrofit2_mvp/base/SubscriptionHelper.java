package com.example.rxjava2_retrofit2_mvp.base;

import io.reactivex.disposables.Disposable;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/14
 */

public interface SubscriptionHelper<T> {

    void add(Disposable subscription);

    void cancel(Disposable t);

    void cancelall();
}

