import java.util.ArrayList;
import java.util.Collections;

public class InheritanceMain {

    public static void main(String[] args) {

        //Create Person Objects
        Person Midi = new Person();
        Midi.setName("Nana");
        Midi.setPhoneNumber("425-911-9111");
        Midi.setAddress("12345 KingsCanyon LN");
        Midi.setEmail("BetterThanGosu@gmail.com");
        Midi.setNotes("Learn to code...");
        Midi.setBirthday("04/20/80");

        Person Anthony = new Person();
        Anthony.setName("PhoMachine");
        Anthony.setPhoneNumber("911-911-9111");
        Anthony.setAddress("23456 ARAM LN");
        Anthony.setEmail("BIGPHOMAN@gmail.com");
        Anthony.setNotes("Learn to code...");
        Anthony.setBirthday("04/21/80");

        Person Ashley = new Person();
        Ashley.setName("Oheuna");
        Ashley.setPhoneNumber("808-911-9111");
        Ashley.setAddress("34567 SummonersRift LN");
        Ashley.setEmail("BigSorkaHeals@gmail.com");
        Ashley.setNotes("Learn to Draw...");
        Ashley.setBirthday("05/03/80");

        //Creating objects
        BusinessContact obj = new BusinessContact("Microsoft", "/in/nanakul", "123-456-7890");
        PersonalContact obj2 = new PersonalContact("Facebook.com/nana", "@nana");
        FamilyContact obj3 = new FamilyContact("Son");
        SchoolContact obj4 = new SchoolContact("UW", "CS", "BS", "2018");

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
    
        //Added code for Assignment 6
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        //Create an array list and store the objects created.
        ArrayList<Person> contactList = new ArrayList<Person>();

        //Add Contacts to list
        contactList.add(Midi);
        contactList.add(Anthony);
        contactList.add(Ashley);

        //Sort the ArrayList
        //Collections.sort(Person);

        //Print the ArrayList
        System.out.println(contactList);
        System.out.println();

        //Remove Contacts from ArrayList
        contactList.remove(2);

        //Print the new ArrayList
        System.out.println(contactList);

        //Search the ArrayList
        boolean ans = contactList.contains(Ashley);

        if(ans) {
            System.out.println("Ashley is on the list. Here is their information.");
            System.out.println(Ashley);
        } else {
            System.out.println("Ashley is not on this list.");
        }
    }
}
