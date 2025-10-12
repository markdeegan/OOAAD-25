// Mark Deegan
// Sat 11 Oct 2025 21:43:32 IST
// programme to demonstrate use of inheritance and class hierarchy
public class fleet { // start definition of class fleet
	public static void main(String[] args)
	{ // definition of main method in class fleet
		System.out.println("Fleet Manager");

		car myCar1 = new car();
		car myCar2 = new car();

		myCar1.setValue(2000);

		System.out.print("myCar1 says ");
		myCar1.beep();

		System.out.print("myCar2 says ");
		myCar2.beep();

		System.out.println("myCar1 - My value is: " + myCar1.getValue());
		System.out.println("myCar2 - My value is: " + (int)myCar2.getValue());

	} // end definition of main method in class fleet
} // end definition of class fleet
