package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webpage extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage);
        webView=findViewById(R.id.webpage);


        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new Browser());
        webView.loadUrl("https://www.programiz.com/java-programming");

    }
    private class Browser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
       else{
            super.onBackPressed();
        }
    }
}