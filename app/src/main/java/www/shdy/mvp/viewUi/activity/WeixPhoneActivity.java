package www.shdy.mvp.viewUi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hjq.toast.ToastUtils;

import butterknife.Bind;
import butterknife.OnClick;
import www.shdy.R;
import www.shdy.base.BaseActivity;
import www.shdy.base.BaseMvpActivity;
import www.shdy.entity.WeixPhoneBean;
import www.shdy.mvp.contract.WeixphoneContract;
import www.shdy.mvp.presenter.WeixphonePresenter;
import www.shdy.widget.CountDownButton;

public class WeixPhoneActivity extends BaseMvpActivity<WeixphonePresenter> implements WeixphoneContract.WeixphoneView {

    @Bind(R.id.tiaobtn)
    TextView tiaobtn;
    @Bind(R.id.phone_number)
    EditText phoneNumber;
    @Bind(R.id.phone_password)
    EditText phonePassword;
    @Bind(R.id.code_btn)
    CountDownButton codeBtn;
    @Bind(R.id.code_layout)
    RelativeLayout codeLayout;
    @Bind(R.id.btn)
    Button btn;
    @Bind(R.id.relateive_ground)
    RelativeLayout relateiveGround;
    @Bind(R.id.text_h5)
    TextView textH5;
    private String unionid;

    @Override
    protected WeixphonePresenter onLoadPresenter() {
        return new WeixphonePresenter();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_weix_phone;
    }

    @Override
    protected void onInitialization(Bundle bundle) {

        Intent intent=getIntent();
        unionid = intent.getStringExtra("unionid");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @OnClick({R.id.tiaobtn, R.id.btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tiaobtn:

                Intent intent=new Intent();
                startActivity(intent);

                break;
            case R.id.btn:


                if(unionid!=null){
                    mPresenter.WeixphoneData(unionid,phoneNumber.getText().toString());
                }

                break;
        }
    }

    @Override
    public void WeixphoneSuccess(WeixPhoneBean weixPhoneBean) {

        ToastUtils.show(weixPhoneBean.getCode());
    }

    @Override
    public void WeixphoneFailed(String msg) {

        ToastUtils.show(msg);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
