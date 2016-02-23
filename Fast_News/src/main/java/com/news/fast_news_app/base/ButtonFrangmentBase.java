package com.news.fast_news_app.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/2/22.
 */
public abstract class ButtonFrangmentBase extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initViews(inflater);
    }

    /**
     *定义一个初始化布局的抽象方法，子类必须实现。
     * @param inflater 用来加载布局的
     * @return:返回一个布局对象
     */
    protected   abstract View initViews(LayoutInflater inflater);



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }



    /*
    * 初始化数据
    * */
    public void initData(){

    };
}
