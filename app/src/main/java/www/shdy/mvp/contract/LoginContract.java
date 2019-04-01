package www.shdy.mvp.contract;


import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.LogginBean;
import www.shdy.entity.LogginsBean;

/**

 * Describe：
 */
public interface LoginContract {

    interface loginModel extends IModel {

        void login(String username, String pwd);

        void HttpCode(String phone);
    }

    interface loginView extends IView {

        void loginSuccess(LogginsBean logginBean);

        void loginFailed(String msg);

        void loginCodeSuccess(HttpCodeBean codeBean);

        void loginCodeFailed(String mag);

        void showLoading();

        void hideLoading();

    }

}
