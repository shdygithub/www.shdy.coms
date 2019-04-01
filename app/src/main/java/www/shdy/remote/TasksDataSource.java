package www.shdy.remote;


import okhttp3.MultipartBody;
import rx.Subscription;
import www.shdy.data.callback.LoadTaskCallback;

import www.shdy.entity.HomeBean;
import www.shdy.entity.HomeFourNameBean;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.LogginBean;
import www.shdy.entity.UpImage;
import www.shdy.entity.UsetBean;

/**

 * @describe: 数据层抽象接口，数据来源大体上分为三层：缓存，DB，网络
 */
public interface TasksDataSource {


    /**
     * 释放资源
     */
    void release();

    /**
     * 登录
     */
    Subscription login(String usrname, String pwd, LoadTaskCallback<LogginBean> callback);

    /**
     * 登录 验证码
     */
    Subscription httpcode(String phone, LoadTaskCallback<HttpCodeBean> callback);

  //  Subscription homein(LoadTaskCallback<UserInfoBean> callback);

    Subscription Homeone(LoadTaskCallback<HomeBean> callback);

    Subscription HomeoneTitle(String cate_id,LoadTaskCallback<HomeBean> callback);



    Subscription AnswerUpData(MultipartBody.Part images, LoadTaskCallback<UpImage> callback);




    Subscription HomeFourData(String uid, LoadTaskCallback<UsetBean> callback);

    Subscription HomeFourIconData(String uid, String avatar, LoadTaskCallback<HomeFourNameBean> callback);

    Subscription HomeFourNameData(String uid, String username, LoadTaskCallback<HomeFourNameBean> callback);





}
