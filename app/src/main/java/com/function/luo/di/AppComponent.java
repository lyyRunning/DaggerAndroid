package com.function.luo.di;

import com.function.luo.base.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by luo on 2019/8/7.
 * 全局的快递员
 */
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AppModule.class})
public interface AppComponent {
    void inject(MyApplication application);
}
