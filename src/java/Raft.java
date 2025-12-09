// Aarti Saravanan
//OOATD
// DTAI Year 3
//AS20251209
//Raft Class

// Declares a public class named Raft that extends NonPoweredWaterVehicle and implements the asset interface
public class Raft extends NonPoweredWaterVehicle implements asset{

// Declares a private float command to store the value of the Raft
private float value;

// Public method to set the value of the Raft
// Takes a float input representing the new value
public void setValue(float value){
    this.value = value;  // Assigns the input value to the instance variable 'value'
                         // 'this' refers to the current object instance
}

public string toString(){  // Public method that returns a string to represent the Raft object
    return "Raft, Value: $" + value;  // Returns a formatted string containing the class name and value
                                          // The value is displayed with a doller sign

}
}