//# ContainerShip.java tristanmake.mak - vehicle V2 makefile
//# owner: Tristan Berns
//# 15/12/25
//# DTAI Y3
//# Object Oriented Analysis and Design
//# container ships are large powered vessels used to transport cargo

public class ContainerShip extends PoweredWaterVehicle {

    public ContainerShip() {
        super(45, 200000);   //speed in km/h, weight in tonnes
        System.out.println("ContainerShip created.");
    }
}

