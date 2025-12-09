//# LandVehicle.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 08/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# attempt to create a LandVehicle class


public class LandVehicle extends Vehicle {

    //number of wheels the vehicle has
    private int wheels;

    //type of terrain it is designed for (road, off-road, mixed)
    private String terrainType;


    //constructor that sets basic land vehicle information
    public LandVehicle(int wheels, String terrainType) {
        this.wheels = wheels;               //store number of wheels
        this.terrainType = terrainType;     //store terrain category

        System.out.println("Land vehicle created.");
    }


    // ----------------------------
    // Getter methods
    // ----------------------------

    public int getWheels() {               //returns number of wheels
        return wheels;
    }

    public String getTerrainType() {       //returns terrain type
        return terrainType;
    }
}
