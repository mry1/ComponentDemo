package com.liuyi.common_module.base;

import android.app.Application;

import com.liuyi.common_module.utils.Utils;

public class BaseApplication extends Application {
    private static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        Utils.init(this);
    }

    public static BaseApplication getApplication() {
        return application;
    }
}
