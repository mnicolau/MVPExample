package mvp.android.infobosccoma.net.mvpexample.models.business.entities;

import org.parceler.Parcel;

/**
 * Created by marc on 25/01/2016.
 */
@Parcel
public class Person {

    private String name;
    private String firstName;

    public Person() {

    }

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
