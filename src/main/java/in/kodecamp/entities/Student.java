package in.kodecamp.entities;

// Every student is a person
public interface Student extends Person {
  public String rollNo();
  public String course();
  public String college();
}
