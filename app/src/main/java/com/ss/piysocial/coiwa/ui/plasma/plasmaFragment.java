package com.ss.piysocial.coiwa.ui.plasma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.ss.piysocial.coiwa.R;

public class plasmaFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_plasma, container, false);
        WebView mywebview=(WebView)v.findViewById(R.id.webview3);
        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("https://www.donatingplasma.org/");
        return v;
    }
}
