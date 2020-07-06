package com.example.rxjava2_retrofit2_mvp.ui.index.presenter;

import com.example.rxjava2_retrofit2_mvp.base.BasePresenter;
import com.example.rxjava2_retrofit2_mvp.base.XSubscriber;
import com.example.rxjava2_retrofit2_mvp.ui.index.view.MainView;
import com.example.rxjava2_retrofit2_mvp.ui.index.model.PicListBean;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/14
 */
public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter(MainView mainView){
        attachView(mainView);
    }

    public void getNewsList(){

        addSubscription(apiService.getGSxin("max-age=60*60*24*2",1,10), new XSubscriber<PicListBean>() {
            @Override
            public void onSuccess(PicListBean model) {
                mvpView.onHttpGetNewsListSuccess(model);
            }

            @Override
            public void onFailure(String msg) {
                mvpView.onHttpGetNewsListFailed(msg);
            }

            @Override
            public void onFinish() {

            }
        });
    }
}
