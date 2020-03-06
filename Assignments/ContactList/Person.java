public class Person {

  private String name;
  private String phoneNumber;
  private String email;
  private String address;
  private String notes;
  private String birthday;

  //Parent class constructor
  public Person() {
    
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress() {
    return address;
  }

  public String getNotes() {
    return notes;
  }

  public String getBirthday() {
    return birthday;
  }
}
