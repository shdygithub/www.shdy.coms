package www.shdy.data.callback;


import www.shdy.data.TaskObserver;

public abstract class LoadTaskCallback<T> implements TaskObserver<T> {

    public void onStart(){ }

    public void onCompleted(){ }
}
