package com.ss.piysocial.coiwa.ui.donations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.ss.piysocial.coiwa.R;

public class DonationFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_donation, container, false);
        WebView mywebview=(WebView)v.findViewById(R.id.webview3);
        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/donate");
        return v;
    }
}
