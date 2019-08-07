package com.function.luo.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.function.luo.bean.Student;
import com.function.luo.mvp.activity.MainActivity;
import com.function.luo.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luo on 2019/8/7.
 * 对应每一个 Activity 的小箱子
 */
@Module
public class MainActivityModule {


    @Provides
    static String provideName() {
        return MainActivity.class.getName();
    }

    @Provides
    static SharedPreferences provideSp(MainActivity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }

    @Provides
    @ActivityScope
    static Student provideStudent() {
        return new Student();
    }
}
