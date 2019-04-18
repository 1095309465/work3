package com.example.myapplication.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.R;
import com.example.myapplication.module.FriendsZone;
import com.example.myapplication.utils.JsSupport;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class WebActivity extends AppCompatActivity {
    WebView mWebView;
    String TAG=WebActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        //hideSystemUI
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        initWeb();
    }
    //初始化webview
    private void initWeb(){
        Log.e(TAG,"初始化web");

        mWebView=findViewById(R.id.web);
        //解决点击链接跳转浏览器问题
        mWebView.setWebViewClient(new WebViewClient());
//js支持
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
//允许访问assets目录
        settings.setAllowFileAccess(true);
//设置WebView排版算法, 实现单列显示, 不允许横向移动
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//assets文件路径
        String path = "file:///android_asset/index.html";
//添加Json数据
        addJson();
//加载Html页面
        mWebView.loadUrl(path);

    }


    private void addJson() {
        JsSupport jsSupport = new JsSupport(this);
        List<FriendsZone> zones = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            zones.add(new FriendsZone("鹿鹿" + i, "images/icon.png", "这里是Html测试数据, 这里是Html测试数据, 这里是Html测试数据" + i));
        }
        Gson gson = new Gson();
        String json = gson.toJson(zones);
        Log.d(TAG, "addJson: json => " + json);
        jsSupport.setJson(json);
        //添加js交互接口, 并指明js中对象的调用名称
        mWebView.addJavascriptInterface(jsSupport, "weichat");
    }


    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }

    }
}
