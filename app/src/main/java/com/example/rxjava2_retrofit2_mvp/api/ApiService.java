package com.example.rxjava2_retrofit2_mvp.api;


import com.example.rxjava2_retrofit2_mvp.ui.index.model.PicListBean;
import com.example.rxjava2_retrofit2_mvp.net.GetPostInterceptor.CacheHeader;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/14
 */
public interface ApiService {

    @Headers(CacheHeader.PUBLIC)
    @FormUrlEncoded
    @POST("getImages")
    Observable<PicListBean> getGSxin(
            @Header("Cache-Control") String cacheControl,
            @Field("page") int page,
            @Field("count") int count
    );
}
