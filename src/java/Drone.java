// Aarti Saravanan
//OOATD
// DTAI Year 3
//AS20251209
//Drone Class

public class Drone extends AirVehicle { // Electric aircraft class
    
    public Drone() {
        super(4, "electric", 400); // Constructor: 4 motors, electric, 400 ft max altitude
        System.out.println("Drone created."); // Output creation
    }
}