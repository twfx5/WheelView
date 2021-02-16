package com.wang.wheelview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wang.wheelview.widget.Interface.OnCityItemClickListener;
import com.wang.wheelview.widget.bean.CityBean;
import com.wang.wheelview.widget.bean.DistrictBean;
import com.wang.wheelview.widget.bean.ProvinceBean;
import com.wang.wheelview.widget.config.CityConfig;
import com.wang.wheelview.widget.wheel.WheelView;

public class MainActivity extends AppCompatActivity {

    private int visibleItems = 5;

    private boolean isProvinceCyclic = true;

    private boolean isCityCyclic = true;

    private boolean isDistrictCyclic = true;

    private boolean isShowBg = true;
    private boolean isShowGAT = true;

    private String defaultProvinceName = "江苏";

    private String defaultCityName = "常州";

    private String defaultDistrict = "新北区";

    public CityConfig.WheelType mWheelType = CityConfig.WheelType.PRO_CITY_DIS;

    CityPickerView mCityPickerView = new CityPickerView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wheel();
            }
        });
        TextView apm = findViewById(R.id.apm);
        apm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, APMActivity.class));
            }
        });
    }

    private void wheel() {
        CityConfig cityConfig = new CityConfig.Builder()
                .title("选择城市")
                .visibleItemsCount(visibleItems)
                .province(defaultProvinceName)
                .city(defaultCityName)
                .district(defaultDistrict)
                .provinceCyclic(isProvinceCyclic)
                .cityCyclic(isCityCyclic)
                .districtCyclic(isDistrictCyclic)
                .setCityWheelType(mWheelType)
                //.setCustomItemLayout(R.layout.item_city)//自定义item的布局
                //.setCustomItemTextViewId(R.id.item_city_name_tv)
                .setShowGAT(isShowGAT)
                .build();

        mCityPickerView.init(MainActivity.this);
        mCityPickerView.setConfig(cityConfig);
        mCityPickerView.setOnCityItemClickListener(new OnCityItemClickListener() {
            @Override
            public void onSelected(ProvinceBean province, CityBean city, DistrictBean district) {
                StringBuilder sb = new StringBuilder();
                sb.append("选择的结果：\n");
                if (province != null) {
                    sb.append(province.getName() + " " + province.getId() + "\n");
                }

                if (city != null) {
                    sb.append(city.getName() + " " + city.getId() + ("\n"));
                }

                if (district != null) {
                    sb.append(district.getName() + " " + district.getId() + ("\n"));
                }

                Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(MainActivity.this, "已取消", Toast.LENGTH_SHORT).show();
            }
        });
        mCityPickerView.showCityPicker();
    }
}