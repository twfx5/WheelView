package com.wang.wheelview;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.wang.wheelview.widget.bean.CustomTimeData;
import com.wang.wheelview.widget.config.APMConfig;
import com.wang.wheelview.widget.wheel.WheelView;
import com.wang.wheelview.widget.wheel.adapters.ArrayWheelAdapter;

import java.util.ArrayList;
import java.util.List;

public class APMActivity extends AppCompatActivity {

    private WheelView apmWheel, hourWheel, minWheel;
    private int hour, minute;

    private int visibleItems = 5;

    private String defaultAPM = "上午";

    private String defaultHour = "8";

    private String defaultMinute = "30";

    private APMConfig config;

    private List<CustomTimeData> mTotalDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apm);
        apmWheel = findViewById(R.id.id_apm);
        hourWheel = findViewById(R.id.id_hour);
        minWheel = findViewById(R.id.id_minute);
        initData();
        wheel();
        TextView reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apmWheel.setCurrentItem(0, true);
                hourWheel.setCurrentItem(7, true);
                minWheel.setCurrentItem(30, true);
            }
        });
        TextView current = findViewById(R.id.current);
        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int apmCurrent = apmWheel.getCurrentItem();
                List<CustomTimeData> dataList = config.getDataList();
                CustomTimeData apmData = dataList.get(apmCurrent);
                int hourCurrent = hourWheel.getCurrentItem();
                List<CustomTimeData> hourList = apmData.getList();
                if (hourList == null) return;
                CustomTimeData hourData = hourList.get(hourCurrent);
                int minCurrent = minWheel.getCurrentItem();
                List<CustomTimeData> minuteList = hourData.getList();
                if (minuteList == null) return;
                CustomTimeData minData = minuteList.get(minCurrent);
                Toast.makeText(APMActivity.this, apmData + " - " + hourData
                        + " - " + minData, Toast.LENGTH_SHORT).show();
            }
        });
    }

   private void initData() {
        CustomTimeData am = new CustomTimeData("上午");

        CustomTimeData h1 = new CustomTimeData("1");
        CustomTimeData h2 = new CustomTimeData("2");
        CustomTimeData h3 = new CustomTimeData("3");
        CustomTimeData h4 = new CustomTimeData("4");
        CustomTimeData h5 = new CustomTimeData("5");
        CustomTimeData h6 = new CustomTimeData("6");
        CustomTimeData h7 = new CustomTimeData("7");
        CustomTimeData h8 = new CustomTimeData("8");
        CustomTimeData h9 = new CustomTimeData("9");
        CustomTimeData h10 = new CustomTimeData("10");
        CustomTimeData h11 = new CustomTimeData("11");
        CustomTimeData h12 = new CustomTimeData("12");

        List<CustomTimeData> h1List = new ArrayList<>();
        List<CustomTimeData> h2List = new ArrayList<>();
        List<CustomTimeData> h3List = new ArrayList<>();
        List<CustomTimeData> h4List = new ArrayList<>();
        List<CustomTimeData> h5List = new ArrayList<>();
        List<CustomTimeData> h6List = new ArrayList<>();
        List<CustomTimeData> h7List = new ArrayList<>();
        List<CustomTimeData> h8List = new ArrayList<>();
        List<CustomTimeData> h9List = new ArrayList<>();
        List<CustomTimeData> h10List = new ArrayList<>();
        List<CustomTimeData> h11List = new ArrayList<>();
        List<CustomTimeData> h12List = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            h1List.add(new CustomTimeData("" + i));
        }
        h1.setList(h1List);
        for (int i = 0; i < 60; i++) {
            h2List.add(new CustomTimeData("" + i));
        }
        h2.setList(h2List);
        for (int i = 0; i < 60; i++) {
            h3List.add(new CustomTimeData("" + i));
        }
        h3.setList(h3List);
        for (int i = 0; i < 60; i++) {
            h4List.add(new CustomTimeData("" + i));
        }
        h4.setList(h4List);
        for (int i = 0; i < 60; i++) {
            h5List.add(new CustomTimeData("" + i));
        }
        h5.setList(h5List);
        for (int i = 0; i < 60; i++) {
            h6List.add(new CustomTimeData("" + i));
        }
        h6.setList(h6List);
        for (int i = 0; i < 60; i++) {
            h7List.add(new CustomTimeData("" + i));
        }
        h7.setList(h7List);
        for (int i = 0; i < 60; i++) {
            h8List.add(new CustomTimeData("" + i));
        }
        h8.setList(h8List);
        for (int i = 0; i < 60; i++) {
            h9List.add(new CustomTimeData("" + i));
        }
        h9.setList(h9List);
        for (int i = 0; i < 60; i++) {
            h10List.add(new CustomTimeData("" + i));
        }
        h10.setList(h10List);
        for (int i = 0; i < 60; i++) {
            h11List.add(new CustomTimeData("" + i));
        }
        h11.setList(h11List);
        for (int i = 0; i < 60; i++) {
            h12List.add(new CustomTimeData("" + i));
        }
        h12.setList(h12List);
        List<CustomTimeData> amList = new ArrayList<>();
        amList.add(h1);
        amList.add(h2);
        amList.add(h3);
        amList.add(h4);
        amList.add(h5);
        amList.add(h6);
        amList.add(h7);
        amList.add(h8);
        amList.add(h9);
        amList.add(h10);
        amList.add(h11);
        amList.add(h12);
        am.setList(amList);

        CustomTimeData pm = new CustomTimeData("下午");
        List<CustomTimeData> pmList = new ArrayList<>();
        pmList.add(h1);
        pmList.add(h2);
        pmList.add(h3);
        pmList.add(h4);
        pmList.add(h5);
        pmList.add(h6);
        pmList.add(h7);
        pmList.add(h8);
        pmList.add(h9);
        pmList.add(h10);
        pmList.add(h11);
        pmList.add(h12);
        pm.setList(pmList);

        mTotalDataList.add(am);
        mTotalDataList.add(pm);
    }

    private void setUpData() {
        List<CustomTimeData> dataList = config.getDataList();
        if (dataList == null) return;

        int apmDefault = -1;
        if (!TextUtils.isEmpty(config.getDefaultAPM()) && dataList.size() > 0) {
            for (int i = 0; i < dataList.size(); i++) {
                if (dataList.get(i).getName().startsWith(config.getDefaultAPM())) {
                    apmDefault = i;
                    break;
                }
            }
        }

        ArrayWheelAdapter arrayWheelAdapter = new ArrayWheelAdapter<CustomTimeData>(APMActivity.this, dataList);
        //自定义item
        arrayWheelAdapter.setItemResource(R.layout.default_item_city);
        arrayWheelAdapter.setItemTextResource(R.id.default_item_city_name_tv);
        apmWheel.setViewAdapter(arrayWheelAdapter);

        //获取所设置的省的位置，直接定位到该位置
        if (-1 != apmDefault) {
            apmWheel.setCurrentItem(apmDefault);
        }

        // 设置可见条目数量
        apmWheel.setVisibleItems(config.getVisibleItems());
        hourWheel.setVisibleItems(config.getVisibleItems());
        minWheel.setVisibleItems(config.getVisibleItems());
        apmWheel.setCyclic(config.isAPMCyclic());
        hourWheel.setCyclic(config.isHourCyclic());
        minWheel.setCyclic(config.isMinuteCyclic());

        //显示滚轮模糊效果
        apmWheel.setDrawShadows(config.isDrawShadows());
        hourWheel.setDrawShadows(config.isDrawShadows());
        minWheel.setDrawShadows(config.isDrawShadows());

        //中间线的颜色及高度
        apmWheel.setLineColorStr(config.getLineColor());
        apmWheel.setLineWidth(config.getLineHeigh());
        hourWheel.setLineColorStr(config.getLineColor());
        hourWheel.setLineWidth(config.getLineHeigh());
        minWheel.setLineColorStr(config.getLineColor());
        minWheel.setLineWidth(config.getLineHeigh());

        updateHours();
    }

    private void updateHours() {
        //省份滚轮滑动的当前位置
        int apmCurrent = apmWheel.getCurrentItem();

        //省份选中的名称
        List<CustomTimeData> apmData = config.getDataList();
        CustomTimeData hourBean = apmData.get(apmCurrent);

        List<CustomTimeData> hourList = hourBean.getList();
        if (hourList == null) return;

        //设置最初的默认城市
        int hourDefault = -1;
        if (!TextUtils.isEmpty(config.getDefaultHour()) && hourList.size() > 0) {
            for (int i = 0; i < hourList.size(); i++) {
                if (hourList.get(i).getName().startsWith(config.getDefaultHour())) {
                    hourDefault = i;
                    break;
                }
            }
        }

        ArrayWheelAdapter hourAdapter = new ArrayWheelAdapter<CustomTimeData>(APMActivity.this, hourList);
        //自定义item
        hourAdapter.setItemResource(R.layout.default_item_city);
        hourAdapter.setItemTextResource(R.id.default_item_city_name_tv);

        hourWheel.setViewAdapter(hourAdapter);
        if (-1 != hourDefault) {
            hourWheel.setCurrentItem(hourDefault);
        } else {
            hourWheel.setCurrentItem(0);
        }
        updateMinutes();
    }

    private void updateMinutes() {
        int apmCurrent = apmWheel.getCurrentItem();
        int hourCurrent = hourWheel.getCurrentItem();

        List<CustomTimeData> dataList = config.getDataList();
        CustomTimeData apm = dataList.get(apmCurrent);
        List<CustomTimeData> hourList = apm.getList();
        if (hourList == null || hourList.size() <= hourCurrent) return;
        CustomTimeData hourData = hourList.get(hourCurrent);
        List<CustomTimeData> minList = hourData.getList();
        if (minList == null) return;

        int minDefault = -1;
        if (!TextUtils.isEmpty(config.getDefaultMinute()) && minList.size() > 0) {
            for (int i = 0; i < minList.size(); i++) {
                if (minList.get(i).getName().startsWith(config.getDefaultMinute())) {
                    minDefault = i;
                    break;
                }
            }
        }

        ArrayWheelAdapter minAdapter = new ArrayWheelAdapter<CustomTimeData>(APMActivity.this, minList);
        //自定义item
        minAdapter.setItemResource(R.layout.default_item_city);
        minAdapter.setItemTextResource(R.id.default_item_city_name_tv);
        minWheel.setViewAdapter(minAdapter);

        //设置默认城市
        if (-1 != minDefault) {
            minWheel.setCurrentItem(minDefault);
        } else {
            minWheel.setCurrentItem(0);
        }

    }

    private void wheel() {
        config = new APMConfig.Builder()
                .visibleItemsCount(visibleItems)
                .setDataList(mTotalDataList)
                .apm(defaultAPM)
                .hour(defaultHour)
                .minute(defaultMinute)
                .apmCyclic(false)
                .hourCyclic(true)
                .minuteCyclic(true)
                .build();

        setUpData();
    }
}