package com.ding.god.icloudmusic.network;



import com.ding.god.icloudmusic.Constant;
import com.ding.god.icloudmusic.bean.DiscoverRecommendBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/7/12.
 */

public interface ApiService {

    public static final String URL = "http://tingapi.ting.baidu.com/v1/restserver/ting?from=android&version=5.9.9.6/";


    /**
     *
     * @param channel 手机厂商（Xiaomi）
     * @param operator 默认0
     * @param method Constant.METHOD
     * @param cuid   Constant.CUID
     * @param focu_num 焦点图的个数（最大8）
     * @return 首页的个性推荐的数据
     */
    @GET("ting?from=android&version=5.9.9.6")
    Observable<BaseResponse<DiscoverRecommendBean>> getRecommendBean(@Query("channel") String channel,
                                                                     @Query("operator") String operator,
                                                                     @Query("method") String method,
                                                                     @Query("cuid") String cuid,
                                                                     @Query("focu_num") String focu_num);
}
