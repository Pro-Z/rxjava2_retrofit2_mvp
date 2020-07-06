package com.example.rxjava2_retrofit2_mvp.ui.index.controller;

import android.os.Bundle;
import android.widget.TextView;

import com.example.rxjava2_retrofit2_mvp.ui.index.presenter.MainPresenter;
import com.example.rxjava2_retrofit2_mvp.ui.index.view.MainView;
import com.example.rxjava2_retrofit2_mvp.ui.index.model.PicListBean;
import com.example.rxjava2_retrofit2_mvp.R;
import com.example.rxjava2_retrofit2_mvp.base.BasePresenter;
import com.example.rxjava2_retrofit2_mvp.base.MvpAc;
import com.google.gson.Gson;

public class MainActivity extends MvpAc<MainPresenter> implements MainView {

    private TextView tv;

    @Override
    protected BasePresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv = findViewById(R.id.tv);
        mvpPresenter.getNewsList();
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onHttpGetNewsListSuccess(PicListBean model) {
        String json = new Gson().toJson(model).toString();
        tv.setText(json);
    }

    @Override
    public void onHttpGetNewsListFailed(String msg) {

    }
}
