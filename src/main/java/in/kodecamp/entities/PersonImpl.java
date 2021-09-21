package in.kodecamp.entities;

/**
 * PersonImpl
 */
public class PersonImpl implements Person, Comparable<Person> {

  private String uuid;
  private String name;
  private String address;

  /**
   *
   */
  public PersonImpl(String uuid, String name, String address) {
    this.uuid = uuid;
    this.name = name;
    this.address = address;
  }

  @Override
  public String name() {
    return this.name;
  }

  @Override
  public String uuid() {
    return this.uuid;
  }

  @Override
  public String address() {
    return this.address;
  }

  @Override
  public String changeAddress(String newAddress) {
    this.address = newAddress;
    return this.address;
  }

  @Override
  public String toString() {
    String PersonString = "\r[uuid= " + uuid + " name : " + name + " Address : " + address + "]\r\n";
    return PersonString;
  }

  @Override
  public boolean equals(Object onotherObject) {
    if (!(onotherObject instanceof Person)) {
      return false;
    }
    PersonImpl obj = (PersonImpl) onotherObject;
    System.out.print("------------Equals \r\n");
    // if (obj.uuid.equals(uuid)) {
    // return true;
    // }
    // return false;
    return obj.uuid.equals(this.uuid) ? true : false;
  }

  @Override
  public int compareTo(Person o) {
    String thisUuid = String.valueOf(this.uuid);
    String otherUuid = String.valueOf(o.uuid());
    return thisUuid.compareTo(otherUuid);
    // return String.valueOf(this.uuid).compareTo(String.valueOf(o.uuid));
  }


}
