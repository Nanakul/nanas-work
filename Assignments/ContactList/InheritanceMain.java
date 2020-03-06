public class InheritanceMain {

  public static void main(String[] args) {

    //Creating objects
    BusinessContact obj = new BusinessContact();
    PersonalContact obj2 = new PersonalContact();
    FamilyContact obj3 = new FamilyContact();
    SchoolContact obj4 = new SchoolContact();

    //Set BusinessContact Information
    obj.setCompany("Microsoft");
    obj.setLinkedIn("Linkedin.com/in/nana");
    obj.setFaxNumber("1-800-382-5968");

    //Set PersonalContact Information
    obj2.setFacebook("Facebook.com/nana");
    obj2.setInstagram("@nana");
    
    //Set FamilyContact Information
    obj3.setFamilyRelationship("Son");

    //Set SchoolContact Information
    obj4.setCollege("UW");
    obj4.setMajor("CS");
    obj4.setDegree("BS");
    obj4.setGradYear("2018");

    System.out.println(obj.getCompany());
    System.out.println(obj.getLinkedIn());
    System.out.println(obj.getFaxNumber());
    System.out.println(obj2.getFacebook());
    System.out.println(obj2.getInstagram());
    System.out.println(obj3.getFamilyRelationship());
    System.out.println(obj4.getCollege());
    System.out.println(obj4.getMajor());
    System.out.println(obj4.getDegree());
    System.out.println(obj4.getGradYear());
  } 
}
