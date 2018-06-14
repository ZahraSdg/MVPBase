package ir.zahrasadeghi.mvpbase.view;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import ir.zahrasadeghi.mvpbase.presenter.Presenter;

/**
 * Created by ZahraSadeghi on 9/22/2016.
 */

public abstract class BaseActivity<E extends Presenter> extends AppCompatActivity {

    protected E presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        ButterKnife.bind(this);

        presenter = constructPresenter();
        presenter.onStart();
    }

    @LayoutRes
    public abstract int getLayoutId();

    public E getPresenter() {
        return presenter;
    }

    public abstract E constructPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onStop();
    }
}
