//# Ferry.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 15/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# ferries can transport people or vehicles over short distances

public class Ferry extends PoweredWaterVehicle {

    public Ferry() {
        super(35, 12000);   //speed in km/h, weight in tonnes
        System.out.println("Ferry created.");
    }
}

