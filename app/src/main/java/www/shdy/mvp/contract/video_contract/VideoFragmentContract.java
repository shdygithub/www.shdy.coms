package www.shdy.mvp.contract.video_contract;

import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.VideoHomeFragmentBean;

public interface VideoFragmentContract {

    interface videohomeModel extends IModel {

        void videohomemodel(String position);
    }

    interface videohomeView extends IView {

        void videohomeSuccess(VideoHomeFragmentBean videoHomeFragmentBean);

        void videohomeFailed(String msg);

        void showLoading();

        void hideLoading();

    }
}
