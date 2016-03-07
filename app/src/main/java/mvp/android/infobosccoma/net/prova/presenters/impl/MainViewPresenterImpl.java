package mvp.android.infobosccoma.net.prova.presenters.impl;


import android.content.Context;

import java.util.List;

import mvp.android.infobosccoma.net.prova.helpers.PersonBuilder;
import mvp.android.infobosccoma.net.prova.models.business.entities.Person;
import mvp.android.infobosccoma.net.prova.models.persistence.daos.impl.PersonsSQLiteDAO;
import mvp.android.infobosccoma.net.prova.models.persistence.daos.interfaces.PersonsDAO;
import mvp.android.infobosccoma.net.prova.presenters.interfaces.IMainViewPresenter;
import mvp.android.infobosccoma.net.prova.views.interfaces.IMainView;

public class MainViewPresenterImpl implements IMainViewPresenter {


    private IMainView view;
    private List<Person> persons;
    private Context context;

    @Override
    public void onCreate(IMainView view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void getPersonsFromService() {
        view.showProgressBar();
        view.hideList();

        // Aquí, és on demanem les dades
        // En aquest exemple, agafo les dades d'un "creador" de persones
        /*PersonBuilder personBuiler = new PersonBuilder();
        persons = personBuiler.getPersons();*/

        PersonsDAO personsDAO = new PersonsSQLiteDAO(context);
        persons = personsDAO.getAll();
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

