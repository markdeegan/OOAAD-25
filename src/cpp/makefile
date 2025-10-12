# define the default operation 
# which is to build vehicle.o car.o and fleet.o
default: vehicle.o car.o fleet.o fleet.exe

####################
# CPP section
####################

# rule for building vehicle.o if vehicle.cpp or vehicle.h have changed
vehicle.o: vehicle.cpp vehicle.h
	g++ -c vehicle.cpp

# rule for building car.o if car.cpp or vehicle.cpp have changed
car.o:	car.cpp car.h vehicle.o 
	g++ -c car.cpp

# rule for building fleet.o if car.cpp, vehicle.cpp or fleet.cpp have changed
fleet.o: fleet.cpp car.h car.cpp vehicle.h vehicle.cpp
	g++ -c fleet.cpp

fleet.exe: fleet.o car.o
	g++ vehicle.o car.o fleet.o -o fleet.exe

# rule for building all .cpp applicaitons files
cpp: fleet.exe

####################
# java section
####################

# rule for building all .class files
java: fleet.class car.class vehicle.class

# rule for building car.class if car.java has changed
car.class: car.java
	javac car.java

# rule for building vehicle.class if vehicle.java has changed
vehicle.class: vehicle.java
	javac vehicle.java

# rule for building fleet.class if fleet.java has changed
fleet.class: fleet.java
	javac fleet.java

clean:
	@rm *.o 2>/dev/null || true
	@rm *.exe 2>/dev/null || true
	@rm *.class 2>/dev/null || true

