package www.shdy.entity;

import java.util.List;

public class BannerCmscategoryBean {


    /**
     * code : 200
     * remark : 请求成功
     * result : {"banners":[{"id":3,"bannerName":"大吉大利","bannerImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-01-24/d21fcfe5-35bc-43b6-93d0-61e7d5c91c9a.png","bannerUrl":"","gradation":1,"position":"首页","createTime":"2019-01-24 10:20:32","updateTime":null,"status":0},{"id":2,"bannerName":"首页banner2","bannerImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-01-18/5ce022f8-f234-4e31-84ee-7e4e8d6a7d64.png","bannerUrl":"","gradation":2,"position":"首页","createTime":"2018-12-21 17:05:29","updateTime":"2019-01-24 10:20:39","status":0}],"cmsCategories":[{"categoryId":15,"categoryName":"大神","parentCategoryId":0,"weight":0,"delStatus":0,"createTime":"2019-03-12 12:18:09","updateTime":"2019-03-12 12:19:20"},{"categoryId":31,"categoryName":"嘿嘿嘿","parentCategoryId":0,"weight":0,"delStatus":0,"createTime":"2019-04-01 20:57:33","updateTime":"2019-04-01 20:57:33"},{"categoryId":27,"categoryName":"哈哈","parentCategoryId":0,"weight":1,"delStatus":0,"createTime":"2019-03-15 19:46:14","updateTime":"2019-04-01 19:51:17"},{"categoryId":10,"categoryName":"高手","parentCategoryId":0,"weight":4,"delStatus":0,"createTime":"2019-03-11 14:14:23","updateTime":"2019-03-11 15:20:31"}]}
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


    private List<BannersBean> banners;
    private List<CmsCategoriesBean> cmsCategories;

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public List<CmsCategoriesBean> getCmsCategories() {
        return cmsCategories;
    }

    public void setCmsCategories(List<CmsCategoriesBean> cmsCategories) {
        this.cmsCategories = cmsCategories;
    }

    public static class BannersBean {
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

    public static class CmsCategoriesBean {
        /**
         * categoryId : 15
         * categoryName : 大神
         * parentCategoryId : 0
         * weight : 0
         * delStatus : 0
         * createTime : 2019-03-12 12:18:09
         * updateTime : 2019-03-12 12:19:20
         */

        private int categoryId;
        private String categoryName;
        private int parentCategoryId;
        private int weight;
        private int delStatus;
        private String createTime;
        private String updateTime;

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public int getParentCategoryId() {
            return parentCategoryId;
        }

        public void setParentCategoryId(int parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
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
    }

}
