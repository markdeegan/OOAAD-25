import java.util.Date;

public class person {
   private String placeOfBirth;
   private Date dateOfBirth;
    private String givenName;
    private String familyName;


    public person(String pob, Date dob) {
        this.placeOfBirth = pob;
        this.dateOfBirth = dob;
    }

    public String getGivenName() {
        return givenName;
    }
    public String getFamilyName() {
        return familyName;
    }

    public Date getDOB() {
        return dateOfBirth;
    }
}