package com.example.rxjava2_retrofit2_mvp.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rxjava2_retrofit2_mvp.R;

public abstract class MvpAc<P extends BasePresenter> extends BaseAc {

    protected P mvpPresenter;
    protected abstract BasePresenter createPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = (P) createPresenter();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null){
            mvpPresenter.detachView();
        }
    }

    public void showxDialog(String title) {
        showDialog(title);
    }

    public void dismissxDialog(){
        dismissDialog();
    }

}
