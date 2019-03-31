package www.shdy.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/12/26 0026
 * <p>
 * Describe:
 */
public class KnowledgeItemBean {


    /**
     * code : 1
     * data : {"circle":{"addtime":"2018.08.29","big_image":"http://lx.beijingliuxue.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","describe":"捷库接口就考虑接口都聚隆科技离开；家里；的老怕我了；到怕我ID老怕我ID老怕我iopdi   打我的娃大无哇多安慰 的哇打我哇大无大无大无大无","title":"备孕交流圈"},"comment":[{"addtime":"2018-12-25","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"3werefrgg","uid":"65","username":"159****4102"},{"addtime":"2018-12-25","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"45667","uid":"65","username":"159****4102"},{"addtime":"2018-12-25","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"333333","uid":"65","username":"159****4102"},{"addtime":"2018-12-24","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"4243242432424324243242432424324243242432424324243242432424324243242432424324243242432424324243242432424324243242432424324243242432","uid":"65","username":"159****4102"},{"addtime":"2018-12-24","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"测试评论1","uid":"65","username":"159****4102"}],"comment_count":5,"pages":2}
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

    public List<CircleBean> getCircleBeanList() {
        return circleBeanList;
    }

    public void setCircleBeanList(List<CircleBean> circleBeanList) {
        this.circleBeanList = circleBeanList;
    }

    public KnowledgeItemBean(List<CircleBean> circleBeanList) {
        this.circleBeanList = circleBeanList;
    }

    /**
     * circle : {"addtime":"2018.08.29","big_image":"http://lx.beijingliuxue.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","describe":"捷库接口就考虑接口都聚隆科技离开；家里；的老怕我了；到怕我ID老怕我ID老怕我iopdi   打我的娃大无哇多安慰 的哇打我哇大无大无大无大无","title":"备孕交流圈"}
     * comment : [{"addtime":"2018-12-25","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"3werefrgg","uid":"65","username":"159****4102"},{"addtime":"2018-12-25","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"45667","uid":"65","username":"159****4102"},{"addtime":"2018-12-25","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"333333","uid":"65","username":"159****4102"},{"addtime":"2018-12-24","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"4243242432424324243242432424324243242432424324243242432424324243242432424324243242432424324243242432424324243242432424324243242432","uid":"65","username":"159****4102"},{"addtime":"2018-12-24","avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","title":"测试评论1","uid":"65","username":"159****4102"}]
     * comment_count : 5
     * pages : 2
     */
    private List<CircleBean> circleBeanList;
    private CircleBean circle;
    private int comment_count;
    private int pages;
    private List<CommentBean> comment;

    public CircleBean getCircle() {
        return circle;
    }

    public void setCircle(CircleBean circle) {
        this.circle = circle;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<CommentBean> getComment() {
        return comment;
    }

    public void setComment(List<CommentBean> comment) {
        this.comment = comment;
    }

    public static class CircleBean {
        /**
         * addtime : 2018.08.29
         * big_image : http://lx.beijingliuxue.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg
         * describe : 捷库接口就考虑接口都聚隆科技离开；家里；的老怕我了；到怕我ID老怕我ID老怕我iopdi   打我的娃大无哇多安慰 的哇打我哇大无大无大无大无
         * title : 备孕交流圈
         */

        private String addtime;
        private String big_image;
        private String describe;
        private String title;

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getBig_image() {
            return big_image;
        }

        public void setBig_image(String big_image) {
            this.big_image = big_image;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class CommentBean {
        /**
         * addtime : 2018-12-25
         * avatar : http://lx.beijingliuxue.com/res/images/mobile_180x180.png
         * title : 3werefrgg
         * uid : 65
         * username : 159****4102
         */

        private String addtime;
        private String avatar;
        private String title;
        private String uid;
        private String username;

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
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

}
