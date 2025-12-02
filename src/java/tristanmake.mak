# tristanmake.mak - vehicle V2 makefile
# owner: Tristan Berns
# 01/12/25
# DTAI Y3
# Object Oriented Analysis and Design

Categories
----------------------
all: land water air military
----------------------
Clean
----------------------
clean: rm -f ../bin/*.class

####################################################################################################################################
------------------------------------------------------------------------------------------------------------------------------------
Land Vehicles
------------------------------------------------------------------------------------------------------------------------------------

land: LandVehicle ATV Car CombineHarvester DirtBike DuneBuggy Lorry Moped Motorbike Tractor QuadBike GoKart Snowmobile roadvehicle

LandVehicle: javac -d ../bin/ LandVehicle.java

ATV: javac -d ../bin/ ATV.java

Car: javac -d ../bin/ Car.java

CombineHarvester: javac -d ../bin/ CombineHarvester.java

DirtBike: javac -d ../bin/ DirtBike.java

DuneBuggy: javac -d ../bin/ DuneBuggy.java

Lorry: javac -d ../bin/ Lorry.java

Moped: javac -d ../bin/ Moped.java

Motorbike: javac -d ../bin/ Motorbike.java

Tractor: javac -d ../bin/ Tractor.java

QuadBike: javac -d ../bin/ QuadBike.java

GoKart: javac -d ../bin/ GoKart.java

Snowmobile: javac -d ../bin/ Snowmobile.java

roadvehicle: Car Lorry Moped Motorbike GoKart

RoadVehicle: javac -d ../bin/ RoadVehicle.java


------------------------------------------------------------------------------------------------------------------------------------
Water Vehicles
------------------------------------------------------------------------------------------------------------------------------------

water: WaterVehicle PoweredWaterVehicle NonPoweredWaterVehicle

WaterVehicle: javac -d ../bin/ WaterVehicle.java

PoweredWaterVehicle: Submarine ContainerShip CruiseShip Jetski SurfaceBoat SpeedBoat Yacht Ferry

Submarine: javac -d ../bin/ Submarine.java

ContainerShip: javac -d ../bin/ ContainerShip.java

CruiseShip: javac -d ../bin/ CruiseShip.java

Jetski: javac -d ../bin/ Jetski.java

SurfaceBoat: javac -d ../bin/ SurfaceBoat.java

SpeedBoat: javac -d ../bin/ SpeedBoat.java

Yacht: javac -d ../bin/ Yacht.java

Ferry: javac -d ../bin/ Ferry.java

NonPoweredWaterVehicle: Sailboat Kayak Canoe PaddleBoat

Sailboat: javac -d ../bin/ Sailboat.java

Kayak: javac -d ../bin/ Kayak.java

Canoe: javac -d ../bin/ Canoe.java

PaddleBoat: javac -d ../bin/ PaddleBoat.java

------------------------------------------------------------------------------------------------------------------------------------
Air Vehicles
------------------------------------------------------------------------------------------------------------------------------------

air: AirVehicle PoweredAirVehicle NonPoweredAirVehicle

AirVehicle: javac -d ../bin/ AirVehicle.java

PoweredAirVehicle: AirPlane Drone Helicopter Jet

AirPlane: javac -d ../bin/ AirPlane.java

Drone: javac -d ../bin/ Drone.java

Helicopter: javac -d ../bin/ Helicopter.java

Jet: javac -d ../bin/ Jet.java

NonPoweredAirVehicle: ParaGlider Wingsuit HotAirBalloon

ParaGlider: javac -d ../bin/ ParaGlider.java

Wingsuit: javac -d ../bin/ Wingsuit.java

HotAirBalloon: javac -d ../bin/ HotAirBalloon.java

------------------------------------------------------------------------------------------------------------------------------------
Military Vehicles
------------------------------------------------------------------------------------------------------------------------------------

military: MilitaryVehicle Tank ArmouredVehicle AttackHelicopter

MilitaryVehicle: javac -d ../bin/ MilitaryVehicle.java

Tank: javac -d ../bin/ Tank.java

ArmouredVehicle: javac -d ../bin/ ArmouredVehicle.java

AttackHelicopter: javac -d ../bin/ AttackHelicopter.java

####################################################################################################################################