package in.kodecamp.entities;

public class StudentImpl implements Student {

    private String uuid;
    private String name;
    private String address;
    private String rollNo;
    private String course;
    private String college;

    public StudentImpl(String uuid, String name, String address, String rollNo, String course, String college) {
        this.uuid = uuid;
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
        this.course = course;
        this.college = college;
        
    }

    @Override
    public String uuid() {
        return uuid;
    }

    @Override
    public String name() {

        return name;
    }

    @Override
    public String address() {

        return address;
    }

    @Override
    public String changeAddress(String newAddress) {
        this.address = newAddress;
        return this.address;
    }

    @Override
    public String rollNo() {
        return rollNo;
    }

    @Override
    public String course() {
        return course;
    }

    @Override
    public String college() {
        return college;
    }

}
