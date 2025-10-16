////////// ////////// ////////// //////////
/// // Mark Deegan
// Sat 11 Oct 2025 21:43:32 IST
// programme to demonstrate use of inheritance and class hierarchy
////////// ////////// ////////// //////////

/** @author Mark Deegan */
public class fleet { // start definition of class fleet
	public static void main(String[] args)
	{ // definition of main method in class fleet
		System.out.println("Fleet Manager");

		// declare two variables of class car
		// and create the obejcts of class car
		// assign the variables to the new objects
		car myCar1 = new car();
		car myCar2 = new car();

		// set the value of the car to €2,000
		myCar1.setValue(2000);

		// print out a simnple message
		System.out.print("myCar1 says ");
		// get the car to boop
		myCar1.beep();

		// print out a simnple message
		System.out.print("myCar2 says ");
		// get the car to boop
		myCar2.beep();

		// print diagnostic messages
		System.out.println("myCar1 - My value is: " + myCar1.getValue());
		System.out.println("myCar2 - My value is: " + (int)myCar2.getValue());
		System.out.println("myCar2 - My reg is: " + myCar2.getRegistration());

	} // end definition of main method in class fleet
} // end definition of class fleet