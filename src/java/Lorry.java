//# Lorry.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 09/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# lorries are heavier powered road vehicles

public class Lorry extends RoadVehicle {

    private double loadCapacity;  //how much weight it can carry (tonnes)

    public Lorry(double loadCapacity) {
        super(6, 90);             //6 wheels, slower max speed
        this.loadCapacity = loadCapacity;
        System.out.println("Lorry created.");
    }

    public double getLoadCapacity() { return loadCapacity; }
}
