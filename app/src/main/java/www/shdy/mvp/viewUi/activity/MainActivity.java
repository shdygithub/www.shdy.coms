package www.shdy.mvp.viewUi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
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
import com.orhanobut.logger.Logger;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.Map;

import butterknife.Bind;
import butterknife.OnClick;
import www.shdy.R;
import www.shdy.base.BaseMvpActivity;
import www.shdy.entity.EventPhoneWeixBean;
import www.shdy.entity.HttpCodeBean;
import www.shdy.entity.LogginBean;

import www.shdy.entity.LogginsBean;
import www.shdy.entity.PhoneWeixBean;
import www.shdy.entity.WeixLoginBean;
import www.shdy.entity.WeixPhoneBean;
import www.shdy.mvp.contract.LoginContract;
import www.shdy.mvp.presenter.LoginPresenter;
import www.shdy.utils.AppUser;

import www.shdy.utils.Dolas;
import www.shdy.utils.SPUtils;
import www.shdy.widget.CountDownButton;
import www.shdy.widget.widget.PhoneDialog_Weix;
import www.shdy.widget.widget.Weixphone_Dialog;

import static www.shdy.StaticUtil.Weixin_Appid;

public class MainActivity extends BaseMvpActivity<LoginPresenter> implements LoginContract.loginView {


    private  int IntenLoginPhone=0;
    private int IntenLoginWeix=1;
    @Bind(R.id.phone_number)
    EditText phoneNumber;

    @Bind(R.id.phone_password)
    EditText phonePassword;

    @Bind(R.id.btn)
    Button btn;
    @Bind(R.id.text_h5)
    TextView texth5;
    @Bind(R.id.relateive_ground)
    RelativeLayout relateiveGround;

    @Bind(R.id.linear)
    LinearLayout linear;
    @Bind(R.id.code_btn)
    CountDownButton codeBtn;
    @Bind(R.id.code_layout)
    RelativeLayout codeLayout;
    @Bind(R.id.weix_btn)
    ImageView weixBtn;
    private String TAG = ">>>";
    private boolean CheckGone = false;
    private boolean CheckClean = false;
    private PhoneDialog_Weix phoneDialogWeix;
    private String openid;
    private String unionid;
    private int longins;
    private EventPhoneWeixBean eventPhoneWeixBean;


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
        EventBus.getDefault().register(this);
        phoneDialogWeix = new PhoneDialog_Weix();

    }

    @Override
    protected void onInitialization(Bundle bundle) {

        linear.setPadding(0, 0, 0, getNavbarHeight());

        phonePassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }


    @Override
    public void loginSuccess(LogginsBean logginBean) {

        phoneDialogWeix.newInatance().show(getSupportFragmentManager());

        //ToastUtils.show(logginBean.getUserInfo().getNickname());

        AppUser.login(logginBean);

    }


    @Override
    public void loginFailed(String msg) {


        ToastUtils.show(msg);
    }

    @Override
    public void loginCodeSuccess(HttpCodeBean codeBean) {

        codeBtn.start();
        ToastUtils.show(codeBean.getValidateCode());
    }


    @Override
    public void loginCodeFailed(String mag) {


    }

    @Override
    public void Phonelogin_weixSuccess(PhoneWeixBean phoneWeixBean) {
        //    Intent intent = new Intent(this, HomeActivity.class);
        //    startActivity(intent);
    }

    @Override
    public void Phonelogin_weixFailed(String msg) {

        ToastUtils.show(msg);
    }

    @Override
    public void weixloginSuccess(WeixLoginBean weixLoginBean) {

        ToastUtils.show(weixLoginBean.getUserInfo().getNickname());
    }

    @Override
    public void weixloginFailed(String msg) {
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
        //authorization(SHARE_MEDIA.QQ);
    }

    public void weiXin(Activity view,int weiXinID) {
        authorization(SHARE_MEDIA.WEIXIN,weiXinID);
    }


    //授权
    private void authorization(SHARE_MEDIA share_media, final int weiXinID) {
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
                //微博没有
                openid = map.get("openid");
                //微博没有
                unionid = map.get("unionid");
                String access_token = map.get("access_token");
                String refresh_token = map.get("refresh_token");//tengweixin_icon,qq,微博都没有获取到
                String expires_in = map.get("expires_in");
                String name = map.get("name");
                String gender = map.get("gender");
                String iconurl = map.get("iconurl");


                if(weiXinID==0){

                    mPresenter.Phonelogin_weix(openid,unionid,Weixin_Appid,phoneNumber.getText().toString());
                }else {
                    mPresenter.weixlogin(openid,unionid,Weixin_Appid,name,gender,iconurl);
                    ToastUtils.show("登录成功");
                    Weixphone_Dialog.newInatance(unionid).show(getSupportFragmentManager());
                }




                //跳转界面
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


    @OnClick({R.id.btn, R.id.text_h5, R.id.code_btn, R.id.weix_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {


            case R.id.btn:


                mPresenter.login(phoneNumber.getText().toString(), phonePassword.getText().toString());

                //本地保存用户账号及密码
                SPUtils.putString(MainActivity.this, "phoneNumber", phoneNumber.getText().toString());
                SPUtils.putString(MainActivity.this, "phonePassword", phonePassword.getText().toString());


                break;
            case R.id.text_h5:

                break;

            case R.id.code_btn:
                codeBtn.start();
                ToastUtils.show("已发送短信至手机，请注意查收");
                mPresenter.HttpCode(phoneNumber.getText().toString());

                break;
            case R.id.weix_btn:

                weiXin(this,IntenLoginWeix);


                //mPresenter.weixlogin_phone(unionid,phoneNumber.getText().toString());


                break;

        }
    }
    /**
     * EventBus的接收方法
     *
     * @param phoneWeixBean 传递类
     */
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void eventBusReceive(EventPhoneWeixBean phoneWeixBean) {

        if(phoneWeixBean.isOn()){

            phoneDialogWeix.dismiss();

            Intent intent=new Intent();
            startActivity(intent);
        }else if(phoneWeixBean.isRoot()){
            //手机号码绑定微信
            if(openid!=null&&unionid!=null){
                mPresenter.Phonelogin_weix(openid,unionid,Weixin_Appid,phoneNumber.getText().toString());
            }else {
                weiXin(this,IntenLoginPhone);

            }
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
