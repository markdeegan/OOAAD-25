// Mark Deegan
// Thu 20 Nov 2025 14:31:41 GMT

public class ownership {
	private person vehicleOwner;
	private vehicle ownedVehicle;

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
		ownershipRecord.setOwner(alice);
		ownershipRecord.setVehicle(car);

		System.out.println(ownershipRecord.getOwner()+ " owns the following vehicle " + ownershipRecord.getVehicle());
	}
}
