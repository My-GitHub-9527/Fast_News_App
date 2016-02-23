package com.news.fast_news_app.bottom_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.news.fast_news_app.R;
import com.news.fast_news_app.adapter.Indicator_Viewpager_Adapter;
import com.news.fast_news_app.view.Dispatch_ViewPager;
import com.viewpagerindicator.TabPageIndicator;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/2/22.
 * 底部菜单的第一个页面
 */
public class Bottom_First extends Fragment {

    @Bind(R.id.indicator)
    TabPageIndicator tab_Indicator;
    @Bind(R.id.indicator_viewpager)
    Dispatch_ViewPager indicatorViewpager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View bottom_view1 = inflater.inflate(R.layout.tabhost_view1, null);
        ButterKnife.bind(this, bottom_view1);
        indicatorViewpager.setAdapter(new Indicator_Viewpager_Adapter(getChildFragmentManager()));
        //设置预加载的页数 ，这样就不会导致每次切换都会重新加载了
        indicatorViewpager.setOffscreenPageLimit(10);
        tab_Indicator.setViewPager(indicatorViewpager);
        return bottom_view1;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
