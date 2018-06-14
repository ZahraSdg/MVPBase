package ir.zahrasadeghi.mvpbase.model;

import android.os.AsyncTask;

import ir.zahrasadeghi.mvpbase.model.interactor.BaseListener;

/**
 * Created by ZahraSadeghi on 10/5/2016.
 */
public abstract class BaseTask<T extends BaseListener, Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    protected T listener;

    public BaseTask(T listener) {
        this.listener = listener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Result result) {
        super.onPostExecute(result);
    }
}
