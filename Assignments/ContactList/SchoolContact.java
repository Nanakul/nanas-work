public class SchoolContact extends Person {

  private String college;
  private String major;
  private String degree;
  private String gradYear;

  //SchoolContact Constructor
  public SchoolContact() {

  }

  //Setters
  public void setCollege(String college) {
    this.college = college;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public void setGradYear(String gradYear) {
    this.gradYear = gradYear;
  }

  //Getters
  public String getCollege() {
    return college;
  }

  public String getMajor() {
    return major;
  }

  public String getDegree() {
    return degree;
  }

  public String getGradYear() {
    return gradYear;
  }
}
