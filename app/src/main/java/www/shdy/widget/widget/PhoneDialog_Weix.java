package www.shdy.widget.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hjq.toast.ToastUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import www.shdy.R;


/**
 * Created by handagou on  2019.4.2
 */

//手机号注册绑定微信Dialog
public class PhoneDialog_Weix extends BaseDialogFragment {


    @Bind(R.id.image_dimess)
    ImageView dimess_img;
    @Bind(R.id.text_view)
    TextView textView;
    @Bind(R.id.unbtn)
    Button unbtn;
    @Bind(R.id.btn)
    Button btn;

    public static PhoneDialog_Weix newInatance() {
        Bundle args = new Bundle();
        PhoneDialog_Weix pays_dialog = new PhoneDialog_Weix();
        pays_dialog.setArguments(args);
        pays_dialog.setCancelable(false);

        return pays_dialog;

    }

    @Override
    protected int getLayoutRes() {
        return R.layout.phonedialog_weix;
    }

    @Override
    public void BindView(View v) {

        ImageView imageView_dimess = findView(R.id.image_dimess);

        imageView_dimess.setOnClickListener(new View.OnClickListener() {
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
        return Gravity.CENTER;

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



    @OnClick({R.id.unbtn, R.id.btn,R.id.image_dimess})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.unbtn:
                break;
            case R.id.btn:
                break;
            case R.id.image_dimess:
                ToastUtils.show("关闭");
                dismiss();
                break;

        }
    }
}
