package com.function.luo.mvp.model;


import com.function.luo.mvp.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by lyy
 * desc:
 */

public class MainModel implements MainContract.Model {

    @Inject
    public MainModel() {
    }

    public String returnMessage() {
        return "小明";
    }
}
