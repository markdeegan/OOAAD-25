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


// start definition of class tristanTest
public class tristanTest { 

    static java.util.ArrayList<String[]> models = new java.util.ArrayList<>(); // storage for make and model
    static java.util.ArrayList<String[]> counties = new java.util.ArrayList<>(); // storage for county name and reg

    // start definition of method tristanTest::main() 
    public static void main(String[] args) { // definition of tristanTest::main method

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
        // call the car::honk method on object myCar1
        myCar1.honk();

        // print a message
        System.out.print("myCar2 says ");
        // call the car::honk function on onject myCar2
        myCar2.honk();

        // do the same thing as above, only
        // call the function getValue within the println statement
        System.out.println("myCar1 - My value is: " + myCar1.getValue());
        System.out.println("myCar2 - My value is: " + (int)myCar2.getValue());

        addMakesManually(); // from current file, hardcoded

        if(manufacturers.makes.contains("Mazda")) System.out.println("Mazda is present");
        else System.out.println("Mazda is NOT present");
        System.out.println("Full list of makes is :");
        System.out.println(manufacturers.makes);

        // models and counties manually
        addModelsManually();
        addCountiesManually();

        // list stored model data
        System.out.println("\nList of car models:");
        for (String[] m : models) {
            System.out.println(m[0] + " - " + m[1]);
        }

        // List stored county data
        System.out.println("\nList of counties:");
        for (String[] c : counties) {
            System.out.println(c[0] + " (" + c[1] + ")");
        }

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

    // manually add some make and models
    static void addModelsManually() {
        models.add(new String[]{"Nissan", "Micra"});
        models.add(new String[]{"Toyota", "Corolla"});
        models.add(new String[]{"Mazda", "CX-5"});
        models.add(new String[]{"Hyundai", "i30"});
        models.add(new String[]{"BMW", "X5"});
    }

    // manually add some county/reg
    static void addCountiesManually() {
        counties.add(new String[]{"Kildare", "KE"});
        counties.add(new String[]{"Dublin", "D"});
        counties.add(new String[]{"Cork", "C"});
        counties.add(new String[]{"Galway", "G"});
        counties.add(new String[]{"Meath", "MH"});
    }

}
///