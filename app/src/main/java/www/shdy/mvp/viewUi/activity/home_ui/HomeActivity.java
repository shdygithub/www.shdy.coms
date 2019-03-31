package www.shdy.mvp.viewUi.activity.home_ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.widget.RelativeLayout;

import com.chaychan.library.BottomBarLayout;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.orhanobut.logger.Logger;
import com.umeng.socialize.UMShareAPI;

import org.greenrobot.eventbus.EventBus;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

import top.zibin.luban.CompressionPredicate;
import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;
import www.shdy.R;
import www.shdy.base.BaseMvpActivity;
import www.shdy.entity.EventHomeBean;
import www.shdy.mvp.presenter.HomePresenter;
import www.shdy.utils.AppUser;
import www.shdy.utils.Dolas;




public class HomeActivity extends BaseMvpActivity {
    @Bind(R.id.vp_content)
    ViewPager vpContent;
    @Bind(R.id.bbl)
    BottomBarLayout bbl;
    @Bind(R.id.relative)
    RelativeLayout relative;
    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<LocalMedia> selectList;
    private String base64_images;
    private int viewPageCum;

    private String uid;

    @Override
    protected HomePresenter onLoadPresenter() {
        return new HomePresenter();
    }

    @Override
    protected int getLayoutResource() {

        return R.layout.activity_home;
    }


    @Override
    protected void onInitialization(Bundle bundle) {
        //  initToolBar(mToolbar, "登录");

        relative.setPadding(0, 0, 0, getNavbarHeight());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EventBus.getDefault().register(this);

        uid = AppUser.getUserInfoBean().getUid();

//
//         mFragmentList.add(new HomeTwoFragment());


        vpContent.setAdapter(new MyAdapter(getSupportFragmentManager()));
        bbl.setViewPager(vpContent);
        vpContent.setOffscreenPageLimit(4);
        bbl.setSmoothScroll(true);

        bbl.setUnread(0, 0);//设置第一个页签的未读数为20
        bbl.setUnread(0, 0);//设置第二个页签的未读数
        bbl.setUnread(0, 0);//设置第二个页签的未读数
        bbl.setUnread(0, 0);//设置第二个页签的未读数


        bbl.getBottomItem(4);



    }

    public void setpages() {
        vpContent.setCurrentItem(1);
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case PictureConfig.CHOOSE_REQUEST:
                    // 图片、视频、音频选择结果回调
                    selectList = PictureSelector.obtainMultipleResult(data);
                    for (LocalMedia media : selectList) {

                        String path = media.getCompressPath();

                        Luban.with(this).load(path).ignoreBy(50).filter(new CompressionPredicate() {
                            @Override
                            public boolean apply(String path) {
                                return !(TextUtils.isEmpty(path) || path.toLowerCase().endsWith(".gif"));
                            }
                        }).setCompressListener(new OnCompressListener() {
                            @Override
                            public void onStart() {

                                Dolas.Doals(HomeActivity.this);
                            }

                            @Override
                            public void onSuccess(File file) {

                                Dolas.DoalsDimess(HomeActivity.this);

                                Logger.e("压缩成功后的图片路径 ：："+file.getPath());
                                String filepath = file.getPath();

                                //base64_images = PictureUtil.imageToBase64(filepath);

                                if (file != null) {

                                    EventHomeBean eventHomeBean = new EventHomeBean(filepath, filepath);

                                    //发送粘性事件
                                    EventBus.getDefault().postSticky(eventHomeBean);
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                Dolas.DoalsDimess(HomeActivity.this);
                            }
                        }).launch();



                    }


                    // 例如 LocalMedia 里面返回三种path
                    // 1.media.getPath(); 为原图path
                    // 2.media.getCutPath();为裁剪后path，需判断media.isCut();是否为true  注意：音视频除外
                    // 3.media.getCompressPath();为压缩后path，需判断media.isCompressed();是否为true  注意：音视频除外
                    // 如果裁剪并压缩了，以取压缩路径为准，因为是先裁剪后压缩的
                    //adapter.setList(selectList);
                    // adapter.notifyDataSetChanged();
                    break;
            }
        }


        //分享回调
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);


    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void onResume() {

        if (viewPageCum > 0 && viewPageCum == 1) {

            vpContent.setCurrentItem(2);

            viewPageCum = 0;
        }


        super.onResume();


    }

    //mainactivity返回桌面代码
    @Override
    public void onBackPressed() {
        Intent home = new Intent(Intent.ACTION_MAIN);
        home.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        home.addCategory(Intent.CATEGORY_HOME);
        startActivity(home);

    }









}
