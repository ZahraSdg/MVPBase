package ir.zahrasadeghi.mvpbase.view;

import android.os.Bundle;

import ir.zahrasadeghi.mvpbase.presenter.MainPresenter;
import ir.zahrasadeghi.mvpbase.R;

/**
 * Created by ZahraSadeghi on 9/23/2016.
 */

public class MainActivity extends BaseActivity<MainPresenter> implements MainPresenter.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter constructPresenter() {
        return new MainPresenter(MainActivity.this, this);
    }

}
