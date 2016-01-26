package mvp.android.infobosccoma.net.mvpexample.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import org.parceler.Parcels;
import mvp.android.infobosccoma.net.mvpexample.R;
import mvp.android.infobosccoma.net.mvpexample.models.business.entities.Person;
import mvp.android.infobosccoma.net.mvpexample.presenters.impl.DetailViewPresenterImpl;
import mvp.android.infobosccoma.net.mvpexample.presenters.interfaces.IDetailViewPresenter;
import mvp.android.infobosccoma.net.mvpexample.views.interfaces.IDetailView;


/**
 * Created by juanjo on 14/2/15.
 */
public class DetailActivity extends AppCompatActivity implements IDetailView {

    private TextView txtName;
    private TextView txtFirstName;

    private IDetailViewPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtName = (TextView) findViewById(R.id.detail_txtview_name);
        txtFirstName = (TextView) findViewById(R.id.detail_txtview_firstname);

        presenter = new DetailViewPresenterImpl();
        presenter.onCreate(this, getPersonFromIntent(getIntent()));
    }


    @Override
    public void setImage(String url) {
        // per si tinguessim un ImageView, per exemple...
    }

    @Override
    public void setName(String text) {
        txtName.setText(text);
    }

    @Override
    public void setFirstname(String text) {
        txtFirstName.setText(text);
    }

    private Person getPersonFromIntent(Intent intent) {
        return (Person) Parcels.unwrap(intent.getParcelableExtra("PERSON"));
    }

}
