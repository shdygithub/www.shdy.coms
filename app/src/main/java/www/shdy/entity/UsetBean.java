package www.shdy.entity;

/**
 * Created by Administrator on 2019/1/19 0019
 * <p>
 * Describe:
 */
public class UsetBean {


    /**
     * code : 1
     * msg : success
     * data : {"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","username":"155****3812","points":"0","uid":"85"}
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
         * avatar : http://lx.beijingliuxue.com/res/images/mobile_180x180.png
         * username : 155****3812
         * points : 0
         * uid : 85
         */

        private String avatar;
        private String username;
        private String points;
        private String uid;

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

}
