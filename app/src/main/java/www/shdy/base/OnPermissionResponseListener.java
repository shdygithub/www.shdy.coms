package www.shdy.base;

public interface OnPermissionResponseListener {
    void onSuccess(String[] permissions);
    void onFail();
}
