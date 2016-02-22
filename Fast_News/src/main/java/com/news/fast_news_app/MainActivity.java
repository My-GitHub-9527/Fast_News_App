package com.news.fast_news_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.jsoup.Jsoup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Jsoup.connect("www.baidu.com");
    }
}
