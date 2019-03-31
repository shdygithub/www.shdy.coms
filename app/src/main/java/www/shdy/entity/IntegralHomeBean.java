package www.shdy.entity;

import java.util.List;

public class IntegralHomeBean {


    /**
     * code : 1
     * data : {"integral":[{"id":"2","integral":"56","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png","title":"测试商品2"},{"id":"1","integral":"123","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","title":"测试商品1"}],"page":2}
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
         * integral : [{"id":"2","integral":"56","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png","title":"测试商品2"},{"id":"1","integral":"123","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","title":"测试商品1"}]
         * page : 2
         */
        private int page;
        private List<IntegralBean> integral;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public List<IntegralBean> getIntegral() {
            return integral;
        }

        public void setIntegral(List<IntegralBean> integral) {
            this.integral = integral;
        }

        public static class IntegralBean {
            /**
             * id : 2
             * integral : 56
             * thumb : http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png
             * title : 测试商品2
             */

            private String id;
            private String integral;
            private String thumb;
            private String title;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIntegral() {
                return integral;
            }

            public void setIntegral(String integral) {
                this.integral = integral;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

}
