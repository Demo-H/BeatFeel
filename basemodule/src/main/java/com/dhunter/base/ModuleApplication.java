package com.dhunter.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by dhunter on 2019/5/6.
 */

public class ModuleApplication extends Application {

    private static ModuleApplication instance;

    public static ModuleApplication getInstance() {
        return instance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 65535
        MultiDex.install(this);
    }
}
