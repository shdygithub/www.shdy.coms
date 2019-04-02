package www.shdy.entity;

public class WeixPhoneBean {


    /**
     * code : 200
     * remark : 请求成功
     * result : {"info":"success"}
     * pageInfo : null
     */

    private int code;
    private String remark;

    private Object pageInfo;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



    public Object getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Object pageInfo) {
        this.pageInfo = pageInfo;
    }


        /**
         * info : success
         */

        private String info;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
}
