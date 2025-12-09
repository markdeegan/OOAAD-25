//# Motorbike.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 09/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# motorbike is a powered road vehicle with two wheels

public class Motorbike extends RoadVehicle {

    private int engineSize;   //engine size in cc (e.g. 600cc)

    //creates a motorbike
    public Motorbike(int engineSize) {
        super(2, 100);        //2 wheels, typical speed 100km/h
        this.engineSize = engineSize;
        System.out.println("Motorbike created.");
    }

    public int getEngineSize() { return engineSize; }
}
