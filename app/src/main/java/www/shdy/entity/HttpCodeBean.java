package www.shdy.entity;

public class HttpCodeBean {


    /**
     * code : 200
     * remark : 请求成功
     * result : {"validateCode":"400602","info":"success"}
     * pageInfo : null
     */

    private int code;
    private String remark;

    private String pageInfo;

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

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
    }


        /**
         * validateCode : 400602
         * info : success
         */

        private String validateCode;
        private String info;

        public String getValidateCode() {
            return validateCode;
        }

        public void setValidateCode(String validateCode) {
            this.validateCode = validateCode;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

}
