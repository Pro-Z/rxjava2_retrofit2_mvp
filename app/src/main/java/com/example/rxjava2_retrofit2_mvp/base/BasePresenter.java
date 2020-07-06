package com.example.rxjava2_retrofit2_mvp.base;

import com.example.rxjava2_retrofit2_mvp.api.ApiService;
import com.example.rxjava2_retrofit2_mvp.net.NetClient;

import org.reactivestreams.Subscriber;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;


/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/6
 */
public class BasePresenter<V> {

    public V mvpView;
    protected ApiService apiService;

    public void attachView(V mvpView) {
        this.mvpView = mvpView;
        apiService = NetClient.retrofit().create(ApiService.class);
    }

    public void detachView() {
        this.mvpView = null;
        SubscriptionManager.getInstance().cancelall();
    }

    public void addSubscription(Observable observable, XSubscriber subscriber) {
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
