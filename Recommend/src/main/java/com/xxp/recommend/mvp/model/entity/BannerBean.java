package com.xxp.recommend.mvp.model.entity;

import java.util.List;

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :
 * 电影 banner数据  不要问我为啥不用kotlin
 */
public class BannerBean {
    /**
     * code : 200
     * data : {"next":2,"rows":[{"adId":0,"combineId":"","dataMode":0,"dataModuleId":1113,"interfaceUrl":"","isExchange":"0","moduleData":[{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"#E4B659","filter":"","imgHUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115343084-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://4img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115337547-new.jpg","isShare":"1","jumpId":"294084","jumpKind":"1","mobileTitle":"","name":"她很漂亮 更新至38集","pageUrl":"","phoneImgUrl":"http://2img.hitv.com/preview/cms_icon/2018/06/20180611165647651.jpg","playerType":"0","rightCorner":"VIP免费","sortNo":1,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3020590"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/322071/20180419113815288-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/322071/20180419113719490-new.jpg","isShare":"1","jumpId":"322071","jumpKind":"1","mobileTitle":"","name":"归去来 大结局","pageUrl":"","phoneImgUrl":"http://3img.hitv.com/preview/cms_icon/2018/06/20180610202916831.jpg","playerType":"0","rightCorner":"","sortNo":2,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3082766"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323832/20180521110656404-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323832/20180521110651315-new.jpg","isShare":"1","jumpId":"323832","jumpKind":"1","mobileTitle":"","name":"如果，爱 更新至第27集","pageUrl":"","phoneImgUrl":"http://1img.hitv.com/preview/cms_icon/2018/06/20180611225310265.jpg","playerType":"0","rightCorner":"","sortNo":3,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"2844131"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://2img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323665/20180528174846667-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323665/20180528174825794-new.jpg","isShare":"1","jumpId":"323665","jumpKind":"1","mobileTitle":"","name":"像我们一样年轻 更新至第14集","pageUrl":"","phoneImgUrl":"http://2img.hitv.com/preview/cms_icon/2018/06/20180611224840385.jpg","playerType":"0","rightCorner":"","sortNo":4,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3196168"}],"moduleId":1113,"moduleName":"banner","moduleTitle":"精选闪图","moduleType":"banner"}]}
     * msg :
     * seqid : 8ee3942c59a94754832b075c75a03401
     * serverTime : 1528792387
     * timestamp : 1528792387
     */

    private int code;
    private DataBean data;
    private String msg;
    private String seqid;
    private int serverTime;
    private int timestamp;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSeqid() {
        return seqid;
    }

    public void setSeqid(String seqid) {
        this.seqid = seqid;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public static class DataBean {
        /**
         * next : 2
         * rows : [{"adId":0,"combineId":"","dataMode":0,"dataModuleId":1113,"interfaceUrl":"","isExchange":"0","moduleData":[{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"#E4B659","filter":"","imgHUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115343084-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://4img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115337547-new.jpg","isShare":"1","jumpId":"294084","jumpKind":"1","mobileTitle":"","name":"她很漂亮 更新至38集","pageUrl":"","phoneImgUrl":"http://2img.hitv.com/preview/cms_icon/2018/06/20180611165647651.jpg","playerType":"0","rightCorner":"VIP免费","sortNo":1,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3020590"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/322071/20180419113815288-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/322071/20180419113719490-new.jpg","isShare":"1","jumpId":"322071","jumpKind":"1","mobileTitle":"","name":"归去来 大结局","pageUrl":"","phoneImgUrl":"http://3img.hitv.com/preview/cms_icon/2018/06/20180610202916831.jpg","playerType":"0","rightCorner":"","sortNo":2,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3082766"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323832/20180521110656404-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323832/20180521110651315-new.jpg","isShare":"1","jumpId":"323832","jumpKind":"1","mobileTitle":"","name":"如果，爱 更新至第27集","pageUrl":"","phoneImgUrl":"http://1img.hitv.com/preview/cms_icon/2018/06/20180611225310265.jpg","playerType":"0","rightCorner":"","sortNo":3,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"2844131"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://2img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323665/20180528174846667-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323665/20180528174825794-new.jpg","isShare":"1","jumpId":"323665","jumpKind":"1","mobileTitle":"","name":"像我们一样年轻 更新至第14集","pageUrl":"","phoneImgUrl":"http://2img.hitv.com/preview/cms_icon/2018/06/20180611224840385.jpg","playerType":"0","rightCorner":"","sortNo":4,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3196168"}],"moduleId":1113,"moduleName":"banner","moduleTitle":"精选闪图","moduleType":"banner"}]
         */

        private int next;
        private List<RowsBean> rows;

        public int getNext() {
            return next;
        }

        public void setNext(int next) {
            this.next = next;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * adId : 0
             * combineId :
             * dataMode : 0
             * dataModuleId : 1113
             * interfaceUrl :
             * isExchange : 0
             * moduleData : [{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"#E4B659","filter":"","imgHUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115343084-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://4img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115337547-new.jpg","isShare":"1","jumpId":"294084","jumpKind":"1","mobileTitle":"","name":"她很漂亮 更新至38集","pageUrl":"","phoneImgUrl":"http://2img.hitv.com/preview/cms_icon/2018/06/20180611165647651.jpg","playerType":"0","rightCorner":"VIP免费","sortNo":1,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3020590"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/322071/20180419113815288-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/322071/20180419113719490-new.jpg","isShare":"1","jumpId":"322071","jumpKind":"1","mobileTitle":"","name":"归去来 大结局","pageUrl":"","phoneImgUrl":"http://3img.hitv.com/preview/cms_icon/2018/06/20180610202916831.jpg","playerType":"0","rightCorner":"","sortNo":2,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3082766"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323832/20180521110656404-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://3img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323832/20180521110651315-new.jpg","isShare":"1","jumpId":"323832","jumpKind":"1","mobileTitle":"","name":"如果，爱 更新至第27集","pageUrl":"","phoneImgUrl":"http://1img.hitv.com/preview/cms_icon/2018/06/20180611225310265.jpg","playerType":"0","rightCorner":"","sortNo":3,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"2844131"},{"autoPlayVideoId":"0","childId":"","connectUrl":"","cornerType":"","filter":"","imgHUrl":"http://2img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323665/20180528174846667-new.jpg","imgHUrlToMobile":"","imgHVUrl":"http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/323665/20180528174825794-new.jpg","isShare":"1","jumpId":"323665","jumpKind":"1","mobileTitle":"","name":"像我们一样年轻 更新至第14集","pageUrl":"","phoneImgUrl":"http://2img.hitv.com/preview/cms_icon/2018/06/20180611224840385.jpg","playerType":"0","rightCorner":"","sortNo":4,"subName":"","tvChannelId":"0","updateInfo":"","videoId":"3196168"}]
             * moduleId : 1113
             * moduleName : banner
             * moduleTitle : 精选闪图
             * moduleType : banner
             */

            private int adId;
            private String combineId;
            private int dataMode;
            private int dataModuleId;
            private String interfaceUrl;
            private String isExchange;
            private int moduleId;
            private String moduleName;
            private String moduleTitle;
            private String moduleType;
            private List<ModuleDataBean> moduleData;

            public int getAdId() {
                return adId;
            }

            public void setAdId(int adId) {
                this.adId = adId;
            }

            public String getCombineId() {
                return combineId;
            }

            public void setCombineId(String combineId) {
                this.combineId = combineId;
            }

            public int getDataMode() {
                return dataMode;
            }

            public void setDataMode(int dataMode) {
                this.dataMode = dataMode;
            }

            public int getDataModuleId() {
                return dataModuleId;
            }

            public void setDataModuleId(int dataModuleId) {
                this.dataModuleId = dataModuleId;
            }

            public String getInterfaceUrl() {
                return interfaceUrl;
            }

            public void setInterfaceUrl(String interfaceUrl) {
                this.interfaceUrl = interfaceUrl;
            }

            public String getIsExchange() {
                return isExchange;
            }

            public void setIsExchange(String isExchange) {
                this.isExchange = isExchange;
            }

            public int getModuleId() {
                return moduleId;
            }

            public void setModuleId(int moduleId) {
                this.moduleId = moduleId;
            }

            public String getModuleName() {
                return moduleName;
            }

            public void setModuleName(String moduleName) {
                this.moduleName = moduleName;
            }

            public String getModuleTitle() {
                return moduleTitle;
            }

            public void setModuleTitle(String moduleTitle) {
                this.moduleTitle = moduleTitle;
            }

            public String getModuleType() {
                return moduleType;
            }

            public void setModuleType(String moduleType) {
                this.moduleType = moduleType;
            }

            public List<ModuleDataBean> getModuleData() {
                return moduleData;
            }

            public void setModuleData(List<ModuleDataBean> moduleData) {
                this.moduleData = moduleData;
            }

            public static class ModuleDataBean {
                /**
                 * autoPlayVideoId : 0
                 * childId :
                 * connectUrl :
                 * cornerType : #E4B659
                 * filter :
                 * imgHUrl : http://0img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115343084-new.jpg
                 * imgHUrlToMobile :
                 * imgHVUrl : http://4img.hitv.com/preview/internettv/sp_images/ott/2018/dianshiju/294084/20180424115337547-new.jpg
                 * isShare : 1
                 * jumpId : 294084
                 * jumpKind : 1
                 * mobileTitle :
                 * name : 她很漂亮 更新至38集
                 * pageUrl :
                 * phoneImgUrl : http://2img.hitv.com/preview/cms_icon/2018/06/20180611165647651.jpg
                 * playerType : 0
                 * rightCorner : VIP免费
                 * sortNo : 1
                 * subName :
                 * tvChannelId : 0
                 * updateInfo :
                 * videoId : 3020590
                 */

                private String autoPlayVideoId;
                private String childId;
                private String connectUrl;
                private String cornerType;
                private String filter;
                private String imgHUrl;
                private String imgHUrlToMobile;
                private String imgHVUrl;
                private String isShare;
                private String jumpId;
                private String jumpKind;
                private String mobileTitle;
                private String name;
                private String pageUrl;
                private String phoneImgUrl;
                private String playerType;
                private String rightCorner;
                private int sortNo;
                private String subName;
                private String tvChannelId;
                private String updateInfo;
                private String videoId;

                public String getAutoPlayVideoId() {
                    return autoPlayVideoId;
                }

                public void setAutoPlayVideoId(String autoPlayVideoId) {
                    this.autoPlayVideoId = autoPlayVideoId;
                }

                public String getChildId() {
                    return childId;
                }

                public void setChildId(String childId) {
                    this.childId = childId;
                }

                public String getConnectUrl() {
                    return connectUrl;
                }

                public void setConnectUrl(String connectUrl) {
                    this.connectUrl = connectUrl;
                }

                public String getCornerType() {
                    return cornerType;
                }

                public void setCornerType(String cornerType) {
                    this.cornerType = cornerType;
                }

                public String getFilter() {
                    return filter;
                }

                public void setFilter(String filter) {
                    this.filter = filter;
                }

                public String getImgHUrl() {
                    return imgHUrl;
                }

                public void setImgHUrl(String imgHUrl) {
                    this.imgHUrl = imgHUrl;
                }

                public String getImgHUrlToMobile() {
                    return imgHUrlToMobile;
                }

                public void setImgHUrlToMobile(String imgHUrlToMobile) {
                    this.imgHUrlToMobile = imgHUrlToMobile;
                }

                public String getImgHVUrl() {
                    return imgHVUrl;
                }

                public void setImgHVUrl(String imgHVUrl) {
                    this.imgHVUrl = imgHVUrl;
                }

                public String getIsShare() {
                    return isShare;
                }

                public void setIsShare(String isShare) {
                    this.isShare = isShare;
                }

                public String getJumpId() {
                    return jumpId;
                }

                public void setJumpId(String jumpId) {
                    this.jumpId = jumpId;
                }

                public String getJumpKind() {
                    return jumpKind;
                }

                public void setJumpKind(String jumpKind) {
                    this.jumpKind = jumpKind;
                }

                public String getMobileTitle() {
                    return mobileTitle;
                }

                public void setMobileTitle(String mobileTitle) {
                    this.mobileTitle = mobileTitle;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPageUrl() {
                    return pageUrl;
                }

                public void setPageUrl(String pageUrl) {
                    this.pageUrl = pageUrl;
                }

                public String getPhoneImgUrl() {
                    return phoneImgUrl;
                }

                public void setPhoneImgUrl(String phoneImgUrl) {
                    this.phoneImgUrl = phoneImgUrl;
                }

                public String getPlayerType() {
                    return playerType;
                }

                public void setPlayerType(String playerType) {
                    this.playerType = playerType;
                }

                public String getRightCorner() {
                    return rightCorner;
                }

                public void setRightCorner(String rightCorner) {
                    this.rightCorner = rightCorner;
                }

                public int getSortNo() {
                    return sortNo;
                }

                public void setSortNo(int sortNo) {
                    this.sortNo = sortNo;
                }

                public String getSubName() {
                    return subName;
                }

                public void setSubName(String subName) {
                    this.subName = subName;
                }

                public String getTvChannelId() {
                    return tvChannelId;
                }

                public void setTvChannelId(String tvChannelId) {
                    this.tvChannelId = tvChannelId;
                }

                public String getUpdateInfo() {
                    return updateInfo;
                }

                public void setUpdateInfo(String updateInfo) {
                    this.updateInfo = updateInfo;
                }

                public String getVideoId() {
                    return videoId;
                }

                public void setVideoId(String videoId) {
                    this.videoId = videoId;
                }
            }
        }
    }
}
