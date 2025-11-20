// Mark Deegan
// Thu 20 Nov 2025 14:31:41 GMT

import java.time.LocalDate;

public class ownership {
	private person vehicleOwner;
	private vehicle ownedVehicle;
	private LocalDate ownershipDate;
	private LocalDate NCTDueDate;
	private LocalDate insuranceDueDate;
	private LocalDate roadTaxDueDate;


	ownership(){
		this.vehicleOwner = null;
		this.ownedVehicle = null;
	}

	ownership(person owner, vehicle vehicle){
		this.vehicleOwner = owner;
		this.ownedVehicle = vehicle;
	}

	ownership(person owner, vehicle vehicle, LocalDate ownershipDate, LocalDate NCTDueDate, LocalDate insuranceDueDate, LocalDate roadTaxDueDate)
	{
		this.vehicleOwner = owner;
		this.ownedVehicle = vehicle;
		this.ownershipDate = ownershipDate;
		this.NCTDueDate = NCTDueDate;
		this.insuranceDueDate = insuranceDueDate;
		this.roadTaxDueDate = roadTaxDueDate;
	}	

	public void setOwner(person owner) {
		this.vehicleOwner = owner;
	}	

	public person getOwner() {
		return this.vehicleOwner;
	}	

	public void setVehicle(vehicle vehicle) {
		this.ownedVehicle = vehicle;
	}	

	public vehicle getVehicle() {
		return this.ownedVehicle;
	}	

	public LocalDate getOwnershipDate() {
		return this.ownershipDate;
	}

	public LocalDate getNCTDueDate() {
		return this.NCTDueDate;
	}	


	public LocalDate getInsuranceDueDate() {
		return this.insuranceDueDate;
	}

	public LocalDate getRoadTaxDueDate() {
		return this.roadTaxDueDate;
	}

	public LocalDate setOwnershipDate(LocalDate ownershipDate) {
		return this.ownershipDate = ownershipDate;
	}	

	public LocalDate setNCTDueDate(LocalDate NCTDueDate) {
		return this.NCTDueDate = NCTDueDate;
	}

	public LocalDate setInsuranceDueDate(LocalDate insuranceDueDate) {
		return this.insuranceDueDate = insuranceDueDate;
	}	

	public LocalDate setRoadTaxDueDate(LocalDate roadTaxDueDate) {
		return this.roadTaxDueDate = roadTaxDueDate;
	}	

	public LocalDate extendNCTDueDate(int months) {
		this.NCTDueDate = this.NCTDueDate.plusMonths(months);
		return this.NCTDueDate;
	}	



	public static void main(String[] args) {
		person alice = new person("Alice");
		vehicle car = new vehicle();

		ownership ownershipRecord = new ownership();
		ownership ownershipRecord2 = new ownership(new person("Limerick"), new vehicle(), LocalDate.of(2020,1,1), LocalDate.of(2026,4,21), LocalDate.of(2022,6,1), LocalDate.of(2026,5,12));

		ownershipRecord.setOwner(alice);
		ownershipRecord.setVehicle(car);

		System.out.println("---------- ---------- ---------- ----------");
		System.out.println(ownershipRecord.getOwner()+ " owns the following vehicle " + ownershipRecord.getVehicle());
		System.out.println("---------- ---------- ---------- ----------");
		System.out.println(ownershipRecord2.getOwner()+ " owns the following vehicle " + ownershipRecord2.getVehicle() + ": NCT Due Date: " + ownershipRecord2.getNCTDueDate());
		System.out.println("---------- ---------- ---------- ----------");
	}
}

