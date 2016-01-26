package mvp.android.infobosccoma.net.mvpexample.presenters.interfaces;


import mvp.android.infobosccoma.net.mvpexample.views.interfaces.IMainView;

public interface IMainViewPresenter {

    public void onCreate(IMainView view);

    public void getPersonsFromService();

    public void showList();

    public void onItemClicked(int position);

}
