package mvp.android.infobosccoma.net.prova.presenters.impl;


import mvp.android.infobosccoma.net.prova.models.business.entities.Person;
import mvp.android.infobosccoma.net.prova.presenters.interfaces.IDetailViewPresenter;
import mvp.android.infobosccoma.net.prova.views.interfaces.IDetailView;

public class DetailViewPresenterImpl implements IDetailViewPresenter {

	private IDetailView view;
	private Person person;

	@Override
	public void onCreate(IDetailView detailView, Person person) {
		view = detailView;
		this.person = person;

		view.setName(person.getLastName());
		view.setFirstname(person.getFirstName());
	}

}
