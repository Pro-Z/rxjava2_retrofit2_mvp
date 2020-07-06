package com.example.rxjava2_retrofit2_mvp.net.Interceptor;

import com.example.rxjava2_retrofit2_mvp.net.NetworkUtils;
import com.example.rxjava2_retrofit2_mvp.utils.LogUtil;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/18
 * 断网的时候 // 缺点：只支持get请求
 */
public class OffLineNetCacheInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {

        Request request = chain.request();
        LogUtil.e("断网了");
        if (!NetworkUtils.isConnected()) {
            int offlineCacheTime = 60;//离线的时候的缓存的过期时间
            request = request.newBuilder()
//                        .cacheControl(new CacheControl
//                                .Builder()
//                                .maxStale(60,TimeUnit.SECONDS)
//                                .onlyIfCached()
//                                .build()
//                        ) 两种方式结果是一样的，写法不同
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + offlineCacheTime)
                    .build();
        }
        return chain.proceed(request);
    }
}
