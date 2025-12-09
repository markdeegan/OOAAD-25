//# Tractor.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 09/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# tractors are powered land vehicles used in farming making all terrain (atv)/off road

public class Tractor extends LandVehicle {

    public Tractor() {
        super(4, "off road");   //tractor has 4 wheels and operates mostly off road
        System.out.println("Tractor created.");
    }
}
