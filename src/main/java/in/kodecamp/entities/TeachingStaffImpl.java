package in.kodecamp.entities;

public class TeachingStaffImpl implements TeachingStaff {

    private String uuid;
    private String name;
    private String address;
    private String specialization;
    private Double salary;
    private String designation;

    public TeachingStaffImpl(String uuid, String name, String address, String specialization, Double salary, String designation ){
        
        this.uuid = uuid;
        this.name = name;
        this.address = address;
        this.specialization = specialization;
        this.salary = salary;
        this.designation = designation;
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
    public String specialization(){

        return this.specialization;
    }
  
    @Override
    public Double salary(){

        return this.salary;
    }

    @Override
    public String designation(){

        return designation;
    }

}
