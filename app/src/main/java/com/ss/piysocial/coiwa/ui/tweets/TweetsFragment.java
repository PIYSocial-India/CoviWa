package com.ss.piysocial.coiwa.ui.tweets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.ss.piysocial.coiwa.R;

public class TweetsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_tweets, container, false);
        WebView mywebview=(WebView)v.findViewById(R.id.webview1);
        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("https://twitter.com/search?q=%23COVIDWarriors&src=recent_search_click");
        return v;
    }
}
