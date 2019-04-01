package www.shdy.base;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;


/**
 * Author:Mr.HanWenrui
 * <p>
 基类
 * <p>
 * Description: Dialog基类
 */
public abstract class BaseDialogFragment extends DialogFragment {

    protected View contentView;

    //判断是否需要登录
    protected boolean IsLogins;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = dialog.getWindow();
        if (window!=null) {
            window.setGravity(getGravity());
            window.setBackgroundDrawable(new ColorDrawable(Color.argb(0, 0, 0, 0)));
        }

        return dialog;
    }

    public int getGravity() {
        return Gravity.CENTER;
    }



    public void setContentView(@LayoutRes int layoutId) {
        contentView = LayoutInflater.from(getActivity()).inflate(layoutId, null);
    }

    public View findViewById(@IdRes int id) {
        return contentView.findViewById(id);
    }

    /**
     * 省略findViewById的强制类型转换
     *
     * @param id
     * @param <T>
     * @return
     */
    public <T extends View> T findView(@IdRes int id) {
        return (T) findViewById(id);
    }

    protected void findViews() {
    }

    protected void initViews() {
    }

    protected void registerViews() {
    }

}
