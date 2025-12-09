// Aarti Saravanan
//OOATD
// DTAI Year 3
//AS20251209
//HotAirBalloon Class

// Declares a public class named HotAirBalloon that extends NonPoweredAirVehicle and implements the asset interface
public class HotAirBalloon extends NonPoweredAirVehicle implements asset{

// Declares a private float command to store the value of the HotAirBalloon
private float value;

// Public method to set the value of the HotAirBalloon
// Takes a float input representing the new value
public void setValue(float value){
    this.value = value;  // Assigns the input value to the instance variable 'value'
                         // 'this' refers to the current object instance
}

public string toString(){  // Public method that returns a string to represent the HotAirBalloon object
    return "HotAirBalloon, Value: $" + value;  // Returns a formatted string containing the class name and value
                                          // The value is displayed with a doller sign

}
}