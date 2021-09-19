package in.kodecamp.entities;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    static public List<Person> createList(int noOfItems) {
        List<Person> people = new ArrayList<>();
        Person p = null;
        for (int i = 0; i < noOfItems; i++) {
            p = new PersonImpl("uuid_" + (i + 1), "Name_" + (i + 1), "Address_" + (i + 1));
            people.add(p);
        }
        return people;
    }

}
