package com.example.rxjava2_retrofit2_mvp.app;

import android.app.Application;
import android.content.Context;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/15
 */
public class MyApplication extends Application {

    private static Context context;
    public static Context applicationContext;
    private static MyApplication instance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        applicationContext = this;
        instance = this;


    }

    public static MyApplication getInstance() {
        return instance;
    }

}
