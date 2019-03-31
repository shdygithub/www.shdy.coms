package www.shdy.widget.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import www.shdy.R;
import www.shdy.widget.BaseDialogFragment;

/**
 * Created by handagou on 2018/12/23.
 */

//积分支付成功Dialog
public class Clean_Dialog extends BaseDialogFragment {

    /**
     * 定义一个变量储存数据
     */
    private onCleanListener listener;


    /**
     * 定义一个接口
     */
    public interface onCleanListener {
        void OnCleanListener(boolean x);
    }


    /**
     * 提供公共的方法,并且初始化接口类型的数据
     */
    public void setCleanListener(onCleanListener listener) {
        this.listener = listener;
    }

    @Bind(R.id.pay_btn)
    Button payBtn;

    public static Clean_Dialog newInatance() {
        Bundle args = new Bundle();
        Clean_Dialog pays_dialog = new Clean_Dialog();
        pays_dialog.setArguments(args);
        pays_dialog.setCancelable(false);


        return pays_dialog;

    }

    @Override
    protected int getLayoutRes() {
        return R.layout.clean_dialogs;
    }

    @Override
    public void BindView(View v) {

        RelativeLayout Relatdimess = findView(R.id.dimess_btn);

        Relatdimess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    @Override
    public void show(Context context) {


    }

    @Override
    protected int getGravity() {
        return Gravity.TOP;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @OnClick(R.id.pay_btn)
    public void onViewClicked() {

        dismiss();
    }
}
