package com.function.luo.base;

import android.app.Activity;
import android.app.Application;

import com.function.luo.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by luo on 2019/8/7.
 */

public class MyApplication  extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

}
