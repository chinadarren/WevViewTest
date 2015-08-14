package com.example.WevViewTest;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private WebView webView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        webView = (WebView) findViewById(R.id.web_view);
        //设置页面支撑JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);//根据传入的参数再去加载新的网页
                return true;//表示当前WebView可以处理打开新网页的请求，不用借助系统浏览器
            }

        });
        webView.loadUrl("http://www.baidu.com");
    }
}
