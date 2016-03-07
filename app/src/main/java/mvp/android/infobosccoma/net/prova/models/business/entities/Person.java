package mvp.android.infobosccoma.net.prova.models.business.entities;

import org.parceler.Parcel;

/**
 * Created by marc on 25/01/2016.
 */
@Parcel
public class Person {

    private String lastName;
    private String firstName;
    private long codi;

    public Person() {

    }

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getCodi() {
        return codi;
    }

    public void setCodi(long codi) {
        this.codi = codi;
    }
}
