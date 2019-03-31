package www.shdy.mvp.presenter;

import android.util.Log;



import rx.Subscription;
import www.shdy.basemvp.BasePresenter;
import www.shdy.data.callback.LoadTaskCallback;
import www.shdy.entity.UserInfoBean;
import www.shdy.mvp.contract.HomeContract;
import www.shdy.remote.TasksRepositoryProxy;

import static android.content.ContentValues.TAG;


public class HomePresenter extends BasePresenter<HomeContract.homeView> implements HomeContract.homeModel {



    @Override
    public void homemodel() {

        Log.i(TAG, "homemodel: 首页打开成功");


        Subscription homein = TasksRepositoryProxy.getInstance().homein(new LoadTaskCallback<UserInfoBean>() {
            @Override
            public void onTaskLoaded(UserInfoBean data) {

               getView().homeSuccess();
            }

            @Override
            public void onDataNotAvailable(String msg) {

                getView().homeFailed(msg);
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
        addSubscription(homein);
    }


}
