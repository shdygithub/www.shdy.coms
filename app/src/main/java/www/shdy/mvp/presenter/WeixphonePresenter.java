package www.shdy.mvp.presenter;

import android.text.TextUtils;
import android.util.Log;

import com.hjq.toast.ToastUtils;
import com.orhanobut.logger.Logger;

import rx.Subscription;
import www.shdy.basemvp.BasePresenter;
import www.shdy.data.callback.LoadTaskCallback;
import www.shdy.entity.LogginsBean;
import www.shdy.entity.WeixPhoneBean;
import www.shdy.mvp.contract.WeixphoneContract;
import www.shdy.remote.TasksRepositoryProxy;

import static android.content.ContentValues.TAG;

public class WeixphonePresenter  extends BasePresenter<WeixphoneContract.WeixphoneView> implements WeixphoneContract.WeixphoneModel {
    @Override
    public void WeixphoneData(String unid, String phone) {

        if (TextUtils.isEmpty(unid)) {
            Logger.e(unid);
            return;
        }
        if (TextUtils.isEmpty(phone)) {
            Logger.e(phone);
            return;
        }

        Subscription weixlogin = TasksRepositoryProxy.getInstance().weixlogin_phone(unid,phone,new LoadTaskCallback<WeixPhoneBean>() {
            @Override
            public void onTaskLoaded(WeixPhoneBean weixLoginBean) {

                Log.i(TAG, "onTaskLoaded: "+weixLoginBean);
                getView().WeixphoneSuccess(weixLoginBean);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                Log.i(TAG, "onDataNotAvailable: "+msg);
                getView().WeixphoneFailed(msg);
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
