package www.shdy.mvp.presenter;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.Subscription;
import www.shdy.basemvp.BasePresenter;
import www.shdy.data.callback.LoadTaskCallback;
import www.shdy.entity.HomeFourNameBean;
import www.shdy.entity.UpImage;
import www.shdy.entity.UsetBean;
import www.shdy.mvp.contract.HomeFourContract;
import www.shdy.remote.TasksRepositoryProxy;

/**
 * Created by Administrator on 2019/1/19 0019
 * <p>
 * Describe:
 */
public class HomeFourPresenter extends BasePresenter<HomeFourContract.View> implements HomeFourContract.Model {


    @Override
    public void HomeFourData(String uid) {


        if (getView() == null) {
            return;
        }


        Subscription subscription = TasksRepositoryProxy.getInstance().HomeFourData(uid, new LoadTaskCallback<UsetBean>() {
            @Override
            public void onTaskLoaded(UsetBean data) {

                getView().HomeFourSuccess(data);
            }

            @Override
            public void onDataNotAvailable(String msg) {

                getView().HomeFourFailed(msg);
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
    public void HomeFourIcon(String uid, String avatar) {


        if (getView() == null) {
            return;
        }
        if (avatar == null) {
            return;
        }


        Subscription subscription = TasksRepositoryProxy.getInstance().HomeFourIconData(uid, avatar, new LoadTaskCallback<HomeFourNameBean>() {
            @Override
            public void onTaskLoaded(HomeFourNameBean data) {

                getView().HomeFourIconSuccess(data);
            }

            @Override
            public void onDataNotAvailable(String msg) {

                getView().HomeFourIconFailed(msg);
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
    public void HomeFourName(String uid, String username) {


        if (getView() == null) {
            return;
        }
        if (username == null) {
            return;
        }


        Subscription subscription = TasksRepositoryProxy.getInstance().HomeFourNameData(uid, username, new LoadTaskCallback<HomeFourNameBean>() {
            @Override
            public void onTaskLoaded(HomeFourNameBean data) {

                getView().HomeFourNameSuccess(data);
            }

            @Override
            public void onDataNotAvailable(String msg) {

                getView().HomeFourNameFailed(msg);
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
    public void AnswerUpData(String images) {

        if (getView() == null) {
            return;
        }


        File file = new File(images);
        RequestBody requestFile = RequestBody.create(MediaType.parse("image/jpeg"), file);
        MultipartBody.Part filePart = MultipartBody.Part.createFormData("headimg", file.getName(), requestFile);



         Subscription subscription = TasksRepositoryProxy.getInstance().AnswerUpData(filePart, new LoadTaskCallback<UpImage>() {

            @Override
            public void onTaskLoaded(UpImage data) {

                getView().AnswerUpSuccess(data);
            }

            @Override
            public void onDataNotAvailable(String msg) {

                getView().AnswerUpFailed(msg);
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
