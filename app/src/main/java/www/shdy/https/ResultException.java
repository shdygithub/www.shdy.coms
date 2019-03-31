package www.shdy.https;

/**
 * Created by Administrator on 2016/12/15.
 */

public class ResultException extends RuntimeException{
    private int Code;
    private String msg;


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;


    public ResultException(int Code,String msg,String info){
        super();
        this.Code = Code;
        this.msg = msg;
        this.info=info;
    }

    public int getCode() {
        return Code;
    }

    public String getMsg(){
        return msg;
    }
}
