package com.example.module2;

import com.loopj.android.http.AsyncHttpClient;

public class Module2 {
    public static AsyncHttpClient httpClient()
    {
        return new AsyncHttpClient(true, 80, 443);
    }
}
