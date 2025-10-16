////////// ////////// ////////// //////////
/// // Mark Deegan
// Sat 11 Oct 2025 21:43:32 IST
// programme to demonstrate use of inheritance and class hierarchy
////////// ////////// ////////// //////////

/** @author Mark Deegan */
public class vehicle {
	// declare private data members
	// registration data members
	private int regYear = 99;
	private String regCounty = "MH";
	private int regSequence = 12345;

	// financial asset values
	private float value = 12;

	public void setValue(float carValue)
	/** define setValue method to set the value of a vehicle */
	{
		value = carValue;
	}
	
	public float getValue()
	/** define get method to get the value of a vehicle */
	{
		return value;
	}

	public String getRegistration()
	/** define get method to get the registration of a vehicle */
	{
		// declare a variable sb of class StringBuffer
		// and create the new StringBuffer object
		StringBuffer sb = new StringBuffer();
		// add the year value to the StringBuffer
		sb.append(regYear);
			sb.append("-");
		// add the county string to the StringBuffer
		sb.append(regCounty);
			sb.append("-");
		// add the sequence value to the StringBuffer
		sb.append(regSequence);

		// convert the StringBuffer to a String
		// and return that as the value of this function
		return sb.toString();
	} // end definition ot the getRegistration function
} // end the definition of the vehicle class
