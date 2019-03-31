package www.shdy.mvp.contract;

import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;


//3.31
public interface HomeContract {

    interface homeModel extends IModel {

        void homemodel();
    }

    interface homeView extends IView {

        void homeSuccess();

        void homeFailed(String msg);

        void showLoading();

        void hideLoading();

    }

}
