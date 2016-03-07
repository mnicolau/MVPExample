package mvp.android.infobosccoma.net.prova.views.impl.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import mvp.android.infobosccoma.net.mvpexample.R;
import mvp.android.infobosccoma.net.prova.models.business.entities.Person;

/**
 * Created by marc on 25/01/2016.
 */
public class PersonListAdapter extends ArrayAdapter<Person> {
    private Context context;
    private LayoutInflater inflater;

    public PersonListAdapter(Context context, List<Person> comments) {
        super(context, 0, comments);

        this.context = context;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PersonHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_list, parent, false);

            holder = new PersonHolder();
            addViewsToHolder(convertView, holder);
            convertView.setTag(holder);
        } else {
            holder = (PersonHolder) convertView.getTag();
        }
        Person person = getItem(position);
        setDataIntoHolder(holder, person);

        return convertView;
    }

    private void addViewsToHolder(View convertView, PersonHolder holder) {
        holder.name = (TextView) convertView.findViewById(R.id.main_txtview_name);
        holder.firstName = (TextView) convertView.findViewById(R.id.main_txtview_firstname);
    }

    private void setDataIntoHolder(PersonHolder holder, Person person) {
        //Picasso.with(context).load(image.getUrl()).fit().into(holder.image);
        holder.name.setText(person.getLastName());
        holder.firstName.setText(person.getFirstName());
    }

    class PersonHolder {
        TextView name;
        TextView firstName;
    }

}
