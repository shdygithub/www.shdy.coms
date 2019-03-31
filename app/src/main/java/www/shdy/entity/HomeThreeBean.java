package www.shdy.entity;

import java.util.List;

/**
 * Created by Administrator on 2019/1/15 0015
 * <p>
 * Describe:
 */
public class HomeThreeBean {
    /**
     * __name : root
     * data : {"nation":[{"lid":"3367","name":"自考","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/19/20190219100603DBmHoi.png"},{"lid":"3368","name":"职业资格证","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/19/201902191007192QUKBS.png"},{"lid":"3369","name":"管理类联考","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/16/201901160939076QHrl3.png"},{"name":"错题库","thumb":"http://lx.beijingliuxue.com/uploadfile/errorbank.jpg"}]}
     * msg : success
     */

    private String __name;

    private String msg;

    public String get__name() {
        return __name;
    }

    public void set__name(String __name) {
        this.__name = __name;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


        private List<NationBean> nation;

        public List<NationBean> getNation() {
            return nation;
        }

        public void setNation(List<NationBean> nation) {
            this.nation = nation;
        }

        public static class NationBean {
            /**
             * lid : 3367
             * name : 自考
             * thumb : http://lx.beijingliuxue.com/uploadfile/2019/02/19/20190219100603DBmHoi.png
             */

            private String lid;
            private String name;
            private String thumb;

            public String getLid() {
                return lid;
            }

            public void setLid(String lid) {
                this.lid = lid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

    }


//    /**
//     * msg : success
//     * code : 1
//     * data : {"mn_num":"0","jd_id":61,"dy_num":"2","mn_id":62,"dy_id":60,"jd_num":"0"}
//     */
//
//    private String msg;
//    private int code;
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//
//
//        /**
//         * mn_num : 0
//         * jd_id : 61
//         * dy_num : 2
//         * mn_id : 62
//         * dy_id : 60
//         * jd_num : 0
//         */
//
//        private String mn_num;
//        private int jd_id;
//        private String dy_num;
//        private int mn_id;
//        private int dy_id;
//        private String jd_num;
//
//        public String getMn_num() {
//            return mn_num;
//        }
//
//        public void setMn_num(String mn_num) {
//            this.mn_num = mn_num;
//        }
//
//        public int getJd_id() {
//            return jd_id;
//        }
//
//        public void setJd_id(int jd_id) {
//            this.jd_id = jd_id;
//        }
//
//        public String getDy_num() {
//            return dy_num;
//        }
//
//        public void setDy_num(String dy_num) {
//            this.dy_num = dy_num;
//        }
//
//        public int getMn_id() {
//            return mn_id;
//        }
//
//        public void setMn_id(int mn_id) {
//            this.mn_id = mn_id;
//        }
//
//        public int getDy_id() {
//            return dy_id;
//        }
//
//        public void setDy_id(int dy_id) {
//            this.dy_id = dy_id;
//        }
//
//        public String getJd_num() {
//            return jd_num;
//        }
//
//        public void setJd_num(String jd_num) {
//            this.jd_num = jd_num;
//        }





}
