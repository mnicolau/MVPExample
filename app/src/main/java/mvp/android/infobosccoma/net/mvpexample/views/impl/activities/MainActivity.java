package mvp.android.infobosccoma.net.mvpexample.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.parceler.Parcels;

import java.util.List;

import mvp.android.infobosccoma.net.mvpexample.R;
import mvp.android.infobosccoma.net.mvpexample.models.business.entities.Person;
import mvp.android.infobosccoma.net.mvpexample.presenters.impl.MainViewPresenterImpl;
import mvp.android.infobosccoma.net.mvpexample.presenters.interfaces.IMainViewPresenter;
import mvp.android.infobosccoma.net.mvpexample.views.impl.adapters.PersonListAdapter;
import mvp.android.infobosccoma.net.mvpexample.views.interfaces.IMainView;


public class MainActivity extends AppCompatActivity implements IMainView, AdapterView.OnItemClickListener {


    private ListView list;
    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainViewPresenter presenter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);

        presenter = new MainViewPresenterImpl();
        presenter.onCreate(this);
        presenter.getPersonsFromService();
    }

    @Override
    public PersonListAdapter createPersonAdapter(List<Person> persons) {
        return new PersonListAdapter(this, persons);
    }

    @Override
    public void goToDetailActivity(Person person) {
        Intent intent = new Intent(this, DetailActivity.class);
        // quan s'han d'enviar objectes es fa embolcallant-los.
        // ens ajudem d'una llibreria externa, per no haver d'implementar la interface Parcelable
        intent.putExtra("PERSON", Parcels.wrap(person));
        startActivity(intent);
    }

    @Override
    public void createList(PersonListAdapter adapter) {
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showRetryButton() {
        btnRetry.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideRetryButton() {
        btnRetry.setVisibility(View.GONE);
    }

    @Override
    public void showList() {
        list.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideList() {
        list.setVisibility(View.GONE);
    }


    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        presenter.onItemClicked(position);
    }


}
