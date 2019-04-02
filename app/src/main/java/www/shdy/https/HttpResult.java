package www.shdy.https;

/**

 * @describe: 网络请求的实体基类
 */
public class HttpResult<T> extends BaseResponse {

    public int code;

    private String info;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String remark;

    private T result;



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
        return code ==200;
    }

    public T getData() {
        return result;
    }

}
