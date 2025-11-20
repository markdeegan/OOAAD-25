// Mark Deegan
// Thu 20 Nov 2025 14:31:41 GMT

import java.sql.Date;

public class ownership {
	private person vehicleOwner;
	private vehicle ownedVehicle;
	private Date ownershipDate;
	private Date NCTDueDate;
	private Date insuranceDueDate;
	private Date roadTaxDueDate;


	ownership(){
		this.vehicleOwner = null;
		this.ownedVehicle = null;
	}

	ownership(person owner, vehicle vehicle){
		this.vehicleOwner = owner;
		this.ownedVehicle = vehicle;
	}

	ownership(person owner, vehicle vehicle, Date ownershipDate, Date NCTDueDate, Date insuranceDueDate, Date roadTaxDueDate){
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

	public static void main(String[] args) {
		person alice = new person("Alice");
		vehicle car = new vehicle();

		ownership ownershipRecord = new ownership();
		ownership ownershipRecord2 = new ownership(new person("Limerick"), new vehicle(), new Date(2020,1,1), new Date(2022,1,1), new Date(2022,6,1), new Date(2022,12,1));

		ownershipRecord.setOwner(alice);
		ownershipRecord.setVehicle(car);

		System.out.println(ownershipRecord.getOwner()+ " owns the following vehicle " + ownershipRecord.getVehicle());
	}
}
