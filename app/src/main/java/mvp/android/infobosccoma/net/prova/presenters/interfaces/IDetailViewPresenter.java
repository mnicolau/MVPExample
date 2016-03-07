package mvp.android.infobosccoma.net.prova.presenters.interfaces;


import mvp.android.infobosccoma.net.prova.models.business.entities.Person;
import mvp.android.infobosccoma.net.prova.views.interfaces.IDetailView;

public interface IDetailViewPresenter {

	public void onCreate(IDetailView view, Person person);

}
