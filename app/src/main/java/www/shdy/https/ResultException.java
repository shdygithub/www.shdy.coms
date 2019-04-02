package www.shdy.https;

/**
 * Created by Administrator on 2016/12/15.
 */

public class ResultException extends RuntimeException{
    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ResultException(int code, String msg, String result, String info) {
        Code = code;
        this.msg = msg;
        this.result = result;
        this.info = info;
    }

    private int Code;
    private String msg;
    private String result;
    private String info;


}
