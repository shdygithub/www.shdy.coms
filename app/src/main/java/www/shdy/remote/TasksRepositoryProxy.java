package www.shdy.remote;

import android.util.Log;


import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.Subscription;
import www.shdy.config.ApiService;
import www.shdy.data.callback.LoadTaskCallback;

import www.shdy.entity.HomeBean;
import www.shdy.entity.HomeFourNameBean;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.LogginBean;
import www.shdy.entity.LogginsBean;
import www.shdy.entity.RegisterBean;
import www.shdy.entity.UpImage;
import www.shdy.entity.UsetBean;
import www.shdy.https.HttpManager;
import www.shdy.https.HttpResult;
import www.shdy.https.HttpResultSubscriber;
import www.shdy.utils.TransformUtils;

/**
 * Author: Mr.xiao on 2018/9/5
 *
 * @mail:xhb_199409@163.com
 * @github:https://github.com/xiaohaibin
 * @describe: 数据仓库代理类，用于封装从不同来源处获取数据
 */
public class TasksRepositoryProxy implements TasksDataSource {

    private static TasksRepositoryProxy INSTANCE = null;
    private RequestBody requestBody;

    private TasksRepositoryProxy() {
    }

    public static TasksRepositoryProxy getInstance() {
        if (INSTANCE == null) {
            synchronized (TasksRepositoryProxy.class) {
                if (INSTANCE == null) {
                    return new TasksRepositoryProxy();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void release() {
        INSTANCE = null;
    }


    //登录
    @Override
    public Subscription login(String usrname, String pwd, final LoadTaskCallback<LogginsBean> callback) {
        JSONObject  jsusername= new JSONObject();
        JSONObject  requestData=new JSONObject();
        try {
            requestData.put("phone",usrname);
            requestData.put("code",pwd);

            jsusername.put("datalist",requestData);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        RequestBody bodypwd= RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsusername.toString());
        return HttpManager.getInstance().createService(ApiService.class)
                .login(bodypwd)
                .compose(TransformUtils.<HttpResult<LogginsBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<LogginsBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        com.orhanobut.logger.Logger.i("" + msg);
                        callback.onDataNotAvailable(msg);
                    }

                    @Override
                    public void onSuccess(LogginsBean logginBean) {

                        callback.onTaskLoaded(logginBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }




    //登录 验证码
    @Override
    public Subscription httpcode(String phone ,final LoadTaskCallback<HttpCodeBean> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .httpcode(phone)
                .compose(TransformUtils.<HttpResult<HttpCodeBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<HttpCodeBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        com.orhanobut.logger.Logger.i("" + msg);
                        callback.onDataNotAvailable(msg);
                    }

                    @Override
                    public void onSuccess(HttpCodeBean logginBean) {

                        callback.onTaskLoaded(logginBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }

    //   微信登录
    @Override
    public Subscription weixlogin(final LoadTaskCallback<Object> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .weixlogin()
                .compose(TransformUtils.<HttpResult<Object>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<Object>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        com.orhanobut.logger.Logger.i("" + msg);
                        callback.onDataNotAvailable(msg);
                    }

                    @Override
                    public void onSuccess(Object logginBean) {

                        callback.onTaskLoaded(logginBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }




















































    @Override
    public Subscription Homeone(final LoadTaskCallback<HomeBean> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .Homeone()
                .compose(TransformUtils.<HttpResult<HomeBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<HomeBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        callback.onDataNotAvailable(msg);
                    }

                    @Override
                    public void onSuccess(HomeBean homeBean) {

                        callback.onTaskLoaded(homeBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }


    //TODO 注册
    public Subscription Register(String userid, String code, String psd, final LoadTaskCallback<RegisterBean> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .register(userid, code, psd)
                .compose(TransformUtils.<HttpResult<RegisterBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<RegisterBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {

                        Log.i(">>>", "onError: " + msg + code);

                        callback.onDataNotAvailable(msg);
                    }

                    @Override
                    public void onSuccess(RegisterBean registerBean) {

                        com.orhanobut.logger.Logger.i(registerBean.getUsername());

                        callback.onTaskLoaded(registerBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }

//
//    //TODO 修改密码
//    @Override
//    public Subscription Changpassword(String userid, int code, String psd, final LoadTaskCallback<RegisterBean> callback) {
//        return HttpManager.getInstance().createService(ApiService.class)
//                .changpassword(userid, code, psd)
//                .compose(TransformUtils.<HttpResult<RegisterBean>>defaultSchedulers())
//                .subscribe(new HttpResultSubscriber<RegisterBean>() {
//                    @Override
//                    public void onStart() {
//                        callback.onStart();
//                    }
//
//                    @Override
//                    public void onError(String info, String msg, int code) {
//                        callback.onDataNotAvailable(msg);
//                    }
//
//                    @Override
//                    public void onSuccess(RegisterBean registerBean) {
//
//                        callback.onTaskLoaded(registerBean);
//                    }
//
//
//                    @Override
//                    public void onFinished() {
//                        callback.onCompleted();
//                    }
//                });
//    }


    //TODO 图片上传接口
    public Subscription AnswerUpData(MultipartBody.Part images, final LoadTaskCallback<UpImage> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .AnswerUpData(images)
                .compose(TransformUtils.<HttpResult<UpImage>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<UpImage>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        callback.onDataNotAvailable(info);
                    }

                    @Override
                    public void onSuccess(UpImage upImage) {
                        callback.onTaskLoaded(upImage);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });

    }


    //TODO 个人中心
    @Override
    public Subscription HomeFourData(String uid, final LoadTaskCallback<UsetBean> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .HomeFourData(uid)
                .compose(TransformUtils.<HttpResult<UsetBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<UsetBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        callback.onDataNotAvailable(info);
                    }

                    @Override
                    public void onSuccess(UsetBean ticketBean) {

                        callback.onTaskLoaded(ticketBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }


    //TODO 个人中心头像
    @Override
    public Subscription HomeFourIconData(String uid, String avatar, final LoadTaskCallback<HomeFourNameBean> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .HomeFourIconData(uid, avatar)
                .compose(TransformUtils.<HttpResult<HomeFourNameBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<HomeFourNameBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        callback.onDataNotAvailable(info);
                    }

                    @Override
                    public void onSuccess(HomeFourNameBean ticketBean) {

                        callback.onTaskLoaded(ticketBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }


    //TODO 个人中心昵称
    @Override
    public Subscription HomeFourNameData(String uid, String username, final LoadTaskCallback<HomeFourNameBean> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .HomeFourNameData(uid, username)
                .compose(TransformUtils.<HttpResult<HomeFourNameBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<HomeFourNameBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        callback.onDataNotAvailable(info);
                    }

                    @Override
                    public void onSuccess(HomeFourNameBean ticketBean) {

                        callback.onTaskLoaded(ticketBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }


    @Override
    public Subscription HomeoneTitle(String cate_id, final LoadTaskCallback<HomeBean> callback) {
        return HttpManager.getInstance().createService(ApiService.class)
                .HomeoneTitle(cate_id)
                .compose(TransformUtils.<HttpResult<HomeBean>>defaultSchedulers())
                .subscribe(new HttpResultSubscriber<HomeBean>() {
                    @Override
                    public void onStart() {
                        callback.onStart();
                    }

                    @Override
                    public void onError(String info, String msg, int code) {
                        callback.onDataNotAvailable(msg);
                    }

                    @Override
                    public void onSuccess(HomeBean homeBean) {

                        callback.onTaskLoaded(homeBean);
                    }


                    @Override
                    public void onFinished() {
                        callback.onCompleted();
                    }
                });
    }


//    @Override
//    public Subscription getOriginalPage(int currentPage, final LoadTaskCallback<NewsPageBean> callback) {
//        return HttpManager.getInstance().createService(ApiService.class)
//                .getOriginalPage(RequestBodyHelper.creatRequestBody(new NewsContent(currentPage)))
//                .compose(TransformUtils.<HttpResult<NewsPageBean>>defaultSchedulers())
//                .subscribe(new HttpResultSubscriber<NewsPageBean>() {
//
//                    @Override
//                    public void onStart() {
//                        callback.onStart();
//                    }
//
//                    @Override
//                    public void onSuccess(NewsPageBean newsPageBean) {
//                        callback.onTaskLoaded(newsPageBean);
//                    }
//
//                    @Override
//                    public void onError(String msg, int code) {
//                        callback.onDataNotAvailable(msg);
//                    }
//
//                    @Override
//                    public void onFinished() {
//                        callback.onCompleted();
//                    }
//                });
//    }


}
