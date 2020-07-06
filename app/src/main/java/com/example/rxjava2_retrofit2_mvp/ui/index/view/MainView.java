package com.example.rxjava2_retrofit2_mvp.ui.index.view;

import com.example.rxjava2_retrofit2_mvp.base.BaseView;
import com.example.rxjava2_retrofit2_mvp.ui.index.model.PicListBean;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/14
 */
public interface MainView extends BaseView {

    void onHttpGetNewsListSuccess(PicListBean model);

    void onHttpGetNewsListFailed(String msg);
}
