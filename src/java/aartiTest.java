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
import java.util.ArrayList;

/** Start definition of class aartiTest */
public class aartiTest { 

//List to store car models
	static ArrayList<CarModel> models = new ArrayList<>();

//List to store counties
	static Arraylist<County> counties = new ArrayList<>();

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
		myCar1.setValue(100);

		// print a message
		System.out.print("Car 1 says: ");
		// call the car::beep method on object myCar1
		myCar1.beep();

		// print a message
		System.out.print("Car 2 says: ");
		// call the car::beep function on onject myCar2
		myCar2.beep();

		// do the same thing as above, only
		// call the function getValue within the println statement
		System.out.println("Car 1 - My value is: " + myCar1.getValue());
		System.out.println("Car 2 - My value is: " + (int)myCar2.getValue());

		//add car makes
		addMakesManually();
		addMakesFromFile();

		if(manufacturers.makes.contains("BMW")) System.out.println("BMW is present");
		else System.out.println("BMW is NOT present");
		System.out.println("Full list of makes is :");
		System.out.println(manufacturers.makes);

		//Add car models and counties
		addModelsManually();
		addCountiesManually();

		//print all car models
		System.out.println("/List of car models: ")
		for (CarModel m: models) {
		System.out.println(m.make + " (" + m.make +")")
		}

		//print all counties
		System.out.println("/List of counties: ")
		for (County c: counties) {
		System.out.println(c.name + " (" + c.reg +")")


		}


	} // end definition of main method in class aartiTest

//manually add car makes
static void addMakesManually()
	{
		manufacturers.makes.add("Mazda");
		manufacturers.makes.add("Mazda");
		manufacturers.makes.add("Maserati");
		manufacturers.makes.add("BMW");
		manufacturers.makes.add("Toyota");
		manufacturers.makes.add("Hyundai");
	}

//read car makes from file
static void addMakesFromFile(){

	try{

		Scanner s = new Scanner(new File("list-of-makes.txt"));
		while (s.hasNext()){
    			manufacturers.makes.add(s.next());
		}
		s.close();
		}
	catch (Exception e)
	
	}

//manually add car models
static void addModels Manually() {
	models.add(newstring[]{"Audi", "Q5"})
	models.add(newstring[]{"Toyota", "RAV4"})
	models.add(newstring[]{"Nissan", "Micra"})
	models.add(newstring[]{"Honda", "Civic"})
}

//manually add counties 
static void addCounties Manually() {
	counties.add(newstring[]{"Kerry", "KY"})
	counties.add(newstring[]{"Clare", "CE"})
	counties.add(newstring[]{"Longford", "LF"})
	counties.add(newstring[]{"Sligo", "SL"})
} //end class aartiTest

// class represents a car model
class CarModel{
	String make;
	String model;

	CarModel(String make, String model){
		this.make = make;
		this.model = model;
	}

}

//class represents a county
class County{
	String name;
	String reg;

	County(String name, string reg){
		this.name = name;
		this.reg = reg;
	}
}