package com.news.fast_news_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    String myString = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(myString);
    }
    public void on(View v) throws IOException {

        StringBuffer sff = new StringBuffer();
        Document doc= Jsoup.connect("http://news.163.com/16/0221/12/BGBN6K8300011229.html").get();
        Elements links = doc.select("a[href]");
        for(Element link : links){
            sff.append(link.text()).append("\n");
        }
        myString = sff.toString();
    }
}
