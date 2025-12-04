# Aarti Saravanan
# OOTAD
# DTAI Year 3
# AS20251127
# Aarti's File

# #################################################################
# Nicola's Makefile #

# This Makefile is used to help automatically compile several Java files that describe different kinds of air vehicles. 

# Each vehicle, like AirVehicle, Airplane, or Drone, contains a command that tells Java to compile that specific .java file and place the output in the ../bin folder. 

# There is also a clean command that deletes all the .class files in that folder so you can start fresh if needed. 

# When you type make air, the Makefile will automatically run all the other vehicles listed after air. Each of those vehicles compiles in one Java file. This is done instead of running eight separate commands to compile each class so with one command (make air) it will compile all of them

# ################################################################
# AirVehicle 
# appears to be the root of the hierarchy 
# Common attributes = speed, weight, vehicle identification

# PoweredAirVehicle: (class that extends from AirVehicle)
# Covers vehicles that rely on engines/motors for lift or propulsion 

# Subclass of PoweredAirVehicles
# Airplane
# Helicopter
# Drone 

# NonPoweredAirVehicle: (class that extends from AirVehicle)
# Vehicles that don't rely on engine 

# Subclass of NonPoweredVehicle
# Wingsuit
# HotAirBalloon 

# #################################################################


# ################################################################
# Jordan's Makefile #
# Jordan's makefile is focused on person and staff class

# This Makefile helps automatically compile and run Java files related to people and staff. 

# It starts with a help command that prints a short message explaining what the Makefile is for. 

# The clean command clears out all .class files from the ../bin folder so you can rebuild everything from scratch when needed. 

# There are groups like Jordan and People that both compile the Person and Staff classes together with one command. 

# It also includes commands for compiling single files such as asset.java, Person.java, and Staff.java, putting the finished class files into the ../bin folder. 

# The Makefile then provides a command to compile the JordanTestProgramme file and a RunJordan command that first builds it and then runs the program. 

# This Makefile makes the whole process of cleaning, compiling, and running your Java code much easier and quicker.

# clean: @-rm ../bin/*.class 2>/dev/null || true
# Deletes all .class files in ../bin
# If no files exist or there's an error it ignores it and doesn't fail
# #################################################################


# #################################################################
# Adrian's Makefile #
# Splits into two group : Air and Water 
# Includes only classes he implemented 
# Reflects the class hierarchy (AirVehicle -> Non-PoweredAirVehicle)

# This Makefile helps compile different Java files that represent air and water vehicles. 

# It sets up two groups: Air, which includes classes like AirVehicle, NonPoweredAirVehicle, Drone, Paraglider, Wingsuit, and Parachute, and Water, which includes the Kayak class. 

# When you run one of these group names with make, all the classes listed under it will be compiled at once. 

# Each class also has its own command that uses javac to compile its .java file and place the finished .class file into the ../bin folder. 

# These commands let you compile a single file or a whole group of related files depending on what you need. 

# #################################################################


# #################################################################
# Mark's Makefile #
# Groups organise classes by type(Air, Water and Land)
# Each class has a rule to compile it 
# ests are built and run rules
# Team members have targets listing the classes they wrote
# clean deletes class files
# docs create documentation

# This Makefile helps compile, clean, run, and document a large Java project about different types of vehicles and people. 

# It starts with a help command that shows a message about the project when make is run without any other command. 

# The all command can build the entire project at once by compiling groups like air, land, water, people, other, and tests, which list the classes or programs they include. 

# The clean command removes all .class files from the ../bin folder so you can rebuild everything from scratch. 

# Each class and test program has its own command to compile it into the ../bin folder. There are also commands to run each team member’s test programs and a docs command to create JavaDoc documentation. 

# #################################################################