package in.kodecamp;

public class CollectionTest {

    private int count = 0;
    private static int acount = 0;

    public static void test(String[] args) {
        CollectionTest obj1 = new CollectionTest();
        obj1.count = 10;
        System.out.println("count = " + obj1.count);
        System.out.println("count = " + CollectionTest.acount);
        CollectionTest.acount = 100;

        CollectionTest obj2 = new CollectionTest();
        obj2.count = 20;
        System.out.println("count = " + obj2.count);
        System.out.println("count = " + CollectionTest.acount);
        System.out.println("count = " + CollectionTest.acount);

    }

    private static class Person {
        int id;
        String name;
        String address;

        Person(int id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        @Override
        public boolean equals(Object obj) {
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.id == p.id && this.address.equals(p.address);  
        }

        // @Override    
        // public boolean equal(Object obj1) {
        //     Person p1 = (Person)obj1;
        //     //System.out.println("......Equals called.....");
        //     return this.id == p1.id;
        //     //return this.name.equals(p.name);
        // }


    }

    public void testCollectionTest() {

        CollectionTest.Person p1 = new CollectionTest.Person(1, "golu", "kanpur");
        CollectionTest.Person p2 = new CollectionTest.Person(1, "golu", "kanpur");
        //CollectionTest.Person p2 = p1;

        System.out.println(p1);
        System.out.println(p2);

        assert (p1.equals(p2)) : "both are not equal";
       
    }
}