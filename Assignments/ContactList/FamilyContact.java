public class FamilyContact extends Person {

  private String familyRelationship;

  //FamilyContact Constructor
  public FamilyContact(String familyRelationship) {
      this.familyRelationship = familyRelationship;
  }

  public String toString() {
      return "\nFamily Information -- Family Relationship: " + this.familyRelationship;
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
