package mvp.android.infobosccoma.net.mvpexample.presenters.interfaces;


import mvp.android.infobosccoma.net.mvpexample.models.business.entities.Person;
import mvp.android.infobosccoma.net.mvpexample.views.interfaces.IDetailView;

public interface IDetailViewPresenter {

	public void onCreate(IDetailView view, Person person);

}
