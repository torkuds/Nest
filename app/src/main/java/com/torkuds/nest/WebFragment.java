package com.torkuds.nest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * des:显示网页的Fragment
 * Created by torkuds
 * on 2017/4/21 0021.
 */

public class WebFragment extends Fragment {

    private WebView webView;
    private String url = "https://www.github.com";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_web, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        webView = (WebView) view.findViewById(R.id.webView);
        webView.loadUrl(url);
    }
}
