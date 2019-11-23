package com.nsyw.lib_commom;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author : yetianhua
 * @project: ComponentDemo
 * @date : 2019-11-23
 * @time : 20:59
 * @note :
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
