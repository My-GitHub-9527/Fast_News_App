package com.news.fast_news_app.bottom_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.news.fast_news_app.R;
import com.news.fast_news_app.base.ButtonFrangmentBase;

/**
 * Created by Administrator on 2016/2/22.
 */
public class Bottom_Second extends ButtonFrangmentBase {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected View initViews(LayoutInflater inflater) {
        return inflater.inflate(R.layout.tabhost_view2,null);
    }
}
