package com.example.rxjava2_retrofit2_mvp.base;


import org.reactivestreams.Subscriber;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/6
 */
public abstract class XSubscriber<M> implements Observer<M> {

    public abstract void onSuccess(M model);

    public abstract void onFailure(String msg);

    public abstract void onFinish();

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();

        onFailure(e.getMessage());

        onFinish();
    }

    @Override
    public void onNext(M model) {
        onSuccess(model);
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onSubscribe(Disposable d) {
        SubscriptionManager.getInstance().add(d);
    }
}
