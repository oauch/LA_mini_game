package com.example.la

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class Mackcha : AppCompatActivity() {

    lateinit var webview : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mackcha)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        webview = findViewById(R.id.webview)

        webview.webViewClient = A()

        webview.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }
        webview.loadUrl("https://bus.go.kr/subWayMain.jsp?mnuNm=3")
    }

    class A : WebViewClient(){
        override fun shouldOverrideUrlLoading( view: WebView?, url: String?): Boolean {
            return super.shouldOverrideUrlLoading(view, url)
        }
    }

}