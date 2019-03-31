package www.shdy.base;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;

import com.jaeger.library.StatusBarUtil;

import com.zhy.http.okhttp.OkHttpUtils;

import butterknife.ButterKnife;
import www.shdy.R;
import www.shdy.utils.AppManager;

/**
 *
 * @author Mr.HanWenrui
 */
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * 当前页码
     */
    protected int currentpage = 1;

    /**
     * 页面数据量
     */
    protected int pageSize = 20;

    protected abstract int getLayoutResource();

    protected abstract void onInitialization(Bundle bundle);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
        StatusBarUtil.setTranslucent(this);
        //StatusBarUtil.setColor(this, getResources().getColor(R.color.common_main));
        AppManager.getAppManager().addActivity(this);
        if (getLayoutResource() != 0) {
            setContentView(getLayoutResource());
            ButterKnife.bind(this);
        }
        onInitialization(savedInstanceState);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        OkHttpUtils.getInstance().cancelTag(this);
        AppManager.getAppManager().finishActivity(this);
    }


    public int setToolBar(Toolbar toolbar, boolean isChangeToolbar, boolean isChangeStatusBar, DrawerLayout drawerLayout) {
        int vibrantColor = Color.TRANSPARENT;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(Color.BLACK);
        }
        if (isChangeToolbar) {
            toolbar.setBackgroundColor(vibrantColor);
        }
        if (isChangeStatusBar) {
            StatusBarUtil.setColor(this, vibrantColor);
        }
        if (drawerLayout != null) {
            StatusBarUtil.setColorForDrawerLayout(this, drawerLayout, vibrantColor);
        }
        return vibrantColor;
    }

    protected void initToolBar(Toolbar toolbar, String title) {
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.common_main)));
                //设置显示返回上一级的图标
                actionBar.setDisplayHomeAsUpEnabled(true);
                //设置标题
                actionBar.setTitle(title);
                actionBar.setDisplayShowCustomEnabled(true);
                //设置标题栏字体颜色
                toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
                //toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.abc_ic_ab_back_mtrl_am_alpha));
            }
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
       // MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
       // MobclickAgent.onPause(this);
    }

    //获取底栏高度
    public int getNavbarHeight() {
        int rootHeight = getRootHeight();
        int navbarHeight = rootHeight - getWindowManager().getDefaultDisplay().getHeight();
        if (navbarHeight < 0) navbarHeight = 0;
        return navbarHeight;
    }

    //获取真实的屏幕高度，注意判断非0
    public int getRootHeight() {
        int diaplayHeight = 0;
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            display.getRealSize(point);
            diaplayHeight = point.y;
        } else {
            DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);
            diaplayHeight = dm.heightPixels; //得到高度```
        }
        return diaplayHeight;
    }
}
