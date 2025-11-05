////////// ////////// ////////// //////////
// Mark Deegan
// Thu Oct 16 16:09:52 IST 2025
// DTAI H3013 Object Oriented Analysis & Design
////////// ////////// ////////// //////////
 
 
 
/** 
 * @author Mark Deegan 
 */
public class car extends vehicle
/** class to represent a car, which is an extension of or a 
 * specialisaiton of class vehicle */
{ // start definition of the class car
	String VIN;
	public car()
	{
	}

	public car(String paramVIN)
	{
		VIN = paramVIN;
	}
	public void beep()
	/** public method beep to make the car sound the horn */
	{ // end definition of method car::beep()
		System.out.println("Beep! Beep!");
	} // end definition of method cat::beep()
} // end definition of the class car
