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


/** Start definition of class tristanTest */
public class tristanTest { // start definition of class tristanTest
	// Start definition of method tristanTest::main() 
	public static void main(String[] args)
	{ // definition of tristanTest::main method

		// print Fleet Manager message
		System.out.println("Fleet Manager");

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
		System.out.print("myCar1 says ");
		// call the car::beep method on object myCar1
		myCar1.beep();

		// print a message
		System.out.print("myCar2 says ");
		// call the car::beep function on onject myCar2
		myCar2.beep();

		// do the same thing as above, only
		// call the function getValue within the println statement
		System.out.println("myCar1 - My value is: " + myCar1.getValue());
		System.out.println("myCar2 - My value is: " + (int)myCar2.getValue());

		//addMakesManually(); //from current file, hardcoded
		addMakesFromFile(); //takes from seperate data file

		if(manufacturers.makes.contains("Mazda")) System.out.println("Mazda is present");
		else System.out.println("Mazda is NOT present");
		System.out.println("Full list of makes is :");
		System.out.println(manufacturers.makes);


	} // end definition of main method in class tristanTest

//static void addMakesManually()
	{
		manufacturers.makes.add("Mazda");
		manufacturers.makes.add("Maserati");
		manufacturers.makes.add("BMW");
		manufacturers.makes.add("Toyota");
		manufacturers.makes.add("Hyundai");
		manufacturers.makes.add("Kia");
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
