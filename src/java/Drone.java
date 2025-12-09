// Aarti Saravanan
//OOATD
// DTAI Year 3
//AS20251209
//Drone Class

// Declares a public class named Drone that extends PoweredAirVehicle and implements the asset interface
public class Drone extends PoweredAirVehicle implements asset{

// Declares a private float command to store the value of the Drone
private float value;

// Public method to set the value of the Drone
// Takes a float input representing the new value
public void setValue(float value){
    this.value = value;  // Assigns the input value to the instance variable 'value'
                         // 'this' refers to the current object instance
}

public string toString(){  // Public method that returns a string to represent the Drone object
    return "Drone, Value: $" + value;  // Returns a formatted string containing the class name and value
                                          // The value is displayed with a doller sign

}
}