package mvp.android.infobosccoma.net.mvpexample.presenters.impl;


import mvp.android.infobosccoma.net.mvpexample.models.business.entities.Person;
import mvp.android.infobosccoma.net.mvpexample.presenters.interfaces.IDetailViewPresenter;
import mvp.android.infobosccoma.net.mvpexample.views.interfaces.IDetailView;

public class DetailViewPresenterImpl implements IDetailViewPresenter {

	private IDetailView view;
	private Person person;

	@Override
	public void onCreate(IDetailView detailView, Person person) {
		view = detailView;
		this.person = person;

		view.setName(person.getName());
		view.setFirstname(person.getFirstName());
	}

}
