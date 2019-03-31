package www.shdy.https;

/**

 * @describe: 网络请求的实体基类
 */
public class HttpResult<T> extends BaseResponse {

    public int code;

    private String info;

    private T data;

    public String getMsg() {
        return info;
    }

    public int getCode() {
        return code;
    }

    /**
     * 连接服务器是否成功
     *
     * @return
     */
    public boolean isHttpSuccess() {
        return code ==1;
    }

    public T getData() {
        return data;
    }

}
