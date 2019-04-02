package www.shdy.entity;

public class WeixLoginBean {


    /**
     * code : 200
     * remark : 请求成功
     * result : {"userInfo":{"skey":"bbByh9o4xFEmswU67Nt","roleId":null,"sessionKey":null,"openId":null,"uid":10000956,"saNum":null,"nickname":"阿瑞","userName":null,"email":null,"phone":null,"wxNum":null,"wxOpenid":null,"createTime":1554191809000,"updateTime":null,"gender":"男","language":null,"city":null,"province":null,"country":null,"avatarurl":"null","unionid":"asdfsadf","idCard":null,"fishTime":null,"idCardFront":null,"idCardBack":null,"personalPhotos":null,"status":"0","approve":null,"opinion":null,"origin":null,"area":null,"address":null,"brand":null,"model":null,"version":null,"system":null,"platform":null,"sdkversion":null,"userTitle":null,"signature":null,"fansNum":0,"subscribeNum":0,"collectNum":0,"levelId":0,"levelNum":null,"levelName":null,"expVal":0,"totalIntegralVal":0,"payIntegralVal":0},"info":"success","token":"bbByh9o4xFEmswU67Nt"}
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
         * userInfo : {"skey":"bbByh9o4xFEmswU67Nt","roleId":null,"sessionKey":null,"openId":null,"uid":10000956,"saNum":null,"nickname":"阿瑞","userName":null,"email":null,"phone":null,"wxNum":null,"wxOpenid":null,"createTime":1554191809000,"updateTime":null,"gender":"男","language":null,"city":null,"province":null,"country":null,"avatarurl":"null","unionid":"asdfsadf","idCard":null,"fishTime":null,"idCardFront":null,"idCardBack":null,"personalPhotos":null,"status":"0","approve":null,"opinion":null,"origin":null,"area":null,"address":null,"brand":null,"model":null,"version":null,"system":null,"platform":null,"sdkversion":null,"userTitle":null,"signature":null,"fansNum":0,"subscribeNum":0,"collectNum":0,"levelId":0,"levelNum":null,"levelName":null,"expVal":0,"totalIntegralVal":0,"payIntegralVal":0}
         * info : success
         * token : bbByh9o4xFEmswU67Nt
         */

        private UserInfoBean userInfo;
        private String info;
        private String token;

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class UserInfoBean {
            /**
             * skey : bbByh9o4xFEmswU67Nt
             * roleId : null
             * sessionKey : null
             * openId : null
             * uid : 10000956
             * saNum : null
             * nickname : 阿瑞
             * userName : null
             * email : null
             * phone : null
             * wxNum : null
             * wxOpenid : null
             * createTime : 1554191809000
             * updateTime : null
             * gender : 男
             * language : null
             * city : null
             * province : null
             * country : null
             * avatarurl : null
             * unionid : asdfsadf
             * idCard : null
             * fishTime : null
             * idCardFront : null
             * idCardBack : null
             * personalPhotos : null
             * status : 0
             * approve : null
             * opinion : null
             * origin : null
             * area : null
             * address : null
             * brand : null
             * model : null
             * version : null
             * system : null
             * platform : null
             * sdkversion : null
             * userTitle : null
             * signature : null
             * fansNum : 0
             * subscribeNum : 0
             * collectNum : 0
             * levelId : 0
             * levelNum : null
             * levelName : null
             * expVal : 0
             * totalIntegralVal : 0
             * payIntegralVal : 0
             */

            private String skey;
            private Object roleId;
            private Object sessionKey;
            private Object openId;
            private int uid;
            private Object saNum;
            private String nickname;
            private Object userName;
            private Object email;
            private Object phone;
            private Object wxNum;
            private Object wxOpenid;
            private long createTime;
            private Object updateTime;
            private String gender;
            private Object language;
            private Object city;
            private Object province;
            private Object country;
            private String avatarurl;
            private String unionid;
            private Object idCard;
            private Object fishTime;
            private Object idCardFront;
            private Object idCardBack;
            private Object personalPhotos;
            private String status;
            private Object approve;
            private Object opinion;
            private Object origin;
            private Object area;
            private Object address;
            private Object brand;
            private Object model;
            private Object version;
            private Object system;
            private Object platform;
            private Object sdkversion;
            private Object userTitle;
            private Object signature;
            private int fansNum;
            private int subscribeNum;
            private int collectNum;
            private int levelId;
            private Object levelNum;
            private Object levelName;
            private int expVal;
            private int totalIntegralVal;
            private int payIntegralVal;

            public String getSkey() {
                return skey;
            }

            public void setSkey(String skey) {
                this.skey = skey;
            }

            public Object getRoleId() {
                return roleId;
            }

            public void setRoleId(Object roleId) {
                this.roleId = roleId;
            }

            public Object getSessionKey() {
                return sessionKey;
            }

            public void setSessionKey(Object sessionKey) {
                this.sessionKey = sessionKey;
            }

            public Object getOpenId() {
                return openId;
            }

            public void setOpenId(Object openId) {
                this.openId = openId;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public Object getSaNum() {
                return saNum;
            }

            public void setSaNum(Object saNum) {
                this.saNum = saNum;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Object getUserName() {
                return userName;
            }

            public void setUserName(Object userName) {
                this.userName = userName;
            }

            public Object getEmail() {
                return email;
            }

            public void setEmail(Object email) {
                this.email = email;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public Object getWxNum() {
                return wxNum;
            }

            public void setWxNum(Object wxNum) {
                this.wxNum = wxNum;
            }

            public Object getWxOpenid() {
                return wxOpenid;
            }

            public void setWxOpenid(Object wxOpenid) {
                this.wxOpenid = wxOpenid;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public Object getLanguage() {
                return language;
            }

            public void setLanguage(Object language) {
                this.language = language;
            }

            public Object getCity() {
                return city;
            }

            public void setCity(Object city) {
                this.city = city;
            }

            public Object getProvince() {
                return province;
            }

            public void setProvince(Object province) {
                this.province = province;
            }

            public Object getCountry() {
                return country;
            }

            public void setCountry(Object country) {
                this.country = country;
            }

            public String getAvatarurl() {
                return avatarurl;
            }

            public void setAvatarurl(String avatarurl) {
                this.avatarurl = avatarurl;
            }

            public String getUnionid() {
                return unionid;
            }

            public void setUnionid(String unionid) {
                this.unionid = unionid;
            }

            public Object getIdCard() {
                return idCard;
            }

            public void setIdCard(Object idCard) {
                this.idCard = idCard;
            }

            public Object getFishTime() {
                return fishTime;
            }

            public void setFishTime(Object fishTime) {
                this.fishTime = fishTime;
            }

            public Object getIdCardFront() {
                return idCardFront;
            }

            public void setIdCardFront(Object idCardFront) {
                this.idCardFront = idCardFront;
            }

            public Object getIdCardBack() {
                return idCardBack;
            }

            public void setIdCardBack(Object idCardBack) {
                this.idCardBack = idCardBack;
            }

            public Object getPersonalPhotos() {
                return personalPhotos;
            }

            public void setPersonalPhotos(Object personalPhotos) {
                this.personalPhotos = personalPhotos;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Object getApprove() {
                return approve;
            }

            public void setApprove(Object approve) {
                this.approve = approve;
            }

            public Object getOpinion() {
                return opinion;
            }

            public void setOpinion(Object opinion) {
                this.opinion = opinion;
            }

            public Object getOrigin() {
                return origin;
            }

            public void setOrigin(Object origin) {
                this.origin = origin;
            }

            public Object getArea() {
                return area;
            }

            public void setArea(Object area) {
                this.area = area;
            }

            public Object getAddress() {
                return address;
            }

            public void setAddress(Object address) {
                this.address = address;
            }

            public Object getBrand() {
                return brand;
            }

            public void setBrand(Object brand) {
                this.brand = brand;
            }

            public Object getModel() {
                return model;
            }

            public void setModel(Object model) {
                this.model = model;
            }

            public Object getVersion() {
                return version;
            }

            public void setVersion(Object version) {
                this.version = version;
            }

            public Object getSystem() {
                return system;
            }

            public void setSystem(Object system) {
                this.system = system;
            }

            public Object getPlatform() {
                return platform;
            }

            public void setPlatform(Object platform) {
                this.platform = platform;
            }

            public Object getSdkversion() {
                return sdkversion;
            }

            public void setSdkversion(Object sdkversion) {
                this.sdkversion = sdkversion;
            }

            public Object getUserTitle() {
                return userTitle;
            }

            public void setUserTitle(Object userTitle) {
                this.userTitle = userTitle;
            }

            public Object getSignature() {
                return signature;
            }

            public void setSignature(Object signature) {
                this.signature = signature;
            }

            public int getFansNum() {
                return fansNum;
            }

            public void setFansNum(int fansNum) {
                this.fansNum = fansNum;
            }

            public int getSubscribeNum() {
                return subscribeNum;
            }

            public void setSubscribeNum(int subscribeNum) {
                this.subscribeNum = subscribeNum;
            }

            public int getCollectNum() {
                return collectNum;
            }

            public void setCollectNum(int collectNum) {
                this.collectNum = collectNum;
            }

            public int getLevelId() {
                return levelId;
            }

            public void setLevelId(int levelId) {
                this.levelId = levelId;
            }

            public Object getLevelNum() {
                return levelNum;
            }

            public void setLevelNum(Object levelNum) {
                this.levelNum = levelNum;
            }

            public Object getLevelName() {
                return levelName;
            }

            public void setLevelName(Object levelName) {
                this.levelName = levelName;
            }

            public int getExpVal() {
                return expVal;
            }

            public void setExpVal(int expVal) {
                this.expVal = expVal;
            }

            public int getTotalIntegralVal() {
                return totalIntegralVal;
            }

            public void setTotalIntegralVal(int totalIntegralVal) {
                this.totalIntegralVal = totalIntegralVal;
            }

            public int getPayIntegralVal() {
                return payIntegralVal;
            }

            public void setPayIntegralVal(int payIntegralVal) {
                this.payIntegralVal = payIntegralVal;
            }
        }

}
