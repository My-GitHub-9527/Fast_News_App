package com.news.fast_news_app.bottom_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.news.fast_news_app.R;

/**
 * Created by Administrator on 2016/2/22.
 */
public class Bottom_Second extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View bottom_view2 = inflater.inflate(R.layout.tabhost_view2,null);
        return bottom_view2;
    }
}