package www.shdy.utils;

import android.text.TextUtils;



import www.shdy.ShdyApplication;
import www.shdy.entity.LogginBean;
import www.shdy.entity.LogginsBean;

/**

 * Describe：用户工具类
 */

public class AppUser {

    private static LogginsBean logginBean;

    public static void init() {
        String userInfo = SPUtils.getString(ShdyApplication.getInstance().getApplicationContext(), "userInfo", "");
        if (!TextUtils.isEmpty(userInfo)) {
            logginBean = GsonUtil.newGson().fromJson(userInfo, LogginsBean.class);
        }
    }

    public static LogginsBean getUserInfoBean() {
        if (logginBean == null) {
            return GsonUtil.newGson().fromJson("{}", LogginsBean.class);
        }
        return logginBean;
    }

    public static boolean isLogin() {
        return logginBean != null;
    }


    /**
     * 登录成功时调用
     * @param logginBean
     */
    public static void login(LogginsBean logginBean) {
        setUserInfo(logginBean);
    }

    /**
     * 刷新用户信息时调用
     * @param logginBean
     */
    public static void setUserInfo(LogginsBean logginBean) {
        AppUser.logginBean = logginBean;
        SPUtils.putString(ShdyApplication.getInstance().getApplicationContext(), "userInfo", GsonUtil.newGson().toJson(logginBean));
    }

    /**
     * 注销时调用
     */
    public static void logout() {
        logginBean = null;
        SPUtils.removeByKey(ShdyApplication.getInstance().getApplicationContext(), "userInfo");
    }

}
