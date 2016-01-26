package mvp.android.infobosccoma.net.mvpexample.helpers;

import java.util.ArrayList;
import java.util.List;

import mvp.android.infobosccoma.net.mvpexample.models.business.entities.Person;

/**
 * Created by marc on 25/01/2016.
 */
public class PersonBuilder {
    public PersonBuilder() {
    }

    public List<Person> getPersons() {

        List<Person> persons = new ArrayList<>();

        persons.add(new  Person("Joan", "Pujol"));
        persons.add(new  Person("Pere", "Mir"));
        persons.add(new  Person("Anna", "Roca"));
        persons.add(new  Person("Josep", "Bou"));
        persons.add(new  Person("Jon", "Viles"));

        return persons;
    }
}
