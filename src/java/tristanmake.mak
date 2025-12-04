# tristanmake.mak - vehicle V2 makefile
# owner: Tristan Berns
# 01/12/25
# DTAI Y3
# Object Oriented Analysis and Design

Categories
----------------------
all: land water air				#every vehicle type category: land, water, air

----------------------
Clean							
----------------------
clean: rm -f ../bin/*.class		#removes all compiled .class files from bin directory

####################################################################################################################################
------------------------------------------------------------------------------------------------------------------------------------
Land Vehicles
------------------------------------------------------------------------------------------------------------------------------------
#all land related vehicle classes, including road vehicles
land: LandVehicle ATV Car CombineHarvester DirtBike DuneBuggy Lorry Moped Motorbike Tractor QuadBike GoKart Snowmobile roadvehicle

#compiles a Java source file into the bin directory
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

#road vehicle group depends on these classes
roadvehicle: Car Lorry Moped Motorbike GoKart

#compiles the base RoadVehicle class
RoadVehicle: javac -d ../bin/ RoadVehicle.java


------------------------------------------------------------------------------------------------------------------------------------
Water Vehicles
------------------------------------------------------------------------------------------------------------------------------------
#all water related vehicle classes
water: WaterVehicle PoweredWaterVehicle NonPoweredWaterVehicle

#base water vehicle class
WaterVehicle: javac -d ../bin/ WaterVehicle.java

#powered water vehicle group depends on these classes
PoweredWaterVehicle: Submarine ContainerShip CruiseShip Jetski SurfaceBoat SpeedBoat Yacht Ferry

Submarine: javac -d ../bin/ Submarine.java

ContainerShip: javac -d ../bin/ ContainerShip.java

CruiseShip: javac -d ../bin/ CruiseShip.java

Jetski: javac -d ../bin/ Jetski.java

SurfaceBoat: javac -d ../bin/ SurfaceBoat.java

SpeedBoat: javac -d ../bin/ SpeedBoat.java

Yacht: javac -d ../bin/ Yacht.java

Ferry: javac -d ../bin/ Ferry.java

#non powered water vehicle group depends on these classes
NonPoweredWaterVehicle: Sailboat Kayak Canoe PaddleBoat

Sailboat: javac -d ../bin/ Sailboat.java

Kayak: javac -d ../bin/ Kayak.java

Canoe: javac -d ../bin/ Canoe.java

PaddleBoat: javac -d ../bin/ PaddleBoat.java

------------------------------------------------------------------------------------------------------------------------------------
Air Vehicles
------------------------------------------------------------------------------------------------------------------------------------
#all air related vehicle classes
air: AirVehicle PoweredAirVehicle NonPoweredAirVehicle

AirVehicle: javac -d ../bin/ AirVehicle.java

#powered air vehicle group depends on these classes
PoweredAirVehicle: AirPlane Drone Helicopter Jet

AirPlane: javac -d ../bin/ AirPlane.java

Drone: javac -d ../bin/ Drone.java

Helicopter: javac -d ../bin/ Helicopter.java

Jet: javac -d ../bin/ Jet.java

#non powered air vehicle group depends on these classes
NonPoweredAirVehicle: ParaGlider Wingsuit HotAirBalloon

ParaGlider: javac -d ../bin/ ParaGlider.java

Wingsuit: javac -d ../bin/ Wingsuit.java

HotAirBalloon: javac -d ../bin/ HotAirBalloon.java

------------------------------------------------------------------------------------------------------------------------------------

####################################################################################################################################


#added a few new vehicles to each class. Took out previous military type to focus on the core 3 types (land air and water)
#focus on organising land types further by arranging the hierarchy to allign with air and water (powered and non powered)