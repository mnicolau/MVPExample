package mvp.android.infobosccoma.net.prova.presenters.interfaces;


import android.content.Context;

import mvp.android.infobosccoma.net.prova.views.interfaces.IMainView;

public interface IMainViewPresenter {

    public void onCreate(IMainView view, Context context);

    public void getPersonsFromService();

    public void showList();

    public void onItemClicked(int position);

}
