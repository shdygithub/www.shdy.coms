package www.shdy.mvp.contract;


import www.shdy.basemvp.IModel;
import www.shdy.basemvp.IView;
import www.shdy.entity.NewsPageBean;

public interface NewsContrcat {

    interface newsModel extends IModel {
        void news(String mid);
    }

    interface newsView extends IView {

        void getNewListSuccess(NewsPageBean data);

        void getNewListFailed(String msg);

        void  showLoading();

        void  hideLoading();
    }

}
