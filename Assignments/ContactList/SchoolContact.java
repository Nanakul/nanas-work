public class SchoolContact extends Person {

  private String college;
  private String major;
  private String degree;
  private String gradYear;

  //SchoolContact Constructor
  public SchoolContact(String college, String major, String degree, String gradYear) {
      this.college = college;
      this.major = major;
      this.degree = degree;
      this.gradYear = gradYear;
  }

  public String toString() {
      return "\nSchool Information -- College: " + this.college + " | Major: " + this.major + " | Degree: " + this.degree + " | Expected Graduation: " + this.gradYear;
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
