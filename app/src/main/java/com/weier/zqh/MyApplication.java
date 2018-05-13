package com.weier.zqh;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.taobao.sophix.SophixManager;

/**
 * Demo class
 *
 * @author yikwing
 * @date 2018/5/13
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Logger.addLogAdapter(new AndroidLogAdapter() {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });


        SophixManager.getInstance().queryAndLoadNewPatch();
    }
}
