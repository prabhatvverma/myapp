package in.kodecamp.entities;

/**
 * College
 */
public interface College {
  public String regNo();  //(behavior)  METHOD PROTOTYPE
  public Course[] courses();
  public String address();
  public Student[] students();
}
