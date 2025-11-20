// Mark Deegan
// Thu 20 Nov 2025 14:31:41 GMT

// we are going to use this to handle dates, instead of the more obvious, but deprecated java.util.Date
import java.time.LocalDate;

// start definition of public class ownership {
public class ownership {
	// that has data members representing the owner
	private person vehicleOwner;
	// and the vehicle owned
	private vehicle ownedVehicle;
	// and the date of ownership
	private LocalDate ownershipDate;
	// and the NCT, insurance, and road tax due dates
	private LocalDate NCTDueDate;
	private LocalDate insuranceDueDate;
	private LocalDate roadTaxDueDate;


	// it also has a default constructor, 	
	public ownership() {
		this.vehicleOwner = null;
		this.ownedVehicle = null;
	}

	// and also a non-default constructor
	public	ownership(person owner, vehicle vehicle){
		this.vehicleOwner = owner;
		this.ownedVehicle = vehicle;
	}

	// it also has another constructor that takes more details
	public ownership(person owner, vehicle vehicle, LocalDate ownershipDate, LocalDate NCTDueDate, LocalDate insuranceDueDate, LocalDate roadTaxDueDate)
	{
		// thayt sets all the data members, based on the parameters passed
		this.vehicleOwner = owner;
		this.ownedVehicle = vehicle;
		this.ownershipDate = ownershipDate;
		this.NCTDueDate = NCTDueDate;
		this.insuranceDueDate = insuranceDueDate;
		this.roadTaxDueDate = roadTaxDueDate;
	}	

	// we also have a slew of getter and setter functions
	// set the owner of the vehicle
	public void setOwner(person owner) {
		this.vehicleOwner = owner;
	}	

	// return the owner of the vehicle
	public person getOwner() {
		return this.vehicleOwner;
	}	

	// set the vehicle owned
	public void setVehicle(vehicle vehicle) {
		this.ownedVehicle = vehicle;
	}	

	// return the vehicle owned
	public vehicle getVehicle() {
		return this.ownedVehicle;
	}	

	// get set the date when ownership last changed
	public LocalDate getOwnershipDate() {
		return this.ownershipDate;
	}

	// return the NCT due date
	public LocalDate getNCTDueDate() {
		return this.NCTDueDate;
	}	

	// get the insurance due date
	public LocalDate getInsuranceDueDate() {
		return this.insuranceDueDate;
	}

	// get the road tax due date
	public LocalDate getRoadTaxDueDate() {
		return this.roadTaxDueDate;
	}

	// set the date when ownership last changed
	public LocalDate setOwnershipDate(LocalDate ownershipDate) {
		return this.ownershipDate = ownershipDate;
	}	

	// set the NCT due date
	public LocalDate setNCTDueDate(LocalDate NCTDueDate) {
		return this.NCTDueDate = NCTDueDate;
	}

	public LocalDate setInsuranceDueDate(LocalDate insuranceDueDate) {
		return this.insuranceDueDate = insuranceDueDate;
	}	

	// set the road tax due date
	public LocalDate setRoadTaxDueDate(LocalDate roadTaxDueDate) {
		return this.roadTaxDueDate = roadTaxDueDate;
	}	

	// extend the NCT due date by a given number of months
	public LocalDate extendNCTDueDate(int months) {
		this.NCTDueDate = this.NCTDueDate.plusMonths(months);
		return this.NCTDueDate;
	}	


	// main function to test the class
	public static void main(String[] args) {
		// create a new person called Alice
		person alice = new person("Dublin");

		// create a new 'anonyous' vehicle
		vehicle car = new vehicle();

		// create an ownership record
		ownership ownershipRecord = new ownership();

		// create another ownership record with more details
		ownership ownershipRecord2 = new ownership(new person("Limerick"), new vehicle(), LocalDate.of(2020,1,1), LocalDate.of(2026,4,21), LocalDate.of(2022,6,1), LocalDate.of(2026,5,12));

		// set the owner of the first vehicle
		ownershipRecord.setOwner(alice);
		// set the vehicle owned
		ownershipRecord.setVehicle(car);

		// print out some debugging info
		System.out.println("---------- ---------- ---------- ----------");
		System.out.println(ownershipRecord.getOwner().getFamilyName()+" "+ownershipRecord.getOwner().getGivenName()+ " owns the following vehicle " + ownershipRecord.getVehicle());
		System.out.println("---------- ---------- ---------- ----------");
		System.out.println(ownershipRecord2.getOwner()+ " owns the following vehicle " + ownershipRecord2.getVehicle() + ": NCT Due Date: " + ownershipRecord2.getNCTDueDate());
		System.out.println("---------- ---------- ---------- ----------");
	}
}

