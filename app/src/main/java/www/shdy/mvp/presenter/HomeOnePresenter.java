package www.shdy.mvp.presenter;

import android.text.TextUtils;

import rx.Subscription;
import www.shdy.basemvp.BasePresenter;
import www.shdy.data.callback.LoadTaskCallback;
import www.shdy.entity.HomeBean;
import www.shdy.mvp.contract.HomeOneContrcat;
import www.shdy.remote.TasksRepositoryProxy;

public class HomeOnePresenter extends BasePresenter<HomeOneContrcat.View> implements HomeOneContrcat.HomeOneModel {




    @Override
    public void HomeOneData() {

        if (getView() == null) {
            return;
        }

        Subscription subscription = TasksRepositoryProxy.getInstance().Homeone(new LoadTaskCallback<HomeBean>() {

            @Override
            public void onTaskLoaded(HomeBean data) {


                getView().HomeOneDataSuccess(data);


            }

            @Override
            public void onDataNotAvailable(String msg) {

                getView().HomeOneDataFailed(TextUtils.isEmpty(msg) ? "服务器请求失败，请重试" : msg);

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

        addSubscription(subscription);
    }

    @Override
    public void HomeOneTitleData(String cate_id) {


        Subscription subscription = TasksRepositoryProxy.getInstance().HomeoneTitle(cate_id,new LoadTaskCallback<HomeBean>() {

            @Override
            public void onTaskLoaded(HomeBean data) {


                getView().HomeOneDataTitleSuccess(data);


            }

            @Override
            public void onDataNotAvailable(String msg) {

                getView().HomeOneDataTitleFailed(TextUtils.isEmpty(msg) ? "服务器请求失败，请重试" : msg);

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

        addSubscription(subscription);
    }
}
