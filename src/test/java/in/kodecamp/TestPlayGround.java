package in.kodecamp;

import static in.kodecamp.commons.Logger.log;

import in.kodecamp.entities.Course;
import in.kodecamp.entities.CourseImpl;
import in.kodecamp.entities.Person;
import in.kodecamp.entities.PersonImpl;
import in.kodecamp.entities.Student;
import in.kodecamp.entities.StudentImpl;
import in.kodecamp.entities.StudentMarks;
import in.kodecamp.entities.StudentMarksImpl;
import in.kodecamp.entities.TeachingStaff;
import in.kodecamp.entities.TeachingStaffImpl;
import in.kodecamp.entities.Test;

/**
 * Unit test for simple App.
 */
public class TestPlayGround {

    public void testPerson() {
        log("start: TestPlayGround : ", "testPerson");

        // person object
        Person p = new PersonImpl("uu100", "Golu", "Kanpur");
        String uuid = p.uuid();
        // log("uuid", uuid);
        String name = p.name();
        String address = p.address();

        assert uuid.equals("uu100") : "Actual uuid does not match to expected uuid";
        assert name.equals("Golu") : "Actual name does not match to expected name";
        assert address.equals("Kanpur") : "Actual address does not match to expected address";

        log("end  : TestPlayGround : ", "testPerson");
    }

    public void testTeachingStaff() {

        log("start: TestPlayGround : ", "testTeachingStaff");

        TeachingStaff t = new TeachingStaffImpl("u100111", "Sunil sir", "Prayagraj", "cs", 10.0056, "developer");

        String uuid = t.uuid();
        String name = t.name();
        String address = t.address();
        String specialization = t.specialization();
        Double salary = t.salary();
        String designation = t.designation();

        assert uuid.equals("u100111") : "Actual uuid does not match to expected uuid";
        assert name.equals("Sunil sir") : "Actual name does not match to expected name";
        assert address.equals("Prayagraj") : "Actual address does not match to expected address";
        assert specialization.equals("cs") : "Actual specilization does not match to expected specilization";
        assert salary.equals(10.0056) : "Actual salary does not match to expected salary";
        assert designation.equals("developer") : "Actual designation does not match to expected designation";

        log("end  : TestPlayGround : ", "testTeachingStaff");
    }

    public void testStudent() {
        log("start: TestPlayGround ", "testStudent");

        Student s = new StudentImpl("u1001", "Golu", "Kanpur", "rum1901504201", "BTech", "Rama");

        String uuid = s.uuid();
        String name = s.name();
        String address = s.address();
        String rollNo = s.rollNo();
        String course = s.course();
        String college = s.college();

        assert uuid.equals("u1001") : "Actual uuid does not match to expected uuid";
        assert name.equals("Golu") : "Actual name does not match to expected name";
        assert address.equals("Kanpur") : "Actual address does not match to expected address";
        assert rollNo.equals("rum1901504201") : "Actual  does not match to expected address";
        assert course.equals("BTech") : "Actual address does not match to expected address";
        assert college.equals("Rama") : "Actual address does not match to expected address";

        log("end  : TestPlayGround : ", "testStudent");
    }

    public void testCourse() {

        log("Start: TestPlayGround :", "testCourse");

        Course c = new CourseImpl("B Tech", "3year", new String[] { "java", "sql" });

        String title = c.title();
        String duration = c.duration();
        String[] subjects = c.subjects();

        assert title.equals("B Tech") : "Actual title does not match the expacted title";
        assert duration.equals("3year") : "Actual duration doest not match the expacted duration";
        // assert subjects.equals(new String[] { "java" }) : "Actual subjects does not
        // match the expected subjects";

    log(subjects+ "end  : TestPlayGround : ", "testCourse");

    }

    public void testStudentMarks() {
        log("start: TestPlayGround ", "testStudentsMarks");

        StudentMarks s = new StudentMarksImpl("Golu", "BTech", "fifth", null);

        String name = s.name();
        String course = s.course();
        String semester = s.semester();
        // List<Integer> marks = s.marks() ;

        assert name.equals("Golu"): "Actual name does not match to expected name";
        assert course.equals("BTech"): "Actual address does not match to expected address";
        assert semester.equals("fifth"): "Actual semester does not match to expected semester";

        log("end  : TestPlayGround : " , "testStudentMarks");
    }

    public void testCollege() {
        // CollegeImpl is a College
        // College college = new CollegeImpl();

    }

    // private Person fetchPersonFromService(String uuid) {
    // Person p = new PersonImpl(uuid, "Golu", "Kanpur");
    // return p;
    // }

    public void testStatic() {
        Test.test2();
        Test test = new Test();
        test.test1();
    }

}
