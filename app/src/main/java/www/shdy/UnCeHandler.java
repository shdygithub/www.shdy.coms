package www.shdy;

import android.os.Looper;


import com.hjq.toast.ToastUtils;
import com.orhanobut.logger.Logger;
import com.tencent.bugly.crashreport.CrashReport;

import www.shdy.utils.AppManager;


/**
 * 作者： ${} on 2018/10/31.
 */

public class UnCeHandler implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler mDefaultHandler;
    public static final String TAG = "CatchExcep";
    private ShdyApplication mContext;

    public UnCeHandler(ShdyApplication application) {
        //获取系统默认的UncaughtException处理器
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.mContext = application;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        if (!handleException(ex) && mDefaultHandler != null) {
            //如果用户没有处理则让系统默认的异常处理器来处理
            mDefaultHandler.uncaughtException(thread, ex);
        } else {
            CrashReport.postCatchedException(ex);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Logger.e(TAG, "error : --> " + e);
            }

            // 关闭所有Ac
            AppManager.getAppManager().finishAllActivity();

          //  Intent intent = new Intent(mContext, MainActivity.class);
           // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
          //  mContext.startActivity(intent);
//             //退出程序
//            AlarmManager mgr = (AlarmManager)mContext.getSystemService(Context.ALARM_SERVICE);
//                mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 1000, ); // 1秒钟后重启应用

            System.exit(0);// 关闭已奔溃的app进程




        }
    }

    /**
     * 自定义错误处理,收集错误信息 发送错误报告等操作均在此完成.
     *
     * @param ex
     * @return true:如果处理了该异常信息;否则没有处理返回false.
     */
    private boolean handleException(Throwable ex) {
        if (ex == null) {
            return false;
        }
        //使用Toast来显示异常信息
        new Thread() {
            @Override
            public void run() {
                Looper.prepare();
                ToastUtils.show("很抱歉,程序出现异常,即将退出.");
                Looper.loop();
            }
        }.start();
        return true;
    }
}
