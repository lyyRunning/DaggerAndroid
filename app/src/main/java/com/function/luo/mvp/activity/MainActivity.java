package com.function.luo.mvp.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.function.luo.base.BaseActivity;
import com.function.luo.bean.Student;
import com.function.luo.mvp.contract.MainContract;
import com.function.luo.daggerandroid.R;
import com.function.luo.mvp.presenter.MainPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    String className;
    @Inject
    SharedPreferences sp;
    @Inject
    MainPresenter presenter;
    @Inject
    Student s1;
    @Inject
    Student s2;

    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvContent.setText(className + "\n" +
                s2.toString() + "\n" +
                s1.toString() + "\n" +
                sp.toString()
        );
    }


    public void gotoSecond(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void requestHttp(View view) {
        presenter.requestHttp();
    }

    /**
     * 返回数据
     *
     * @param message
     */
    public void onGetMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
