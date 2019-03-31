package www.shdy.entity;

public class LogginBean {

    /**
     * code : 1
     * data : {"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","uid":"84","username":"155****3812"}
     * info : 登录成功
     */

        /**
         * avatar : http://lx.beijingliuxue.com/res/images/mobile_180x180.png
         * uid : 84
         * username : 155****3812
         */

        private String avatar;
        private String uid;
        private String username;

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

}
