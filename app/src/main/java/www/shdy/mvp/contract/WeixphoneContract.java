package www.shdy.mvp.contract;

import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.LogginsBean;
import www.shdy.entity.WeixPhoneBean;

public interface WeixphoneContract {

    interface WeixphoneModel extends IModel {

        void WeixphoneData(String unid,String phone);

    }


    interface WeixphoneView extends IView {

        void WeixphoneSuccess(WeixPhoneBean weixPhoneBean);

        void WeixphoneFailed(String msg);



        void showLoading();

        void hideLoading();
    }
}
