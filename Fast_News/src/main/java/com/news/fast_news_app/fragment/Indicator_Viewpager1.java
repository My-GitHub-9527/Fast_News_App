package com.news.fast_news_app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.news.fast_news_app.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/2/22.
 */
public class Indicator_Viewpager1 extends Fragment {
    @Bind(R.id.slider)
    SliderLayout slider;
    @Bind(R.id.custom_indicator)
    PagerIndicator customIndicator;
    /**
     * TextSliderView代表轮播的图片
     */
    private TextSliderView image_slider_1;
    private TextSliderView image_slider_2;
    private TextSliderView image_slider_3;
    private TextSliderView image_slider_4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewpager1 = inflater.inflate(R.layout.indicator_viewpager1, null);
        ButterKnife.bind(this, viewpager1);
        initImageSlider();
        return viewpager1;
    }

    private void initImageSlider() {
        //TextSliderView 代表轮播的图片
        image_slider_1 = new TextSliderView(this.getActivity());
        image_slider_1.description("大妈组团花千元买鱼 大明湖集体放生");//图片数量根据这几行代码重复添加
        //网络图片
        image_slider_1.image("http://192.168.1.91:8080/neteasy/head_news3.jpg");
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
        image_slider_2.image("http://192.168.1.91:8080/neteasy/head_news7.jpg");
        slider.addSlider(image_slider_2);

        image_slider_3 = new TextSliderView(this.getActivity());
        image_slider_3.description("陕西戒毒所内女警与学员共庆元宵节");
        image_slider_3.image("http://192.168.1.91:8080/neteasy/head_news8.jpg");
        slider.addSlider(image_slider_3);

        image_slider_4 = new TextSliderView(this.getActivity());
        image_slider_4.description("2016春运落幕：哪些魂萦梦牵离家人");
        image_slider_4.image("http://192.168.1.91:8080/neteasy/head_news10.jpg");
        slider.addSlider(image_slider_3);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
