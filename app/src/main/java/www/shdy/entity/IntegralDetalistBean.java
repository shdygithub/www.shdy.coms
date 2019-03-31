package www.shdy.entity;

import java.util.List;

public class IntegralDetalistBean {


    /**
     * msg : success
     * code : 1
     * data : {"channel":[{"integral":"10","remark":"邀请1人，注册成功，即可有积分奖励哦","title":"邀请好友使用APP？"}],"total_score":"0"}
     */

    private String msg;
    private int code;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }




        /**
         * channel : [{"integral":"10","remark":"邀请1人，注册成功，即可有积分奖励哦","title":"邀请好友使用APP？"}]
         * total_score : 0
         */

        private String total_score;
        private List<ChannelBean> channel;

        public String getTotal_score() {
            return total_score;
        }

        public void setTotal_score(String total_score) {
            this.total_score = total_score;
        }

        public List<ChannelBean> getChannel() {
            return channel;
        }

        public void setChannel(List<ChannelBean> channel) {
            this.channel = channel;
        }

        public static class ChannelBean {
            /**
             * integral : 10
             * remark : 邀请1人，注册成功，即可有积分奖励哦
             * title : 邀请好友使用APP？
             */

            private String integral;
            private String remark;
            private String title;

            public String getIntegral() {
                return integral;
            }

            public void setIntegral(String integral) {
                this.integral = integral;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

}
