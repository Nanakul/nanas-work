public class BusinessContact extends Person {

  private String company;
  private String linkedIn;
  private String faxNumber;

  //BusinessContact constructor
  public BusinessContact(String company, String linkedIn, String faxNumber) {
      this.company = company;
      this.linkedIn = linkedIn;
      this.faxNumber = faxNumber;
  }

  public String toString() {
      return "\nBusiness Contact Information -- Company: " + this.company + " | LinkedIn: " + this.linkedIn + " | FaxNumber: " + this.faxNumber;
  }

  //Setters
  public void setCompany(String company) {
    this.company = company;
  }

  public void setLinkedIn(String linkedIn) {
    this.linkedIn = linkedIn;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  //Getters
  public String getCompany() {
    return company;
  }

  public String getLinkedIn() {
    return linkedIn;
  }

  public String getFaxNumber() {
    return faxNumber;
  }
}
