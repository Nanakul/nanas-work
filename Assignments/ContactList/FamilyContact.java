public class FamilyContact extends Person {

  private String familyRelationship;

  //FamilyContact Constructor
  public FamilyContact() {
    
  }

  //Setters
  public void setFamilyRelationship(String familyRelationship) {
    this.familyRelationship = familyRelationship;
  }

  //Getters
  public String getFamilyRelationship() {
    return familyRelationship;
  }
}
