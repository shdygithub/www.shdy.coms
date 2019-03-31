package www.shdy.entity;

/**
 * Created by Administrator on 2019/1/7 0007
 * <p>
 * Describe:
 */
public class UpImage {


    /**
     * code : 1
     * data : {"name":"201901141410415260586.jpeg","path":"http://lx.beijingliuxue.com/uploadfile/2019/01/14/"}
     * msg : success
     */

    private int code;
     private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


        /**
         * name : 201901141410415260586.jpeg
         * path : http://lx.beijingliuxue.com/uploadfile/2019/01/14/
         */

        private String name;
        private String path;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

}
