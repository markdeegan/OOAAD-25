// Aarti Saravanan
//OOATD
// DTAI Year 3
//AS20251209
//Helicopter Class

public class Helicopter extends AirVehicle { //Rotary Wing aircraft class
    
    public Helicopter() {
        super(1, "rotary-wing", 10000); // Constructor: 1 main rotor, rotary-wing type, 10,000 ft max altitude
        System.out.println("Helicopter created."); // Output creation
    }
}