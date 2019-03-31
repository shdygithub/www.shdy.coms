package www.shdy.entity;

public class RegisterBean {

    /**
     * code : 1
     * data : {"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","uesr_id":"73","username":"157****1345"}
     * info : 注册成功
     */

    private int code;

    private String info;


    public int getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

         /**
         * avatar : http://lx.beijingliuxue.com/res/images/mobile_180x180.png
         * uesr_id : 73
         * username : 157****1345
         */

        private String avatar;
        private String uesr_id;
        private String username;

        public String getAvatar() {
            return avatar;
        }


        public String getUesr_id() {
            return uesr_id;
        }



        public String getUsername() {
            return username;
        }


}
