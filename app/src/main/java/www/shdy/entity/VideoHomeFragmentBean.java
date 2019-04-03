package www.shdy.entity;

import java.util.List;

public class VideoHomeFragmentBean {


    /**
     * code : 200
     * remark : 请求成功
     * result : {"column":[{"columnId":12,"columnName":"44","slogan":"44","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-20/b168dc28-a88a-4527-a972-3d01b0d72649.jpg","introduction":"44","showStatus":1,"weight":0,"delStatus":0,"createTime":"2019-03-15 19:52:32","updateTime":"2019-03-20 17:23:32","list":null,"playNum":null},{"columnId":19,"columnName":"耗子","slogan":"喊号子","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-21/374332fc-0f56-4afe-81de-b099fed8ee94.jpg","introduction":"的规范和托管费和股份","showStatus":1,"weight":0,"delStatus":0,"createTime":"2019-03-21 19:48:13","updateTime":"2019-03-21 19:48:38","list":null,"playNum":null}],"banner":[{"id":3,"bannerName":"大吉大利","bannerImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-01-24/d21fcfe5-35bc-43b6-93d0-61e7d5c91c9a.png","bannerUrl":"","gradation":1,"position":"首页","createTime":"2019-01-24 10:20:32","updateTime":null,"status":0},{"id":2,"bannerName":"首页banner2","bannerImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-01-18/5ce022f8-f234-4e31-84ee-7e4e8d6a7d64.png","bannerUrl":"","gradation":2,"position":"首页","createTime":"2018-12-21 17:05:29","updateTime":"2019-01-24 10:20:39","status":0}],"info":"success"}
     * pageInfo : null
     */

    private int code;
    private String remark;

    private Object pageInfo;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Object getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Object pageInfo) {
        this.pageInfo = pageInfo;
    }

         /**
         * column : [{"columnId":12,"columnName":"44","slogan":"44","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-20/b168dc28-a88a-4527-a972-3d01b0d72649.jpg","introduction":"44","showStatus":1,"weight":0,"delStatus":0,"createTime":"2019-03-15 19:52:32","updateTime":"2019-03-20 17:23:32","list":null,"playNum":null},{"columnId":19,"columnName":"耗子","slogan":"喊号子","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-21/374332fc-0f56-4afe-81de-b099fed8ee94.jpg","introduction":"的规范和托管费和股份","showStatus":1,"weight":0,"delStatus":0,"createTime":"2019-03-21 19:48:13","updateTime":"2019-03-21 19:48:38","list":null,"playNum":null}]
         * banner : [{"id":3,"bannerName":"大吉大利","bannerImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-01-24/d21fcfe5-35bc-43b6-93d0-61e7d5c91c9a.png","bannerUrl":"","gradation":1,"position":"首页","createTime":"2019-01-24 10:20:32","updateTime":null,"status":0},{"id":2,"bannerName":"首页banner2","bannerImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-01-18/5ce022f8-f234-4e31-84ee-7e4e8d6a7d64.png","bannerUrl":"","gradation":2,"position":"首页","createTime":"2018-12-21 17:05:29","updateTime":"2019-01-24 10:20:39","status":0}]
         * info : success
         */

        private String info;
        private List<ColumnBean> column;
        private List<BannerBean> banner;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public List<ColumnBean> getColumn() {
            return column;
        }

        public void setColumn(List<ColumnBean> column) {
            this.column = column;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public static class ColumnBean {
            /**
             * columnId : 12
             * columnName : 44
             * slogan : 44
             * coverImgUrl : http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-20/b168dc28-a88a-4527-a972-3d01b0d72649.jpg
             * introduction : 44
             * showStatus : 1
             * weight : 0
             * delStatus : 0
             * createTime : 2019-03-15 19:52:32
             * updateTime : 2019-03-20 17:23:32
             * list : null
             * playNum : null
             */

            private int columnId;
            private String columnName;
            private String slogan;
            private String coverImgUrl;
            private String introduction;
            private int showStatus;
            private int weight;
            private int delStatus;
            private String createTime;
            private String updateTime;
            private Object list;
            private Object playNum;

            public int getColumnId() {
                return columnId;
            }

            public void setColumnId(int columnId) {
                this.columnId = columnId;
            }

            public String getColumnName() {
                return columnName;
            }

            public void setColumnName(String columnName) {
                this.columnName = columnName;
            }

            public String getSlogan() {
                return slogan;
            }

            public void setSlogan(String slogan) {
                this.slogan = slogan;
            }

            public String getCoverImgUrl() {
                return coverImgUrl;
            }

            public void setCoverImgUrl(String coverImgUrl) {
                this.coverImgUrl = coverImgUrl;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public int getShowStatus() {
                return showStatus;
            }

            public void setShowStatus(int showStatus) {
                this.showStatus = showStatus;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getDelStatus() {
                return delStatus;
            }

            public void setDelStatus(int delStatus) {
                this.delStatus = delStatus;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public Object getList() {
                return list;
            }

            public void setList(Object list) {
                this.list = list;
            }

            public Object getPlayNum() {
                return playNum;
            }

            public void setPlayNum(Object playNum) {
                this.playNum = playNum;
            }
        }

        public static class BannerBean {
            /**
             * id : 3
             * bannerName : 大吉大利
             * bannerImgUrl : http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-01-24/d21fcfe5-35bc-43b6-93d0-61e7d5c91c9a.png
             * bannerUrl :
             * gradation : 1
             * position : 首页
             * createTime : 2019-01-24 10:20:32
             * updateTime : null
             * status : 0
             */

            private int id;
            private String bannerName;
            private String bannerImgUrl;
            private String bannerUrl;
            private int gradation;
            private String position;
            private String createTime;
            private Object updateTime;
            private int status;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getBannerName() {
                return bannerName;
            }

            public void setBannerName(String bannerName) {
                this.bannerName = bannerName;
            }

            public String getBannerImgUrl() {
                return bannerImgUrl;
            }

            public void setBannerImgUrl(String bannerImgUrl) {
                this.bannerImgUrl = bannerImgUrl;
            }

            public String getBannerUrl() {
                return bannerUrl;
            }

            public void setBannerUrl(String bannerUrl) {
                this.bannerUrl = bannerUrl;
            }

            public int getGradation() {
                return gradation;
            }

            public void setGradation(int gradation) {
                this.gradation = gradation;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }

}
