package www.shdy.mvp.viewUi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hjq.toast.ToastUtils;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

import butterknife.Bind;
import butterknife.OnClick;
import www.shdy.R;
import www.shdy.base.BaseMvpActivity;
import www.shdy.entity.LogginBean;

import www.shdy.mvp.contract.LoginContract;
import www.shdy.mvp.presenter.LoginPresenter;
import www.shdy.utils.AppUser;

import www.shdy.utils.Dolas;
import www.shdy.utils.SPUtils;

public class MainActivity extends BaseMvpActivity<LoginPresenter> implements LoginContract.loginView {


    @Bind(R.id.phone_number)
    EditText phoneNumber;

    @Bind(R.id.phone_password)
    EditText phonePassword;

    @Bind(R.id.btn)
    Button btn;
    @Bind(R.id.password)
    TextView password;
    @Bind(R.id.relateive_ground)
    RelativeLayout relateiveGround;

    @Bind(R.id.linear)
    LinearLayout linear;
    @Bind(R.id.code_btn)
    Button codeBtn;
    @Bind(R.id.code_layout)
    RelativeLayout codeLayout;
    @Bind(R.id.weix_btn)
    ImageView weixBtn;
    private String TAG = ">>>";
    private boolean CheckGone = false;
    private boolean CheckClean = false;


    @Override
    protected LoginPresenter onLoadPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getLayoutResource() {

        //让布局向上移来显示软键盘
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        return R.layout.activity_main;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onInitialization(Bundle bundle) {

        linear.setPadding(0, 0, 0, getNavbarHeight());

        phonePassword.setTransformationMethod(PasswordTransformationMethod.getInstance());//隐藏密码
    }


    @Override
    public void loginSuccess(LogginBean logginBean) {


        //    Intent intent = new Intent(this, HomeActivity.class);
        AppUser.login(logginBean);
        //    startActivity(intent);
    }

    @Override
    public void loginFailed(String msg) {


        ToastUtils.show(msg);
    }

    @Override
    public void showLoading() {


        Dolas.Doals(this);
    }

    @Override
    public void hideLoading() {

        Dolas.DoalsDimess(this);
    }

    public void QQ(View view) {
        authorization(SHARE_MEDIA.QQ);
    }

    public void weiXin(View view) {
        authorization(SHARE_MEDIA.WEIXIN);
    }


    //授权
    private void authorization(SHARE_MEDIA share_media) {
        UMShareAPI.get(this).getPlatformInfo(this, share_media, new UMAuthListener() {
            @Override
            public void onStart(SHARE_MEDIA share_media) {
                Log.d(TAG, "onStart " + "授权开始");
            }

            @Override
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                Log.d(TAG, "onComplete " + "授权完成");

                //sdk是6.4.4的,但是获取值的时候用的是6.2以前的(access_token)才能获取到值,未知原因
                String uid = map.get("uid");
                String openid = map.get("openid");//微博没有
                String unionid = map.get("unionid");//微博没有
                String access_token = map.get("access_token");
                String refresh_token = map.get("refresh_token");//tengweixin_icon,qq,微博都没有获取到
                String expires_in = map.get("expires_in");
                String name = map.get("name");
                String gender = map.get("gender");
                String iconurl = map.get("iconurl");

                Toast.makeText(getApplicationContext(), "name=" + name + ",gender=" + gender, Toast.LENGTH_SHORT).show();

                //拿到信息去请求登录接口。。。
            }

            @Override
            public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
                Log.d(TAG, "onError " + "授权失败");
            }

            @Override
            public void onCancel(SHARE_MEDIA share_media, int i) {
                Log.d(TAG, "onCancel " + "授权取消");
            }
        });
    }


    //TODO  QQ 回调
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }


    @OnClick({R.id.btn, R.id.password, R.id.code_btn,R.id.weix_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {


            case R.id.btn:


                mPresenter.login(phoneNumber.getText().toString(), phonePassword.getText().toString());

                //本地保存用户账号及密码
                SPUtils.putString(MainActivity.this, "phoneNumber", phoneNumber.getText().toString());
                SPUtils.putString(MainActivity.this, "phonePassword", phonePassword.getText().toString());


                break;
            case R.id.password:

                break;

            case R.id.code_btn:
                ToastUtils.show("验证码");
              //  mPresenter.HttpCode();


                break;
            case R.id.weix_btn:

                weiXin(view);
                break;
//            case R.id.phone_register:
////
////                Intent intent1 = new Intent(this, RegisterActivity.class);
////                startActivity(intent1);
////                finish();
//                break;
        }
    }


}
