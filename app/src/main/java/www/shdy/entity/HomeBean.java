package www.shdy.entity;

import java.util.List;

public class HomeBean {
    /**
     * code : 1
     * data : {"categorys":[{"id":888888,"pid":0,"son":[],"thumb":"","title":"全部"},{"id":"4","pid":"","son":[{"id":"14","pid":"4","thumb":"","title":"职业考试子类2"},{"id":"11","pid":"4","thumb":"","title":"职业考试子类"}],"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/26/20190226150810G4VUKR.png","title":"职业考试"},{"id":"3","pid":"","son":[{"id":"13","pid":"3","thumb":"","title":"留学子类2"},{"id":"10","pid":"3","thumb":"","title":"留学子类"}],"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/26/20190226150754oMv3Sl.png","title":"留学"},{"id":"2","pid":"","son":[{"id":"8","pid":"2","thumb":"","title":"采购管理"},{"id":"7","pid":"2","thumb":"","title":"工程管理"},{"id":"6","pid":"2","thumb":"","title":"工商管理"},{"id":"5","pid":"2","thumb":"","title":"金融学"}],"thumb":"http://www.yzls.com/uploadfile/2019/02/26/201902261500578JaYo3.png","title":"研究生"},{"id":"1","pid":"","son":[{"id":"12","pid":"1","thumb":"","title":"专科本科子类2"},{"id":"9","pid":"1","thumb":"","title":"专科本科子类"}],"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/26/20190226150037LNw7ZU.png","title":"专科本科"}],"circle":[{"addtime":"2019-01-17 10:20","id":"20","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg","title":"健康管理师证书的含金量"},{"addtime":"2019-01-17 10:16","id":"19","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117101753YtuQ2P.jpg","title":"健康管理师考几科"},{"addtime":"2019-01-16 15:39","id":"18","thumb":"","title":"健康管理师有用吗"},{"addtime":"2019-01-16 15:27","id":"17","thumb":"","title":"数学考什么"}],"classes":[{"addtime":"2019-02-20 10:46","id":"9","price":"0.00","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png","title":"测试课程1"},{"addtime":"2019-02-18 13:54","id":"10","price":"0.01","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","title":"测试课程2"}],"ios_status":1,"question":[{"addtime":"2019-02-20 14:11","id":"76","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"66","uid":"65"},{"addtime":"2019-02-20 11:48","id":"75","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"nice","uid":"65"}],"thumbnail":["http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png"]}
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
         * categorys : [{"id":888888,"pid":0,"son":[],"thumb":"","title":"全部"},{"id":"4","pid":"","son":[{"id":"14","pid":"4","thumb":"","title":"职业考试子类2"},{"id":"11","pid":"4","thumb":"","title":"职业考试子类"}],"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/26/20190226150810G4VUKR.png","title":"职业考试"},{"id":"3","pid":"","son":[{"id":"13","pid":"3","thumb":"","title":"留学子类2"},{"id":"10","pid":"3","thumb":"","title":"留学子类"}],"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/26/20190226150754oMv3Sl.png","title":"留学"},{"id":"2","pid":"","son":[{"id":"8","pid":"2","thumb":"","title":"采购管理"},{"id":"7","pid":"2","thumb":"","title":"工程管理"},{"id":"6","pid":"2","thumb":"","title":"工商管理"},{"id":"5","pid":"2","thumb":"","title":"金融学"}],"thumb":"http://www.yzls.com/uploadfile/2019/02/26/201902261500578JaYo3.png","title":"研究生"},{"id":"1","pid":"","son":[{"id":"12","pid":"1","thumb":"","title":"专科本科子类2"},{"id":"9","pid":"1","thumb":"","title":"专科本科子类"}],"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/02/26/20190226150037LNw7ZU.png","title":"专科本科"}]
         * circle : [{"addtime":"2019-01-17 10:20","id":"20","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg","title":"健康管理师证书的含金量"},{"addtime":"2019-01-17 10:16","id":"19","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117101753YtuQ2P.jpg","title":"健康管理师考几科"},{"addtime":"2019-01-16 15:39","id":"18","thumb":"","title":"健康管理师有用吗"},{"addtime":"2019-01-16 15:27","id":"17","thumb":"","title":"数学考什么"}]
         * classes : [{"addtime":"2019-02-20 10:46","id":"9","price":"0.00","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png","title":"测试课程1"},{"addtime":"2019-02-18 13:54","id":"10","price":"0.01","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","title":"测试课程2"}]
         * ios_status : 1
         * question : [{"addtime":"2019-02-20 14:11","id":"76","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"66","uid":"65"},{"addtime":"2019-02-20 11:48","id":"75","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"nice","uid":"65"}]
         * thumbnail : ["http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png"]
         */

        private int ios_status;
        private List<CategorysBean> categorys;
        private List<CircleBean> circle;
        private List<ClassesBean> classes;
        private List<QuestionBean> question;
        private List<String> thumbnail;

        public int getIos_status() {
            return ios_status;
        }

        public void setIos_status(int ios_status) {
            this.ios_status = ios_status;
        }

        public List<CategorysBean> getCategorys() {
            return categorys;
        }

        public void setCategorys(List<CategorysBean> categorys) {
            this.categorys = categorys;
        }

        public List<CircleBean> getCircle() {
            return circle;
        }

        public void setCircle(List<CircleBean> circle) {
            this.circle = circle;
        }

        public List<ClassesBean> getClasses() {
            return classes;
        }

        public void setClasses(List<ClassesBean> classes) {
            this.classes = classes;
        }

        public List<QuestionBean> getQuestion() {
            return question;
        }

        public void setQuestion(List<QuestionBean> question) {
            this.question = question;
        }

        public List<String> getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(List<String> thumbnail) {
            this.thumbnail = thumbnail;
        }

        public static class CategorysBean {
            /**
             * id : 888888
             * pid : 0
             * son : []
             * thumb :
             * title : 全部
             */

            private int id;
            private String pid;
            private String thumb;
            private String title;
             private List<Son> son;
            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
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

            public List<Son> getSon() {
                return son;
            }

            public void setSon(List<Son> son) {
                this.son = son;
            }

            public static class Son {

                public Son(int id, String pid, String title) {
                    this.id = id;
                    this.pid = pid;
                    this.title = title;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                private int id;
                private String   pid;
                private String title;

                public boolean isColorChecked() {
                    return ColorChecked;
                }

                public void setColorChecked(boolean colorChecked) {
                    ColorChecked = colorChecked;
                }

                private boolean ColorChecked;
            }
        }

        public static class CircleBean {
            /**
             * addtime : 2019-01-17 10:20
             * id : 20
             * thumb : http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg
             * title : 健康管理师证书的含金量
             */

            private String addtime;
            private String id;
            private String thumb;
            private String title;

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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

        public static class ClassesBean {
            /**
             * addtime : 2019-02-20 10:46
             * id : 9
             * price : 0.00
             * thumb : http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png
             * title : 测试课程1
             */

            private String addtime;
            private String id;
            private String price;
            private String thumb;
            private String title;

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
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

        public static class QuestionBean {
            /**
             * addtime : 2019-02-20 14:11
             * id : 76
             * member : {"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"}
             * thumb :
             * title : 66
             * uid : 65
             */

            private String addtime;
            private String id;
            private MemberBean member;
            private String thumb;
            private String title;
            private String uid;

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public MemberBean getMember() {
                return member;
            }

            public void setMember(MemberBean member) {
                this.member = member;
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

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public static class MemberBean {
                /**
                 * avatar : http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg
                 * username : 晴天二柱子儿
                 */

                private String avatar;
                private String username;

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
            }

    }


    /**
     * code : 1
     * data : {"categorys":[{"id":888888,"pid":0,"son":[],"title":"全部"},{"id":"4","pid":"0","son":[{"id":"14","pid":"4","title":"职业考试子类2"},{"id":"11","pid":"4","title":"职业考试子类"}],"title":"职业考试"},{"id":"3","pid":"0","son":[{"id":"13","pid":"3","title":"留学子类2"},{"id":"10","pid":"3","title":"留学子类"}],"title":"留学"},{"id":"2","pid":"0","son":[{"id":"8","pid":"2","title":"采购管理"},{"id":"7","pid":"2","title":"工程管理"},{"id":"6","pid":"2","title":"工商管理"},{"id":"5","pid":"2","title":"金融学"}],"title":"研究生"},{"id":"1","pid":"0","son":[{"id":"12","pid":"1","title":"专科本科子类2"},{"id":"9","pid":"1","title":"专科本科子类"}],"title":"专科本科"}],"circle":[{"addtime":"2019-01-17 10:20","id":"20","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg","title":"健康管理师证书的含金量"},{"addtime":"2019-01-17 10:16","id":"19","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117101753YtuQ2P.jpg","title":"健康管理师考几科"},{"addtime":"2019-01-16 15:39","id":"18","thumb":"","title":"健康管理师有用吗"},{"addtime":"2019-01-16 15:27","id":"17","thumb":"","title":"数学考什么"}],"classes":[{"addtime":"2019-02-20 10:46","id":"9","price":"0.00","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png","title":"测试课程1"},{"addtime":"2019-02-18 13:54","id":"10","price":"0.01","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","title":"测试课程2"}],"ios_status":1,"question":[{"addtime":"2019-02-20 11:48","id":"75","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"nice","uid":"65"},{"addtime":"2019-02-20 11:47","id":"74","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"55","uid":"65"}],"thumbnail":["http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png"]}
     * msg : success
     */

//    private int code;
//     private String msg;
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
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//        /**
//         * categorys : [{"id":888888,"pid":0,"son":[],"title":"全部"},{"id":"4","pid":"0","son":[{"id":"14","pid":"4","title":"职业考试子类2"},{"id":"11","pid":"4","title":"职业考试子类"}],"title":"职业考试"},{"id":"3","pid":"0","son":[{"id":"13","pid":"3","title":"留学子类2"},{"id":"10","pid":"3","title":"留学子类"}],"title":"留学"},{"id":"2","pid":"0","son":[{"id":"8","pid":"2","title":"采购管理"},{"id":"7","pid":"2","title":"工程管理"},{"id":"6","pid":"2","title":"工商管理"},{"id":"5","pid":"2","title":"金融学"}],"title":"研究生"},{"id":"1","pid":"0","son":[{"id":"12","pid":"1","title":"专科本科子类2"},{"id":"9","pid":"1","title":"专科本科子类"}],"title":"专科本科"}]
//         * circle : [{"addtime":"2019-01-17 10:20","id":"20","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg","title":"健康管理师证书的含金量"},{"addtime":"2019-01-17 10:16","id":"19","thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117101753YtuQ2P.jpg","title":"健康管理师考几科"},{"addtime":"2019-01-16 15:39","id":"18","thumb":"","title":"健康管理师有用吗"},{"addtime":"2019-01-16 15:27","id":"17","thumb":"","title":"数学考什么"}]
//         * classes : [{"addtime":"2019-02-20 10:46","id":"9","price":"0.00","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png","title":"测试课程1"},{"addtime":"2019-02-18 13:54","id":"10","price":"0.01","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","title":"测试课程2"}]
//         * ios_status : 1
//         * question : [{"addtime":"2019-02-20 11:48","id":"75","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"nice","uid":"65"},{"addtime":"2019-02-20 11:47","id":"74","member":{"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"},"thumb":"","title":"55","uid":"65"}]
//         * thumbnail : ["http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png"]
//         */
//
//        private int ios_status;
//        private List<CategorysBean> categorys;
//        private List<CircleBean> circle;
//        private List<ClassesBean> classes;
//        private List<QuestionBean> question;
//        private List<String> thumbnail;
//
//        public int getIos_status() {
//            return ios_status;
//        }
//
//        public void setIos_status(int ios_status) {
//            this.ios_status = ios_status;
//        }
//
//        public List<CategorysBean> getCategorys() {
//            return categorys;
//        }
//
//        public void setCategorys(List<CategorysBean> categorys) {
//            this.categorys = categorys;
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
//        public List<ClassesBean> getClasses() {
//            return classes;
//        }
//
//        public void setClasses(List<ClassesBean> classes) {
//            this.classes = classes;
//        }
//
//        public List<QuestionBean> getQuestion() {
//            return question;
//        }
//
//        public void setQuestion(List<QuestionBean> question) {
//            this.question = question;
//        }
//
//        public List<String> getThumbnail() {
//            return thumbnail;
//        }
//
//        public void setThumbnail(List<String> thumbnail) {
//            this.thumbnail = thumbnail;
//        }
//
//        public static class CategorysBean {
//            /**
//             * id : 888888
//             * pid : 0
//             * son : []
//             * title : 全部
//             */
//
//            private int id;
//            private int pid;
//            private String title;
//            private List<Son> son;
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//
//            public int getPid() {
//                return pid;
//            }
//
//            public void setPid(int pid) {
//                this.pid = pid;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public void setTitle(String title) {
//                this.title = title;
//            }
//
//            public List<Son> getSon() {
//                return son;
//            }
//
//            public void setSon(List<Son> son) {
//                this.son = son;
//            }
//
//            public static class Son {
//
//                public Son(int id, int pid, String title) {
//                    this.id = id;
//                    this.pid = pid;
//                    this.title = title;
//                }
//
//                public int getId() {
//                    return id;
//                }
//
//                public void setId(int id) {
//                    this.id = id;
//                }
//
//                public String getTitle() {
//                    return title;
//                }
//
//                public void setTitle(String title) {
//                    this.title = title;
//                }
//
//                private int id;
//                private int pid;
//                private String title;
//
//                public boolean isColorChecked() {
//                    return ColorChecked;
//                }
//
//                public void setColorChecked(boolean colorChecked) {
//                    ColorChecked = colorChecked;
//                }
//
//                private boolean ColorChecked;
//            }
//        }
//
//        public static class CircleBean {
//            /**
//             * addtime : 2019-01-17 10:20
//             * id : 20
//             * thumb : http://lx.beijingliuxue.com/uploadfile/2019/01/17/20190117102116oyqdCe.jpg
//             * title : 健康管理师证书的含金量
//             */
//
//            private String addtime;
//            private String id;
//            private String thumb;
//            private String title;
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
//            public String getThumb() {
//                return thumb;
//            }
//
//            public void setThumb(String thumb) {
//                this.thumb = thumb;
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
//
//        public static class ClassesBean {
//            /**
//             * addtime : 2019-02-20 10:46
//             * id : 9
//             * price : 0.00
//             * thumb : http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png
//             * title : 测试课程1
//             */
//
//            private String addtime;
//            private String id;
//            private String price;
//            private String thumb;
//            private String title;
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
//            public String getPrice() {
//                return price;
//            }
//
//            public void setPrice(String price) {
//                this.price = price;
//            }
//
//            public String getThumb() {
//                return thumb;
//            }
//
//            public void setThumb(String thumb) {
//                this.thumb = thumb;
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
//
//        public static class QuestionBean {
//            /**
//             * addtime : 2019-02-20 11:48
//             * id : 75
//             * member : {"avatar":"http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg","username":"晴天二柱子儿"}
//             * thumb :
//             * title : nice
//             * uid : 65
//             */
//
//            private String addtime;
//            private String id;
//            private MemberBean member;
//            private String thumb;
//            private String title;
//            private String uid;
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
//            public MemberBean getMember() {
//                return member;
//            }
//
//            public void setMember(MemberBean member) {
//                this.member = member;
//            }
//
//            public String getThumb() {
//                return thumb;
//            }
//
//            public void setThumb(String thumb) {
//                this.thumb = thumb;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public void setTitle(String title) {
//                this.title = title;
//            }
//
//            public String getUid() {
//                return uid;
//            }
//
//            public void setUid(String uid) {
//                this.uid = uid;
//            }
//
//            public static class MemberBean {
//                /**
//                 * avatar : http://lx.beijingliuxue.com/uploadfile/member/fc/65/180x180.jpg
//                 * username : 晴天二柱子儿
//                 */
//
//                private String avatar;
//                private String username;
//
//                public String getAvatar() {
//                    return avatar;
//                }
//
//                public void setAvatar(String avatar) {
//                    this.avatar = avatar;
//                }
//
//                public String getUsername() {
//                    return username;
//                }
//
//                public void setUsername(String username) {
//                    this.username = username;
//                }
//            }
//
//    }

//
//
//    /**
//     * code : 1
//     * data : {"circle":[{"addtime":"2018-08-31 15:31","id":"11","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/201809191708196zBRkS.png","title":"金夫子教育圈"},{"addtime":"2018-08-31 15:27","id":"10","thumb":"http://www.yzls.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","title":"宝宝地带"},{"addtime":"2018-08-31 14:21","id":"9","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170933nkc6MJ.png","title":"母婴用品圈"},{"addtime":"2018-08-31 14:21","id":"8","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170958tgonie.png","title":"喂养大本营"}],"classes":[{"addtime":"2019-01-09 16:44","id":"10","price":"0.01","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","title":"测试课程2"},{"addtime":"2018-12-28 13:31","id":"13","price":"200.00","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","title":"课程4"}],"ios_status":1,"question":[{"addtime":"2019-01-07 17:24","id":"10","member":{"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","username":"呵呵哈哈哈"},"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/07/201901071724003661893.jpeg","title":"朱欢是猪","uid":"65"},{"addtime":"2019-01-07 17:12","id":"9","member":{"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","username":"呵呵哈哈哈"},"thumb":"","title":"4y75y74354yt","uid":"65"}],"thumbnail":["http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png"]}
//     * msg : success
//     */
//
//    private int code;
//     private String msg;
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
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//
//        /**
//         * circle : [{"addtime":"2018-08-31 15:31","id":"11","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/201809191708196zBRkS.png","title":"金夫子教育圈"},{"addtime":"2018-08-31 15:27","id":"10","thumb":"http://www.yzls.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","title":"宝宝地带"},{"addtime":"2018-08-31 14:21","id":"9","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170933nkc6MJ.png","title":"母婴用品圈"},{"addtime":"2018-08-31 14:21","id":"8","thumb":"http://www.jingfuzi.com/uploadfile/2018/09/19/20180919170958tgonie.png","title":"喂养大本营"}]
//         * classes : [{"addtime":"2019-01-09 16:44","id":"10","price":"0.01","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","title":"测试课程2"},{"addtime":"2018-12-28 13:31","id":"13","price":"200.00","thumb":"http://lx.beijingliuxue.com/uploadfile/2018/12/24/20181224133038iDz2KQ.jpg","title":"课程4"}]
//         * ios_status : 1
//         * question : [{"addtime":"2019-01-07 17:24","id":"10","member":{"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","username":"呵呵哈哈哈"},"thumb":"http://lx.beijingliuxue.com/uploadfile/2019/01/07/201901071724003661893.jpeg","title":"朱欢是猪","uid":"65"},{"addtime":"2019-01-07 17:12","id":"9","member":{"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","username":"呵呵哈哈哈"},"thumb":"","title":"4y75y74354yt","uid":"65"}]
//         * thumbnail : ["http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539Fphz6K.png","http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539QqThjX.png"]
//         */
//
//        private String ios_status;
//        private List<CircleBean> circle;
//        private List<ClassesBean> classes;
//        private List<QuestionBean> question;
//        private List<String> thumbnail;
//
//        public String getIos_status() {
//            return ios_status;
//        }
//
//        public void setIos_status(String ios_status) {
//            this.ios_status = ios_status;
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
//        public List<ClassesBean> getClasses() {
//            return classes;
//        }
//
//        public void setClasses(List<ClassesBean> classes) {
//            this.classes = classes;
//        }
//
//        public List<QuestionBean> getQuestion() {
//            return question;
//        }
//
//        public void setQuestion(List<QuestionBean> question) {
//            this.question = question;
//        }
//
//        public List<String> getThumbnail() {
//            return thumbnail;
//        }
//
//        public void setThumbnail(List<String> thumbnail) {
//            this.thumbnail = thumbnail;
//        }
//
//        public static class CircleBean {
//            /**
//             * addtime : 2018-08-31 15:31
//             * id : 11
//             * thumb : http://www.jingfuzi.com/uploadfile/2018/09/19/201809191708196zBRkS.png
//             * title : 金夫子教育圈
//             */
//
//            private String addtime;
//            private String id;
//            private String thumb;
//            private String title;
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
//            public String getThumb() {
//                return thumb;
//            }
//
//            public void setThumb(String thumb) {
//                this.thumb = thumb;
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
//
//        public static class ClassesBean {
//            /**
//             * addtime : 2019-01-09 16:44
//             * id : 10
//             * price : 0.01
//             * thumb : http://lx.beijingliuxue.com/uploadfile/2018/12/18/20181218164539uq7k3g.png
//             * title : 测试课程2
//             */
//
//            private String addtime;
//            private String id;
//            private String price;
//            private String thumb;
//            private String title;
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
//            public String getPrice() {
//                return price;
//            }
//
//            public void setPrice(String price) {
//                this.price = price;
//            }
//
//            public String getThumb() {
//                return thumb;
//            }
//
//            public void setThumb(String thumb) {
//                this.thumb = thumb;
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
//
//        public static class QuestionBean {
//            /**
//             * addtime : 2019-01-07 17:24
//             * id : 10
//             * member : {"avatar":"http://lx.beijingliuxue.com/res/images/mobile_180x180.png","username":"呵呵哈哈哈"}
//             * thumb : http://lx.beijingliuxue.com/uploadfile/2019/01/07/201901071724003661893.jpeg
//             * title : 朱欢是猪
//             * uid : 65
//             */
//
//            private String addtime;
//            private String id;
//            private MemberBean member;
//            private String thumb;
//            private String title;
//            private String uid;
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
//            public MemberBean getMember() {
//                return member;
//            }
//
//            public void setMember(MemberBean member) {
//                this.member = member;
//            }
//
//            public String getThumb() {
//                return thumb;
//            }
//
//            public void setThumb(String thumb) {
//                this.thumb = thumb;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public void setTitle(String title) {
//                this.title = title;
//            }
//
//            public String getUid() {
//                return uid;
//            }
//
//            public void setUid(String uid) {
//                this.uid = uid;
//            }
//
//            public static class MemberBean {
//                /**
//                 * avatar : http://lx.beijingliuxue.com/res/images/mobile_180x180.png
//                 * username : 呵呵哈哈哈
//                 */
//
//                private String avatar;
//                private String username;
//
//                public String getAvatar() {
//                    return avatar;
//                }
//
//                public void setAvatar(String avatar) {
//                    this.avatar = avatar;
//                }
//
//                public String getUsername() {
//                    return username;
//                }
//
//                public void setUsername(String username) {
//                    this.username = username;
//                }
//            }
//        }



}
