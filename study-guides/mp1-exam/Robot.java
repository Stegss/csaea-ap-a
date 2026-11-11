// CLASS: blueprint / template that CREATE objects. 
// It stores methods/functions and data, etc.

// CLASS HEADER
public class Robot {
    
    // ATTRIBUTES / DATA: private instance variables
    private String name;
    private String serial;
    private double battery;
    private boolean isOn; 

    private static int robotCount;

    // CONSTRUCTOR:
    // special method; starting point for new objects
    // CONSTRUCTOR: no return type, same name as class
    // PARAMETERS: name, serial, battery
    public Robot(String name, String serial, double battery) {
        // THIS: instance variable vs. paramater
        this.name = name;
        this.serial = serial;
        this.battery = battery;
        robotCount++;

        // DEFAULT STATE: every Robot starts off
        this.isOn = false;
    }

    // GETTER / ACCESSOR: return type matches variable
    public String getName() {
        return name;
    }

    public double getBattery() {
        return battery;
    }

    // BOOLEAN getter:
    public boolean isOn() {
        return isOn;
    }

    // SETTERS / MUTATORS: void, PARAMATER recieves an ARGUMENT
    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        return name + " [" + serial + "]";
    }

     // indexOf: returns index, or -1 if not found
     public boolean serialContains(String part) {
            return serial.indexOf(part) != -1;
     
     }


     public void randomDrain() {
        double drain = Math.random() * 10;
        battery = Math.max(0, battery - drain);
     }

     public int getRobotCount() {
        return robotCount;
     }


}
