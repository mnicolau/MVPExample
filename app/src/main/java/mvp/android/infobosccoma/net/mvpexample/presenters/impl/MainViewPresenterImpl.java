package mvp.android.infobosccoma.net.mvpexample.presenters.impl;


import java.util.List;

import mvp.android.infobosccoma.net.mvpexample.helpers.PersonBuilder;
import mvp.android.infobosccoma.net.mvpexample.models.business.entities.Person;
import mvp.android.infobosccoma.net.mvpexample.presenters.interfaces.IMainViewPresenter;
import mvp.android.infobosccoma.net.mvpexample.views.interfaces.IMainView;

public class MainViewPresenterImpl implements IMainViewPresenter {


    private IMainView view;
    private List<Person> persons;

    @Override
    public void onCreate(IMainView view) {
        this.view = view;
    }

    @Override
    public void getPersonsFromService() {
        view.showProgressBar();
        view.hideList();

        // Aquí, és on demanem les dades
        // En aquest exemple, agafo les dades d'un "creador" de persones
        PersonBuilder personBuiler = new PersonBuilder();
        persons = personBuiler.getPersons();

        showList();
    }

    @Override
    public void showList() {
        view.hideProgressBar();
        view.createList(view.createPersonAdapter(persons));
        view.showList();
    }

    @Override
    public void onItemClicked(int position) {
        view.goToDetailActivity(persons.get(position));
    }
}

