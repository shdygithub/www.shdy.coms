package www.shdy.mvp.contract;


import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.LogginBean;
import www.shdy.entity.LogginsBean;
import www.shdy.entity.PhoneWeixBean;
import www.shdy.entity.WeixLoginBean;
import www.shdy.entity.WeixPhoneBean;

/**

 * Describe：
 */
public interface LoginContract {

    interface loginModel extends IModel {

        void login(String username, String pwd);

        void HttpCode(String phone);

        void Phonelogin_weix(String openid,String unionid,String appid,String phone);

        void weixlogin(String openid,String unionid,String appid,String nickname,String gender,String avatarUrl);

    }

    interface loginView extends IView {

        void loginSuccess(LogginsBean logginBean);

        void loginFailed(String msg);

        void loginCodeSuccess(HttpCodeBean codeBean);

        void loginCodeFailed(String mag);

        void  Phonelogin_weixSuccess(PhoneWeixBean phoneWeixBean);

        void  Phonelogin_weixFailed(String msg);

        void weixloginSuccess(WeixLoginBean weixLoginBean);

        void weixloginFailed(String msg);




        void showLoading();

        void hideLoading();

    }

}
