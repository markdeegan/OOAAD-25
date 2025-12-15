//# Jetski.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 15/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# jetskis are small fast powered water vehicles

public class Jetski extends PoweredWaterVehicle {

    public Jetski() {
        super(70, 0.4);   //speed in km/h, weight in tonnes
        System.out.println("Jetski created.");
    }
}
