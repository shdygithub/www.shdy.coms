package www.shdy.mvp.presenter;

import android.text.TextUtils;
import android.util.Log;


import com.hjq.toast.ToastUtils;

import rx.Subscription;
import www.shdy.basemvp.BasePresenter;
import www.shdy.data.callback.LoadTaskCallback;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.LogginBean;
import www.shdy.entity.LogginsBean;
import www.shdy.entity.PhoneWeixBean;
import www.shdy.entity.WeixLoginBean;
import www.shdy.entity.WeixPhoneBean;
import www.shdy.mvp.contract.LoginContract;
import www.shdy.remote.TasksRepositoryProxy;

import static android.content.ContentValues.TAG;


public class LoginPresenter extends BasePresenter<LoginContract.loginView> implements LoginContract.loginModel {


    //登录
    @Override
    public void login(String username, String pwd) {

        if (TextUtils.isEmpty(username)) {
            ToastUtils.show("请填写用户名");
            return;
        }
        if (TextUtils.isEmpty(pwd)) {
            ToastUtils.show("请填写验证码");
            return;
        }


        Subscription login = TasksRepositoryProxy.getInstance().login(username, pwd, new LoadTaskCallback<LogginsBean>() {
            @Override
            public void onTaskLoaded(LogginsBean logginBean) {

                getView().loginSuccess(logginBean);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                Log.i(TAG, "onDataNotAvailable: "+msg);
                getView().loginFailed(msg);
            }

            @Override
            public void onStart() {
                getView().showLoading();
            }

            @Override
            public void onCompleted() {
                 getView().hideLoading();
            }
        });
        addSubscription(login);
    }




    //登录验证码
    @Override
    public void HttpCode(String phone) {


        if (TextUtils.isEmpty(phone)) {
            ToastUtils.show("请填写手机号码");
            return;
        }

        Subscription httpcode = TasksRepositoryProxy.getInstance().httpcode(phone, new LoadTaskCallback<HttpCodeBean>() {
            @Override
            public void onTaskLoaded(HttpCodeBean httpCodeBean) {

                Log.i(TAG, "onTaskLoaded: "+httpCodeBean.getCode());
                getView().loginCodeSuccess(httpCodeBean);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                Log.i(TAG, "onDataNotAvailable: "+msg);
                getView().loginCodeFailed(msg);
            }

            @Override
            public void onStart() {
                getView().showLoading();
            }

            @Override
            public void onCompleted() {
                getView().hideLoading();
            }
        });
        addSubscription(httpcode);
    }


    @Override
    public void Phonelogin_weix(String openid,String unionid,String appid,String phone) {

        Subscription weixlogin = TasksRepositoryProxy.getInstance().phonelogin_weix(openid,unionid,appid,phone,new LoadTaskCallback<PhoneWeixBean>() {
            @Override
            public void onTaskLoaded(PhoneWeixBean phoneWeixBean) {

                Log.i(TAG, "onTaskLoaded: "+phoneWeixBean);
                getView().Phonelogin_weixSuccess(phoneWeixBean);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                Log.i(TAG, "onDataNotAvailable: "+msg);
                getView().Phonelogin_weixFailed(msg);
            }

            @Override
            public void onStart() {
                getView().showLoading();
            }

            @Override
            public void onCompleted() {
                getView().hideLoading();
            }
        });
        addSubscription(weixlogin);
    }


    @Override
    public void weixlogin(String openid,String unionid,String appid,String nickname,String gender,String avatarUrl) {

        Subscription weixlogin = TasksRepositoryProxy.getInstance().weixlogin(openid,unionid,appid,nickname,gender,avatarUrl,new LoadTaskCallback<WeixLoginBean>() {
            @Override
            public void onTaskLoaded(WeixLoginBean weixLoginBean) {

                Log.i(TAG, "onTaskLoaded: "+weixLoginBean);
                getView().weixloginSuccess(weixLoginBean);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                Log.i(TAG, "onDataNotAvailable: "+msg);
                getView().weixloginFailed(msg);
            }

            @Override
            public void onStart() {
                getView().showLoading();
            }

            @Override
            public void onCompleted() {
                getView().hideLoading();
            }
        });
        addSubscription(weixlogin);
    }




}
