package www.shdy.widget.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;

import www.shdy.R;
import www.shdy.widget.BaseDialogFragment;

/**
 * Created by handagou on 2018/12/23.
 */

//积分支付成功Dialog
public class Pays_Dialog extends BaseDialogFragment {

    public static Pays_Dialog newInatance() {
        Bundle args = new Bundle();
        Pays_Dialog pays_dialog = new Pays_Dialog();
        pays_dialog.setArguments(args);
        pays_dialog.setCancelable(false);


        return pays_dialog;

    }

    @Override
    protected int getLayoutRes() {
        return R.layout.pay_dialogs;
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
}
