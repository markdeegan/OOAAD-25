//# Moped.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 09/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# mopeds are light powered road vehicles with smaller engines

public class Moped extends RoadVehicle {

    public Moped() {
        super(2, 45);   //2 wheels, very low max speed
        System.out.println("Moped created.");
    }
}
