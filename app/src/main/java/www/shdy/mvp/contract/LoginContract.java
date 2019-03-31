package www.shdy.mvp.contract;


import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.LogginBean;

/**

 * Describe：
 */
public interface LoginContract {

    interface loginModel extends IModel {

        void login(String username, String pwd);
    }

    interface loginView extends IView {

        void loginSuccess(LogginBean logginBean);

        void loginFailed(String msg);

        void showLoading();

        void hideLoading();

    }

}
