package www.shdy.https;

import android.content.Context;
import android.text.TextUtils;

import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import www.shdy.utils.MD5Util;
import www.shdy.utils.TimeUtils;

/**

 * @Describe：缓存拦截器
 */
public class CacheInterceptor implements Interceptor {

    private Context context;

    public CacheInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request.Builder requestBuilder = originalRequest.newBuilder();

        //如果需要在请求服务器之前做一些操作, 则重新构建一个做过操作的 Request 并 return, 如增加 Header、Params 等请求信息, 不做操作则直接返回参数 request
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");// HH:mm:ss
        //获取当前时间
        Date date = new Date(System.currentTimeMillis());
        //转换成时间戳
        String currentTime = TimeUtils.getCurrentTime(simpleDateFormat.format(date));
        int num = TimeUtils.getNum(10000);
        try {
            //value值  时间戳，随机数 token,参数 MD5加密之后==signature；
            String md5Str = MD5Util.getMD5Str(currentTime + num + "1" + "1");
            String  tokenId="timeStamp:"+currentTime+","+"nonce:"+num+","+"token:"+"1"+","+"signature:"+md5Str+"body"+"1";


            Logger.i("Header"+tokenId);
            requestBuilder.addHeader("Authorization",tokenId);
        } catch (Exception e) {
            e.printStackTrace();
        }




        Request request = requestBuilder.build();
        Response response = chain.proceed(request);
        if (NetUtils.isNetworkAvailable(context)) {
            // 有网络时 设置缓存超时时间0个小时
            int maxAge = 0;
            // 如果单个请求不同请在请求中写上Cache-control头则按照对应的配置进行本地缓存时间配置
            String cacheControl = request.cacheControl().toString();
            if (TextUtils.isEmpty(cacheControl)) {
                return response.newBuilder()
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        //清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                        .removeHeader("Pragma")
                        .build();
            } else {
                return response.newBuilder()
                        .header("Cache-Control", cacheControl)
                        //清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                        .removeHeader("Pragma")
                        .build();
            }
        } else {
            // 无网络时，设置超时为1周
            int maxStale = 60 * 60 * 24 * 7;
            return response.newBuilder()
                    //清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                    .removeHeader("Pragma")
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                    .build();
        }
    }
}
