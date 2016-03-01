package com.news.fast_news_app.bottom_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.news.fast_news_app.R;
import com.news.fast_news_app.adapter.Tab4_Adapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/2/22.
 */
public class Bottom_Fourth extends Fragment {
    @Bind(R.id.tab4_listview)
    ListView tab4Listview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View bottom_view4 = inflater.inflate(R.layout.tabhost_view4, null);
        ButterKnife.bind(this, bottom_view4);
        tab4Listview.setAdapter(new Tab4_Adapter(getActivity()));
        return bottom_view4;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
