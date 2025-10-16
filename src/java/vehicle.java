public class vehicle {
	private int regYear = 99;
	private String regCounty = "MH";
	private int regSequence = 12345;

	private float value = 12;

	public void setValue(float carValue)
	{
		value = carValue;
	}
	
	public float getValue()
	{
		return value;
	}

	public String getRegistration()
	{
	StringBuffer sb = new StringBuffer();
	sb.append(regYear);
		sb.append("-");
	sb.append(regCounty);
		sb.append("-");
	sb.append(regSequence);
	return sb.toString();
	}
}
