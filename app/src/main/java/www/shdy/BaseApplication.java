package www.shdy;

import android.app.Application;



/**
 * Created by Administrator on 2019/2/27 0027
 * <p>
 * Describe:
 */
public class BaseApplication extends Application {


    private static BaseApplication ourInstance;

    public static BaseApplication getInstance() {

        return ourInstance;
    }


}
