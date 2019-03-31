package www.shdy.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/12/25 0025
 * <p>
 * Describe:
 */
public class KnowledgeBean {
    /**
     * code : 1
     * msg : success
     * data : {"circle":[{"id":"20","title":"健康管理师证书的含金量","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg","addtime":"2019.01.17"},{"id":"19","title":"健康管理师考几科","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117101753YtuQ2P.jpg","addtime":"2019.01.17"},{"id":"18","title":"健康管理师有用吗","thumb":"","addtime":"2019.01.16"},{"id":"17","title":"数学考什么","thumb":"","addtime":"2019.01.16"},{"id":"16","title":"逻辑学什么","thumb":"","addtime":"2019.01.16"},{"id":"15","title":"如何提高学习效率","thumb":"","addtime":"2019.01.16"},{"id":"14","title":"dwadwa","thumb":"","addtime":"2019.01.16"},{"id":"13","title":"dwadwa","thumb":"","addtime":"2019.01.16"},{"id":"12","title":"dwadwa","thumb":"","addtime":"2019.01.16"},{"id":"11","title":"金夫子教育圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/201809191708196zBRkS.png","addtime":"2018.08.31"},{"id":"10","title":"宝宝地带","thumb":"http://www.yzls.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","addtime":"2018.08.31"},{"id":"9","title":"母婴用品圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170933nkc6MJ.png","addtime":"2018.08.31"},{"id":"8","title":"喂养大本营","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170958tgonie.png","addtime":"2018.08.31"},{"id":"7","title":"育儿圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170744n3T6jb.png","addtime":"2018.08.31"},{"id":"6","title":"宝宝取名圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/21/20180921110035VPkX7v.jpg","addtime":"2018.08.31"},{"id":"5","title":"准妈妈圈","thumb":"https://att2.citysbs.com/hangzhou/2016/03/17/11/thumb_320x320-111523_v2_15931458184523986_0c468c8b6703a428822909a64f2acba7.jpg","addtime":"2018.08.31"}],"pages":2,"categorys":[{"id":"8888","title":"全部"},{"id":"4","title":"职业考试"},{"id":"3","title":"留学"},{"id":"2","title":"研究生"},{"id":"1","title":"专科本科"}]}
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
         * circle : [{"id":"20","title":"健康管理师证书的含金量","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg","addtime":"2019.01.17"},{"id":"19","title":"健康管理师考几科","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117101753YtuQ2P.jpg","addtime":"2019.01.17"},{"id":"18","title":"健康管理师有用吗","thumb":"","addtime":"2019.01.16"},{"id":"17","title":"数学考什么","thumb":"","addtime":"2019.01.16"},{"id":"16","title":"逻辑学什么","thumb":"","addtime":"2019.01.16"},{"id":"15","title":"如何提高学习效率","thumb":"","addtime":"2019.01.16"},{"id":"14","title":"dwadwa","thumb":"","addtime":"2019.01.16"},{"id":"13","title":"dwadwa","thumb":"","addtime":"2019.01.16"},{"id":"12","title":"dwadwa","thumb":"","addtime":"2019.01.16"},{"id":"11","title":"金夫子教育圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/201809191708196zBRkS.png","addtime":"2018.08.31"},{"id":"10","title":"宝宝地带","thumb":"http://www.yzls.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","addtime":"2018.08.31"},{"id":"9","title":"母婴用品圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170933nkc6MJ.png","addtime":"2018.08.31"},{"id":"8","title":"喂养大本营","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170958tgonie.png","addtime":"2018.08.31"},{"id":"7","title":"育儿圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170744n3T6jb.png","addtime":"2018.08.31"},{"id":"6","title":"宝宝取名圈","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/21/20180921110035VPkX7v.jpg","addtime":"2018.08.31"},{"id":"5","title":"准妈妈圈","thumb":"https://att2.citysbs.com/hangzhou/2016/03/17/11/thumb_320x320-111523_v2_15931458184523986_0c468c8b6703a428822909a64f2acba7.jpg","addtime":"2018.08.31"}]
         * pages : 2
         * categorys : [{"id":"8888","title":"全部"},{"id":"4","title":"职业考试"},{"id":"3","title":"留学"},{"id":"2","title":"研究生"},{"id":"1","title":"专科本科"}]
         */

        private int pages;
        private List<CircleBean> circle;
        private List<CategorysBean> categorys;

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public List<CircleBean> getCircle() {
            return circle;
        }

        public void setCircle(List<CircleBean> circle) {
            this.circle = circle;
        }

        public List<CategorysBean> getCategorys() {
            return categorys;
        }

        public void setCategorys(List<CategorysBean> categorys) {
            this.categorys = categorys;
        }

        public static class CircleBean {
            /**
             * id : 20
             * title : 健康管理师证书的含金量
             * thumb : http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg
             * addtime : 2019.01.17
             */

            private String id;
            private String title;
            private String thumb;
            private String addtime;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }
        }

        public static class CategorysBean {
            /**
             * id : 8888
             * title : 全部
             */

            private String id;
            private String title;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

    }


//
//    /**
//     * msg : success
//     * code : 1
//     * data : {"pages":2,"circle":[{"thumb":"http://www.jingfuzi.com/uploadfile/2018/09/21/20180921105958HxodPU.jpg","addtime":"2018.08.29","id":"1","title":"备孕交流圈"}]}
//     */
//
//    private String msg;
//    private int code;
//
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
//
//        /**
//         * pages : 2
//         * circle : [{"thumb":"http://www.jingfuzi.com/uploadfile/2018/09/21/20180921105958HxodPU.jpg","addtime":"2018.08.29","id":"1","title":"备孕交流圈"}]
//         */
//
//        private int pages;
//        private List<CircleBean> circle;
//
//        public int getPages() {
//            return pages;
//        }
//
//        public void setPages(int pages) {
//            this.pages = pages;
//        }
//
//        public List<CircleBean> getCircle() {
//            return circle;
//        }
//
//        public void setCircle(List<CircleBean> circle) {
//            this.circle = circle;
//        }
//
//        public static class CircleBean {
//            /**
//             * thumb : http://www.jingfuzi.com/uploadfile/2018/09/21/20180921105958HxodPU.jpg
//             * addtime : 2018.08.29
//             * id : 1
//             * title : 备孕交流圈
//             */
//
//            private String thumb;
//            private String addtime;
//            private String id;
//            private String title;
//
//            public String getThumb() {
//                return thumb;
//            }
//
//            public void setThumb(String thumb) {
//                this.thumb = thumb;
//            }
//
//            public String getAddtime() {
//                return addtime;
//            }
//
//            public void setAddtime(String addtime) {
//                this.addtime = addtime;
//            }
//
//            public String getId() {
//                return id;
//            }
//
//            public void setId(String id) {
//                this.id = id;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public void setTitle(String title) {
//                this.title = title;
//            }
//        }


}
