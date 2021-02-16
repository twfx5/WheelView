package com.wang.wheelview.widget.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义数据源需要的数据model,自定义的话需要继承该数据model
 */
public class CustomTimeData {

    private String name;

    private List<CustomTimeData> list = new ArrayList<>();

    public CustomTimeData() {

    }

    @Override
    public String toString() {
        return name;
    }

    public CustomTimeData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CustomTimeData> getList() {
        return list;
    }

    public void setList(List<CustomTimeData> list) {
        this.list = list;
    }


}
