package in.kodecamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import in.kodecamp.collection.ListExample;
import in.kodecamp.commons.Logger;
import static in.kodecamp.collection.ListExample.Person;

public class ListTest {
    static final int NO_OF_ITEMS = 100000;

    public void setup(){


    }

    public void testLinkedlistAppend(){

        List<Integer> list = new LinkedList<>();
        long start =System.currentTimeMillis();


        for (int i = 0; i < NO_OF_ITEMS; i++){
            list.add(i);
        }

        long timeTaken = System.currentTimeMillis() - start;
        Logger.log("time_taken", timeTaken);
        assert true;
    }

    public void testArraylistAppend(){

        List<Integer> list = new ArrayList<>();
        long start =System.currentTimeMillis();


        for (int i = 0; i < NO_OF_ITEMS; i++){
            list.add(i);
        }

        long timeTaken = System.currentTimeMillis() - start;
        Logger.log("time_taken", timeTaken);
        assert true;
    }

    public void testList(){
        List<Person> people = ListExample.createList(10);
        Person myPerson = new Person(05, "prabhat");
        System.out.println(people);
        System.out.println("SizeOf  :"+people.size());
        System.out.println("IsEmpty  : "+people.isEmpty());

        people.contains(myPerson);

        boolean isFound = people.contains(myPerson);  
        System.out.println("isFound  : " +isFound);
    }
    
}
