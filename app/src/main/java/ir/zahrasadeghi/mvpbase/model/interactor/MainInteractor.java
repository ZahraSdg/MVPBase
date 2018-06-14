package ir.zahrasadeghi.mvpbase.model.interactor;

/**
 * Created by ZahraSadeghi on 9/25/2016.
 */
public class MainInteractor implements Interactor {

    Listener listener;

    public MainInteractor(Listener listener) {
        this.listener = listener;
    }

    public interface Listener extends BaseListener {

    }
}
