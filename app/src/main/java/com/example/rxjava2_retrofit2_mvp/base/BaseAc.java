package com.example.rxjava2_retrofit2_mvp.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rxjava2_retrofit2_mvp.R;

public abstract class BaseAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initView();
    }

    protected abstract void initView();

    // 加载框
    public void showDialog(String title) {
        showDzDialog(title);
    }

    protected void showDzDialog(String title) {
        if (this.isFinishing())
            return;
    }

    // 消失
    public void dismissDialog() {
        dismissDzDialog();
    }

    protected void dismissDzDialog() {
        if (this.isFinishing())
            return;
    }

}
