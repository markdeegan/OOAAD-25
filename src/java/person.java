import java.sql.Date;

public class person {
   private String placeOfBirth;
   private Date dateOfBirth;
    private String givenName;
    private String familyName;


    public person(String pob) {
        this.placeOfBirth = pob;
    }

    public String getGivenName() {
        return givenName;
    }
    public String getFamilyName() {
        return familyName;
    }

    public static void main(String[] args) {
        // Example usage
        person p = new person("New York"); // 
        System.out.println("Place of Birth: " + p.placeOfBirth);
    }   
}

