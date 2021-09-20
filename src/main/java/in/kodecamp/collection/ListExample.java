package in.kodecamp.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    static public List<Person> createList(int noOfItems) {
        List<Person> people = new ArrayList<>();
        Person p = null;
        for (int i = 0; i < noOfItems; i++) {
            p = new Person(i + 1, "Name__" + (i + 1));
            people.add(p);
        }
        return people;
    }

    static public class Person {
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            String PersonString = "[id= " + id + " name : " + name + " ]";
            return PersonString;
        }

        @Override
        public boolean equals(Object onotherObject) {
            if (!(onotherObject instanceof Person)) {
                return false;
            }
            Person obj = (Person) onotherObject;
            System.out.print("------------Equals");
            if (obj.id == this.id) {
                return true;
            }
            return false;
        }
    }
}
