package www.shdy.https;

import android.content.Context;

import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import www.shdy.utils.MD5Util;
import www.shdy.utils.TimeUtils;

public class CacheInterceptotHeader implements Interceptor {
    private Context context;
    public CacheInterceptotHeader(Context context) {
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
        return response.newBuilder().build();
    }
}
