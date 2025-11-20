import java.sql.Date;                               // imports the Date class for storing the date of birth

public class person {                               // sefines person class
   private String placeOfBirth;                     // stores where the person was born (doesn't change)
   private Date dateOfBirth;                        // stores the person's date of birth (doesn't change)
   private String givenName;                        // stores the person's given/birth name
   private String familyName;                       // stores the person's family/birth name

    public person(String pob) {                     // constructor that takes place of birth as input
        this.placeOfBirth = pob;                    // sets the placeOfBirth field to the given value
    }

    public String getGivenName() {                  // returns the person's given name
        return givenName;                           // read only access to givenName
    }
    public String getFamilyName() {                 // returns the person's family name
        return familyName;                          // read only access to familyName
    }

    public static void main(String[] args) {        // main method for testing the class
        person p = new person("New York");     // creates a new person object with place of birth "New York"
        System.out.println("Place of Birth: " + p.placeOfBirth);
    }                                              // prints the place of birth for the created person
}

