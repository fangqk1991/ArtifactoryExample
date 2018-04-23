package com.example.module3;

import com.example.module1.Module1;
import com.example.module2.Module2;
import com.loopj.android.http.AsyncHttpClient;
import com.tencent.mm.sdk.constants.ConstantsAPI;

public class Module3 {

    public static ConstantsAPI.WXApp checkModule1()
    {
        return Module1.wxApp();
    }

    public static AsyncHttpClient checkModule2()
    {
        return Module2.httpClient();
    }
}
