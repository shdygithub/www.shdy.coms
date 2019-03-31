package www.shdy.entity;

import java.util.List;

/**
 * Created by Administrator on 2019/1/14 0014
 * <p>
 * Describe:
 */
public class KnowledgeSearchBean {


    /**
     * msg : success
     * code : 1
     * data : {"pages":2,"questions":[{"id":"1","title":"你猜哦"}]}
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
         * pages : 2
         * questions : [{"id":"1","title":"你猜哦"}]
         */

        private int pages;
        private List<QuestionsBean> questions;

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public List<QuestionsBean> getQuestions() {
            return questions;
        }

        public void setQuestions(List<QuestionsBean> questions) {
            this.questions = questions;
        }

        public static class QuestionsBean {
            /**
             * id : 1
             * title : 你猜哦
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

}
