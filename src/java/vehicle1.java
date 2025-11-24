//Vehicle 
/** @author Aarti Saravanan */
//programme to show vehicle classes (e.g. car, plane, boat)
//Thursday 20 November 2025


public class vehilcle {
    private String CarModel;
    private String CarMake;
    private int VehicleIdentificationNumber;


    public vehicle(String VIN){
        this.VehicleIdentificationNumber = VIN;
    }

    public String getCarModel(){
        return CarModel;
    }

    public String getCarMake(){
        return CarMake;
    }

    public int getVIN(){
        return VIN;
    }
}