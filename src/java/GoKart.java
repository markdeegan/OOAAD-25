//# GoKart.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 09/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# gokarts are small powered land vehicles, usually track/road.

public class GoKart extends RoadVehicle {

    public GoKart() {
        super(4, 60);  // small 4-wheel vehicle
        System.out.println("GoKart created.");
    }
}
