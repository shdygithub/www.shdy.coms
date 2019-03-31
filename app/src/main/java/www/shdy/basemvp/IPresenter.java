package www.shdy.basemvp;


public interface IPresenter<V extends IView> {

    void attachView(V mvpView);

    void onStart();

    void detachView();

    boolean isViewBind();

}
