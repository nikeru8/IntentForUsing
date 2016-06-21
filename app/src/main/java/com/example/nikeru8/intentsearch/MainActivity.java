package com.example.nikeru8.intentsearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //點我搜索
    public void search(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_WEB_SEARCH);

        intent.putExtra(SearchManager.QUERY, "nikeru8 blog"); //"這裡放要搜索的文字"
        startActivity(intent);
    }

    //網頁連結
    public void WEB(View view) {
        Uri uri = Uri.parse("http://nikeru8.blogspot.tw/");//這裡放妳要連結的網址
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }


    //地圖作標
    public void map(View view) {
        Uri uri = Uri.parse("geo:38.899533,-77.036476");//輸入座標
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    //路徑規劃
    public void maP2(View view) {

//saddr 出發地的經緯度， daddr 目的地的經緯度
        Uri uri = Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }


    //發送簡訊
    public void text(View view) {
        Intent it = new Intent(Intent.ACTION_VIEW);
        it.putExtra("sms_body", "這裡輸入妳想要的文字");//後面文字可作變更
        it.setType("vnd.android-dir/mms-sms");
        startActivity(it);

    }
}
