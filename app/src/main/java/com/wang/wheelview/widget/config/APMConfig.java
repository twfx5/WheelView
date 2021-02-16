package com.wang.wheelview.widget.config;


import com.wang.wheelview.widget.bean.CustomCityData;
import com.wang.wheelview.widget.bean.CustomTimeData;

import java.util.ArrayList;
import java.util.List;

/**
 * 时间选择器样式配置
 * 上下午、时钟、分钟
 */

public class APMConfig {

    public static final Integer NONE = -1111;

    /**
     * 滚轮显示的item个数
     */
    private int visibleItems = 5;

    /**
     * 上下午滚轮是否循环滚动
     */
    private boolean isAPMCyclic = true;

    /**
     * 时钟滚轮是否循环滚动
     */
    private boolean isHourCyclic = true;

    /**
     * 分钟滚轮是否循环滚动
     */
    private boolean isMinuteCyclic = true;

    /**
     * 自定义的item布局
     */
    private Integer customItemLayout;

    /**
     * 自定义的item txt id
     */
    private Integer customItemTextViewId;

    /**
     * 是否显示滚轮上面的模糊阴影效果
     */
    private boolean drawShadows = true;


    /**
     * 第一次默认的显示上下午，一般配合定位，使用
     */
    private String defaultAPM = "";

    /**
     * 第一次默认的显示小时，一般配合定位，使用
     */
    private String defaultHour = "";

    /**
     * 第一次默认的显示分钟，一般配合定位，使用
     */
    private String defaultMinute = "";


    /**
     * 中间线的颜色
     */
    private String lineColor = "#26A5FF";

    /**
     * 中间线的宽度
     */
    private int lineHeigh = 3;

    /**
     * 是否显示半透明的背景
     */
    private boolean isShowBackground = true;

    private List<CustomTimeData> dataList = new ArrayList<>();

    public boolean isShowBackground() {
        return isShowBackground;
    }

    public String getLineColor() {
        return lineColor == null ? "" : lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public int getLineHeigh() {
        return lineHeigh;
    }

    public void setLineHeigh(int lineHeigh) {
        this.lineHeigh = lineHeigh;
    }

    public boolean isDrawShadows() {
        return drawShadows;
    }

    public void setDrawShadows(boolean drawShadows) {
        this.drawShadows = drawShadows;
    }

    public int getVisibleItems() {
        return visibleItems;
    }

    public void setVisibleItems(int visibleItems) {
        this.visibleItems = visibleItems;
    }

    public boolean isAPMCyclic() {
        return isAPMCyclic;
    }

    public void setAPMCyclic(boolean APMCyclic) {
        isAPMCyclic = APMCyclic;
    }

    public boolean isHourCyclic() {
        return isHourCyclic;
    }

    public void setHourCyclic(boolean hourCyclic) {
        isHourCyclic = hourCyclic;
    }

    public boolean isMinuteCyclic() {
        return isMinuteCyclic;
    }

    public void setMinuteCyclic(boolean minuteCyclic) {
        isMinuteCyclic = minuteCyclic;
    }

    public String getDefaultAPM() {
        return defaultAPM == null ? "" : defaultAPM;
    }

    public void setDefaultAPM(String defaultAPM) {
        this.defaultAPM = defaultAPM;
    }

    public String getDefaultHour() {
        return defaultHour == null ? "" : defaultHour;
    }

    public void setDefaultHour(String defaultHour) {
        this.defaultHour = defaultHour;
    }

    public String getDefaultMinute() {
        return defaultMinute == null ? "" : defaultMinute;
    }

    public void setDefaultMinute(String defaultMinute) {
        this.defaultMinute = defaultMinute;
    }

    public Integer getCustomItemLayout() {
        return customItemLayout == null ? NONE : customItemLayout;
    }

    public void setCustomItemLayout(int customItemLayout) {
        this.customItemLayout = customItemLayout;
    }

    public Integer getCustomItemTextViewId() {
        return customItemTextViewId == null ? NONE : customItemTextViewId;
    }

    public void setCustomItemTextViewId(Integer customItemTextViewId) {
        this.customItemTextViewId = customItemTextViewId;
    }

    public List<CustomTimeData> getDataList() {
        return dataList;
    }

    public void setDataList(List<CustomTimeData> dataList) {
        this.dataList = dataList;
    }

    public void setShowBackground(boolean showBackground) {
        isShowBackground = showBackground;
    }

    public APMConfig(Builder builder) {
        /**
         * 滚轮相关的属性：
         * 1、item显示的个数
         * 2、省份是否可以循环
         * 3、城市是否可以循环
         * 4、地区是否可以循环
         */
        this.visibleItems = builder.visibleItems;
        this.isAPMCyclic = builder.isAPMCyclic;
        this.isMinuteCyclic = builder.isMintueCyclic;
        this.isHourCyclic = builder.isHourCyclic;
        /**
         * 默认的省市区地址
         */
        this.defaultMinute = builder.defaultMinute;
        this.defaultHour = builder.defaultHour;
        this.defaultAPM = builder.defaultAPM;

        /**
         * 是否显示半透明
         */
        this.isShowBackground = builder.isShowBackground;

        /**
         * 自定义item的布局，必须制定Layout和id
         */
        this.customItemLayout = builder.customItemLayout;
        this.customItemTextViewId = builder.customItemTextViewId;

        /**
         * 是否显示滚轮上面的模糊阴影效果
         */
        this.drawShadows = builder.drawShadows;
        this.lineColor = builder.lineColor;
        this.lineHeigh = builder.lineHeigh;
        this.dataList = builder.dataList;

    }

    public static class Builder {

        /**
         * 滚轮显示的item个数
         */
        private int visibleItems = 5;

        /**
         * 上下午滚轮是否循环滚动
         */
        private boolean isAPMCyclic = true;

        /**
         * 小时滚轮是否循环滚动
         */
        private boolean isHourCyclic = true;

        /**
         * 分钟滚轮是否循环滚动
         */
        private boolean isMintueCyclic = true;

        /**
         * 是否显示半透明的背景
         */
        private boolean isShowBackground = true;

        /**
         * 自定义的item布局
         */
        private Integer customItemLayout;

        /**
         * 自定义的item txt id
         */
        private Integer customItemTextViewId;

        /**
         * 是否显示滚轮上面的模糊阴影效果
         */
        private boolean drawShadows = true;

        /**
         * 中间线的颜色
         */
        private String lineColor = "#C7C7C7";

        /**
         * 中间线的宽度
         */
        private int lineHeigh = 3;

        private List<CustomTimeData> dataList = new ArrayList<>();

        /**
         * 第一次默认显示的上下午，一般配合定位，使用
         */
        private String defaultAPM = "";

        /**
         * 第一次默认显示的城市，一般配合定位，使用
         */
        private String defaultHour = "";

        /**
         * 第一次默认显示的分钟，一般配合定位，使用
         */
        private String defaultMinute = "";

        public Builder() {
        }

        public Builder setDataList(List<CustomTimeData> data) {
            this.dataList = data;
            return this;
        }

        /**
         * 第一次默认的显示上下午，一般配合定位，使用
         *
         * @param defaultAPM
         * @return
         */
        public Builder apm(String defaultAPM) {
            this.defaultAPM = defaultAPM;
            return this;
        }

        /**
         * 第一次默认得显示小时，一般配合定位，使用
         *
         * @param defaultHour
         * @return
         */
        public Builder hour(String defaultHour) {
            this.defaultHour = defaultHour;
            return this;
        }

        /**
         * 第一次默认分钟显示，一般配合定位，使用
         *
         * @param defaultMinute
         * @return
         */
        public Builder minute(String defaultMinute) {
            this.defaultMinute = defaultMinute;
            return this;
        }

        /**
         * 中间线的宽度
         *
         * @param lineHeigh
         * @return
         */
        public Builder setLineHeigh(int lineHeigh) {
            this.lineHeigh = lineHeigh;
            return this;
        }

        /**
         * 中间线的颜色
         *
         * @param lineColor
         * @return
         */
        public Builder setLineColor(String lineColor) {
            this.lineColor = lineColor;
            return this;
        }

        /**
         * 是否显示滚轮上面的模糊阴影效果
         *
         * @param drawShadows
         * @return
         */
        public Builder drawShadows(boolean drawShadows) {
            this.drawShadows = drawShadows;
            return this;
        }

        /**
         * 滚轮显示的item个数
         *
         * @param visibleItems
         * @return
         */
        public Builder visibleItemsCount(int visibleItems) {
            this.visibleItems = visibleItems;
            return this;
        }

        /**
         * 上下午滚轮是否循环滚动
         *
         * @param isAPMCyclic
         * @return
         */
        public Builder apmCyclic(boolean isAPMCyclic) {
            this.isAPMCyclic = isAPMCyclic;
            return this;
        }

        /**
         * 小时滚轮是否循环滚动
         *
         * @param isHourCyclic
         * @return
         */
        public Builder hourCyclic(boolean isHourCyclic) {
            this.isHourCyclic = isHourCyclic;
            return this;
        }

        /**
         * 分滚轮是否循环滚动
         *
         * @param isMintueCyclic
         * @return
         */
        public Builder minuteCyclic(boolean isMintueCyclic) {
            this.isMintueCyclic = isMintueCyclic;
            return this;
        }

        /**
         * 是否显示半透明的背景
         *
         * @param isShowBackground
         * @return
         */
        public Builder showBackground(boolean isShowBackground) {
            this.isShowBackground = isShowBackground;
            return this;
        }

        /**
         * 自定义item布局
         *
         * @param itemLayout
         * @return
         */
        public Builder setCustomItemLayout(Integer itemLayout) {
            this.customItemLayout = itemLayout;
            return this;
        }

        /**
         * 自定义item布局中的id
         *
         * @param setCustomItemTextViewId
         * @return
         */
        public Builder setCustomItemTextViewId(Integer setCustomItemTextViewId) {
            this.customItemTextViewId = setCustomItemTextViewId;
            return this;
        }

        public APMConfig build() {
            APMConfig config = new APMConfig(this);
            return config;
        }
    }
}
