//Aarti Saravanan
//OOATD
//DTAI Year 3
//AS20251204
//AirVehicle Class

public class AirVehicle extends Vehicle {

    // Can this air vehicle fly by itself? (true) 
    // Or does it need wind/gravity to fly? (false)
    private boolean hasEngine;
    
    // How high can this vehicle fly in feet?
    private int highestAltitude;
    
    // What makes this vehicle move through the air?
    private String howItMoves;

    // Constructor - creates a new air vehicle with specific details
    public AirVehicle(boolean hasEngine, int highestAltitude, String howItMoves) {
        this.hasEngine = hasEngine;           // Does it have an engine?
        this.highestAltitude = highestAltitude; // How high can it go?
        this.howItMoves = howItMoves;         // What pushes it forward?
        
    // This if-else statement tells us whether the air vehicle is:
    // Self-powered (has engine) or Needs outside help to fly (no engine)
        if (hasEngine) { // Examples: Airplanes, helicopters, drones
            System.out.println("This vehicle has an engine to power itself.");
        } else { // Examples: ParaGliders, Wingsuit, hotairballoons
            System.out.println("This vehicle has no engine topower itself.");
        }
    }


    // Check if the vehicle has an engine
    public boolean hasEngine() {
        return hasEngine;
    }
    
    // Find out how high it can fly
    public int getHighestAltitude() {
        return highestAltitude;
    }
    
    // Find out what makes it move
    public String getHowItMoves() {
        return howItMoves;
    }