//package com.vvvd.yk;
//
//import android.app.Activity;
//import android.graphics.PixelFormat;
//import android.os.Bundle;
//import android.view.Window;
//import android.view.WindowManager;
//
//import com.tencent.smtt.sdk.TbsDownloader;
//import com.tencent.smtt.sdk.WebView;
//import com.tencent.smtt.sdk.WebViewClient;
//
///**
// * Created by Administrator on 2017/9/16.
// */
//
//public class VebViewDemo extends Activity {
//
//    private WebView twv_test;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getWindow().setFormat(PixelFormat.TRANSLUCENT);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉应用标题
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.activity_main);
//
//        TbsDownloader.needDownload(getApplicationContext(), false);
//
//        twv_test = (WebView) findViewById(R.id.twv_test);
//        twv_test.setWebViewClient(client);
//        twv_test.loadUrl("http://www.82190555.com/index/qqvod.php?url=https://v.qq.com/x/cover/j7rhyrkajgw3w97.html");
//
//    }
//
//    private WebViewClient client = new WebViewClient() {
//        // 防止加载网页时调起系统浏览器
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url);
//            return true;
//        }
//    };
//}
