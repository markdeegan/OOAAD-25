//# Submarine.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 11/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# submarines are powered water vehicles capable of underwater travel

public class Submarine extends PoweredWaterVehicle {

    public Submarine() {
        super(50, 18000);   //speed in km/h, weight in tonnes
        System.out.println("Submarine created.");
    }
}

