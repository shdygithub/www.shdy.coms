package www.shdy.config;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

import www.shdy.entity.HomeBean;
import www.shdy.entity.HomeFourNameBean;
import www.shdy.entity.HomeThreeBean;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.IntegralDetalistBean;
import www.shdy.entity.IntegralHomeBean;
import www.shdy.entity.ItemZanBean;
import www.shdy.entity.KnowledgeBean;
import www.shdy.entity.KnowledgeItemBean;
import www.shdy.entity.KnowledgeItemZanBean;
import www.shdy.entity.KnowledgeSearchBean;
import www.shdy.entity.LogginBean;
import www.shdy.entity.LogginsBean;
import www.shdy.entity.NewsPageBean;
import www.shdy.entity.PhoneWeixBean;
import www.shdy.entity.RegisterBean;
import www.shdy.entity.UpImage;
import www.shdy.entity.UsetBean;
import www.shdy.entity.VideoHomeFragmentBean;
import www.shdy.entity.WeixLoginBean;
import www.shdy.entity.WeixPhoneBean;
import www.shdy.https.HttpResult;


public interface ApiService {


    /**去钓鱼
     * 用户登录
     * 方式:POST
     * 参数:{"username":"jxnk25","passwd":"sfsdsdsd","time":1538039158747,"sign":"be46fce7daef59fcf56b6be5fbb3d60d"}
     */

    @POST("app/user/login")
    Observable<HttpResult<LogginsBean>> login(@Body RequestBody body);


    /** 去钓鱼
     * 用户登录 验证码
     * 方式:POST
     * 参数:{"username":"jxnk25","passwd":"sfsdsdsd","time":1538039158747,"sign":"be46fce7daef59fcf56b6be5fbb3d60d"}
     */
    @POST("app/user/getValidateCode/{phone}")
    Observable<HttpResult<HttpCodeBean>> httpcode(@Path("phone") String phone);



    //微信登录
    @POST("app/user/bindWx")
    Observable<HttpResult<PhoneWeixBean>> phonelogin_weix(@Body RequestBody body);

    //微信登录
    @POST("app/user/wxLogin")
    Observable<HttpResult<WeixLoginBean>> weixlogin(@Body RequestBody body);

    //微信绑定手机号码
    @POST("app/user/bindPhone ")
    Observable<HttpResult<WeixPhoneBean>> weixlogin_phone(@Body RequestBody body);


    //视频首页Banner
    @POST("app/video/getBannnerAndHotColumn")
    Observable<HttpResult<VideoHomeFragmentBean>> videohome_fragment(@Body RequestBody body);



































    /**
     * home_btn_icon
     */
//    @Headers({"Content-Type: application/json", "Accept: application/json"})
//    Observable<HttpResult<UserInfoBean>> homein(@Body RequestBody body);

    /**
     * 首页
     * 方式：POST
     * 参数：
     */
    @POST("index.php?m=mobile")
    Observable<HttpResult<HomeBean>> Homeone();

    /**
     * 首页二级
     * 方式：POST
     * 参数：
     */
    @POST("index.php?m=mobile")
    Observable<HttpResult<HomeBean>> HomeoneTitle(@Query("cate_id") String cate_id);


    /**
     * 新闻
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=member&v=member_info")
    Observable<HttpResult<NewsPageBean>> getNews(@Query("m_id") String mid);

    /**
     * 注册
     * 方式：POST
     * 参数：
     */
    @POST("index.php?m=mobile&f=register")
    Observable<HttpResult<RegisterBean>> register(@Query("mobile") String mobile, @Query("code") String code, @Query("password") String psd);


//    /**
//     * 注册验证码
//     * 方式：POST
//     * 参数：
//     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
//     */
//    //@Headers({"Content-Type: application/json", "Accept: application/json"})
//    @POST("index.php?m=sms&f=sms")
//    Observable<HttpResult<SignCodeBean>> registercode(@Query("mobile") String mobile, @Query("type") String type);


    /**
     * 修改密码
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=register&v=findpwd")
    Observable<HttpResult<RegisterBean>> changpassword(@Query("mobile") String mobile, @Query("code") int code, @Query("password") String psd);


    /**
     * 积分首页
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=integral")
    Observable<HttpResult<IntegralHomeBean>> Integral();


    /**
     * 积分详情
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=integral&v=mypoints")
    Observable<HttpResult<IntegralDetalistBean>> IntegralDetalist(@Query("uid") String uid);



//    /**
//     * 搜索
//     * 方式：POST
//     * 参数：
//     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
//     */
//    //@Headers({"Content-Type: application/json", "Accept: application/json"})
//    @POST("index.php?m=mobile&v=search")
//    Observable<HttpResult<SearchBean>> SearchData(@Query("condition") String condition, @Query("pages") String pages);
//
//

    /**
     * 知识专栏列表
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=knowledge")
    Observable<HttpResult<KnowledgeBean>> KnowledgeData(@Query("pages") String pages, @Query("cate_id") String cate_id);

    /**
     * 知识专栏列表详情
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=knowledge&v=details")
    Observable<HttpResult<KnowledgeItemBean>> KnowledgeItemData(@Query("id") String id, @Query("pages") String pages);


    /**
     * 知识专栏点赞
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=knowledge&v=praise")
    Observable<HttpResult<KnowledgeItemZanBean>> KnowledgeItemZan(@Query("uid") String uid, @Query("id") String id);


    /**
     * 知识专栏评论
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=knowledge&v=comment")
    Observable<HttpResult<KnowledgeItemZanBean>> KnowledgeItemPing(@Query("uid") String uid, @Query("id") String id, @Query("content") String content);




    /**
     * 问答专区详情点赞
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=questions&v=praise")
    Observable<HttpResult<ItemZanBean>> AnswerItemZanData(@Query("id") String id, @Query("uid") String uid);


    /**
     * 问答专区详情点赞
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=questions&v=comment")
    Observable<HttpResult<ItemZanBean>> AnswerItemContentData(@Query("id") String id, @Query("uid") String uid, @Query("content") String content);


    /**
     * 问答专区发布
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    @POST("index.php?m=mobile&f=questions&v=release")
    Observable<HttpResult<ItemZanBean>> AnswerSsueData(@Query("uid") String uid, @Query("title") String title, @Query("thumb") String thumb, @Query("cate_id") String cate_id);


    /**
     * 图片上传接口
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */

    //@Headers({"Content-Type: application/json","Accept: application/json"})
    // @Multipart
    //index.php?m=mobile&f=uploads
    @Multipart
    @POST("index.php?m=mobile&f=uploads&v=Android")
    Observable<HttpResult<UpImage>> AnswerUpData(@Part MultipartBody.Part parts);



    /**
     * 局部搜索
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&v=qs_search")
    Observable<HttpResult<KnowledgeSearchBean>> KnowledgeSearchData(@Query("condition") String condition, @Query("pages") String pages);




    /**
     * 在线考试首页接口
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=examination")
    Observable<HttpResult<HomeThreeBean>> HomeThreeData();



    /**
     * 个人中心
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=center")
    Observable<HttpResult<UsetBean>> HomeFourData(@Query("uid") String uid);


    /**
     * 个人中心头像
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=center&v=avatar")
    Observable<HttpResult<HomeFourNameBean>> HomeFourIconData(@Query("uid") String uid, @Query("avatar") String avatar);


    /**
     * 个人中心昵称
     * 方式：POST
     * 参数：
     * {"pagesize":10,"page":1,"time":1535078255062,"sign":"9a19c5a6c3d10cc270ebabb17a98d3d2"}
     */
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("index.php?m=mobile&f=center&v=username")
    Observable<HttpResult<HomeFourNameBean>> HomeFourNameData(@Query("uid") String uid, @Query("username") String username);


    //头像上传

    @Multipart
    @POST("index.php?m=mobile&f=uploads&v=Android")
    Observable<ResponseBody> upImg(@Part MultipartBody.Part file);
}
