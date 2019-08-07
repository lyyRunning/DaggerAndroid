package com.function.luo.di;

import com.function.luo.di.module.MainActivityModule;
import com.function.luo.di.scope.ActivityScope;
import com.function.luo.mvp.activity.MainActivity;
import com.function.luo.mvp.activity.SecondActivity;
import com.function.luo.mvp.module.SecondActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by luo on 2019/8/7.
 * 整个 APP 统一的 Moudle，类似大箱子
 *
 */
@Module
public abstract class AppModule {

    /**
     * 引入MainActivityModule
     * @return
     */
    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivityInject();

    /**
     * 引入SecondActivityModule
     * @return
     */
    @ActivityScope
    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInject();

}
