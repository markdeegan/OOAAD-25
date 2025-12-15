//# PoweredWaterVehicle.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 11/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# powered water vehicles base class
//# examples include submarines, cruise ships, jetskis, and speedboats

public class PoweredWaterVehicle extends WaterVehicle {

    public PoweredWaterVehicle(int maxSpeed, double weight) {
        super(maxSpeed, weight);
        System.out.println("PoweredWaterVehicle created.");
    }
}
