package com.function.luo.mvp.presenter;



import com.function.luo.mvp.activity.MainActivity;
import com.function.luo.mvp.contract.MainContract;
import com.function.luo.mvp.model.MainModel;

import javax.inject.Inject;

/**
 * Created by lyy
 * desc:
 */

public class MainPresenter implements MainContract.Presenter {

    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
        this.view = view;
        this.model = model;
    }

    public void requestHttp() {
        view.onGetMessage(model.returnMessage());
    }
}
