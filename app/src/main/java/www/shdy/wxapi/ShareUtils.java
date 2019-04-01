package www.shdy.wxapi;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.kongzue.baseokhttp.HttpRequest;
import com.kongzue.baseokhttp.listener.ResponseListener;
import com.kongzue.baseokhttp.util.Parameter;
import com.orhanobut.logger.Logger;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

import www.shdy.entity.ShareUtilBean;
import www.shdy.utils.AppUser;

import static www.shdy.config.API.ShareApi;

public class ShareUtils {
    public static boolean 分享 = false;

    private static Context context;
    private static String uid;

    /**
     * 分享链接
     */


    private static void loadData( String shareid, String type) {
      //  uid = AppUser.getUserInfoBean().getUid();
        HttpRequest.POST(context, ShareApi, new Parameter()
                        .add("uid", uid)
                        .add("share_type", type)
                        .add("share_id", shareid)
                , new ResponseListener() {
                    @Override
                    public void onResponse(String response, Exception error) {
                        if (error == null) {

                            Logger.i(">>>分享接口" + response);

                            Gson gson = new Gson();
                            ShareUtilBean shareUtilBean = gson.fromJson(response, ShareUtilBean.class);

                            int beanCode = shareUtilBean.getCode();

                            ShareUtilBean.DataBean data = shareUtilBean.getData();

                            if (beanCode == 1 && data != null) {


                                Logger.i(">>>分享接口请求成功"+data.getMessage());

                            } else {


                            }


                        } else {
                            Toast.makeText(context, "请求失败", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }

    public static void shareWeb(final Activity activity, String WebUrl, String title, String description, String imageUrl, int imageID, SHARE_MEDIA platform,
                                final String shareid, final String type) {

        context = activity;
        UMWeb web = new UMWeb(WebUrl);//连接地址
        web.setTitle(title);//标题
        web.setDescription(description);//描述
        if (TextUtils.isEmpty(imageUrl)) {
            web.setThumb(new UMImage(activity, imageID));  //本地缩略图
        } else {
            web.setThumb(new UMImage(activity, imageUrl));  //网络缩略图
        }
        new ShareAction(activity)
                .setPlatform(platform)
                .withMedia(web)
                .setCallback(new UMShareListener() {
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {

                        Logger.i(">>>分享" + share_media);
                    }

                    @Override
                    public void onResult(final SHARE_MEDIA share_media) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (share_media.name().equals("WEIXIN_FAVORITE")) {
                                    Toast.makeText(activity, share_media + " 收藏成功", Toast.LENGTH_SHORT).show();

                                    Logger.i(">>>分享成功 微信");

                                    loadData(shareid,type);

                                } else {
                                    Toast.makeText(activity, share_media + " 分享成功", Toast.LENGTH_SHORT).show();


                                    Logger.i(">>>分享成功2");


                                    loadData(shareid,type);


                                }
                            }
                        });
                    }

                    @Override
                    public void onError(final SHARE_MEDIA share_media, final Throwable throwable) {
                        if (throwable != null) {
                            Log.d("throw", "throw:" + throwable.getMessage());
                        }
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(activity, share_media + " 分享失败", Toast.LENGTH_SHORT).show();

                            }
                        });
                    }

                    @Override
                    public void onCancel(final SHARE_MEDIA share_media) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(activity, share_media + " 分享取消", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                })
                .share();


    }
}
