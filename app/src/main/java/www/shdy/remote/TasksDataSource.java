package www.shdy.remote;


import okhttp3.MultipartBody;
import rx.Subscription;
import www.shdy.data.callback.LoadTaskCallback;

import www.shdy.entity.HomeBean;
import www.shdy.entity.HomeFourNameBean;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.LogginBean;
import www.shdy.entity.LogginsBean;
import www.shdy.entity.PhoneWeixBean;
import www.shdy.entity.UpImage;
import www.shdy.entity.UsetBean;
import www.shdy.entity.VideoHomeFragmentBean;
import www.shdy.entity.WeixLoginBean;
import www.shdy.entity.WeixPhoneBean;

/**

 * @describe: 数据层抽象接口，数据来源大体上分为三层：缓存，DB，网络
 */
public interface TasksDataSource {


    /**
     * 释放资源
     */
    void release();

    /**
     * 手机号码登录
     */
    Subscription login(String usrname, String pwd, LoadTaskCallback<LogginsBean> callback);

    /**
     * 登录 验证码
     */
    Subscription httpcode(String phone, LoadTaskCallback<HttpCodeBean> callback);

    //手机号码绑定微信
    Subscription phonelogin_weix(String openid,String unionid,String appid,String phone, LoadTaskCallback<PhoneWeixBean> callback);

    //微信登录
    Subscription weixlogin(String openid,String unionid,String appid,String nickname,String gender,String avatarUrl, LoadTaskCallback<WeixLoginBean> callback);

    //微信绑定手机号码
    Subscription weixlogin_phone(String unionid,String phone, LoadTaskCallback<WeixPhoneBean> callback);

    //微信绑定手机号码
    Subscription videohome_fragment(String position ,LoadTaskCallback<VideoHomeFragmentBean> callback);




















  //  Subscription homein(LoadTaskCallback<UserInfoBean> callback);

    Subscription Homeone(LoadTaskCallback<HomeBean> callback);

    Subscription HomeoneTitle(String cate_id,LoadTaskCallback<HomeBean> callback);



    Subscription AnswerUpData(MultipartBody.Part images, LoadTaskCallback<UpImage> callback);




    Subscription HomeFourData(String uid, LoadTaskCallback<UsetBean> callback);

    Subscription HomeFourIconData(String uid, String avatar, LoadTaskCallback<HomeFourNameBean> callback);

    Subscription HomeFourNameData(String uid, String username, LoadTaskCallback<HomeFourNameBean> callback);





}
