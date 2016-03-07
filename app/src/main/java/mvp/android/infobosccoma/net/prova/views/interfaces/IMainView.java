package mvp.android.infobosccoma.net.prova.views.interfaces;

import java.util.List;

import mvp.android.infobosccoma.net.prova.models.business.entities.Person;
import mvp.android.infobosccoma.net.prova.views.impl.adapters.PersonListAdapter;

public interface IMainView {

    public void createList(PersonListAdapter adapter);

    public PersonListAdapter createPersonAdapter(List<Person> persons);

    public void goToDetailActivity(Person person);

    public void showProgressBar();

    public void hideProgressBar();

    public void showRetryButton();

    public void hideRetryButton();

    public void showList();

    public void hideList();

    public void showMessage(String message);

}
