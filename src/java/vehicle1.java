//Vehicle 
/** @author Aarti Saravanan */
//programme to show vehicle classes (e.g. car, plane, boat)
//Thursday 20 November 2025

//This class represents a vehicle with a model, make and VIN
public class vehicle {
    private String CarModel; //Model of the car
    private String CarMake; //Make of the Car
    private int VehicleIdentificationNumber; // Unique ID Number

    //Constructor that accepts the VIN as an integer
    public vehicle(int VIN){
        this.VehicleIdentificationNumber = VIN; //Set the VIN when creating the object
    }

    //Get method for the car model
    public String getCarModel(){
        return CarModel;
    }

    //Get method for the car make
    public String getCarMake(){
        return CarMake;
    }

    //Get method for the VIN
    public int getVIN(){
        return VIN;
    }
}