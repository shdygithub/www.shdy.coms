package www.shdy.mvp.presenter.video_presenter;

import android.text.TextUtils;
import android.util.Log;

import com.hjq.toast.ToastUtils;

import rx.Subscription;
import www.shdy.basemvp.BasePresenter;
import www.shdy.data.callback.LoadTaskCallback;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.VideoHomeFragmentBean;
import www.shdy.mvp.contract.HomeFourContract;
import www.shdy.mvp.contract.video_contract.VideoFragmentContract;
import www.shdy.remote.TasksRepositoryProxy;

import static android.content.ContentValues.TAG;

public class VideoFragmentPresenter extends BasePresenter<VideoFragmentContract.videohomeView> implements VideoFragmentContract.videohomeModel {


    @Override
    public void videohomemodel(String position) {
        if (TextUtils.isEmpty(position)) {
            ToastUtils.show("位置为空");
            return;
        }

        Subscription httpcode = TasksRepositoryProxy.getInstance().videohome_fragment(position, new LoadTaskCallback<VideoHomeFragmentBean>() {
            @Override
            public void onTaskLoaded(VideoHomeFragmentBean videoHomeFragmentBean) {

                Log.i(TAG, "onTaskLoaded: "+videoHomeFragmentBean.getCode());
                getView().videohomeSuccess(videoHomeFragmentBean);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                Log.i(TAG, "onDataNotAvailable: "+msg);
                getView().videohomeFailed(msg);
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
        addSubscription(httpcode);

    }
}
