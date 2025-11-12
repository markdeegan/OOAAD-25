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


/** Start definition of class fleet */
public class fleet { // start definition of class fleet
	// Start definition of method fleet::main() 
	public static void main(String[] args)
	{ // definition of fleet::main method

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

		// this line would call the function addMakesManually to populate tyhe manufacturers.makes list
		// that is fine for testing, but does not scale well, as it would require that the code be recompiled
		// and a new versfion of the executable be shared with all users every time we wanted to add a new make of car.
			// addMakesManually();

		// by contrast, this line calles the addMadesFromFile function, which loads makes frmo a text file.
		// we could also load the makes form a database somewhere, or even from a file on the internet somewhere
		// like in a gitHub repo etc.
		// this method means we would not need to recompile our code every time we want to add new makes etc.
		addMakesFromFile();

		// the following code tests if the list of known makes contains the make "Mazda"
		if(manufacturers.makes.contains("Mazda")) System.out.println("Mazda is present");
		else System.out.println("Mazda is NOT present");

		// the following code prints out the full list of all known makes
		System.out.println("Full list of makes is :");
		System.out.println(manufacturers.makes);


	} // end definition of main method in class fleet

static void addMakesManually()
/** this code manually populates the manufacturere.makes list. While it works fine for initial testing
 * we want to moave away from such hard-coded definition of the makes list, in favour of something more
 * dynamic and more realistic */
	{
		// class manufacturers contains a static object, makes, which is a list of known makes
		// because of how we set this up, the list is automatically sorted alphabetically, which is nice
		manufacturers.makes.add("Mazda");
		// also, if we trty to add the same make (string) more than once ro our list,
		// it will be dropped, as only single copies of the same String are stored in this list
		manufacturers.makes.add("Mazda");
		manufacturers.makes.add("Maserati");
		manufacturers.makes.add("BMW");
		manufacturers.makes.add("Toyota");
		manufacturers.makes.add("Hyundai");
	}
	// end definition of the methoid to manually add makes to the makes list

static void addMakesFromFile()
/** a version of the addMakes that takes data from a file */
	{
	// because fiule open and file read operations can faile, for a number of reasons
	// it is always a good idea to check for any errors, using the try/catch mechanism
	
	// wrap 'risky' code in a try block
	try
		{
		// create a File object based on the file List-of-makes.txt
		// then create a Scanner object 's' based on that
		Scanner s = new Scanner(new File("list-of-makes.txt"));
		// as long as there is more data in the file, represented by the scanner object
		while (s.hasNext())
			{	// start loop for handline each line of the data file
				// read data from the file. Read the entire line, not just the first word
    			manufacturers.makes.add(s.nextLine());
			}
			// end loop for handline each line of the data file
		// close the file
		s.close();
		} // end of the 'try' block which might contain 'risky' code

	// code to 'catch' and handle any errors (exceptions) that might have occirred 
	// in the try block above
	// this example catches the most general class of Exception 
	// end actually ignores it
	catch (Exception e)
		{
			// ignore any exceptions that might have occurred
			// generally not a great idea, but at this stage of our learning
			// it is a justifiable approach
		}
	// end the 'catch' block to 'handle' any exceptions that might have been thrown
	}
	// end the addMakesFromFile method

} // end definition fo the fleet class
