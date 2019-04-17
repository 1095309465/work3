package com.example.myapplication.utils;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JsSupport {//和js进行交互
    private Context mContext;
    private String json;

    public JsSupport(Context context) {
        mContext = context;
    }
    public void setJson(String json) {
        this.json = json;
    }

    @JavascriptInterface
    public String getJson(){//这个注解说明,该方法可以在js中调用.
        return json;
    }

    @JavascriptInterface
    public void showToast(String str) {//这个注解说明,该方法可以在js中调用.
        Toast.makeText(mContext, str, Toast.LENGTH_SHORT).show();
    }
}
