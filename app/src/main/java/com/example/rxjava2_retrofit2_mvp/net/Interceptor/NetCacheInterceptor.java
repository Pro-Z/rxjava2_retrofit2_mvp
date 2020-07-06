package com.example.rxjava2_retrofit2_mvp.net.Interceptor;

import com.example.rxjava2_retrofit2_mvp.utils.LogUtil;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/18
 * 有网的时候 // 只支持Get请求
 */
public class NetCacheInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        LogUtil.e("有网络了");
        Request request = chain.request();
        Response response = chain.proceed(request);
        int onlineCacheTime = 30;//在线的时候的缓存过期时间，如果想要不缓存，直接时间设置为0
        return response.newBuilder()
                .header("Cache-Control", "public, max-age="+onlineCacheTime)
                .removeHeader("Pragma")
                .build();
    }
}
