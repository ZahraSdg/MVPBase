package ir.zahrasadeghi.mvpbase.presenter;

import android.content.Context;

import ir.zahrasadeghi.mvpbase.view.BaseView;
import ir.zahrasadeghi.mvpbase.model.interactor.MainInteractor;

/**
 * Created by ZahraSadeghi on 9/23/2016.
 */
public class MainPresenter implements Presenter, MainInteractor.Listener {

    View View;
    Context context;
    private MainInteractor interactor;

    public MainPresenter(Context context, View View) {
        interactor = new MainInteractor(this);
        this.View = View;
        this.context = context;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {

    }

    public interface View extends BaseView {

    }
}
