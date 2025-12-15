//# SpeedBoat.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 15/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# speedboats are powered water vehicles designed for high speed travel

public class SpeedBoat extends PoweredWaterVehicle {

    public SpeedBoat() {
        super(80, 4.5);   //speed in km/h, weight in tonnes
        System.out.println("SpeedBoat created.");
    }
}
