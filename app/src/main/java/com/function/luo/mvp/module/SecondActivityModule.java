package com.function.luo.mvp.module;

import com.function.luo.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luo on 2019/8/7.
 * 对应每一个 Activity 的小箱子
 */
@Module
public class SecondActivityModule {
    @Provides
    static String provideName(){
        return SecondActivity.class.getName();
    }
}
