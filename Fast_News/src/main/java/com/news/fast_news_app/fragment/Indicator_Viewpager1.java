package com.news.fast_news_app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.news.fast_news_app.R;
import com.news.fast_news_app.adapter.NewsList_Adapter;
import com.nhaarman.listviewanimations.appearance.simple.SwingLeftInAnimationAdapter;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/2/22.
 */
public class Indicator_Viewpager1 extends Fragment {
    private ListView newsList;
    private SliderLayout slider;
    private PagerIndicator customIndicator;
    /**
     * TextSliderView代表轮播的图片
     */
    private TextSliderView image_slider_1;
    private TextSliderView image_slider_2;
    private TextSliderView image_slider_3;
    private TextSliderView image_slider_4;
    private View header_news;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewpager1 = inflater.inflate(R.layout.indicator_viewpager1, null);
        newsList = (ListView) viewpager1.findViewById(R.id.news_list);
        header_news = inflater.inflate(R.layout.news_header_layout, null);
        slider = (SliderLayout) header_news.findViewById(R.id.slider);
        customIndicator = (PagerIndicator) header_news.findViewById(R.id.custom_indicator);
        initImageSlider();
        initNewsList();
        return viewpager1;
    }


    /**
     * 初始化新闻列表
     */
    private void initNewsList() {
        newsList.addHeaderView(header_news);
        NewsList_Adapter newsListAdapter = new NewsList_Adapter(getActivity());
        SwingLeftInAnimationAdapter swingLeftInAnimationAdapter = new SwingLeftInAnimationAdapter(newsListAdapter);
        swingLeftInAnimationAdapter.setAbsListView(newsList);
        newsList.setAdapter(swingLeftInAnimationAdapter);

    }

    /**
     * 初始化图片轮播库
     */
    private void initImageSlider() {
        //TextSliderView 代表轮播的图片
        image_slider_1 = new TextSliderView(this.getActivity());
        image_slider_1.description("大妈组团花千元买鱼 大明湖集体放生");//图片数量根据这几行代码重复添加
        //网络图片
        image_slider_1.image(R.mipmap.head_news1);
        slider.addSlider(image_slider_1);
        //设置图片的转变动画，提供了 16 种
        slider.setPresetTransformer(SliderLayout.Transformer.FlipHorizontal);
        //设置持续时间
        slider.setDuration(2000);
        slider.setCustomIndicator(customIndicator);
        //设置动画,(实现了描述文字的动画)
        slider.setCustomAnimation(new DescriptionAnimation());

        image_slider_2 = new TextSliderView(this.getActivity());
        image_slider_2.description("南京数十万人观秦淮灯会 场面壮观");
        image_slider_2.image(R.mipmap.head_news1);
        slider.addSlider(image_slider_2);

        image_slider_3 = new TextSliderView(this.getActivity());
        image_slider_3.description("陕西戒毒所内女警与学员共庆元宵节");
        image_slider_3.image(R.mipmap.head_news1);
        slider.addSlider(image_slider_3);

        image_slider_4 = new TextSliderView(this.getActivity());
        image_slider_4.description("2016春运落幕：哪些魂萦梦牵离家人");
        image_slider_4.image(R.mipmap.head_news1);
        slider.addSlider(image_slider_3);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
