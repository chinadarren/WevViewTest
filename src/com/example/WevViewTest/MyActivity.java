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
        //����ҳ��֧��JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);//���ݴ���Ĳ�����ȥ�����µ���ҳ
                return true;//��ʾ��ǰWebView���Դ��������ҳ�����󣬲��ý���ϵͳ�����
            }

        });
        webView.loadUrl("http://www.baidu.com");
    }
}
