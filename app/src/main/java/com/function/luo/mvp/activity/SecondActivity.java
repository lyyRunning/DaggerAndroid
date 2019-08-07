package com.function.luo.mvp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;


import com.function.luo.base.BaseActivity;
import com.function.luo.daggerandroid.R;

import javax.inject.Inject;

/**
 * Created by QingMei on 2017/7/31.
 * desc:
 */

public class SecondActivity extends BaseActivity {

    @Inject
    String className;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.tv_content);
        tv.setText(className);
    }
}
