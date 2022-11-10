package com.example.banner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.config.IndicatorConfig;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.indicator.RectangleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Banner mBanner;
    private List<ImageBean> mList = new ArrayList<>();

    private void initView(){
        mBanner = (Banner) findViewById(R.id.banner);
        mBanner.setAdapter(new ImageAdapter(MainActivity.this, mList));

        // Set Banner is auto to loop.
        mBanner.isAutoLoop(true);

        // Set an indicator for Banner.
        mBanner.setIndicator(new CircleIndicator(this));
        mBanner.start();
    }

    private void initData(){
        mList.add(new ImageBean(R.drawable.loading));
        mList.add(new ImageBean(R.drawable.loading));
        mList.add(new ImageBean(R.drawable.loading));
        mList.add(new ImageBean(R.drawable.loading));
        mList.add(new ImageBean(R.drawable.loading));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        initView();

    }

}


