public class PersonalContact extends Person {

  private String linkFacebook;
  private String linkInstagram;

  //PersonalContact Constructor
  public PersonalContact() {

  }

  //Setters
  public void setFacebook(String linkFacebook) {
    this.linkFacebook = linkFacebook;
  }

  public void setInstagram(String linkInstagram) {
    this.linkInstagram = linkInstagram;
  }

  //Getters
  public String getFacebook() {
    return linkFacebook;
  }

  public String getInstagram() {
    return linkInstagram;
  }
}
