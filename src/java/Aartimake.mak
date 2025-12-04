# Aarti Saravanan
# OOATD
# DTAI Year 3
# AS20251204
# Aarti's Makefile 

##########################################################################################################################

Categories: Air Land Water # Categorises project's entities

clean: # clean command in Makefile, when executed it removes all Java class files
	rm ../bin/*.class
	
##########################################################################################################################

# Air Vehicles

# Defines the category 'air' and lists all air vehicle types 
air: AirVehicle Airplane Rocket Drone Helicoptor HotAirBalloon ParaGlider Wingsuit NonPoweredAirVehicle PoweredAirVehicle 

# Compilation command for the base AirVehicle class
AirVehicle: javac -d ../bin/AirVehicle.java

##########################################################################################################################

NonPoweredAirVehicle: ParaGlider Wingsuit HotAirBalloon # Defines the category 'NonPoweredAirVehicle' and lists specific vehicles types that inherit from it  

ParaGlider: javac -d ../bin/ParaGlider.java # Compile ParaGlider class 
Wingsuit: javac -d ../bin/Wingsuit.java # Compile Wingsuit class 
HotAirBalloon: javac -d ../bin/HotAirBalloon.java # Compile HotAirBalloon class 

##########################################################################################################################

##########################################################################################################################

PoweredAirVehicle: Airplane Drone Helicopter Rocket # Defines the category 'PoweredAirVehicle' and lists specific vehicles types that inherit from it 

Airplane: javac -d ../bin/Airplane.java # Compile Airplane class 
Drone: javac -d ../bin/Drone.java # Compile Drone class 
Helicopter: javac -d ../bin/Helicopter.java # Compile Helicopter class 
Rocket: javac -d ../bin/Rocket.java # Compile Rocket class 

##########################################################################################################################

# Land Vehicles

# Defines the category 'land' and lists all land vehicle types
land: Bicycle Scooters SkateBoards RollerSkates Carriages Sleighs Car MotorBike Tractor Lorry DirtBike Moped NonPoweredLandVehicle PoweredLandVehicle

# Compilation command for the base LandVehicle class
LandVehicle: javac -d ../bin/LandVehicle.java 

#########################################################################################################################################################

NonPoweredLandVehicle: Bicycle Scooters Skateboards RollerSkates Carriages Sleighs # Defines the category 'NonPoweredLandVehicle' and lists specific vehicles types that inherit from it 

Bicycle: javac -d ../bin/Bicycle.java # Compile Bicycle class 
Scooters: javac -d ../bin/Scooters.java # Compile Scooters class 
SkateBoards: javac -d ../bin/SkateBoards.java # Compile SkateBoards class 
RollerSkates: javac -d ../bin/RollerSkates.java # Compile RollerSkates class 
Carriages: javac -d ../bin/Carriages.java # Compile Carriages class 
Sleighs: javac -d ../bin/Sleighs.java # Compile Sleighs class 

#########################################################################################################################################################

#########################################################################################################################################################

PoweredLandVehicle: Car MotorBike Tractor Lorry DirtBike Moped # Defines the category 'PoweredLandVehicle' and lists specific vehicles types that inherit from it 

Car: javac -d ../bin/Car.java # Compile Car class 
MotorBike: javac -d ../bin/MotorBike.java # Compile MotorBike class 
Tractor: javac -d ../bin/Tractor.java # Compile Tractor class 
Lorry: javac -d ../bin/Lorry.java # Compile Lorry class 
DirtBike: javac -d ../bin/DirtBike.java # Compile DirtBike class 
Moped: javac -d ../bin/Moped.java # Compile Moped class 

#########################################################################################################################################################

# Water Vehicles

# Defines the category 'water' and lists all water vehicle types
water: MotorBoat JetSki MotorYacht HydroBike WarShip HoverCraft WaterJet SailBoat SailingYacht WindSurfer KiteBoard Canoe Kayak Raft NonPoweredWaterVehicle PoweredWaterVehicle 

# Compilation command for the base WaterVehicle class
WaterVehicle: javac -d ../bin/WaterVehicle.java 

################################################################################################################################################################################

NonPoweredWaterVehicle: SailBoat SailingYacht WindSurfer KiteBoard Canoe Kayak Raft # Defines the category 'NonPoweredWaterVehicle' and lists specific vehicles types that inherit from it 

SailBoat: javac -d ../bin/SailBoat.java # Compile SailBoat class 
SailingYacht: javac -d ../bin/SailingYacht.java # Compile SailingYacht class 
WindSurfer: javac -d ../bin/WindSurfer.java # Compile WindSurfer class 
KiteBoard: javac -d ../bin/KiteBoard.java # Compile KiteBoard class 
Canoe: javac -d ../bin/Canoe.java # Compile Canoe class 
Kayak: javac -d ../bin/Kayak.java # Compile Kayak class 
Raft: javac -d ../bin/Raft.java # Compile Raft class 

################################################################################################################################################################################

################################################################################################################################################################################

PoweredWaterVehicle: MotorBoat JetSki MotorYacht HydroBike WarShip HoverCraft WaterJet # Defines the category 'PoweredWaterVehicle' and lists specific vehicles types that inherit from it 

MotorBoat: javac -d ../bin/MotorBoat.java # Compile MotorBoat class 
JetSki: javac -d ../bin/JetSki.java # Compile JetSki class 
MotorYacht: javac -d ../bin/MotorYacht.java # Compile MotorYacht class 
HydroBike: javac -d ../bin/HydroBike.java # Compile HydroBike class 
WarShip: javac -d ../bin/WarShip.java # Compile WarShip class 
HoverCraft: javac -d ../bin/HoverCraft.java # Compile HoverCraft class 
WaterJet: javac -d ../bin/WaterJet.java# Compile WaterJet class 

################################################################################################################################################################################
