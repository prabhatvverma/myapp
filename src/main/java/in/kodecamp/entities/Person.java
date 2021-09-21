package in.kodecamp.entities;


public interface Person extends Comparable<Person> {
  // method prototypes
  public String uuid();
  public String name();
  public String address();
  public String changeAddress(String newAddress);
}
