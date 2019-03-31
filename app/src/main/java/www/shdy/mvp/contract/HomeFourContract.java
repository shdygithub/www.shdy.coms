package www.shdy.mvp.contract;

import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.HomeFourNameBean;
import www.shdy.entity.UpImage;
import www.shdy.entity.UsetBean;

/**
 * Created by Administrator on 2019/1/19 0019
 * <p>
 * Describe:
 */
public interface HomeFourContract {


    interface Model extends IModel {

        void HomeFourData(String uid);

        void HomeFourIcon(String uid, String avatar);

        void HomeFourName(String uid, String username);

        void AnswerUpData(String images);
    }


    interface View extends IView {

        void HomeFourSuccess(UsetBean usetBean);

        void HomeFourFailed(String msg);


        void HomeFourIconSuccess(HomeFourNameBean meQuestionBean);

        void HomeFourIconFailed(String msg);


        void HomeFourNameSuccess(HomeFourNameBean meQuestionBean);

        void HomeFourNameFailed(String msg);


        void AnswerUpSuccess(UpImage data);

        void AnswerUpFailed(String msg);

        void showLoading();

        void hideLoading();

    }
}
