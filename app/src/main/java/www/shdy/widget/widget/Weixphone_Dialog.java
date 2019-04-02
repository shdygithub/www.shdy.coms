package www.shdy.widget.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import www.shdy.R;
import www.shdy.mvp.viewUi.activity.WeixPhoneActivity;

public class Weixphone_Dialog extends BaseDialogFragment {
    @Bind(R.id.image_dimess)
    ImageView imageDimess;
    @Bind(R.id.text_view)
    TextView textView;
    @Bind(R.id.btn)
    Button btn;

    private String unionids;


    public static Weixphone_Dialog newInatance(String unionid) {


        Bundle args = new Bundle();
        Weixphone_Dialog weixphone_dialog = new Weixphone_Dialog();
        weixphone_dialog.setArguments(args);
        weixphone_dialog.setCancelable(false);

        weixphone_dialog.unionids=unionid;


        return weixphone_dialog;

    }

    @Override
    protected int getLayoutRes() {
        return R.layout.weixdialog_phone;
    }

    @Override
    public void BindView(View v) {

    }

    @Override
    protected void show(Context context) {

    }


    @Override
    protected int getGravity() {
        return Gravity.CENTER;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @OnClick({R.id.image_dimess, R.id.btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_dimess:

                dismiss();

                break;
            case R.id.btn:

                Intent intent = new Intent(contentView.getContext(), WeixPhoneActivity.class);
                intent.putExtra("unionid",unionids);
                startActivity(intent);
                break;
        }
    }
}
