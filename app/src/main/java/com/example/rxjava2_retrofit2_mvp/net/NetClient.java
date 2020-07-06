package com.example.rxjava2_retrofit2_mvp.net;

import com.example.rxjava2_retrofit2_mvp.app.MyApplication;
import com.example.rxjava2_retrofit2_mvp.api.UrlUtils;
import com.example.rxjava2_retrofit2_mvp.net.GetPostInterceptor.CacheInterceptor;
import com.example.rxjava2_retrofit2_mvp.utils.LogUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/6
 */
public class NetClient {

    private static final int DEFAULT_TIMEOUT = 5;
    private static Retrofit mRetrofit;
    private static HttpLoggingInterceptor httpLoggingInterceptor;

    public static Retrofit retrofit() {

        if (mRetrofit == null) {

            Gson gson = new GsonBuilder()
                    .serializeNulls()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();
            // 配置缓存
            httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(@NotNull String s) {
                    LogUtil.e("网络请求返回==>>>>"+s+"");
                }
            });
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .addInterceptor(httpLoggingInterceptor)
                    .addInterceptor(new CacheInterceptor(MyApplication.applicationContext))
                    .retryOnConnectionFailure(true)
                    .build();

            mRetrofit = new Retrofit.Builder()
                    .baseUrl(UrlUtils.APP_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();

        }
        return mRetrofit;
    }


}
