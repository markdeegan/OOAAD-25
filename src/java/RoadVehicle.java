//# RoahVehicle.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 09/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# attempt to create a RoadVehicle class
//# RoadVehicle is a subclass of LandVehicle
//# examples include cars, mopeds, motorbikes, lorries, and gokarts

public class RoadVehicle extends LandVehicle {

    //maximum legal speed on the road
    private int maxSpeed;

    //creates a road vehicle with wheel count, terrain type and speed
    public RoadVehicle(int wheelCount, int maxSpeed) {
        super(wheelCount, "road");   //road only terrain
        this.maxSpeed = maxSpeed;    //assign max speed
        System.out.println("RoadVehicle created.");
    }

    public int getMaxSpeed() {      //returns max legal speed
        return maxSpeed;
    }
}
