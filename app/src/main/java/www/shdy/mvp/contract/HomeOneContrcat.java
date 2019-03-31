package www.shdy.mvp.contract;


import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.HomeBean;

public interface HomeOneContrcat {

    interface HomeOneModel extends IModel {

        void HomeOneData();
        void HomeOneTitleData(String cate_id);


    }

    interface View extends IView {

        void HomeOneDataSuccess(HomeBean data);

        void HomeOneDataFailed(String msg);



        void HomeOneDataTitleSuccess(HomeBean data);

        void HomeOneDataTitleFailed(String msg);

        void showLoading();

        void hideLoading();
    }

}
