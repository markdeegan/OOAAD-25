//# WaterVehicle.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 11/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# base class for all water vehicles

public class WaterVehicle extends Vehicle {

    public int maxSpeed;     //maximum speed in km/h
    public double weight;    //weight in tonnes

    //creates a water vehicle with speed and weight
    public WaterVehicle(int maxSpeed, double weight) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        System.out.println("WaterVehicle created.");
    }
}

