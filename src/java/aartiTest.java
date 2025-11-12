////////// ////////// ////////// //////////
// Mark Deegan
// Sat 11 Oct 2025 21:43:32 IST
// programme to demonstrate use of inheritance and class hierarchy
////////// ////////// ////////// //////////
/** @author Mark Deegan */
////////// ////////// ////////// //////////

import java.util.Scanner;
import java.io.File;
import java.lang.Exception;


/** Start definition of class aartiTest */
public class aartiTest { // start definition of class aartiTest
	// Start definition of method aartiTest::main() 
	public static void main(String[] args)
	{ // definition of aartiTest::main method

		// print Fleet Manager message
		System.out.println("Aarti's Test");

		// declare two variables myCar1 and myCar2
		car myCar1;
		car myCar2;

		// crate two new car objects and assigne each one 
		// to myCar1 or myCar2
		myCar1 = new car();
		myCar2 = new car();

		// call the setValue funciton on the myCar1 object
		myCar1.setValue(2000);

		// print a message
		System.out.print("Car 1 says: ");
		// call the car::beep method on object myCar1
		myCar1.honk();

		// print a message
		System.out.print("Car 2 says: ");
		// call the car::beep function on onject myCar2
		myCar2.honk();

		// do the same thing as above, only
		// call the function getValue within the println statement
		System.out.println("Car 1 - My value is: " + myCar1.getValue());
		System.out.println("Car 2 - My value is: " + (int)myCar2.getValue());

		// addMakesManually();
		addMakesFromFile();

		if(manufacturers.makes.contains("BMW")) System.out.println("BMW is present");
		else System.out.println("BMW is NOT present");
		System.out.println("Full list of makes is :");
		System.out.println(manufacturers.makes);


	} // end definition of main method in class aartiTest

static void addMakesManually()
	{
		manufacturers.makes.add("Mazda");
		manufacturers.makes.add("Mazda");
		manufacturers.makes.add("Maserati");
		manufacturers.makes.add("BMW");
		manufacturers.makes.add("Toyota");
		manufacturers.makes.add("Hyundai");
	}

static void addMakesFromFile()
	{
	try
		{
		Scanner s = new Scanner(new File("list-of-makes.txt"));
		while (s.hasNext()){
    			manufacturers.makes.add(s.next());
			}
		s.close();
		}
	catch (Exception e)
		{
		}
	}

} 
