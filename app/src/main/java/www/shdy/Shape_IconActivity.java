package www.shdy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import butterknife.Bind;

import www.shdy.base.BaseActivity;
import www.shdy.mvp.viewUi.activity.MainActivity;


public class Shape_IconActivity extends BaseActivity {

    @Bind(R.id.constraint)
    LinearLayout constraint;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_shape__icon;
    }

    @Override
    protected void onInitialization(Bundle bundle) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        constraint.setPadding(0, 0, 0, getNavbarHeight());


        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);


                    Intent intent = new Intent(Shape_IconActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }





}
