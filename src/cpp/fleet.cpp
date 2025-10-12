// Mark Deegan
// Sat 11 Oct 2025 21:43:32 IST
// programme to demonstrate use of inheritance and class hierarchy

#include <iostream>		// include declarations for use of cout stream
#include "vehicle.h" 		// include declarations for class vehicle
#include "car.h" 		// include declarations for class car

using namespace std;		// use the std namespace to access std::cout

int main()
{ // definition of main method
	cout << "Fleet Manager" << endl;
	car myCar1, myCar2;
	myCar1.setValue(2000);
	cout << "myCar1 says ";
	myCar1.beep();
	
	cout << "myCar2 says ";
	myCar2.beep();

	cout << "myCar1 - My value is: " << myCar1.getValue() << endl;
	cout << "myCar2 - My value is: " << myCar2.getValue() << endl;
	return 0;
} // end definition of main method
